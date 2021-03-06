package com.obieliakov.tasksmanager.service;

import com.obieliakov.tasksmanager.dto.group.*;
import com.obieliakov.tasksmanager.dto.groupMembership.GroupMembershipDto;
import com.obieliakov.tasksmanager.dto.groupinvite.GroupInviteAcceptedDto;
import com.obieliakov.tasksmanager.dto.groupinvite.GroupInviteDto;
import com.obieliakov.tasksmanager.dto.groupinvite.NewGroupInviteDto;
import com.obieliakov.tasksmanager.model.Group;
import com.obieliakov.tasksmanager.model.GroupInvite;

import java.util.List;
import java.util.UUID;

public interface GroupService {

    Group groupModelById(Long id);

    GroupInvite groupInviteModelById(Long id);

    GroupInfoDto groupInfoById(Long id, boolean isAdmin);

    GroupInfoDto createGroup(NewOrUpdateGroupDto newOrUpdateGroupDto);

    GroupInfoDto updateGroupInfo(Long id, NewOrUpdateGroupDto newOrUpdateGroupDto);

    GroupMembersDto groupMembersById(Long id, boolean isAdmin);

    GroupTasksDto groupTasksById(Long id, boolean isAdmin);

    GroupInviteDto createGroupInvite(NewGroupInviteDto newGroupInviteDto);

    GroupInviteAcceptedDto acceptGroupInvite(Long id);

    void declineGroupInvite(Long id);

    void leaveGroup(Long id);

    GroupRolesDto groupRoles(Long id);

    GroupMembersRolesDto groupMembersRolesById(Long id);

    GroupMembershipDto groupMember(Long id, UUID appUserId);

    List<GroupInfoDto> allGroups();

    GroupMembersShortDto groupMembersShortById(Long id);
}
