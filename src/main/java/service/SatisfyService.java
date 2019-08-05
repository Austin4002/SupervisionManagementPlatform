package service;

public interface SatisfyService {

	int findSatisfyByInformationId(String informationId);

	int findSatisfyByUserId(String userId, String informationId);

}
