package com.arror.ArrorDoc.repository;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class CategoryDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Map<String,Object>> getAllCategory(){
        String query = "SELECT * FROM Category";
        Object[] params = new Object[]{};
        List<Map<String,Object>> res = jdbcTemplate.queryForList(query,params);
        return res;
    }
}
