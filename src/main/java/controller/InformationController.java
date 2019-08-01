package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pojo.Information;
import pojo.PageBean;
import pojo.Result;
import service.InformationService;

@RestController
@RequestMapping(value = "/information")
public class InformationController {

	@Autowired
	private InformationService informationService;

	// 根据类型显示信息
	@RequestMapping(value = "/informationTypeList")
	public Object findInformationByType(@RequestParam(defaultValue = "1") int currentPage, String informationType,
			@RequestParam(defaultValue = "10") int currentCount) {

		Result<String> rs = new Result<>(-1, "Error");
		PageBean<Information> pageBean = informationService.findInformationByType(currentCount, currentPage,
				informationType);
		if (pageBean.getList() != null) {
			rs.setCode(200);
			rs.setMsg("OK");
		}
		return rs;
	}

	// 查询热点新闻
	@RequestMapping(value = "/hotInformation")
	public Object findHotInformation() {
		Result<String> rs = new Result<>(-1, "Error");

		return rs;
	}

	// 添加信息
	@RequestMapping(value = "/addInformation")
	public Object AddInformation(Information information) {
		Result<String> rs = new Result<>(-1, "Error");

		return rs;
	}

	// 删除信息
	@RequestMapping(value = "/deleteInformation")
	public Object AddInformation(String informationId) {
		Result<String> rs = new Result<>(-1, "Error");

		return rs;
	}

	// 更新时回显数据
	@RequestMapping(value = "/updateInformationUI")
	public Object updateInformationUI(String informationId) {
		Result<String> rs = new Result<>(-1, "Error");

		return rs;
	}

	// 更新信息
	@RequestMapping(value = "/updateInformation")
	public Object updateInformation(Information information) {
		Result<String> rs = new Result<>(-1, "Error");

		return rs;
	}
}
