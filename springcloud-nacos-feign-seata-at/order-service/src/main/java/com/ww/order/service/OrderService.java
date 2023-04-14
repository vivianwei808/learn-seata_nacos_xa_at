package com.ww.order.service;

import com.ww.datasource.entity.Order;
import com.ww.order.vo.OrderVo;
import io.seata.core.exception.TransactionException;

public interface OrderService {

    /**
     * 保存订单
     */
    Order saveOrder(OrderVo orderVo) throws TransactionException;
}