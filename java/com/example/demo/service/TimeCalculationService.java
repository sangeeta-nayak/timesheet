package com.example.demo.service;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Calendar;

import org.springframework.stereotype.Service;

import com.example.demo.entity.TimeSheetData;
import com.example.demo.entity.TimesheetHoursData;

@Service
public class TimeCalculationService {

    public TimesheetHoursData timeCalculationMethod(TimeSheetData timeSheetData) throws Exception {
        Calendar calendar = Calendar.getInstance();
        int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int currentWeekNumber = (currentDayOfMonth - 1) / 7 + 1;

        if(currentWeekNumber !=timeSheetData.getWeekNo()){
            throw  new Exception("week no cannot be match");
        }
        LocalDate currentDate = LocalDate.now();
        int currentMonthNumber = currentDate.getMonthValue();

        if(currentMonthNumber !=timeSheetData.getMonthNo()){
            throw  new Exception("month no cannot be match");
        }
        float totalHour=0;
        TimesheetHoursData timesheetHoursData=new TimesheetHoursData();
        timesheetHoursData.setTimeSheetData(timeSheetData);
        totalHour +=timeSheetData.getWeekNames().getMonday();
        totalHour +=  timeSheetData.getWeekNames().getSunday();
        totalHour +=  timeSheetData.getWeekNames().getTuesday();
        totalHour +=  timeSheetData.getWeekNames().getWednesday();
        totalHour +=  timeSheetData.getWeekNames().getThursday();
        totalHour +=  timeSheetData.getWeekNames().getFriday();
        totalHour +=  timeSheetData.getWeekNames().getSaturday();
        if(totalHour > 40 ){
            timesheetHoursData.setExtraHour(String.format("%.2f", (totalHour - 40)));
        }else{
            timesheetHoursData.setExtraHour("0");
        }
        timesheetHoursData.setTotalHour(totalHour);

        return timesheetHoursData;
    }
}
