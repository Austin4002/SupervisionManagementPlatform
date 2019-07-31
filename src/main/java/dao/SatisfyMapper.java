package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Satisfy;
import pojo.SatisfyExample;

public interface SatisfyMapper {
    long countByExample(SatisfyExample example);

    int deleteByExample(SatisfyExample example);

    int deleteByPrimaryKey(String satisfyId);

    int insert(Satisfy record);

    int insertSelective(Satisfy record);

    List<Satisfy> selectByExample(SatisfyExample example);

    Satisfy selectByPrimaryKey(String satisfyId);

    int updateByExampleSelective(@Param("record") Satisfy record, @Param("example") SatisfyExample example);

    int updateByExample(@Param("record") Satisfy record, @Param("example") SatisfyExample example);

    int updateByPrimaryKeySelective(Satisfy record);

    int updateByPrimaryKey(Satisfy record);
}