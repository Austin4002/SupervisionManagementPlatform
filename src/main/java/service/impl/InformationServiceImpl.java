package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.InformationMapper;
import pojo.Information;
import pojo.PageBean;
import service.InformationService;

public class InformationServiceImpl implements InformationService {

	@Autowired
	private InformationMapper informationMapper;

	@Override
	public PageBean<Information> findInformationByType(int currentCount, int currnetPage, String informationType) {
		PageBean<Information> pageBean = new PageBean<Information>();
		// 当前页
		pageBean.setCurrentPage(currnetPage);
		// 每页显示的条数
		pageBean.setCurrentCount(currentCount);
		// 总条数
		int totalCount = 0;
		totalCount = informationMapper.getCountByType(informationType);
		pageBean.setTotalCount(totalCount);
		// 总页数
		int totalPage = (int) Math.ceil(1.0 * totalCount / currentCount);
		pageBean.setTotalPage(totalPage);
		int index = (currnetPage - 1) * currentCount;
		List<Information> list = informationMapper.findInformationByType(index, currentCount,informationType);
		pageBean.setList(list);
		return pageBean;
	}

}
