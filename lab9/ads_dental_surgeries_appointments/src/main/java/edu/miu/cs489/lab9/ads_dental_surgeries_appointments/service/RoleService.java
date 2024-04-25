package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.service;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.user.RoleRequest;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.user.RoleResponse;

public interface RoleService {
    RoleResponse addNewRole(RoleRequest roleRequest);
}
