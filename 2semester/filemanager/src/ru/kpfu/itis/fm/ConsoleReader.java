package ru.kpfu.itis.fm;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("$ ");
        return scanner.nextLine();
    }
}
