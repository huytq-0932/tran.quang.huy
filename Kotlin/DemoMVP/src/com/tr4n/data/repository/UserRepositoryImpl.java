package com.tr4n.data.repository;

import com.tr4n.data.OnDataLoadedListener;
import com.tr4n.data.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public void getUsers(OnDataLoadedListener<List<User>> callback) {
        List<User> users = new ArrayList<>();
        users.add(new User(0, "Tran Van A"));
        users.add(new User(1, "Tran Van B"));
        users.add(new User(2, "Tran Van C"));
        users.add(new User(3, "Tran Van D"));

        if (users.isEmpty()) {
            callback.onFailure("Data is empty");
        } else {
            callback.onSuccess(users);
        }
    }
}
