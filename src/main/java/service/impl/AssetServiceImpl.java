package service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AssetMapper;
import pojo.Asset;
import pojo.PageBean;
import service.AssetService;

@Service
public class AssetServiceImpl implements AssetService {

	@Autowired
	private AssetMapper assetMapper;

	@Override
	public PageBean<Asset> findAsset(int currentCount, int currentPage) {
		PageBean<Asset> pageBean = new PageBean();
		pageBean.setCurrentCount(currentCount);
		pageBean.setCurrentPage(currentPage);
		int totalCount = 0;
		totalCount = assetMapper.getCount();
		pageBean.setTotalCount(totalCount);
		// 总页数
		int totalPage = (int) Math.ceil(1.0 * totalCount / currentCount);
		pageBean.setTotalPage(totalPage);
		int index = (currentPage - 1) * currentCount;
		List<Asset> list = assetMapper.findAsset(index, currentCount);
		pageBean.setList(list);
		return pageBean;
	}

	@Override
	public boolean addAsset(Asset asset) {
		asset.setAssetId(UUID.randomUUID().toString().replaceAll("-", ""));
		int i = assetMapper.addAsset(asset);
		return i > 0 ? true : false;
	}

	@Override
	public boolean deleteAsset(String assetId) {
		int i = assetMapper.deleteAsset(assetId);

		return i > 0 ? true : false;
	}

	@Override
	public Asset findAssetById(String assetId) {
		Asset asset = assetMapper.findAssetById(assetId);
		return asset;
	}

	@Override
	public boolean updateAsset(Asset asset) {
		int i = assetMapper.updateAsset(asset);
		return i > 0 ? true : false;
	}
}
