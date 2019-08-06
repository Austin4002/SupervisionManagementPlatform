package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pojo.Fund;
import pojo.PageBean;
import pojo.Result;
import pojo.User;
import service.FundService;

@RestController
@RequestMapping(value = "/fund")
public class FundController {

	@Autowired
	private FundService fundService;

	// 增加资金
	@RequestMapping(value = "/addFund")
	public Object addFund(@RequestBody Fund fund, HttpSession session) {
		Result rs = new Result<>(-1, "ERROR");
		User user = (User) session.getAttribute("user");
		String userId = user.getUserId();
		fund.setUserId(userId);
		boolean flag = fundService.addFund(fund);
		if (flag) {
			rs.setCode(200);
			rs.setMsg("资金增加成功");
		}
		return rs;
	}

	// 查询资金
	@RequestMapping(value = "/findFund")
	public Object findFund(@RequestParam(defaultValue = "10") int currentCount,@RequestParam(defaultValue = "1") int currentPage) {
		Result<PageBean<Fund>> rs = new Result<>(-1, "ERROR");
		PageBean<Fund> pageBean = fundService.findAllFund(currentCount, currentPage);
		if (pageBean.getList() != null) {
			rs.setCode(200);
			rs.setMsg("查询资金成功");
			rs.setData(pageBean);
		}
		return rs;
	}

	// 更新资金显示数据
	@RequestMapping(value = "/updateFundUI")
	public Object updateFundUI(String fundId) {
		Result<Fund> rs = new Result<>(-1, "ERROR");
		Fund fund = fundService.findFundById(fundId);
		if (fund != null) {
			rs.setCode(200);
			rs.setMsg("查询成功");
			rs.setData(fund);
		}

		return rs;
	}

	// 更新资金
	@RequestMapping(value = "/updateFund")
	public Object updateFund(@RequestBody Fund fund) {
		Result rs = new Result<>(-1, "ERROR");
		boolean flag = fundService.updateFund(fund);
		if (flag) {
			rs.setCode(200);
			rs.setMsg("资金更新成功");
		}

		return rs;
	}

	// 删除资金
	@RequestMapping(value = "/deleteFund")
	public Object deleteFund(String fundId) {
		Result rs = new Result<>(-1, "ERROR");
		boolean flag = fundService.deleteFund(fundId);
		if (flag) {
			rs.setCode(200);
			rs.setMsg("资金删除成功");
		}
		return rs;
	}

}
