package com.obieliakov.tasksmanager.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AppUserDto {
    private Long id;
    private String loginName;
}
