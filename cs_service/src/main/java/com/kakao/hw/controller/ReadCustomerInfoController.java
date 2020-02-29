package com.kakao.hw.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;
import com.kakao.hw.dto.AmountSumByBranchByYear;
import com.kakao.hw.dto.BranchInfo;
import com.kakao.hw.dto.BusinessHistoryDTO;
import com.kakao.hw.dto.HighSumAmountCustomerDTO;
import com.kakao.hw.dto.NoneTransctionCustomerDTO;
import com.kakao.hw.dto.ResponseCode;
import com.kakao.hw.service.TransactionServiceImpl;

@Controller
public class ReadCustomerInfoController {
	
	@Autowired
	private TransactionServiceImpl transactionService;
	
	// #1
	@RequestMapping("/get/high/amount/customer/year")
	@ResponseBody
	public List<HighSumAmountCustomerDTO> getCustomerHighSumAmountByYear () {

		List<HighSumAmountCustomerDTO> highSumAmountCustomerDTOList = Lists.newArrayList();
		
		for(Map.Entry<String /*year*/, BusinessHistoryDTO> entry : transactionService.getCustomerHighSumAmountByYear().entrySet()) {
			
			HighSumAmountCustomerDTO highSumAmountCustomerDTO = new HighSumAmountCustomerDTO();
			highSumAmountCustomerDTO.setAcctNo(entry.getValue().getAcctNo());
			highSumAmountCustomerDTO.setYear(entry.getKey());
			highSumAmountCustomerDTO.setName(entry.getValue().getAcctName());
			highSumAmountCustomerDTO.setSumAmt(entry.getValue().getAmount());
			highSumAmountCustomerDTOList.add(highSumAmountCustomerDTO);
		}
		
		return highSumAmountCustomerDTOList;

	}
	
	
	// #2
	@RequestMapping("/get/none/trans/customer")
	@ResponseBody
	public List<NoneTransctionCustomerDTO> getNonTransationCustomerByYear () {
		
		return transactionService.getNonTransationCustomerByYear();
	}
	
	// #3
	@RequestMapping("/get/sum/amount/branch/year")
	@ResponseBody
	public List<AmountSumByBranchByYear> getSumAmountByBranchByYear () {
		return transactionService.getSumAmountByBranchByYear();
	}
	
	// #4
	@RequestMapping("/sum/amount")
	@ResponseBody
	public Object sumAmountByBrName (@RequestParam(required = false) String brName) {
		ResponseCode responseCode = new ResponseCode();
		
		for(BranchInfo branchInfo :  BranchInfo.values()) {
			if(branchInfo.brName().equals(brName) && branchInfo.isEnable()) {
				return transactionService.getSumAmountByBrName(brName);	
			}
		}
		
		responseCode.setCode("404");
		responseCode.setMessage("br code not found error");
		return responseCode;


	}
}
