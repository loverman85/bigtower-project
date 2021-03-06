package com.team4.project.hospital.hospitalizationOperation.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;
import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalizationRequest;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperationSub;

@Repository
public class HoHospitalizationOperationDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//입퇴원 요청 등록
	public int addRequest(String hoTreatmentCode){
		return sqlSession.insert("hoHospitalizationOperation.addRequest",hoTreatmentCode);
	}
	
	//입퇴원 요청 목록
	public List<HoHospitalizationRequest> hospitalizationRequestList(String hoHospitalCode){
		return sqlSession.selectList("hoHospitalizationOperation.hospitalizationRequestList",hoHospitalCode);
	}
	
	//입원 등록
	public int addHospitalization(Map<String, Object> map){
		return sqlSession.insert("hoHospitalizationOperation.addHospitalization",map);
	}
	
	//입원등록과 동시에 입퇴원 요청 테이블에 상태업데이트
	public int updateHospitalizationRequest(String hoHospitalizationRequestCode){
		return sqlSession.update("hoHospitalizationOperation.updateHospitalizationRequest",hoHospitalizationRequestCode);
	}
	
	//퇴원일 업데이트
	public int updateHospitalization(String hoHospitalizationCode){
		System.out.println("DAO의 hoHospitalizationCode : "+hoHospitalizationCode);
		return sqlSession.update("hoHospitalizationOperation.updateHospitalization", hoHospitalizationCode);
	}
	
	//수술 등록
	public int addOperation(HoOperation hoOperation){
		return sqlSession.insert("hoHospitalizationOperation.addOperation",hoOperation);
	}
	
	//수술 목록
	public List<HoOperationSub> operationList(String hoHospitalCode){
		return sqlSession.selectList("hoHospitalizationOperation.operationList", hoHospitalCode);
	}
	
	//수술 상세보기
	public HoOperationSub operationView(String hoOperationCode){
		return sqlSession.selectOne("hoHospitalizationOperation.operationView", hoOperationCode);
	}
	
	//수술일지 수정
	public int updateOperation(HoOperationSub hoOperationSub){
		return sqlSession.update("hoHospitalizationOperation.updateOperation",hoOperationSub);
	}
	
	//입원 환자 목록
	public List<HoHospitalization> hospitalizationList(String hoHospitalCode){
		return sqlSession.selectList("hoHospitalizationOperation.hospitalizationList", hoHospitalCode);
	}
}
