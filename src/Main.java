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

        if (clientOS == 1)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else
            System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println();
    }

    public static void task2() {
        System.out.println("Задание 2:");

        byte clientOS = (byte) getRandomNumber(0, 2);
        short clientDeviceYear = (short) getRandomNumber(2009, 2021);

        if (clientOS == 0) {
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else
                System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else
                System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3:");

        short year = (short) getRandomNumber(1500, 2024);


        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " ялвяется высокосным.");
        else
            System.out.println(year + " не ялвяется высокосным.");

        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 4:");
        short deliveryDistance = (short) getRandomNumber(0, 150);
        int noDays = 1;

        if (deliveryDistance > 100)
            System.out.println("Доставки нет");
        if (deliveryDistance > 20)
            noDays++;
        if (deliveryDistance > 60)
            noDays++;


        System.out.println("Потребуется дней: " + noDays);

        System.out.println();
    }

    public static void task5() {
        System.out.println("Задание 5:");

        byte month = (byte) getRandomNumber(1, 16);
        System.out.println("Номер месяца: " + month);

        if (month < 13) {
            switch (month) {
                case 1:
                case 12:
                case 2:
                    System.out.println("Это зимний месяц");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Это весенний месяц");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Это летний месяц");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Это осенний месяц");
                    break;
                default:
                    System.out.println("некорректный месяц");
            }
        }

    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}