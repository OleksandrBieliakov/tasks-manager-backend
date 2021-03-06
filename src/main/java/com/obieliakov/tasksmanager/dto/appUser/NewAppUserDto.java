package com.obieliakov.tasksmanager.dto.appUser;

import com.obieliakov.tasksmanager.model.AppUser;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class NewAppUserDto {

    @NotNull
    @Size(min = AppUser.NAMES_MIN_LENGTH, max = AppUser.NAMES_MAX_LENGTH)
    private String loginName;

    @NotNull
    private Boolean publicEmail;

    @NotNull
    private Boolean publicFirstLastName;

    public void trim() {
        if (loginName != null) {
            loginName = loginName.trim();
        }
    }
}
