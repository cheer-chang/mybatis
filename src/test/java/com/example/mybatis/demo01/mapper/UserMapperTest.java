package com.example.mybatis.demo01.mapper;

import com.example.mybatis.demo01.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void getAll() {
        for (UserEntity o : userMapper.getAll()) {
            System.out.println(o.getId() + "--" + o.getName());
        }
    }

    @Test
    void findById() {
        UserEntity byId = userMapper.findById(userMapper.getAll().get(0));
        System.out.println(byId.getId() + "--" + byId.getName());
    }

    @Test
    void add() {
        UserEntity entity = new UserEntity();
        entity.setAge(22);
        entity.setCreatorId(1);
        entity.setName("TEST");
        int add = userMapper.add(entity);
        System.out.println(add);
        System.out.println(entity.getId());
    }

    @Test
    void update() {
        UserEntity entity = new UserEntity();
        entity.setId(42);
        entity.setAge(222);
        entity.setCreatorId(10);
        entity.setName("TEST2");
        int update = userMapper.update(entity);
        System.out.println(update);
        System.out.println(entity.getId());
    }

    @Test
    void remove() {
        int remove = userMapper.remove(42L);
        System.out.println(remove);
    }

}