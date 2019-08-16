package com.kdgc.spring.study.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="tb_user")
@Data
public class TbUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "pass_word")
    private String passWord;

    @Column(name = "qq")
    private String qq;

    @Column(name = "phone")
    private String phone;

    @Column(name = "wei_xin")
    private String weiXin;

    @Column(name = "hobby")
    private String hobby;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
