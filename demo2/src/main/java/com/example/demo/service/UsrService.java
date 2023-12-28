package com.example.demo.service;


import com.example.demo.Controller.dto.UsrDTo;
import com.example.demo.common.Result;
import com.example.demo.exception.NotFoundException;
import com.example.demo.mapper.UsrMapper;
import com.example.demo.usr.Usr;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsrService {
    private final UsrMapper usrMapper;
    public UsrService(UsrMapper usrMapper) {
        this.usrMapper = usrMapper;
    }
    public List<Usr> gerUsrs() {
        return usrMapper.findAll();
    }

    public Usr getUsr(Long id) {
        return gerUsrs()
                .stream()
                .filter(usr -> usr.getId().equals(id))
                .findFirst()
//                必须要有的
                .orElseThrow(() -> new NotFoundException(
                        "usr with id" + id + "not find"));
    }

    public  int getSum(){
        return usrMapper.getSum();
    }
    public  boolean insertUsr(Usr usr){
        return  usrMapper.insert(usr);
    }

    public Integer deleteUsr(Long id){
        return usrMapper.delete(id);
    }

    public List<Usr> selectPage(int pageNum,int pageSize) {
        return usrMapper.selectPage(pageNum,pageSize);
    }

    public boolean updateUsr(Usr usr) {
        return usrMapper.update(usr);
    }


    public Result login(UsrDTo usrDTo) {
        String usrname= usrDTo.getUsrname();
        String password=usrDTo.getPassword();
        System.out.println(usrname);
        System.out.println(password);
        if(usrname==null||password==null) return Result.error();
        else  {
            Usr a =usrMapper.login(usrname,password);
            if(a==null) return Result.error();
            else {
                return Result.success(a);
            }
        }
    }
}
