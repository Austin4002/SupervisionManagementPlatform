package service;

import pojo.PageBean;
import pojo.Resource;

public interface ResourceService {

	PageBean<Resource> findResource(int currentCount, int currentPage);

}
