package com.example.demo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ParamProperties {
    @Value("${wyait.name}")
    private String wyaitName;
    @Value("${wyait.title}")
    private String wyaitTitle;
    @Value("${wyait.message}")
    private String wyaitMessage;
    @Value("${wyait.value}")
    private String wyaitValue;
    @Value("${wyait.number}")
    private int wyaitNumber;
    @Value("${wyait.bignumber}")
    private long wyaitBignumber;
    @Value("${wyait.test1}")
    private int wyaitTest1;
    @Value("${wyait.test2}")
    private int wyaitTest2;

    public String getWyaitName() {
        return wyaitName;
    }

    public void setWyaitName(String wyaitName) {
        this.wyaitName = wyaitName;
    }

    public String getWyaitTitle() {
        return wyaitTitle;
    }

    public void setWyaitTitle(String wyaitTitle) {
        this.wyaitTitle = wyaitTitle;
    }

    public String getWyaitMessage() {
        return wyaitMessage;
    }

    public void setWyaitMessage(String wyaitMessage) {
        this.wyaitMessage = wyaitMessage;
    }

    public String getWyaitValue() {
        return wyaitValue;
    }

    public void setWyaitValue(String wyaitValue) {
        this.wyaitValue = wyaitValue;
    }

    public int getWyaitNumber() {
        return wyaitNumber;
    }

    public void setWyaitNumber(int wyaitNumber) {
        this.wyaitNumber = wyaitNumber;
    }

    public long getWyaitBignumber() {
        return wyaitBignumber;
    }

    public void setWyaitBignumber(long wyaitBignumber) {
        this.wyaitBignumber = wyaitBignumber;
    }

    public int getWyaitTest1() {
        return wyaitTest1;
    }

    public void setWyaitTest1(int wyaitTest1) {
        this.wyaitTest1 = wyaitTest1;
    }

    public int getWyaitTest2() {
        return wyaitTest2;
    }

    public void setWyaitTest2(int wyaitTest2) {
        this.wyaitTest2 = wyaitTest2;
    }

    @Override
    public String toString() {
        return "ParamProperties{" +
                "wyaitName='" + wyaitName + '\'' +
                ", wyaitTitle='" + wyaitTitle + '\'' +
                ", wyaitMessage='" + wyaitMessage + '\'' +
                ", wyaitValue='" + wyaitValue + '\'' +
                ", wyaitNumber=" + wyaitNumber +
                ", wyaitBignumber=" + wyaitBignumber +
                ", wyaitTest1=" + wyaitTest1 +
                ", wyaitTest2=" + wyaitTest2 +
                '}';
    }
}
