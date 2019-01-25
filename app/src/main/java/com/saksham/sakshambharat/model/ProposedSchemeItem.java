package com.saksham.sakshambharat.model;

public class ProposedSchemeItem {

    private String schemeHeader;
    private String schemeBody;
    private String schemeImageUrl;

    public ProposedSchemeItem(){}

    public ProposedSchemeItem(String schemeHeader, String schemeBody){
        this.schemeBody = schemeBody;
        this.schemeHeader = schemeHeader;
    }
    public ProposedSchemeItem(String schemeHeader, String schemeBody, String schemeImageUrl){
        this.schemeBody = schemeBody;
        this.schemeHeader = schemeHeader;
        this.schemeImageUrl = schemeImageUrl;
    }

    public String getschemeBody() {
        return schemeBody;
    }

    public String getschemeHeader() {
        return schemeHeader;
    }

    public String getschemeImageUrl() {
        return schemeImageUrl;
    }

    public void setschemeBody(String schemeBody) {
        this.schemeBody = schemeBody;
    }

    public void setschemeHeader(String schemeHeader) {
        this.schemeHeader = schemeHeader;
    }

    public void setschemeImageUrl(String schemeImageUrl) {
        this.schemeImageUrl = schemeImageUrl;
    }
}
