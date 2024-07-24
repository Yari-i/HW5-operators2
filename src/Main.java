
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int clientOS = 1;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Task 2
        System.out.println("Task 2");

        clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }

        //Task 3
        System.out.println("Task 3");

        int year = 2024;

        if (year < 1584) {
            System.out.println("Год не является високосным.");
        } else {
             if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
                 System.out.println("Год является високосным.");
             } else {
                 System.out.println("Год не является високосным.");
             }
        }

        //Task 4
        System.out.println("Task 4");

        int deliveryDistance = 100;
        int days;

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if ( deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;

            System.out.println("Дней потребуется: " + days + ".");
        }
        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        }

        //Task 5
        System.out.println("Task 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Зима.");
                break;
            case 3, 4, 5:
                System.out.println("Весна.");
                break;
            case 6, 7, 8:
                System.out.println("Лето.");
                break;
            case 9, 10, 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Неправильный номер месяца.");

        }
    }
}