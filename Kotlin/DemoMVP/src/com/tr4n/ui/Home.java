package com.tr4n.ui;

import com.tr4n.data.model.User;
import com.tr4n.data.repository.UserRepository;
import com.tr4n.data.repository.UserRepositoryImpl;

import java.util.List;

public class Home implements HomeContract.View {

    private HomeContract.Presenter presenter;

    public Home() {
        initPresenter();
        start();
    }

    private void initPresenter() {
        UserRepository repository = new UserRepositoryImpl();
        presenter = new HomePresenter(repository);
        presenter.setView(this);
    }

    public void start() {
        if (presenter != null) {
            presenter.getUsers();
        }
    }

    @Override
    public void showUsers(List<User> users) {
        for (User user : users) {
            System.out.println("User: " + user);
        }
    }

    @Override
    public void showError(String error) {
        System.out.print("[ERROR] " + error);
    }
}
