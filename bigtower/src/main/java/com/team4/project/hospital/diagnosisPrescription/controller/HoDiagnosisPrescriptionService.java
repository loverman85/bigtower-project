package com.team4.project.hospital.diagnosisPrescription.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoDiagnosisPrescriptionService {

	@Autowired
	private HoDiagnosisPrescriptionDao hoDPD;
	
	public int addDiagnosis(Map<String, Object> map){
		int result = 0;
		String[] diseaseList = (String[]) map.get("diseaseList");
		for(int i=0;i<diseaseList.length-1;i++){
			String hoDiseaseCode = diseaseList[i];
			System.out.println((i+1)+"번째 질병코드 : "+hoDiseaseCode);
			map.put("hoDiseaseCode", hoDiseaseCode);
			result = hoDPD.addDiagnosis(map);
			System.out.println(i+"번째 결과 : " + result);
		}
		return result;
	}
}
