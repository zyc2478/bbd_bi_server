package com.wanghuan.service.impl.sys;

import com.wanghuan.dao.VwBidListDao;
import com.wanghuan.model.sys.VwBidListEntity;
import com.wanghuan.service.sys.VwBidListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(value="vwBidListServiceImpl")
public class VwBidListServiceImpl implements VwBidListService {

    @Autowired
    private VwBidListDao vwBidListDao;

    @Override
    public List<VwBidListEntity> getBidByDate(String bidDate) {
        return vwBidListDao.selectByBidDate(bidDate);
    }

    @Override
    public List<VwBidListEntity> getBidSummaryByDiff(int diffDays) {
        long current_time = new Date().getTime();
        long calc_time = current_time - diffDays * 3600 * 24;
        List<VwBidListEntity> bidSummaryList = vwBidListDao.getLatestBidSummary(calc_time);
        return bidSummaryList;
    }

}