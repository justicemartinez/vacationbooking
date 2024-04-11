package com.example.demo.entities;

public enum StatusType {
    pending("pending"),
    ordered("ordered"),
    canceled("canceled");

    private final String dbValue;

    StatusType(String dbValue) {
        this.dbValue = dbValue;
    }

    public String getDbValue() {
        return this.dbValue;
    }
}