package com.viewnext.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viewnext.rest.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

}
