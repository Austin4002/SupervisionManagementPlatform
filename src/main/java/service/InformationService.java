package service;

import pojo.Information;
import pojo.PageBean;

public interface InformationService {

	PageBean<Information> findInformationByType(int currentCount, int currnetPage, String informationType2);

	boolean addInformation(Information information);

	boolean deleteInformation(String informationId);

	Information findInformationById(String informationId);

	boolean updateInformation(Information information);

	PageBean<Information> findHotInformation(int currentCount, int currentPage);

	
}
