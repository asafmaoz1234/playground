package com.asaf.maoz.playground.autowirefromtestmockito;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDAO, Long> {
    UserDAO findByUserName(String userName);
}
