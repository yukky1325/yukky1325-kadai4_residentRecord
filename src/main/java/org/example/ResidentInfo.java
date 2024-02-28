package org.example;

import java.time.LocalDate;

public class ResidentInfo {
    private int roomNo;
    private String name;

    private LocalDate birthday;
    private int periodOfResidence;

    public ResidentInfo(int roomNo, String name, LocalDate birthday, int periodOfResidence) {
        this.roomNo = roomNo;
        this.name = name;
        this.birthday = birthday;
        this.periodOfResidence = periodOfResidence;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPeriodOfResidence() {
        return periodOfResidence;
    }
}
