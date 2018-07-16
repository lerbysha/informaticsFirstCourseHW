package ru.kpfu.itis.CSV;

public class CSVFormatException extends Exception {
    @Override
    public String getMessage() {
        return "Unreadable format of csv-file.";
    }
}