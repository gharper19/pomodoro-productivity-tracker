package com.salmon.PomodoroProductivityTracker.service;

import com.salmon.PomodoroProductivityTracker.dao.UserDao;
import com.salmon.PomodoroProductivityTracker.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.UUID;

// Invokes UserDao to perform functions
@Service    // Component works the same here, Service is just more descriptive
public class UserService {
    private final UserDao userDao;

    // Getting the user dao here instead of the actual UserDataAccessService allows us to show off dependency injection later
    @Autowired
    public UserService(@Qualifier("mockDao") UserDao userDao) {
        this.userDao = userDao;
    }

    // Here the service generates a random id to pass to the dao
    public int addUser(User user){
        return userDao.insertUser( UUID.randomUUID(), user);
    }

    public int addUser(UUID id, User user){
        return userDao.insertUser( id, user);
    }
}
