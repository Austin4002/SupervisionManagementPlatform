package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pojo.PageBean;
import pojo.Resource;
import pojo.Result;
import service.ResourceService;

@RestController
@RequestMapping(value = "/resource")
public class ResourceController {

	@Autowired
	private ResourceService resourceService;

	// 查询资源
	@RequestMapping(value = "/findResource")
	public Object findResource(@RequestParam(defaultValue = "10") int currentCount,
			@RequestParam(defaultValue = "1") int currentPage) {
		Result<PageBean<Resource>> rs = new Result<PageBean<Resource>>(-1, "ERROR");

		PageBean<Resource> pageBean = resourceService.findResource(currentCount, currentPage);

		if (pageBean.getList() != null) {
			rs.setCode(200);
			rs.setMsg("查询资源成功");
			rs.setData(pageBean);
		}

		return rs;
	}

	// 修改页面
	@RequestMapping(value="/updateResourceUI")
	public Object updateResourceUI(String resourceId) {
		Result<Resource> rs = new Result<>(-1, "ERROR");
		Resource resource = resourceService.findResourceById(resourceId);
		if (resource != null) {
			rs.setCode(200);
			rs.setMsg("查询成功");
			rs.setData(resource);
		}
		return rs;
	}

	// 修改
	@RequestMapping(value="/updateResource")
	public Object updateResource(@RequestBody Resource resource) {
		Result rs = new Result<>(-1, "ERROR");
		boolean flag = resourceService.updateResource(resource);
		if (flag) {
			rs.setCode(200);
			rs.setMsg("更新资源成功");
		}

		return rs;
	}

	// 添加
	@RequestMapping(value="/addResource")
	public Object addResource(@RequestBody Resource resource) {
		Result rs = new Result<>(-1, "ERROR");
		boolean flag = resourceService.addResource(resource);
		if (flag) {
			rs.setCode(200);
			rs.setMsg("添加资源成功");
		}
		return rs;
	}

	// 删除
	@RequestMapping(value="/deleteResource")
	public Object deleteResource(String resourceId) {
		Result rs = new Result<>(-1, "ERROR");
		boolean flag = resourceService.deleteResource(resourceId);
		if (flag) {
			rs.setCode(200);
			rs.setMsg("删除资源成功");
		}
		return rs;
	}

}
