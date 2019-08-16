package com.kdgc.spring.study.controller;

import com.kdgc.spring.study.entity.TbUser;
import com.kdgc.spring.study.service.RedisService;
import com.kdgc.spring.study.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private RedisService redisService;

    @ModelAttribute
    public TbUser getTbUser(Long id) {
        TbUser tbUser = null;

        // id 不为空，则从数据库获取
        if (id != null) {
            tbUser = tbUserService.findById(id);
        } else {
            tbUser = new TbUser();
        }

        return tbUser;
    }


    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ModelAndView list() {
            List<TbUser> users = tbUserService.findAll();
            redisService.set("users",users,60*60*24*7);
        return new ModelAndView("user_list", "users", users);
    }

    @RequestMapping(value = "list/model", method = RequestMethod.GET)
    @ResponseBody
    public List<TbUser> list1() {
        List<TbUser> users = tbUserService.findAll();
        return users;
    }


    /**
     * 跳转用户表单页
     * @return
     */
    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String form() {
        Object o = redisService.get("users");
        if (o != null) {
            String json = String.valueOf(o);
            System.out.println(json);
        }
        return "user_form";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String userSave(TbUser tbUser, Model model){
        tbUser.setCreateTime(new Date());
        tbUser.setUpdateTime(new Date());
        tbUserService.save(tbUser);
        model.addAttribute("message","保存成功");
        return "redirect:/user/list";
    }

    @RequestMapping(value = "deleteone", method = RequestMethod.POST)
    @ResponseBody
    public String userSave(Long id){
        TbUser tbUser = new TbUser();
        tbUser.setId(id);
        tbUserService.delete(tbUser);
        String message = "删除成功";
        return message;
    }


}

