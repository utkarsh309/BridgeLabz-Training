package com.json_handling.IPLAnalyzer;

import java.io.*;


public class IPLCsvProcessor {

    public static void censorCsv(String inputFile, String outputFile) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

        String header = br.readLine();
        bw.write(header);
        bw.newLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            // Apply censorship
            data[1] = IPLCensorUtil.maskTeamName(data[1]); // team1
            data[2] = IPLCensorUtil.maskTeamName(data[2]); // team2
            data[5] = IPLCensorUtil.maskTeamName(data[5]); // winner
            data[6] = IPLCensorUtil.redactPlayer();        // player_of_match

            bw.write(String.join(",", data));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}