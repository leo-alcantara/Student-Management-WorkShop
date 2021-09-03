package se.lexicon.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService {

    public Scanner scanner;

    @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "ScannerInputService{" +
                "scanner=" + scanner +
                '}';
    }

    @Override
    public String getString() {
        return scanner.nextLine();
    }

    @Override
    public int getInt() {
        return scanner.nextInt();
    }


}
