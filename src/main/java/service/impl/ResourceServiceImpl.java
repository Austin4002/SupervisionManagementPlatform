package service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ResourceMapper;
import pojo.PageBean;
import pojo.Resource;
import service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	private ResourceMapper resourceMapper;

	@Override
	public PageBean<Resource> findResource(int currentCount, int currentPage) {
		PageBean<Resource> pageBean = new PageBean<Resource>();
		// 当前页
		pageBean.setCurrentPage(currentPage);
		// 每页显示的条数
		pageBean.setCurrentCount(currentCount);
		// 总条数
		int totalCount = 0;
		totalCount = resourceMapper.getCount();
		pageBean.setTotalCount(totalCount);
		// 总页数
		int totalPage = (int) Math.ceil(1.0 * totalCount / currentCount);
		pageBean.setTotalPage(totalPage);
		int index = (currentPage - 1) * currentCount;
		List<Resource> list = resourceMapper.findResource(index, currentCount);
		pageBean.setList(list);
		return pageBean;
	}

	@Override
	public Resource findResourceById(String resourceId) {
		Resource resource = resourceMapper.findResourceById(resourceId);
		return resource;
	}

	@Override
	public boolean updateResource(Resource resource) {
		int i = resourceMapper.updateResource(resource);
		return i > 0 ? true : false;
	}

	@Override
	public boolean addResource(Resource resource) {
		resource.setResourceId(UUID.randomUUID().toString().replaceAll("-", ""));
		int i = resourceMapper.addResource(resource);
		return i > 0 ? true : false;
	}

	@Override
	public boolean deleteResource(String resourceId) {
		int i = resourceMapper.deleteResource(resourceId);
		return i > 0 ? true : false;
	}

}
