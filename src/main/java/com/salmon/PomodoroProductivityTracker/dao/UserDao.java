package com.salmon.PomodoroProductivityTracker.dao;

import com.salmon.PomodoroProductivityTracker.model.User;

import java.util.UUID;

public interface UserDao {

    int insertUser(UUID id, User user);

    // Polymorphism - Does default mean use this one if no id is provided?
    default int insertUser(User user){
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }
}
