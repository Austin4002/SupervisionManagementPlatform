package service;

import pojo.PageBean;
import pojo.Resource;

public interface ResourceService {

	PageBean<Resource> findResource(int currentCount, int currentPage);

	Resource findResourceById(String resourceId);

	boolean updateResource(Resource resource);

	boolean addResource(Resource resource);

	boolean deleteResource(String resourceId);

}
