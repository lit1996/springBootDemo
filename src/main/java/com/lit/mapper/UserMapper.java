package com.lit.mapper;

import com.lit.pojo.MUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lit
 * @date 2020/1/11 16:10:02
 */
public interface UserMapper {
    List<MUser> getUserList();
}
