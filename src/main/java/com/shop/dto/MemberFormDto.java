package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberFormDto {
    // 이름 이메일 패스워드 주소
    private String name;
    private String email;
    private String password;
    private String address;
}
