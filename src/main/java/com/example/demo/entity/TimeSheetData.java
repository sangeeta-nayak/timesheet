package com.example.demo.entity;
import java.util.List;

public class TimeSheetData {
    private Integer weekNo;
    private Integer monthNo;

    public WeekName weekNames;

    public Integer getWeekNo() {
        return weekNo;
    }

    public void setWeekNo(Integer weekNo) {
        this.weekNo = weekNo;
    }

    public Integer getMonthNo() {
        return monthNo;
    }

    public void setMonthNo(Integer monthNo) {
        this.monthNo = monthNo;
    }

    public WeekName getWeekNames() {
        return weekNames;
    }

    public void setWeekNames(WeekName weekNames) {
        this.weekNames = weekNames;
    }

    public TimeSheetData() {
    }

    public TimeSheetData(Integer weekNo, Integer monthNo, WeekName weekNames) {
        this.weekNo = weekNo;
        this.monthNo = monthNo;
        this.weekNames = weekNames;
    }

    @Override
    public String toString() {
        return "TimeSheetData{" +
                "weekNo=" + weekNo +
                ", monthNo=" + monthNo +
                ", weekNames=" + weekNames +
                '}';
    }

}
