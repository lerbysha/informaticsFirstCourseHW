package ru.kpfu.itis.CSV;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<List<String>> data = new ArrayList<>();

        data.add(List.of("1997", "Ford", "E350", "ac, abs, moon", "3000.00"));
        data.add(List.of("1999", "C", "Venture «Extended Edition»", "", "4900.00"));
        data.add(List.of("1996", "Jeep", "Grand Cherokee", "MUST SELL! air, moon roof, loaded", "4799.00"));

        CSVData csvData = new CSVData(data);
        System.out.println("Before reading: \n" + csvData);

        CSVWriter writer = new CSVWriter();
        CSVReader reader = new CSVReader();

        try {
            writer.write(new File("csv.csv"), csvData);
            CSVData newData = reader.read(new File("csv.csv"), ",");

            writer.write(new File("file.csv"), newData);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }
}
