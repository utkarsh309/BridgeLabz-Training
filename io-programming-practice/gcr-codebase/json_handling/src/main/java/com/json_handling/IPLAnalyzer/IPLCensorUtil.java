package com.json_handling.IPLAnalyzer;

public class IPLCensorUtil {

    // Mask team name: keep first word
    public static String maskTeamName(String team) {
        if (team == null || team.isEmpty()) return team;
        String firstWord = team.split(" ")[0];
        return firstWord + " ***";
    }

    // Redact player name
    public static String redactPlayer() {
        return "REDACTED";
    }
}
