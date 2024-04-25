package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.user;

import jakarta.validation.constraints.NotBlank;

public record RoleRequest(@NotBlank String name) {

}
