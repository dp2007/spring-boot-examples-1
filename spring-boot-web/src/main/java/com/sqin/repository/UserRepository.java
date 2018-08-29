package com.sqin.repository;

import com.sqin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by qinsheng on 2018/8/30.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByUsernameOrEmail(String username, String email);
}
