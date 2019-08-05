package service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.FundMapper;
import pojo.Fund;
import pojo.Information;
import pojo.PageBean;
import service.FundService;

@Service
public class FundServiceImpl implements FundService {

	@Autowired
	private FundMapper fundMapper;

	@Override
	public boolean addFund(Fund fund) {
		fund.setFundId(UUID.randomUUID().toString().replaceAll("-", ""));
		int i = fundMapper.addFund(fund);

		return i > 0 ? true : false;
	}

	@Override
	public PageBean<Fund> findAllFund(int currentCount, int currentPage) {
		PageBean<Fund> pageBean = new PageBean<Fund>();
		// 当前页
		pageBean.setCurrentPage(currentPage);
		// 每页显示的条数
		pageBean.setCurrentCount(currentCount);
		// 总条数
		int totalCount = 0;
		totalCount = fundMapper.getCount();
		pageBean.setTotalCount(totalCount);
		// 总页数
		int totalPage = (int) Math.ceil(1.0 * totalCount / currentCount);
		pageBean.setTotalPage(totalPage);
		int index = (currentPage - 1) * currentCount;
		List<Fund> list = fundMapper.findAllFund(index, currentCount);
		pageBean.setList(list);
		return pageBean;
	}

	@Override
	public boolean updateFund(Fund fund) {
		int count = fundMapper.updateFund(fund);
		return count > 0 ? true : false;
	}

	@Override
	public boolean deleteFund(String fundId) {
		int count = fundMapper.deleteFund(fundId);
		return count > 0 ? true : false;
	}

	@Override
	public Fund findFundById(String fundId) {
		Fund fund = fundMapper.findFundById(fundId);
		return fund;
	}
}
