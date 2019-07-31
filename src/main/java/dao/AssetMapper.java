package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Asset;
import pojo.AssetExample;

public interface AssetMapper {
    long countByExample(AssetExample example);

    int deleteByExample(AssetExample example);

    int deleteByPrimaryKey(String assetId);

    int insert(Asset record);

    int insertSelective(Asset record);

    List<Asset> selectByExample(AssetExample example);

    Asset selectByPrimaryKey(String assetId);

    int updateByExampleSelective(@Param("record") Asset record, @Param("example") AssetExample example);

    int updateByExample(@Param("record") Asset record, @Param("example") AssetExample example);

    int updateByPrimaryKeySelective(Asset record);

    int updateByPrimaryKey(Asset record);
}