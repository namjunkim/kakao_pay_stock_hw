package com.kakao.hw.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service
public class ReadCSVServiceImpl implements ReadCSVService {
	
	@Override
	public List<List<String>> readCSVFileFromLocal (String path, Integer numberHeaderLine) {
	
		// CVS Read Result
        List<List<String>> result = Lists.newArrayList();
        BufferedReader bufferedReader = null;
        Integer countLine = 0;
       
        try{
        	bufferedReader = Files.newBufferedReader(Paths.get(path));
            String line = "";
            
            while((line = bufferedReader.readLine()) != null){
            	if(!numberHeaderLine.equals(countLine + 1)) {
                    List<String> tempList = Lists.newArrayList();
                    String array[] = line.split(",");
                    tempList = Arrays.asList(array);
                    System.out.print(tempList);
                    result.add(tempList);
            	} 
            	countLine++;
            	

            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(bufferedReader != null){
                	bufferedReader.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        
        return result;
	
	}

}
