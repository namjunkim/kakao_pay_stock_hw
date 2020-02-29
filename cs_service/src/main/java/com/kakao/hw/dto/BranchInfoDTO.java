package com.kakao.hw.dto;

import lombok.Data;

@Data
public class BranchInfoDTO {

	public String getBrCode() {
		return brCode;
	}

	public void setBrCode(String brCode) {
		this.brCode = brCode;
	}

	public String getBrName() {
		return brName;
	}

	public void setBrName(String brName) {
		this.brName = brName;
	}

	// 관리점 코드
	private String brCode;
	
	// 관리점 명
	private String brName;
}
