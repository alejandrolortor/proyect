package Lora_Alejandro;

import java.util.Scanner;

public class Lora_Alejandro {

static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int day=13, month=9, year=2021;
        String stDat=birthDay_Lora(day, month, year);
        System.out.println("Dime tu cumpleaños");
        int ddmmyyyy= keyboard.nextInt();
        day = ddmmyyyy/1000000;
        year = ddmmyyyy%10000;
        month = (ddmmyyyy/10000)%100;
        System.out.println(ddmmyyyy);
        System.out.println("International programmer's day: " + stDat + " sep 2021");
    }

    private static String birthDay_Lora(int day, int month, int year) {
        String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 -y / 100+ y / 400 + (31 * m) / 12) %7;
        return ArrayWeek[d];
    }
    
}
