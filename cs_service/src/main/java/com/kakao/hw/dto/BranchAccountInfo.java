package com.kakao.hw.dto;

import lombok.Data;

@Data
public class BranchAccountInfo extends BranchInfoDTO {
	
	// 계좌번호
	private String acctNo;
	
	// 계좌명
	private String acctName;
	

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	
}
