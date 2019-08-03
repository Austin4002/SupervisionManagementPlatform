package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pojo.PageBean;
import pojo.Resource;
import pojo.Result;
import service.ResourceService;

@RestController
@RequestMapping(value="/resource")
public class ResourceController {

	@Autowired
	private ResourceService resourceService;
	
	//查询资源
	@RequestMapping(value="/findResource")
	public Object findResource(@RequestParam(defaultValue = "10") int currentCount,
			@RequestParam(defaultValue = "1") int currentPage) {
		Result<PageBean<Resource>> rs = new Result<PageBean<Resource>>(-1,"ERROR");
		
		PageBean<Resource> pageBean =resourceService.findResource(currentCount,currentPage);
		
		if(pageBean.getList()!=null) {
			rs.setCode(200);
			rs.setMsg("查询资源成功");
			rs.setData(pageBean);
		}
		
		return rs;
	}
}
