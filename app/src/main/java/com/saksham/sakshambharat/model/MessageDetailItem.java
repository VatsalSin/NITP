package com.saksham.sakshambharat.model;

public class MessageDetailItem {

    private String message;
    private String messageTime;
    private boolean readStatus;

    public MessageDetailItem(){}

    public MessageDetailItem(String message, String messageTime, boolean readStatus){
        this.message = message;
        this.messageTime = messageTime;
        this.readStatus = readStatus;
    }

    public boolean isreadStatus() {
        return readStatus;
    }

    public String getmessage() {
        return message;
    }

    public String getmessageTime() {
        return messageTime;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public void setmessageTime(String messageTime) {
        this.messageTime = messageTime;
    }

    public void setreadStatus(boolean readStatus) {
        this.readStatus = readStatus;
    }
}
