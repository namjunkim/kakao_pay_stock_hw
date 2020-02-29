package com.kakao.hw.dto;

public enum BranchInfo {
	
	A("판교점",true),
	B("분당점",false),
	C("강남점",true),
	D("잠실점",true),
	E("을지로점",true);
	
	private String brName;
	private boolean brEnable;
	
	BranchInfo(String brName, boolean brEnable) {
		this.brName = brName;
		this.brEnable = brEnable;
	}
	
	public String brName() {
		return brName;
	}
	
	public boolean isEnable () {
		return brEnable;
	}
}
