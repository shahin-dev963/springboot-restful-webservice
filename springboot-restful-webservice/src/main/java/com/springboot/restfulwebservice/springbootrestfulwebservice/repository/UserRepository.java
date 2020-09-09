package com.springboot.restfulwebservice.springbootrestfulwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.restfulwebservice.springbootrestfulwebservice.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}