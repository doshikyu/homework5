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

       //System.out.println("Задача 4");

      //System.out.println("Задача 5");


    }
}