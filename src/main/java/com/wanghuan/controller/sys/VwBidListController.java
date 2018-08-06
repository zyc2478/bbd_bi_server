package com.wanghuan.controller.sys;

import com.wanghuan.model.sys.PageResult;
import com.wanghuan.service.sys.VwBidListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class VwBidListController {

    private Logger log = LoggerFactory.getLogger(RoleController.class);

    @Resource(name = "vwBidListServiceImpl")
    private VwBidListService vwBidListService;

    @GetMapping("/selectVwBidList")
    public PageResult selectVwBidList(){
        String bidDate = "2018-6-12";
        System.out.println("********  in getVwBid *******");
        PageResult pr = new PageResult();
        pr.setData(vwBidListService.getBidByDate(bidDate));
        return pr;
    }

    @GetMapping("/getLatestBidSummary")
/*    public PageResult getBidSummary(@PathVariable(value = "diffDays") int diffDays){*/
    public PageResult getBidSummary(@RequestParam int diffDays){

        PageResult pr = new PageResult();
        pr.setData(vwBidListService.getBidSummaryByDiff(diffDays));
        return pr;
    }
}