package service;

import pojo.Information;
import pojo.PageBean;
import pojo.Satisfy;

public interface InformationService {

	PageBean<Information> findInformationByType(int currentCount, int currnetPage, String informationType,String informationTitle);

	boolean addInformation(Information information);

	boolean deleteInformation(String informationId);

	Information findInformationById(String informationId);

	boolean updateInformation(Information information);

	PageBean<Information> findHotInformation(int currentCount, int currentPage);

	boolean star(Satisfy s);

	
}
