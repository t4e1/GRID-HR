package org.highfives.grid.user.query.service;

import org.highfives.grid.user.query.dto.LeaderInfoDTO;
import org.highfives.grid.user.query.dto.UserDTO;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserDTO> findAllUsers();

    LeaderInfoDTO findLeaderInfo(int id);

    UserDTO findUserByEmployeeNum(String eNum);

    UserDTO findUserById(int id);

    Map<String, Object> checkNameByEmail(String email);
}
