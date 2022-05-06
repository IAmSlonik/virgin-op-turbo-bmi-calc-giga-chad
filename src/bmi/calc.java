package bmi;

import java.io.IOException;
import java.util.Scanner;

public class calc {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

        static void menu() throws IOException {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj swoja wage[kg]: ");
            double weight = scan.nextDouble();
            System.out.println("Podaj swoj wzrost[m]: ");
            double height = scan.nextDouble();
            double bmi = weight / Math.pow(height,2);

            if (bmi<=18.4) {
                System.out.println("Twoje bmi: " + Math.round(bmi * 100) / 100d);
            }else if (bmi >=18.5 && bmi<=25){
                System.out.println("Twoje bmi: " + Math.round(bmi * 100) / 100d);
            }else if (bmi>26){
                System.out.println("Twoje bmi: " + Math.round(bmi * 100) / 100d);
            }
            System.in.read();
        }
    }
