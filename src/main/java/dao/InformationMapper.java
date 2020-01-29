package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Information;
import pojo.InformationExample;
import pojo.Satisfy;

public interface InformationMapper {
    long countByExample(InformationExample example);

    int deleteByExample(InformationExample example);

    int deleteByPrimaryKey(String informationId);

    int insert(Information record);

    int insertSelective(Information record);

    List<Information> selectByExample(InformationExample example);

    Information selectByPrimaryKey(String informationId);

    int updateByExampleSelective(@Param("record") Information record, @Param("example") InformationExample example);

    int updateByExample(@Param("record") Information record, @Param("example") InformationExample example);

    int updateByPrimaryKeySelective(Information record);

    int updateByPrimaryKey(Information record);

	int getCountByType(@Param("informationType") String informationType,@Param("informationTitle") String informationTitle);

	List<Information> findInformationByType(@Param("index") int index,@Param("currentCount") int currentCount,@Param("informationType") String informationType,@Param("informationTitle") String informationTitle);

	int addInformation(Information information);

	int deleteInformation(String informationId);

	Information findInformationById(String informationId);

	int updateInformation(Information information);

	int getCountByIsHot();

	List<Information> findHotInformation(@Param("index") int index,@Param("currentCount") int currentCount);

	int star(Satisfy s);
}