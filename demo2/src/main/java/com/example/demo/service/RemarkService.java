package com.example.demo.service;

import com.example.demo.mapper.ActivityMapper;
import com.example.demo.mapper.RemarkMapper;
import com.example.demo.usr.Activity;
import com.example.demo.usr.Remark;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RemarkService {
    private final RemarkMapper remarkMapper;

    public RemarkService(RemarkMapper remarkMapper) {
        this.remarkMapper = remarkMapper;
    }

//    public List<Activity> getActivitys() {
//        return activityMapper.findAll();
//    }
//
//    public Activity getActivity(Long vid) {
//        return getActivitys()
//                .stream()
//                .filter(usr -> usr.getId().equals(vid))
//                .findFirst()
////                必须要有的
//                .orElseThrow(() -> new NotFoundException(
//                        "usr with id" + vid + "not find"));
//    }
//
//
//    public  int getSum(){
//        return activityMapper.getSum();
//    }
//    public  boolean insertActivity(Activity activity){
//        return  activityMapper.insert(activity);
//    }
//
//
//    public Integer deleteActivity (Long id){
//        return activityMapper.delete(id);
//    }
//
//    public List<Activity> selectPage(int pageNum,int pageSize) {
//        return activityMapper.selectPage(pageNum,pageSize);
//    }
//
//    public boolean updateActivity(Activity Activity) {
//        return activityMapper.update(Activity);
//    }

    public List<Remark> getRemark(Long vid) {
        return remarkMapper.getRemark(vid);
    }
}
