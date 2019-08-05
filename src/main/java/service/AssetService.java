package service;

import pojo.Asset;
import pojo.PageBean;

public interface AssetService {

	PageBean<Asset> findAsset(int currentCount,int currentPage);

	boolean addAsset(Asset asset);

	boolean deleteAsset(String assetId);

	Asset findAssetById(String assetId);

	boolean updateAsset(Asset asset);

}
