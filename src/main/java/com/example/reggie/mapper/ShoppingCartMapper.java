package com.example.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie.model.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {
}