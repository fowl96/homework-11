public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void checkingLeapYear(int year) {
        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void callingMessage (int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void calculationDelivery (int deliveryDistance){
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <=60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        checkingLeapYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2016;
        callingMessage(clientOS, clientDeviceYear);

    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        calculationDelivery (deliveryDistance);

    }

}