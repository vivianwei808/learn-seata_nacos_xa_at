package com.ww.order.vo;

import lombok.Data;

/**
 * @author ww
 */
@Data
public class OrderVo {
    private String userId;
    /**商品编号**/
    private String commodityCode;
    
    private Integer count;
    
    private Integer money;
}
