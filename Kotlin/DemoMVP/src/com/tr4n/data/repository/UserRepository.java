package com.tr4n.data.repository;

import com.tr4n.data.OnDataLoadedListener;
import com.tr4n.data.model.User;

import java.util.List;

public interface UserRepository {

    void getUsers(OnDataLoadedListener<List<User>> callback);
}
