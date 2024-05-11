package org.highfives.grid.user.query.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTests {

    @Autowired
    private UserServiceImpl userService;

    @DisplayName("팀장, 부서장 정보 조회")
    @Test
    void findLeaderInfo() {

        int id = 2;
        Assertions.assertDoesNotThrow(
                () -> userService.findLeaderInfo(id)
        );


    }
}