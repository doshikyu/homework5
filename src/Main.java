public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача 1");
        byte clientOS = 1; // 0 - iOS; 1 - Android
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println("Задача 2");
        int releaseYear = 2013;
        if (clientOS == 0 && releaseYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 0 && releaseYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 1 && releaseYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else if (clientOS == 1 && releaseYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }

        System.out.println("Задача 3");
        int year = 2000;
        if (year <= 1584){
            System.out.println("Введенный год должен быть больше 1584.");
        }
        else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " год является високосным.");
        }
        else{
            System.out.println(year + " год не является високосным.");
        }

       System.out.println("Задача 4");
        int deliveryDistance = 95;
        short deliveryTime = 0;
        if (deliveryDistance <=20){
            deliveryTime += 1;
        }
        else if (deliveryDistance > 20 && deliveryDistance <=60){
            deliveryTime += 2;
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100){
            deliveryTime += 3;
        }
        else{
            System.out.println("Свыше 100 км доставки нет.");
        }
        System.out.println("Потребуется дней: " + deliveryTime);

        System.out.println("Задача 5");
        short monthNumber = 10;
        switch (monthNumber){
            case 12:
                System.out.println("Декабрь - зимний месяц.");
                break;
            case 1:
                System.out.println("Январь - зимний месяц.");
                break;
            case 2:
                System.out.println("Февраль - зимний месяц.");
                break;
            case 3:
                System.out.println("Март - весенний месяц.");
                break;
            case 4:
                System.out.println("Апрель - весенний месяц.");
                break;
            case 5:
                System.out.println("Май - весенний месяц.");
                break;
            case 6:
                System.out.println("Июнь - летний месяц.");
                break;
            case 7:
                System.out.println("Июль - летний месяц.");
                break;
            case 8:
                System.out.println("Август - летний месяц.");
                break;
            case 9:
                System.out.println("Сентябрь - осенний месяц.");
                break;
            case 10:
                System.out.println("Октябрь - осенний месяц.");
                break;
            case 11:
                System.out.println("Ноябрь - осенний месяц.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }


    }
}