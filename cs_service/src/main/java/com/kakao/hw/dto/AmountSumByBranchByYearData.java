package com.kakao.hw.dto;

public class AmountSumByBranchByYearData {
	
	private String brName;
	
	private String brCode;
	
	private Long sumAmt;

	public String getBrName() {
		return brName;
	}

	public void setBrName(String brName) {
		this.brName = brName;
	}

	public String getBrCode() {
		return brCode;
	}

	public void setBrCode(String brCode) {
		this.brCode = brCode;
	}

	public Long getSumAmt() {
		return sumAmt;
	}

	public void setSumAmt(Long sumAmt) {
		this.sumAmt = sumAmt;
	}

}
