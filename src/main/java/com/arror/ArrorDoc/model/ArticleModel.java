package com.arror.ArrorDoc.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class ArticleModel {
    private int ID;
    private int MemberID;
    private int CategoryID;
    private String Name;
    private String CreateAt;
    private String UpdateAt;
}
