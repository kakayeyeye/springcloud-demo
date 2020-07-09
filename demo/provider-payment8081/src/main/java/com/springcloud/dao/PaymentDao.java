package com.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springcloud.dto.Payment;
import org.apache.ibatis.annotations.Mapper;

public interface PaymentDao extends BaseMapper<Payment> {

    int create(Payment payment);
}
