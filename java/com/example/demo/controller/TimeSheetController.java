package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TimeSheetData;
import com.example.demo.entity.TimesheetHoursData;
import com.example.demo.service.TimeCalculationService;

@RestController
public class TimeSheetController {
    @Autowired
    private TimeCalculationService timeCalculationService ;

    @PostMapping("/api/get-time-sheet-hours")
    public ResponseEntity<?> calculateTimeSheetData(@RequestBody TimeSheetData timeSheetData) throws Exception {

        TimesheetHoursData timesheetHoursData = timeCalculationService.timeCalculationMethod(timeSheetData);
        return ResponseEntity.ok(timesheetHoursData);
    }
}
