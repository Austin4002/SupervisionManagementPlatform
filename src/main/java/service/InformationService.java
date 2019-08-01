package service;

import java.util.List;

import pojo.Information;
import pojo.PageBean;

public interface InformationService {

	PageBean<Information> findInformationByType(int currentCount, int currnetPage, String informationType2);

	
}
