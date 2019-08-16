package com.kdgc.spring.study.service;

import com.kdgc.spring.study.entity.TbUser;

import java.util.List;


public interface TbUserService {

    public List<TbUser> findAll();

    public  TbUser findById(Long id);

    public  void save(TbUser tbUser);

    public void delete(TbUser tbUser);


}
