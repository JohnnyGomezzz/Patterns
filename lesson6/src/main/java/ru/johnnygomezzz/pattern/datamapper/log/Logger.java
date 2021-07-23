package ru.johnnygomezzz.pattern.datamapper.log;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logger {

    public Logger() {}

    public static void writeToFile(String message) {

        try {
            Date date = new Date();
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(
                            new File("./src/log/log.txt"), true
                    )
            );

            writer.newLine();
            writer.write(
                    String.format(
                            "[Logger] %s - %s",
                            date.toString(), message
                    )
            );
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFromFile (int messageLimit) {
        String finalText = "";

        try {
            BufferedReader reader = new BufferedReader(
                new FileReader(
                    new File ("./src/log/log.txt")
                )
            );
            String currentLine;
            List<String> lineArr = new ArrayList<>();
            while ((currentLine = reader.readLine()) != null) {
                lineArr.add(currentLine);
            }

            while (lineArr.size() > messageLimit) {
                lineArr.remove(0);
            }

            for (String line : lineArr) {
                finalText = finalText.concat(line + '\n');
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return finalText;
    }
}
