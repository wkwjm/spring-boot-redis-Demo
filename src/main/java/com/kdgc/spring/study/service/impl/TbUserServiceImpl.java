package com.kdgc.spring.study.service.impl;

import com.kdgc.spring.study.entity.TbUser;
import com.kdgc.spring.study.repository.TbUserRepository;
import com.kdgc.spring.study.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserRepository tbUserRepository;

    @Override
    public List<TbUser> findAll() {
        return tbUserRepository.findAll();
    }

    @Override
    public TbUser findById(Long id) {
        TbUser user = tbUserRepository.findById(id);
        return user;
    }

    @Override
    public void save(TbUser tbUser) {
        tbUserRepository.save(tbUser);
    }

    @Override
    public void delete(TbUser tbUser) {
        tbUserRepository.delete(tbUser);
    }

}
