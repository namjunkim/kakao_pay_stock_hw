package com.kakao.hw.dto;

import java.util.List;

public class AmountSumByBranchByYear {
	
	private String year;
	
	
	private List<AmountSumByBranchByYearData> amountSumByBranchByYearDataList;
	
	public List<AmountSumByBranchByYearData> getAmountSumByBranchByYearDataList() {
		return amountSumByBranchByYearDataList;
	}

	public void setAmountSumByBranchByYearDataList(List<AmountSumByBranchByYearData> amountSumByBranchByYearDataList) {
		this.amountSumByBranchByYearDataList = amountSumByBranchByYearDataList;
	}


	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}


}
