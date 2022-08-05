import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2021;
       System.out.println(checkTheLeapYear(year));

        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();
        System.out.println(checkPhonesOS(clientOS, currentYear));

        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " +  countDeliveryDays(deliveryDistance));


    }

    //task 1
    private static String checkTheLeapYear(int year) {
      String strOut;
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            strOut = year + " - не високосный год";
        } else {
            strOut = year + " - високосный год";
        }
        return strOut;
    }
    //task 2
    private static String checkPhonesOS(int clientOS, int currentYear) {
        String strComment;
        if (clientOS == 0 && currentYear >= 2015 && currentYear < 2023) {
            strComment = "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == 1 && currentYear >= 2015 && currentYear < 2023) {
            strComment = "Установите версию приложения для Android по ссылке";
        } else if (clientOS == 0 && currentYear < 2015) {
            strComment = "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == 1 && currentYear < 2015) {
            strComment = "Установите облегченную версию приложения для Android по ссылке";
        } else throw new RuntimeException("Введены недопустимые параметры ОС или год выпуска");
        return strComment;
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