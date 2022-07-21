package com.scm.contract.user.service;

import com.scm.contract.user.dto.UserDto;
import com.scm.contract.user.entity.UserEntity;
import com.scm.contract.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public Stream<UserDto> getUser() {

        List<UserEntity> findAllUserEntity = userRepository.findAll();

        Stream<UserDto> userData = findAllUserEntity.stream().map(data -> {

            UserDto userDto = new UserDto();

            userDto.setUserNm(data.getUserNm());
            userDto.setDelYn(data.getDelYn());
            userDto.setEmail(data.getEmail());
            userDto.setDeptNm(data.getDeptNm());
            userDto.setEmployeeNumber(data.getEmployeeNumber());
            userDto.setInsDate(data.getInsDate());
            userDto.setLoginId(data.getLoginId());
            userDto.setUpdDate(data.getUpdDate());

            return userDto;
        });

        return userData;
    }

    @Override
    public Stream<UserDto> getUserById(String loginId) {

        List<UserEntity> findByIdEntity = userRepository.findByLoginId(loginId);

        Stream<UserDto> userDataById = findByIdEntity.stream().map(data-> {

            UserDto userDto = new UserDto();

            userDto.setUserNm(data.getUserNm());
            userDto.setDelYn(data.getDelYn());
            userDto.setEmail(data.getEmail());
            userDto.setDeptNm(data.getDeptNm());
            userDto.setEmployeeNumber(data.getEmployeeNumber());
            userDto.setInsDate(data.getInsDate());
            userDto.setLoginId(data.getLoginId());
            userDto.setUpdDate(data.getUpdDate());

            return userDto;
        });

        return userDataById;
    }

    @Override
    public Stream<UserDto> getUserByUserNm(String userNm) {

        List<UserEntity> findByNameEntity = userRepository.findByUserNm(userNm);

        Stream<UserDto> userDataByName = findByNameEntity.stream().map(data-> {

            UserDto userDto = new UserDto();

            userDto.setUserNm(data.getUserNm());
            userDto.setDelYn(data.getDelYn());
            userDto.setEmail(data.getEmail());
            userDto.setDeptNm(data.getDeptNm());
            userDto.setEmployeeNumber(data.getEmployeeNumber());
            userDto.setInsDate(data.getInsDate());
            userDto.setLoginId(data.getLoginId());
            userDto.setUpdDate(data.getUpdDate());

            return userDto;
        });


        return userDataByName;
    }


}
