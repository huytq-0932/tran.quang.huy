package com.tr4n.ui;

import com.tr4n.data.OnDataLoadedListener;
import com.tr4n.data.model.User;

import java.util.List;

public interface HomeContract {
    interface View {
        void showUsers(List<User> users);

        void showError(String error);
    }

    interface Presenter {
        void setView(View view);

        void getUsers();
    }
}
