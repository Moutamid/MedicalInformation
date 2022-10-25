package com.moutamid.medicalinformation.model;

public class HistoryModel {
    String title, desc;

    public HistoryModel() {
    }

    public HistoryModel(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
