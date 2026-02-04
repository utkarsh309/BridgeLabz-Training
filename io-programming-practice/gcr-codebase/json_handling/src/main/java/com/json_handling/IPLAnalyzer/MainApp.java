package com.json_handling.IPLAnalyzer;

public class MainApp {

    public static void main(String[] args) {
        try {
            // JSON processing
            IPLJsonProcessor.censorJson(
                    "ipl_input.json",
                    "ipl_censored.json"
            );

            // CSV processing
            IPLCsvProcessor.censorCsv(
                    "ipl_input.csv",
                    "ipl_censored.csv"
            );

            System.out.println("Censorship completed successfully!");

        } catch (Exception e) {
            e.getMessage();
        }
    }
}