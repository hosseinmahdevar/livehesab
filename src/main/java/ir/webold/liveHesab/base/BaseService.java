package ir.webold.liveHesab.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
import java.util.List;

public abstract class BaseService<T extends BaseEntity,ID>{

    @Autowired
    private BaseRepository<T,ID> repository;

    public T save(T t){
        return repository.save(t);
    }
    List<T> findAll(){
        return repository.findAll();
    }

    List<T> findAll(Sort var1){
        return repository.findAll(var1);
    }

    List<T> findAllById(Iterable<ID> var1){
        return repository.findAllById(var1);

    }

    <S extends T> List<S> saveAll(Iterable<S> var1){
        return repository.saveAll(var1);
    }

    <S extends T> S saveAndFlush(S var1){
        return repository.saveAndFlush(var1);
    }

    void deleteInBatch(Iterable<T> var1){
        repository.deleteInBatch(var1);
    }

    void deleteAllInBatch(){
        repository.deleteAllInBatch();
    }

    T getOne(ID var1){
        return repository.getOne(var1);
    }

    <S extends T> List<S> findAll(Example<S> var1){
        return findAll(var1);
    }

    <S extends T> List<S> findAll(Example<S> var1, Sort var2){
        return repository.findAll(var1,var2);
    }
    public void deleteById(ID id){
        repository.deleteById(id);
    }

}
