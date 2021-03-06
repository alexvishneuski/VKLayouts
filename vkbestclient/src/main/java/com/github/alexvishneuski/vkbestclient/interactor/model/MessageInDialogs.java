package com.github.alexvishneuski.vkbestclient.interactor.model;

public class MessageInDialogs {

    private int mId;
    private UserInDialogs mCurrentUser;
    private UserInDialogs mContactUser;
    private MessageDirection mMessageDirection;
    private int mMessageSendingDate;
    private String mMessageTitle;
    private String mMessageBody;
    private boolean mIsMessageRead;

    public MessageInDialogs() {
    }

    public int getId() {
        return mId;
    }

    public void setId(int pId) {
        mId = pId;
    }

    public UserInDialogs getCurrentUser() {
        return mCurrentUser;
    }

    public void setCurrentUser(UserInDialogs pCurrentUser) {
        mCurrentUser = pCurrentUser;
    }

    public UserInDialogs getContactUser() {
        return mContactUser;
    }

    public void setContactUser(UserInDialogs pContactUser) {
        mContactUser = pContactUser;
    }

    public MessageDirection getMessageDirection() {
        return mMessageDirection;
    }

    public void setMessageDirection(MessageDirection pMessageDirection) {
        mMessageDirection = pMessageDirection;
    }

    public int getMessageSendingDate() {
        return mMessageSendingDate;
    }

    public void setMessageSendingDate(int pMessageSendingDate) {
        mMessageSendingDate = pMessageSendingDate;
    }

    public String getMessageTitle() {
        return mMessageTitle;
    }

    public void setMessageTitle(String pMessageTitle) {
        mMessageTitle = pMessageTitle;
    }

    public String getMessageBody() {
        return mMessageBody;
    }

    public void setMessageBody(String pMessageBody) {
        mMessageBody = pMessageBody;
    }

    public boolean isMessageRead() {
        return mIsMessageRead;
    }

    public void setMessageRead(boolean pMessageRead) {
        mIsMessageRead = pMessageRead;
    }

    @Override
    public String toString() {
        return "MessageInDialogs{" +
                "mId=" + mId +
                ", mCurrentUser=" + mCurrentUser +
                ", mContactUser=" + mContactUser +
                ", mMessageDirection=" + mMessageDirection +
                ", mMessageSendingDate=" + mMessageSendingDate +
                ", mMessageTitle='" + mMessageTitle + '\'' +
                ", mMessageBody='" + mMessageBody + '\'' +
                ", mIsMessageRead=" + mIsMessageRead +
                '}';
    }
}
