package com.reggie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reggie.common.R;
import com.reggie.entity.Dish;
import com.reggie.service.DishFlavorService;
import com.reggie.service.DishService;

//菜品管理
@RestController
@RequestMapping("/dish")
public class DishController {
    @Autowired
    private DishService dishService;

    @Autowired
    private DishFlavorService dishFlavorService;

    public R<String> save(Dish dish){
        
        return null;
    }
}