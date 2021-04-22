package com.obieliakov.tasksmanager.dto.role;

import com.obieliakov.tasksmanager.model.Role;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UpdateRoleDto {

    @NotNull
    @Size(min= Role.TITLE_MIN_LENGTH, max=Role.TITLE_MAX_LENGTH)
    private String title;
}
