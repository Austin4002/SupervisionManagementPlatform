package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Information;
import pojo.InformationExample;

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

	int getCountByType(String informationType);

	List<Information> findInformationByType(@Param("index") int index,@Param("currentCount") int currentCount,@Param("informationType") String informationType);
}