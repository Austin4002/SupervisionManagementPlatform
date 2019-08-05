package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SatisfyMapper;
import pojo.Satisfy;
import service.SatisfyService;

@Service
public class SatisfyServiceImpl implements SatisfyService{
	
	@Autowired
	private SatisfyMapper satisfyMapper;

	@Override
	public int findSatisfyByInformationId(String informationId) {
		List<Satisfy> satisfyList = satisfyMapper.findSatisfyByInformationId(informationId);
		int total =0;
		for (Satisfy satisfy : satisfyList) {
			total += satisfy.getSatisfyStar();
		}
		return total;
	}

	@Override
	public int findSatisfyByUserId(String userId, String informationId) {
		Satisfy satisfy=  satisfyMapper.findSatisfyByUserId(informationId,userId);
		int star = 0;
		star = satisfy.getSatisfyStar();
		return star;
	}

}
