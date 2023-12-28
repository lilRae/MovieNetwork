package com.example.demo.Controller;

import com.example.demo.Controller.dto.UsrDTo;
import com.example.demo.common.Result;
import com.example.demo.mapper.UsrMapper;
import com.example.demo.service.UsrService;
import com.example.demo.usr.Usr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/usr")
public class UsrController {

    private final UsrService usrService;
    @Autowired
    public UsrController(UsrService usrService){
        this.usrService=usrService;
    }
    @GetMapping
    public List<Usr> getUsrs(){
        return usrService.gerUsrs();
    }
    @PostMapping("/login")
    public Result login(@RequestBody UsrDTo usrDTo){
        return usrService.login(usrDTo);
    }
    @GetMapping("/{id}")
    public Usr  getUsr(@PathVariable("id") Long id){
        return usrService.getUsr(id);
    }
    @PostMapping
     public  boolean insertUsr(@RequestBody Usr usr) {
        if(usr.getId()==null)
         return usrService.insertUsr(usr);
        else return usrService.updateUsr(usr);
    }
    @DeleteMapping("/{id}")
    public  Integer delete(@PathVariable("id") Long id){
        return usrService.deleteUsr(id);
    }

    @GetMapping("/page")
    public Map<String, Object> findPage(@RequestParam Integer pageNum
                ,@RequestParam Integer pageSize){
        pageNum=(pageNum-1)*pageSize;
          int sum = usrService.getSum();
          List<Usr> data = usrService.selectPage(pageNum,pageSize);
          Map<String, Object> res = new HashMap<>();
          res.put("data",data);
          res.put("sum",sum);
         return res;
    }
}
