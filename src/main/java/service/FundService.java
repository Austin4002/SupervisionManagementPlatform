package service;

import pojo.Fund;
import pojo.PageBean;

public interface FundService {

	boolean addFund(Fund fund);

	PageBean<Fund> findAllFund(int currentCount, int currentPage);

	boolean updateFund(Fund fund);

	boolean deleteFund(String fundId);

	Fund findFundById(String fundId);
}
