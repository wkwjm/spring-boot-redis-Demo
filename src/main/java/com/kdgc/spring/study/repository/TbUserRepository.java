package com.kdgc.spring.study.repository;

import com.kdgc.spring.study.entity.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TbUserRepository extends JpaRepository<TbUser, Integer> {
       TbUser findById(Long id);

}
