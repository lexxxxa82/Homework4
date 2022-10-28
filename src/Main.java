import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");// задача 1
        int age = 41;
        if (age >= 18) {
            System.out.println("поздравляем ты достиг совершенолетия");
        } else {
            System.out.println("совершенолетие еше не наступило , тебе необходимо подождать");
        }

        System.out.println("Задача 2");// задача 2

        int personsAge = 42;// сколько лет человеку
        if (personsAge >= 7 && personsAge < 18) {
            System.out.println("ребенок ходит в школу");
        }
        if (personsAge >= 18 && personsAge < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }


        System.out.println("Задача 3");// задача 3

        int passengers = 103;
        int seatPlace = (60 - passengers);
        int freePlaces = 42 - (passengers - 60);// если пасс меньше 60, то от 42 прибавляет
        if (passengers <= 102) {
            System.out.println("в вагоне " + freePlaces + " свободных  мест ");
        } else {
            System.out.println("в вагоне мест нет ");
        }
        if (seatPlace >= 0)// если пасс больше 60 отрицательное число получается
        {
            System.out.println("сидячих мест " + seatPlace);
        } else {
            System.out.println("сидячих мест 0");
        }
        System.out.println("Задача 4,1");// задача 4,1
        int clientOS = 2;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("ошибка");
        }
        System.out.println("Задача 4,2");// задача 4,2
        int clientOS1 = 1;
        int clientDeviceYear = 2014;
        if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("ошибка");
        }
        System.out.println("Задача 4,3");// задача 4,3

        int year = 1904;
        if ((year % 4) == 0 || (year % 400) == 0) {
            System.out.println(+year + " год является високосным");
        } else if ((year % 100) == 0) {
            System.out.println(+year + " год не является високосным");
        } else {
            System.out.println(+year + " год не является високосным");
        }
        System.out.println("Задача 4,4");// задача 4,4

        int deliveryDistance = 21;
        if (deliveryDistance <= 20){
            System.out.println( " Потребуется дней 1");
        }else if ( deliveryDistance >20 && deliveryDistance <=60){
            System.out.println (" Потребуется дней 2");
        }else  {
            System.out.println( " Потребуется дней 3");
        }
        System.out.println("Задача 4,5");// задача 4,5
        int monthNumber = 6;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("осень");
                    break;


            }
        }


    }





    }
















