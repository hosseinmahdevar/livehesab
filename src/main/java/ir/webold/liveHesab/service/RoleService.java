package ir.webold.liveHesab.service;

import ir.webold.liveHesab.base.BaseService;
import ir.webold.liveHesab.model.Role;
import ir.webold.liveHesab.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class RoleService extends BaseService<Role, UUID> {
    @Autowired
    RoleRepository roleRepository;
    public Role findByName(String name){
        return roleRepository.findByName(name);
    }
}
