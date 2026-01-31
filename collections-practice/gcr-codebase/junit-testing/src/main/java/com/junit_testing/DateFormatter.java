package com.junit_testing;

public class DateFormatter {

    public String formatDate(String inputDate) {

        if (inputDate == null || inputDate.length() != 10) {
            throw new IllegalArgumentException("Invalid date");
        }

        // Expected format: yyyy-MM-dd
        String[] parts = inputDate.split("-");

        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid date");
        }

        String year = parts[0];
        String month = parts[1];
        String day = parts[2];

        return day + "-" + month + "-" + year;
    }
}