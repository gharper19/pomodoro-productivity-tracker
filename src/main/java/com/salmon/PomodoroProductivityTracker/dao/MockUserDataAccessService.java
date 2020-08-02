package com.salmon.PomodoroProductivityTracker.dao;

import com.salmon.PomodoroProductivityTracker.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


// Used to mock the database access for testing apis

@Repository("mockDao")  // dependency injection - tells spring to instantiate as a bean
public class MockUserDataAccessService implements UserDao {

    List<User> mock_database = new ArrayList<User>();

    @Override
    public int insertUser(UUID id, User user) {
        mock_database.add(new User(id, user.getName()));
        return 1;
    }
}
