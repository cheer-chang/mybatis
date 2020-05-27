package com.example.mybatis.demo01.mapper;

import com.example.mybatis.demo01.entity.UserEntity;

import java.util.List;

public interface UserMapper {


    /**
     * 获取全部信息
     * @return
     */
    List<UserEntity> getAll();

    /**
     * 根据id查询
     * @param userEntity
     * @return
     */
    UserEntity findById(UserEntity userEntity);

    /**
     * 添加信息
     * @param entity
     * @return
     */
    int add(UserEntity entity);

    /**
     * 修改信息
     * @param entity
     * @return
     */
    int update(UserEntity entity);

    /**
     * 删除信息
     * @param id
     * @return
     */
    int remove(Long id);

}
