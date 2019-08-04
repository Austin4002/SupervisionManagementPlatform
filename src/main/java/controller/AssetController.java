package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pojo.Asset;
import pojo.PageBean;
import pojo.Result;
import service.AssetService;

@RestController
@RequestMapping(value="/asset")
public class AssetController {

	@Autowired
	private AssetService assetService;
	
	@RequestMapping(value="/findAsset")
	public Object findAsset(@RequestParam(defaultValue = "10") int currentCount,
			@RequestParam(defaultValue = "1") int currentPage) {
		Result<PageBean<Asset>> rs = new Result<>(200, "ERROR");
		PageBean<Asset> pageBean = assetService.findAsset(currentCount,currentPage);
		if(pageBean.getList()!=null) {
			rs.setCode(200);
			rs.setMsg("查询资产成功");
			rs.setData(pageBean);
		}
		return rs;
	}
	
	@RequestMapping(value="/addAsset")
	public Object addAsset() {
		Result rs = new Result<>(200, "ERROR");
		return rs;
	}
	
	@RequestMapping(value="/deleteAsset")
	public Object deleteAsset() {
		Result rs = new Result<>(200, "ERROR");
		return rs;
	}
	
	@RequestMapping(value="/updateAssetUI")
	public Object updateAssetUI() {
		Result rs = new Result<>(200, "ERROR");
		return rs;
	}
	
	@RequestMapping(value="/updateAsset")
	public Object updateAsset() {
		Result rs = new Result<>(200, "ERROR");
		return rs;
	}
}
