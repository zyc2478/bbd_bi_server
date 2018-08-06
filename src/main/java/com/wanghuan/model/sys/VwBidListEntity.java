package com.wanghuan.model.sys;

import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * vw_bid_list
 * @author 
 */
public class VwBidListEntity {
    private String bid_date;

    @NotEmpty
    private Long bid_count;

    private BigDecimal bid_total_amount;

    private Date bid_date_time;

    private static final long serialVersionUID = 1L;

    public String getBid_date() {
        return bid_date;
    }

    public void setBid_date(String bid_date) {
        this.bid_date = bid_date;
    }

    public Long getBid_count() {
        return bid_count;
    }

    public void setBid_count(Long bid_count) {
        this.bid_count = bid_count;
    }

    public BigDecimal getBid_total_amount() {
        return bid_total_amount;
    }

    public void setBid_total_amount(BigDecimal bid_total_amount) {
        this.bid_total_amount = bid_total_amount;
    }

    public Date getBid_date_time() {
        return bid_date_time;
    }

    public void setBid_date_time(Date bid_date_time) {
        this.bid_date_time = bid_date_time;
    }

}