package com.cw.stu.springboot.web.dao;

import com.cw.stu.springboot.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author WuLiangzhi  2019/06/14 17:33
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUserName(String userName);

    User findUserByUserNameOrEmail(String userName, String email);

}
