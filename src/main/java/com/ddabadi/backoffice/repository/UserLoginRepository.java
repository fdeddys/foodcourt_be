package com.ddabadi.backoffice.repository;

import com.ddabadi.backoffice.domain.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin, Integer> {

    Optional <UserLogin> findByUserNameAndPassword(String userName, String password);

}
