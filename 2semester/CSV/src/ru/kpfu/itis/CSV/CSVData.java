package ru.kpfu.itis.CSV;

import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class CSVData {
    private List<List<String>> csv;
    private int row;
    private int column;
    private String delimiter;


    public CSVData(List<List<String>> csv, String delimiter) {
        this.csv = csv;
        column = csv.get(0).size();
        row = csv.size();
        this.delimiter = delimiter;
    }

    public CSVData(List<List<String>> csv) {
        this(csv, ",");
    }

    public String get(int i, int j) {
        return csv.get(i).get(j);
    }

    public void set(int i, int j, String elem) {
        csv.get(i).set(j, elem);
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getDelimiter() {
        return delimiter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CSVData csvData = (CSVData) o;
        return row == csvData.row &&
                column == csvData.column &&
                Objects.equals(csv, csvData.csv);
    }

    @Override
    public int hashCode() {

        return Objects.hash(csv, row, column);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < csv.size(); i++) {
            int row = csv.get(i).size();
            for (int j = 0; j < row; j++) {
                String element = csv.get(i).get(j);

                Pattern pattern = Pattern.compile("[,;\"«»\n]");
                if (pattern.matcher(element).find() || element.equals("")) {
                    sb.append("\"").append(element).append("\"");
                } else {
                    sb.append(element);
                }

                if (j != row - 1) {
                    sb.append(delimiter);
                }
            }
            sb.append("\n");
        }
        return new String(sb);
    }
}