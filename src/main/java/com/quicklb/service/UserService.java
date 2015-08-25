package com.quicklb.service;

import java.util.List;

import com.quicklb.domain.User;

public interface UserService {

    User save(User user);

    List<User> getList();

}
