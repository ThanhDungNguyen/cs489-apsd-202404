package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.user.RoleRequest;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.user.RoleResponse;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.service.RoleService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/adsweb/api/v1/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping(value = "/add")
    public ResponseEntity<RoleResponse> addNewRole(@RequestBody @Valid RoleRequest roleRequest) {
        var roleResponse = roleService.addNewRole(roleRequest);
        return new ResponseEntity<>(roleResponse, HttpStatus.CREATED);
    }
}
