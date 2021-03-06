package com.obieliakov.tasksmanager.service;

import com.obieliakov.tasksmanager.dto.role.NewRoleDto;
import com.obieliakov.tasksmanager.dto.role.RoleAssignmentDto;
import com.obieliakov.tasksmanager.dto.role.RoleDto;
import com.obieliakov.tasksmanager.model.Role;

public interface RoleService {

    Role roleModelById(Long id);

    RoleDto roleById(Long id);

    RoleDto createRole(NewRoleDto newRoleDto);

    void deleteRole(Long id);

    RoleAssignmentDto assignRole(Long id);

    void unassignRole(Long id);
}
