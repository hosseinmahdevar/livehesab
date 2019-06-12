package ir.webold.liveHesab.repository;

import ir.webold.liveHesab.base.BaseRepository;
import ir.webold.liveHesab.model.User;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends BaseRepository<User, UUID> {
}
