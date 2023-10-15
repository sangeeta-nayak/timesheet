package com.example.demo.entity;

public class TimesheetHoursData {

    private float totalHour;

    private TimeSheetData timeSheetData;

    private String extraHour;

    public String getExtraHour() {
        return extraHour;
    }

    public float getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(float totalHour) {
        this.totalHour = totalHour;
    }

    public TimeSheetData getTimeSheetData() {
        return timeSheetData;
    }

    public void setTimeSheetData(TimeSheetData timeSheetData) {
        this.timeSheetData = timeSheetData;
    }

    public void setExtraHour(String string) {
        this.extraHour = string;
    }

    public TimesheetHoursData() {
    }
}
