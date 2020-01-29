package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Object addAsset(@RequestBody Asset asset) {
		Result rs = new Result<>(200, "ERROR");
		boolean flag =assetService.addAsset(asset);
		if(flag) {
			rs.setCode(200);
			rs.setMsg("添加资产成功");
		}
		return rs;
	}
	
	@RequestMapping(value="/deleteAsset")
	public Object deleteAsset(String assetId) {
		Result rs = new Result<>(200, "ERROR");
		boolean flag =assetService.deleteAsset(assetId);
		if(flag) {
			rs.setCode(200);
			rs.setMsg("删除资产成功");
		}
		return rs;
	}
	
	@RequestMapping(value="/updateAssetUI")
	public Object updateAssetUI(String assetId) {
		Result<Asset> rs = new Result<>(200, "ERROR");
		Asset asset = assetService.findAssetById(assetId);
		if(asset!=null) {
			rs.setCode(200);
			rs.setMsg("查询资产成功");
			rs.setData(asset);
		}
		return rs;
	}
	
	@RequestMapping(value="/updateAsset")
	public Object updateAsset(@RequestBody Asset asset) {
		Result rs = new Result<>(200, "ERROR");
		boolean flag =assetService.updateAsset(asset);
		if(flag) {
			rs.setCode(200);
			rs.setMsg("更新资产成功");
		}
		return rs;
	}
	
}
