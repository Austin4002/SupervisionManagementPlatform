package service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.InformationMapper;
import pojo.Information;
import pojo.PageBean;
import pojo.Satisfy;
import service.InformationService;

@Service
public class InformationServiceImpl implements InformationService {

	@Autowired
	private InformationMapper informationMapper;

	@Override
	public PageBean<Information> findInformationByType(int currentCount, int currentPage, String informationType,String informationTitle) {
		PageBean<Information> pageBean = new PageBean<Information>();
		// 当前页
		pageBean.setCurrentPage(currentPage);
		// 每页显示的条数
		pageBean.setCurrentCount(currentCount);
		// 总条数
		int totalCount = 0;
		totalCount = informationMapper.getCountByType(informationType,informationTitle);
		pageBean.setTotalCount(totalCount);
		// 总页数
		int totalPage = (int) Math.ceil(1.0 * totalCount / currentCount);
		pageBean.setTotalPage(totalPage);
		int index = (currentPage - 1) * currentCount;
		List<Information> list = informationMapper.findInformationByType(index, currentCount, informationType,informationTitle);
		pageBean.setList(list);

		return pageBean;
	}

	@Override
	public boolean addInformation(Information information) {
		information.setInformationId(UUID.randomUUID().toString().replaceAll("-", ""));
		int i = informationMapper.addInformation(information);
		return i > 0 ? true : false;
	}

	@Override
	public boolean deleteInformation(String informationId) {
		int i = informationMapper.deleteInformation(informationId);
		return i > 0 ? true : false;
	}

	@Override
	public Information findInformationById(String informationId) {
		Information information = informationMapper.findInformationById(informationId);
		return information;
	}

	@Override
	public boolean updateInformation(Information information) {
		int i = informationMapper.updateInformation(information);
		return i > 0 ? true : false;
	}

	@Override
	public PageBean<Information> findHotInformation(int currentCount, int currentPage) {
		PageBean<Information> pageBean = new PageBean<Information>();
		// 当前页
		pageBean.setCurrentPage(currentPage);
		// 每页显示的条数
		pageBean.setCurrentCount(currentCount);
		// 总条数
		int totalCount = 0;
		totalCount = informationMapper.getCountByIsHot();
		pageBean.setTotalCount(totalCount);
		// 总页数
		int totalPage = (int) Math.ceil(1.0 * totalCount / currentCount);
		pageBean.setTotalPage(totalPage);
		int index = (currentPage - 1) * currentCount;
		List<Information> list = informationMapper.findHotInformation(index, currentCount);
		pageBean.setList(list);
		return pageBean;
	}

	@Override
	public boolean star(Satisfy s) {
		s.setSatisfyId(UUID.randomUUID().toString().replaceAll("-", ""));
		int i = informationMapper.star(s);
		return i > 0 ? true : false;
	}

}
