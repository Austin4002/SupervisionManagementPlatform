package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.Result;
import pojo.User;
import service.SatisfyService;

@RestController
@RequestMapping(value = "/satisfy")
public class SatisfyController {

	@Autowired
	private SatisfyService satisfyService;

	// 获得某一信息的所有评价总和
	@RequestMapping(value="/findSatisfyByInformationId")
	public Object findSatisfyByInformationId(String informationId) {
		Result<Integer> rs = new Result<Integer>(-1, "ERROR");
		int total = satisfyService.findSatisfyByInformationId(informationId);
		if (total > 0) {
			rs.setCode(200);
			rs.setMsg("获得评价总和");
			rs.setData(total);
		}
		return rs;
	}

	// 查询某一用户对某一信息的评价
	@RequestMapping(value="/findSatisfyByUserId")
	public Object findSatisfyByUserId(HttpSession session,String informationId) {
		Result<Integer> rs = new Result<Integer>(-1, "ERROR");
		User user = (User) session.getAttribute("user");
		int star =satisfyService.findSatisfyByUserId(user.getUserId(),informationId);
		if(star>0) {
			rs.setCode(200);
			rs.setMsg("查询成功");
			rs.setData(star);
		}
		return rs;
	}
}
