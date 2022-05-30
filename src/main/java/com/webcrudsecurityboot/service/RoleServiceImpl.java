package com.webcrudsecurityboot.service;

import com.webcrudsecurityboot.model.Role;
import com.webcrudsecurityboot.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.getAllRoles();
    }

    @Override
    public Role show(Long id) {
        return roleRepository.show(id);
    }

    @Override
    @Transactional
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    @Transactional
    public void update(Role updatedRole) {
        roleRepository.update(updatedRole);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        roleRepository.delete(id);
    }
}
