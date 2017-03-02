package com.team4.project.hospital.diagnosisPrescription.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HoDiagnosisPrescriptionController {

	@Autowired
	private HoDiagnosisPrescriptionService hoDPS;
	
	@RequestMapping(value="/hospital/addDiagnosis")
	public String addDiagnosis(String[] diseaseList,
							   String hoTreatmentCode){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("diseaseList", diseaseList);
		map.put("hoTreatmentCode", hoTreatmentCode);
		hoDPS.addDiagnosis(map);
		return "redirect:/hospital/treatList";
	}
}
