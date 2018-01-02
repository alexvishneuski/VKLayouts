package com.github.alexvishneuski.vkbestclient.presentation.uimodel;

/**
 * Created by alex_vishneuski on 29.11.2017.
 */

public class UserInDialogListViewModel {

    private int mUserId;
    private String mUserFullName;
    private String mUserAvatarPath;

    public UserInDialogListViewModel() {
    }

    public UserInDialogListViewModel(String pUserFullName, String pUserAvatarPath) {
        mUserFullName = pUserFullName;
        mUserAvatarPath = pUserAvatarPath;
    }

    public int getUserId() {

        return mUserId;
    }

    public void setUserId(int pUserId) {
        mUserId = pUserId;
    }

    public String getUserFullName() {

        return mUserFullName;
    }

    public void setUserFullName(String pUserFullName) {
        mUserFullName = pUserFullName;
    }

    public String getUserAvatarPath() {

        return mUserAvatarPath;
    }

    public void setUserAvatarPath(String pUserAvatarPath) {
        mUserAvatarPath = pUserAvatarPath;
    }
}
