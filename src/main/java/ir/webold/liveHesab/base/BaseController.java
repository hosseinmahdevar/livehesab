package ir.webold.liveHesab.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.io.Serializable;
import java.util.Arrays;


public abstract class BaseController<T extends BaseEntity<ID>, ID extends Serializable> {

    @Autowired
    private BaseService<T, ID> baseService;

    public BaseService<T, ID> getBaseService() {
        return baseService;
    }

    public <T> T getBaseService(Class<T> t) {
        return (T) baseService;
    }
    @PostMapping
    public T create(@RequestBody T t){
        return baseService.save(t) ;
    }
    @GetMapping
    public T read(@PathParam("id") ID id){

        return baseService.getOne(id);

    }
    @PutMapping
    public T update(@RequestBody T t){
        return baseService.save(t);
    }
    @DeleteMapping
    public String delete(@PathParam("id") ID id){
        baseService.deleteById(id);
        return "Delete is done";
    }
}
