package ir.webold.liveHesab.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BaseRepository<T extends BaseEntity,ID> extends JpaRepository<T,ID> {

}
