package com.example.demo.service;

import com.example.demo.exception.NotFoundException;
import com.example.demo.mapper.ActivityMapper;
import com.example.demo.usr.Activity;
import com.example.demo.usr.Usr;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActivityService {
    private final ActivityMapper activityMapper;
    
    public ActivityService(ActivityMapper activityMapper) {
        this.activityMapper = activityMapper;
    }

    public List<Activity> getActivitys() {
        return activityMapper.findAll();
    }

    public Activity getActivity(Long vid) {
        return getActivitys()
                .stream()
                .filter(usr -> usr.getId().equals(vid))
                .findFirst()
//                必须要有的
                .orElseThrow(() -> new NotFoundException(
                        "usr with id" + vid + "not find"));
    }


    public  int getSum(){
        return activityMapper.getSum();
    }
    public  boolean insertActivity(Activity activity){
        activityMapper.insert(activity);
         return true;
    }


    public Integer deleteActivity (Long id){
        return activityMapper.delete(id);
    }

    public List<Activity> selectPage(int pageNum,int pageSize) {
        return activityMapper.selectPage(pageNum,pageSize);
    }

    public boolean updateActivity(Activity Activity) {
        return activityMapper.update(Activity);
    }

    public List<Activity> getvActivity(Long vid) {
        return activityMapper.getvActivity(vid);
    }

    public boolean addActivity(long id) {
        return activityMapper.addActivity(id);
    }
}
