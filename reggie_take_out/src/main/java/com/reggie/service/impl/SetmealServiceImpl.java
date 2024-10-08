package com.reggie.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.reggie.entity.Setmeal;
import com.reggie.mapper.SetmealMapper;
import com.reggie.service.SetmealService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService{
    
}
