package com.company;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static String get_you(Integer day,Integer month) throws Exception{
       String result = "The astrological sign for " + day + " " + month + " is ";
        if (month == 1) {
            if (day < 20)
                return result+ "Capricorn";
            else
                return  "Aquarius";
        } else if (month == 2) {
            if (day < 19)
                return result+ "Aquarius";
            else
                return result+ "Pisces";
        } else if (month == 3) {
            if (day < 21)
                return result+ "Pisces";
            else
                return result+ "Aries";
        } else if (month == 4) {
            if (day < 20)
                return result+ "Aries";
            else
                return result+ "Taurus";
        } else if (month == 5) {
            if (day < 21)
                return result+ "Taurus";
            else
                return  result+"Gemini";
        } else if (month == 6) {
            if (day < 21)
                return  result+"Gemini";
            else
                return result+ "Cancer";
        } else if (month == 7) {
            if (day < 23)
                return result+ "Cancer";
            else
                return result+ "Leo";
        } else if (month == 8) {
            if (day < 23)
                return result+ "Leo";
            else
                return result+ "Virgo";
        } else if (month == 9) {
            if (day < 23)
                return  "Virgo";
            else
                return result+ "Libra";
        } else if (month == 10) {
            if (day < 23)
                return result+ "Libra";
            else
                return result+ "Scorpio";
        } else if (month == 11) {
            if (day < 22)
                return result+ "scorpio";
            else
                return result+ "Sagittarius";
        } else if (month == 12) {
            if (day < 22)
                return result+ "Sagittarius";
            else
                return  result+"Capricorn";
        }
        else {
            throw new Exception("неверно введена дата");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter day of birth");
        try {
            Scanner scanner = new Scanner(System.in);
            Integer day = scanner.nextInt();


            System.out.println("enter month of birth");
            Integer month = scanner.nextInt();

            System.out.println(get_you(day,month));


        } catch (
                Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
