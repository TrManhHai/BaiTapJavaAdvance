package com.company;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String input;
            do {
                int randomNumber = random.nextInt();
                fileWriter.write(String.valueOf(randomNumber));
                fileWriter.write(System.lineSeparator());

                System.out.println("Generated random number: " + randomNumber);
                System.out.print("Enter 'stop' to end the program: ");
                input = scanner.nextLine();
            } while (!input.equalsIgnoreCase("stop"));

            fileWriter.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
