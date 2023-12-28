package com.example.demo.service;

import com.example.demo.exception.NotFoundException;
import com.example.demo.mapper.VedioMapper;
import com.example.demo.usr.Vedio;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VedioService {
    private final VedioMapper vedioMapper;

    public VedioService(VedioMapper vedioMapper) {
        this.vedioMapper = vedioMapper;
    }
    public List<Vedio> getVedios() {
        return vedioMapper.findAll();
    }

    public Vedio getVedio(Long id) {
        return getVedios()
                .stream()
                .filter(vedio -> vedio.getId().equals(id))
                .findFirst()
//                必须要有的
                .orElseThrow(() -> new NotFoundException(
                        "usr with id" + id + "not find"));
    }


    public  int getSum(){
        return vedioMapper.getSum();
    }
    public  boolean insertVedio(Vedio vedio){
        return  vedioMapper.insert(vedio);
    }


    public Integer deleteVedio (Long id){
        return vedioMapper.delete(id);
    }

    public List<Vedio> selectPage(int pageNum,int pageSize) {
        return vedioMapper.selectPage(pageNum,pageSize);
    }

    public boolean updateVedio(Vedio vedio) {
        return vedioMapper.update(vedio);
    }
}
