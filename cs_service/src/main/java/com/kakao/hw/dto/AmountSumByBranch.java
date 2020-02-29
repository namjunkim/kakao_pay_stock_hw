package com.kakao.hw.dto;

public class AmountSumByBranch {

	private String brName;
	
	private String brCode;
	
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

	public Long getSumAmount() {
		return sumAmount;
	}

	public void setSumAmount(Long sumAmount) {
		this.sumAmount = sumAmount;
	}

	private Long sumAmount;
	
}
