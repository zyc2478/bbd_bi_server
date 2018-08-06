package com.wanghuan.dao;

import com.wanghuan.model.sys.VwBidListEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * VwBidListDAO继承基类
 */
@Repository
@Mapper
public interface VwBidListDao {

    VwBidListEntity selectByPrimaryKey(long id);

    VwBidListEntity selectVwBidList(String bidDate);

    List<VwBidListEntity> getVwBidSummary();

    int updateByPrimaryKeySelective(VwBidListEntity record);

    int updateByPrimaryKey(VwBidListEntity record);

    List<VwBidListEntity> selectByBidDate(String bidDate);

    List<VwBidListEntity> getLatestBidSummary(long bidDateTime);
}