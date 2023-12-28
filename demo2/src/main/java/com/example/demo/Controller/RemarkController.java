package com.example.demo.Controller;

import com.example.demo.service.ActivityService;
import com.example.demo.service.RemarkService;
import com.example.demo.usr.Activity;
import com.example.demo.usr.Remark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/remark")
public class RemarkController {
    private final RemarkService remarkService ;
    @Autowired
    public RemarkController(RemarkService remarkService) {
        this.remarkService = remarkService;
    }

//    @GetMapping
//    public List<Activity> getActivitys(){
//        return activityService.getActivitys();
//    }

    @GetMapping("/{vid}")
    public List<Remark> getRemark(@PathVariable("vid") Long vid){
        return remarkService.getRemark(vid);
    }
//    @PostMapping
//    public  boolean insertActivity (@RequestBody Activity activity ) {
//        if(activity.getId()==null)
//            return activityService.insertActivity(activity);
//        else return activityService.updateActivity(activity);
//    }
//    @DeleteMapping("/{id}")
//    public  Integer delete(@PathVariable("id") Long id){
//        return activityService.deleteActivity (id);
//    }
//
//    @GetMapping("/page")
//    public Map<String, Object> findPage(@RequestParam Integer pageNum
//            , @RequestParam Integer pageSize){
//        pageNum=(pageNum-1)*pageSize;
//        int sum = activityService.getSum();
//        List<Activity> data = activityService.selectPage(pageNum,pageSize);
//        Map<String, Object> res = new HashMap<>();
//        res.put("data",data);
//        res.put("sum",sum);
//        return res;
//    }
}

