package com.lit.dao;

import com.lit.entry.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lijun
 * @date 2020/1/11 11:16
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
