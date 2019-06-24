package ir.webold.liveHesab.repository;

import ir.webold.liveHesab.base.BaseRepository;
import ir.webold.liveHesab.model.Role;

import java.util.UUID;

public interface RoleRepository extends BaseRepository<Role, UUID> {
    public Role findByName(String name);
}
