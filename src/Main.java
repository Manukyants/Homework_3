public class Main {
    public static <yearnew> void main(String[] args) {

        System.out.println ("Задание №1 и №2 ");
        System.out.println ("Выберите операционную систему. Нажмите кнопку 0 или 1: ");
        System.out.println ("Выберите год производства телефона: ");
        int clientOS = 1;
        int clientDeviceYear = 2005;
        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        System.out.println( "Задание №3 ");
        int year = 1992;
        boolean nameOfTheYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (nameOfTheYear) {
            System.out.println(year + " год является високосным ");
        }else {
            System.out.println(year + " год не является високосным");
        }


        System.out.println("Задание №4");
        int deliveryDistance = 95;
        if (deliveryDistance < 19){
            System.out.println(" Срок досавки 1 день");
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60){
            System.out.println(" Срок доставки 2 дня");
        }
        if (deliveryDistance >= 61 && deliveryDistance <= 100){
            System.out.println(" Срок доставки 3 дня");

        }

        System.out.println(" Задание №5 ");
        int monthNumber = 12;
        switch (monthNumber = 1){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Вестна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println(" Введите корректное число от 1 до 12 ");


        }














        }






    }