import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2021;
        checkTheLeapYear(year);

        int clientOS = 1;
        int currentYear = LocalDate.now().getYear();
        checkPhonesOS(clientOS, currentYear);

        int deliveryDistance = 95;
        countDeliveryDays(deliveryDistance);

    }

    //task 1

    private static void checkTheLeapYear(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println(year + " - не високосный год");
        } else {
            System.out.println(year + " - високосный год");
        }
    }
    //task 2

    private static void checkPhonesOS(int clientOS, int currentYear) {
        if (clientOS == 0 && currentYear >= 2015 && currentYear < 2023) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && currentYear >= 2015 && currentYear < 2023) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else throw new RuntimeException("Введены недопустимые параметры ОС или год выпуска");
    }

    //task 3
    private static void countDeliveryDays(int deliveryDistance) {
        byte daysRequired = 2;
        int firstBorder = 20;
        int secondBorder = 60;
        int lastBorder = 100;

        if (deliveryDistance <= firstBorder) {
            System.out.println("Потребуется дней: " + --daysRequired);
        } else {
            if (deliveryDistance <= secondBorder) {
                System.out.println("Потребуется дней: " + daysRequired);
            } else if (deliveryDistance <= lastBorder) {
                System.out.println("Потребуется дней: " + ++daysRequired);
            } else {
                throw new RuntimeException("Вне зоны доставки");
            }
        }
    }
}