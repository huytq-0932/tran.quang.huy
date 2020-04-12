package com.tr4n.data;

public interface OnDataLoadedListener<T> {

    void onSuccess(T data);

    void onFailure(String error);
}
