package com.arror.ArrorDoc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arror.ArrorDoc.repository.CategoryDao;

@Service
public class CategoryService {
    @Autowired
    CategoryDao categoryDao;

    public List<Map<String,Object>> getCategory(){
        List<Map<String,Object>> res = categoryDao.getAllCategory();
        return res;
    }
}
