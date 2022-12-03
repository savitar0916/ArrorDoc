package com.arror.ArrorDoc.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class MemberModel {
    private int ID;

    @NotBlank(message = "帳號不得為空值")
    private String Account;

    @NotBlank(message = "密碼不得為空值")
    private String Key;

    @NotBlank(message = "信箱不得為空值")
    @Email
    private String Email;

    @Past(message = "生日不得為空直且需是一個過去的日期")
    private String Birthday;

    @NotBlank(message = "性別不得為空值")
    private String Sex;
}
