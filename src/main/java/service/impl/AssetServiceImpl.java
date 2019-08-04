package service.impl;

import java.util.List;

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
}
