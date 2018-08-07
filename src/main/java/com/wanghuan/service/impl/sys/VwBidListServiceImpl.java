package com.wanghuan.service.impl.sys;

import com.wanghuan.dao.VwBidListDao;
import com.wanghuan.model.sys.VwBidListEntity;
import com.wanghuan.service.sys.VwBidListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        System.out.println(current_time);
        long diffDaysl = new Long(diffDays);
        long calc_time = current_time / 1000 -  diffDaysl * 3600 * 24 ;
        System.out.println("calc_time:" + calc_time);
        System.out.println("calc_date" +  new Date(calc_time));
        List<VwBidListEntity> bidSummaryList = vwBidListDao.getLatestBidSummary(calc_time);
        return bidSummaryList;
    }
}