package com.kakao.hw.service;

import java.util.List;

public interface ReadCSVService {

	List<List<String>> readCSVFileFromLocal (String path, Integer numberHeaderLine);
	
}
