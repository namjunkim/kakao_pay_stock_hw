package com.kakao.hw.dto;

public class HighSumAmountCustomerDTO {

	private String year;
	
	private String name;
	
	private String acctNo;
	
	private Long sumAmt;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public Long getSumAmt() {
		return sumAmt;
	}

	public void setSumAmt(Long sumAmt) {
		this.sumAmt = sumAmt;
	}
	
}
