package com.tr4n.ui;

import com.tr4n.data.OnDataLoadedListener;
import com.tr4n.data.model.User;
import com.tr4n.data.repository.UserRepository;

import java.util.List;

public class HomePresenter implements HomeContract.Presenter {

    private HomeContract.View view;
    private UserRepository repository;

    public HomePresenter(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void setView(HomeContract.View view) {
        this.view = view;
    }

    @Override
    public void getUsers() {
        repository.getUsers(new OnDataLoadedListener<List<User>>() {
            @Override
            public void onSuccess(List<User> data) {
                view.showUsers(data);
            }

            @Override
            public void onFailure(String error) {
                view.showError(error);
            }
        });
    }
}
