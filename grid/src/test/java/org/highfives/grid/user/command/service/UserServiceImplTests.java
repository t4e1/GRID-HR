package org.highfives.grid.user.command.service;

import jakarta.transaction.Transactional;
import org.highfives.grid.user.command.aggregate.Gender;
import org.highfives.grid.user.command.aggregate.JoinType;
import org.highfives.grid.user.command.aggregate.Role;
import org.highfives.grid.user.command.aggregate.WorkType;
import org.highfives.grid.user.command.dto.UserDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.highfives.grid.user.command.aggregate.Gender.M;
import static org.highfives.grid.user.command.aggregate.JoinType.NEW;
import static org.highfives.grid.user.command.aggregate.Role.ROLE_USER;
import static org.highfives.grid.user.command.aggregate.WorkType.C;
import static org.highfives.grid.user.command.aggregate.YN.N;

@SpringBootTest
class UserServiceImplTests {

    @Autowired
    private UserServiceImpl userService;

    static Stream<Arguments> userList() {
        List<UserDTO> userDTO = new ArrayList<>();

        userDTO.add(new UserDTO("testemail@gamil.com","testpwd","tester1",
                "2499999", M,"010-1234-5678",
                "2024-05-06", NEW, WorkType.R, "2024-05-06",ROLE_USER,
                4,1,1,1));

        userDTO.add(new UserDTO("testemail2@gamil.com","testpwd","tester1",
                "2399999", M,"010-5678-1234",
                "2024-05-06", NEW, WorkType.R, "2024-05-06",ROLE_USER,
                4,1,1,1));

        return Stream.of(
                Arguments.of(userDTO)
        );
    }

//    static Stream<Arguments> modifyInfo() {
//
//        UserDTO userDTO =
//
//        return Stream.of(
//                Arguments.of(1, ),
//                Arguments.of(56, new UserDTO())
//        );
//    }

    @DisplayName("다중 유저 등록 테스트 - 정상 동작")
    @ParameterizedTest
    @MethodSource("userList")
    @Transactional
    void addMultiUserNormalTest(List<UserDTO> givenInfo) {

        Assertions.assertDoesNotThrow(
                () -> userService.addMultiUser(givenInfo)
        );
    }

//    @DisplayName("단일 유저 수정 테스트 - 정상 동작")
//    @ParameterizedTest
//    @MethodSource("modifyInfo")
//    @Transactional
//    void modifyUserNormalTest(int id, UserDTO infos) {
//
//        Assertions.assertDoesNotThrow(
//                () -> userService.modifyUser(id, infos)
//        );
//    }

//
//    @DisplayName("유저 수정")
//    @Test
//    @Transactional
//    void modifyUserTest() {
//
//        Assertions.assertDoesNotThrow(
//                () -> userService.modifyUser(1, new UserDTO(1, "test@gmail.com"))
//        );
//    }
//
//    @DisplayName("유저 일괄 수정")
//    @Test
//    @Transactional
//    void modifyMultiUserTest() {
//
//        List<UserDTO> userDTO = new ArrayList<>();
//        userDTO.add(new UserDTO(1, "test@gmail.com", "testpwd","Admin",
//                "9999999",M,"010-0000-0000",null,"482123",
//                "테스트시 테스트구","test-task","1999-12-31",NEW,null,N,C,
//                "1999-12-31","2999_12-31",10000,N,null, ROLE_USER,4,
//                1,1,1));
//        userDTO.add(new UserDTO(2, "test2@gmail.com", "testpwd","홍길동",
//                "240101",M,"010-0000-0001",null,"482123",
//                "테스트시 테스트구","test-task","1999-12-31",NEW,null,N,C,
//                "1999-12-31","2999_12-31",10000,N,null, ROLE_USER,4,
//                1,1,1));
//
//        Assertions.assertDoesNotThrow(
//
//                () -> userService.modifyMultiUser(userDTO)
//        );
//    }
//
//    @DisplayName("유저 탈퇴")
//    @Test
//    @Transactional
//    void deleteUserTest() {
//
//        Assertions.assertDoesNotThrow(
//                () -> userService.deleteUser("9999999")
//        );
//    }
//
//    @DisplayName("성별 변경")
//    @Test
//    @Transactional
//    void changeGenderTest() {
//
//        Assertions.assertEquals(userService.changeGender(1),false);
//        Assertions.assertEquals(userService.changeGender(4),true);
//    }
//
//    @DisplayName("비밀번호 리셋")
//    @Test
//    @Transactional
//    void resetPwdTest() {
//        Map<String, String> test = new HashMap<>();
//        test.put("email", "gridpeople2024@gmail.com");
//        test.put("pwd", "qwer1234!");
//
//        Assertions.assertDoesNotThrow(
//                () -> userService.resetPwd(test)
//        );
//    }

}