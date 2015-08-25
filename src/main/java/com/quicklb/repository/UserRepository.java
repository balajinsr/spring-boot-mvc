package com.quicklb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quicklb.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
}
