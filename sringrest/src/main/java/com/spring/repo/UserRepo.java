package com.spring.repo;

import com.spring.entities.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepo {

    List<User> userList;

    public UserRepo() {
        userList = new ArrayList<>();
    }

    //Adding a user
    public User addUser(User user) {
        // TODO Auto-generated method stub
        userList.add(user);
        return user;
    }

    //Show all users
    public List<User> getUsers() {
        // TODO Auto-generated method stub
        return userList;
    }

    //Show specified user
    public User getUsers(long id) {
        // TODO Auto-generated method stub
        User u = null;

        for(User user : userList)
        {
            if(user.getId() == id)
            {
                u = user;
                break;
            }
        }
        return u;
    }

    //Update a user
    public void updateUser(User user, long id) {
        // TODO Auto-generated method stub

        userList = userList.stream().map(u ->{
            if(u.getId() == id)
            {
                u.setAge(user.getAge());
                u.setGender(user.getGender());
                u.setName(user.getName());
            }
            return u;
        }).collect(Collectors.toList());
    }

    //Delete a user
    public void deleteUser(long id) {
        // TODO Auto-generated method stub
        userList = userList.stream().filter(x -> x.getId() != id).collect(Collectors.toList());
    }
}
