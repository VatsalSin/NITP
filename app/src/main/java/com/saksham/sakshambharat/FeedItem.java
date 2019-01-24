package com.saksham.sakshambharat;

public class FeedItem {

    private String eventImageUrl;
    private String eventName;
    private String eventDate;
    private String eventVenue;
    private String eventLongDescription, eventShortDescription;
    private int eventId;

    public FeedItem(){}

    public FeedItem(int eventId, String eventName, String eventDate, String eventVenue, String eventImageUrl, String eventLongDescription){

        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventVenue = eventVenue;
        this.eventImageUrl = eventImageUrl;
        this.eventLongDescription = eventLongDescription;

    }

    public FeedItem(int eventId, String eventName, String eventDate, String eventImageUrl, String eventShortDescription){
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventImageUrl = eventImageUrl;
        this.eventShortDescription = eventShortDescription;
    }

    public int geteventId() {
        return eventId;
    }

    public String geteventName() {
        return eventName;
    }

    public String geteventDate() {
        return eventDate;
    }

    public String geteventVenue() {
        return eventVenue;
    }

    public String geteventImageUrl() {
        return eventImageUrl;
    }

    public void seteventId(int eventId) {
        this.eventId = eventId;
    }

    public void seteventName(String eventName) {
        this.eventName = eventName;
    }

    public void seteventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void seteventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public void seteventImageUrl(String eventImageUrl) {
        this.eventImageUrl = eventImageUrl;
    }

    public String geteventLongDescription() {
        return eventLongDescription;
    }

    public String geteventShortDescription() {
        return eventShortDescription;
    }

    public void seteventLongDescription(String eventLongDescription) {
        this.eventLongDescription = eventLongDescription;
    }

    public void seteventShortDescription(String eventShortDescription) {
        this.eventShortDescription = eventShortDescription;
    }
}
