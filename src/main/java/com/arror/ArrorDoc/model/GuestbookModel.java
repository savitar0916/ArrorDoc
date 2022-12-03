package com.arror.ArrorDoc.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class GuestbookModel {
    private int ID;
    private int ArticleID;
    private int MemberID;
    private String Content;
    private String CreatedAt;
    private String UpdateAt;
}
