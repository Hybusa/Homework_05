public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание 1:");

        byte clientOS = (byte) getRandomNumber(0, 2);

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Ошбика.");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задание 2:");

        byte clientOS = (byte) getRandomNumber(0, 2);
        short clientDeviceYear = (short) getRandomNumber(2009, 2021);

        if (clientDeviceYear < 2015 && clientOS == 0)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        else if (clientDeviceYear >= 2015 && clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");

        else if (clientDeviceYear < 2015 && clientOS == 1)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        else
            System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3:");

        short year = (short) getRandomNumber(1500, 2024);
        boolean leapCheck;

        if (year % 4 != 0)
            leapCheck = false;
        else if (year % 400 == 0)
            leapCheck = true;
        else if (year % 100 == 0)
            leapCheck = false;
        else
            leapCheck = true;


        if (leapCheck)
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");

        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 4:");
        short deliveryDistance = (short) getRandomNumber(0, 150);
        int noDays = 0;

        if (deliveryDistance < 20)
            noDays = 1;
        else if (deliveryDistance >= 20 && deliveryDistance < 60)
            noDays = 2;
        else if (deliveryDistance >= 60 && deliveryDistance < 100)
            noDays = 3;

        if (noDays == 0)
            System.out.println("Доставки нет");
        else
            System.out.println("Потребуется дней: " + noDays);

        System.out.println();
    }

    public static void task5() {
        System.out.println("Задание 5:");

        byte month = (byte) getRandomNumber(1, 16);
        System.out.println("Номер месяца: " + month);

        char season;

        if (month < 13) {
            switch (month) {
                case 1:
                case 12:
                case 2:
                    season = 'w' ;
                    break;
                case 3:
                case 4:
                case 5:
                    season = 's' ;
                    break;
                case 6:
                case 7:
                case 8:
                    season = 'm';
                    break;
                case 9:
                case 10:
                case 11:
                    season = 'a' ;
                    break;
                default:
                    season = 'n' ;
            }

            switch (season) {
                case 'w':
                    System.out.println("Это зимний месяц");
                    break;
                case 's':
                    System.out.println("Это весенний месяц");
                    break;
                case 'm':
                    System.out.println("Это летний месяц");
                    break;
                case 'a':
                    System.out.println("Это осенний месяц");
                    break;
                default:
                    System.out.println("Возникла ошибка");
            }
        }

    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}