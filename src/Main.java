import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void separate() {
        System.out.println();
    }
    public static void task1() {
        System.out.println("Task 1");
        checkYear(2004);
        separate();

    }
    public static void checkYear(int getTheYear) {
        if (getTheYear % 4 == 0 && getTheYear % 400 == 0) {
            System.out.println(getTheYear + " is the visokosniy god");
        }else{
            System.out.println(getTheYear + " ne visokosniy god");
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        whatDevice(0,2015);
        separate();
    }

    public static void whatDevice (int os,int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            System.out.println("Download IOS version ");
            if (currentYear - clientDeviceYear >= 8) {
                System.out.println("Download light IOS version");
            }
        }else if (os == 1) {
            System.out.println("Download Android version ");
            if (currentYear - clientDeviceYear >= 8) {
                System.out.println("Download light Android version");
            }
        }else {
            System.out.println("Something is wrong ;)");
        }
    }


    public static void task3() {
        System.out.println("Task 3");
        int delieveryDistance = 85;
        calculateTheTime(delieveryDistance);
    }

    public static void calculateTheTime(int whatIsTheDistance) {
        int days = 0;
        if (whatIsTheDistance <= 20) {
            days = 1;
            System.out.println("Потребуется дней: " + days);
        }else if (whatIsTheDistance > 20 && whatIsTheDistance <= 60) {
            days = 2;
            System.out.println("Потребуется дней: " + days);
        }else if (whatIsTheDistance > 60 && whatIsTheDistance <= 100) {
            days = 3;
            System.out.println("Потребуется дней: " + days);
        }else {
            System.out.println("Вы живете так далёко, что курьер чисто физически до вас не доберётся. Прости! Желаю вам купить квартиру в Сити");
        }
    }





}