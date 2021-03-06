package com.iguangjie.mall.dao;

import com.iguangjie.mall.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryMapperTest{

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void testFindById() {
        Category category = categoryMapper.findById(100001);
        System.out.println(category.toString());
    }
}