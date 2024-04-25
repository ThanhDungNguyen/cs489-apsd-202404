package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.user.RoleRequest;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.user.RoleResponse;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model.Role;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.repository.RoleRepository;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.service.RoleService;

public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RoleResponse addNewRole(RoleRequest roleRequest) {
        var newRole = new Role(null, roleRequest.name(), null);
        roleRepository.save(newRole);
        return new RoleResponse(newRole.getRoleId(), newRole.getName());
    }

}
