package com.example.demo.Controller;

import com.example.demo.service.VedioService;
import com.example.demo.usr.Vedio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/vedio")
public class VedioController {
    private final VedioService vedioService ;
    @Autowired
    public VedioController(VedioService vedioService) {
        this.vedioService = vedioService;
    }



    @GetMapping
    public List<Vedio> getVedios(){
        return vedioService.getVedios();
    }
    @GetMapping("/{id}")
    public Vedio  getVedio(@PathVariable("id") Long id){
        return vedioService.getVedio(id);
    }
    @PostMapping
    public boolean insertVedio (@RequestBody Vedio vedio ) {
        if(vedio.getId()==null)
            return vedioService.insertVedio(vedio);
        else return vedioService.updateVedio(vedio);
    }
    @DeleteMapping("/{id}")
    public  Integer delete(@PathVariable("id") Long id){
        return vedioService.deleteVedio (id);
    }

    @GetMapping("/page")
    public Map<String, Object> findPage(@RequestParam Integer pageNum
            , @RequestParam Integer pageSize){
        pageNum=(pageNum-1)*pageSize;
        int sum = vedioService.getSum();
        List<Vedio> data = vedioService.selectPage(pageNum,pageSize);
        Map<String, Object> res = new HashMap<>();
        res.put("data",data);
        res.put("sum",sum);
        return res;
    }
}
