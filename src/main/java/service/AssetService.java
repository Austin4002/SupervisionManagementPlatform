package service;

import pojo.Asset;
import pojo.PageBean;

public interface AssetService {

	PageBean<Asset> findAsset(int currentCount,int currentPage);

}
