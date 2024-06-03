import java.time.Year;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 3");
        int year = 2021;
        if (year%4!=0){
            System.out.println(year+" год не является високосным");
        }else if (year%100!=0){
            System.out.println(year+ " год високосный");
        }else  if (year%400!=0){
            System.out.println(year+ " год не является високосным");
        }else {
            System.out.println(year+"год високосный");
        }
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int day = 0;
        if (deliveryDistance<21){
            day = day +1;
            System.out.println("Потребуется дней:"+day);
        }else if (deliveryDistance>20 && deliveryDistance<61){
            day = day +2;
            System.out.println("Потребуется дней:"+ day);
        }else if (deliveryDistance>60 && deliveryDistance<101){
            day = day + 3;
            System.out.println("Потребуется дней:"+ day);
        }else if (deliveryDistance>100){
            System.out.println("Доставки нет");
        }
        System.out.println("Задание 5");
        int monthNumber = 13;
        if (monthNumber < 1 || monthNumber > 12) {
            return;
        } else {
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
        }
        }
    }
}