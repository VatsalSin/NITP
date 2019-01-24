package com.saksham.sakshambharat.model;

public class ChatItem {

    private String personName;
    private String lastMessage;
    private String personImageUrl;
    private String lastMessageTime;

    public ChatItem(){}

    public ChatItem(String personName, String personImageUrl, String lastMessage, String lastMessageTime){

        this.personName = personName;
        this.personImageUrl = personImageUrl;
         this.lastMessage = lastMessage;
         this.lastMessageTime = lastMessageTime;

    }

    public String getlastMessage() {
        return lastMessage;
    }

    public String getlastMessageTime() {
        return lastMessageTime;
    }

    public String getpersonImageUrl() {
        return personImageUrl;
    }

    public String getpersonName() {
        return personName;
    }

    public void setlastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public void setpersonImageUrl(String personImageUrl) {
        this.personImageUrl = personImageUrl;
    }

    public void setlastMessageTime(String lastMessageTime) {
        this.lastMessageTime = lastMessageTime;
    }

    public void setpersonName(String personName) {
        this.personName = personName;
    }
}
