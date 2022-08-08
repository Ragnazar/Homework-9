import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2021;
        checkTheLeapYear(year);

        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();
        System.out.println(checkPhonesOS(clientOS, currentYear));

        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " +  countDeliveryDays(deliveryDistance));


    }

    //task 1
    private static String checkTheLeapYear(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println(year + " - не високосный год");
        } else {
           System.out.println(year + " - високосный год");
        }
        return strOut;
    }
    
    //task 2
    private static String checkPhonesOS(int clientOS, int currentYear) {
        int iOs = 0;
        int android = 1;
        
        if (clientOS == 0 && currentYear >= 2015 && currentYear < 2023) {
           System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && currentYear >= 2015 && currentYear < 2023) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else throw new {
            RuntimeException("Введены недопустимые параметры ОС или год выпуска");
        }
    }

    //task 3
    private static Integer countDeliveryDays(int deliveryDistance) {
        int daysRequired = 2;
        int firstBorder = 20;
        int secondBorder = 60;
        int lastBorder = 100;

        if (deliveryDistance <= firstBorder) {
            --daysRequired;
        } else {
            if (deliveryDistance <= secondBorder) {
            } else if (deliveryDistance <= lastBorder) {
                 ++daysRequired;
            } else {
                throw new RuntimeException("Вне зоны доставки");
            }
        } return daysRequired;
    }
}
