public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else  {
            System.out.println("у тебя и не Android, и не iOS");
        }

        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear>= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear>= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int year = 2021;
        boolean leapYearStartsWith = year >= 1584;
        if (leapYearStartsWith) {
            System.out.println();
            if(year % 400 == 0 || year %4 == 0 && year % 100 != 0){
                System.out.println(year + " год - високосный");
            } else {
                System.out.println(year + " год - невисокосный");

                int deliveryDistance = 95;
                if (deliveryDistance< 20) {
                    System.out.println("Потребуется дней: " + 1);
                } else if (deliveryDistance>=20 && deliveryDistance<60 ) {
                    System.out.println("Потребуется дней: " + 2);
                } else if (deliveryDistance>=60 && deliveryDistance<100 ) {
                    System.out.println("Потребуется дней: " + 3);
                }else {
                    System.out.println("Доставка невозможна");
                }

                int monthNumber = 12;
                switch (monthNumber) {
                    case 1 :
                        System.out.println("Январь; принадлежит к сезону зима");
                        break;
                    case 2 :
                        System.out.println("Февраль; принадлежит к сезону зима");
                        break;
                    case 3 :
                        System.out.println("Март; принадлежит к сезону весна");
                        break;
                    case 4 :
                        System.out.println("Апрель; принадлежит к сезону весна");
                        break;
                    case 5 :
                        System.out.println("Май; принадлежит к сезону весна");
                        break;
                    case 6 :
                        System.out.println("Июнь; принадлежит к сезону лето");
                        break;
                    case 7 :
                        System.out.println("Июль; принадлежит к сезону лето");
                        break;
                    case 8 :
                        System.out.println("Август; принадлежит к сезону лето");
                        break;
                    case 9 :
                        System.out.println("Сентябрь; принадлежит к сезону осень");
                        break;
                    case 10 :
                        System.out.println("Октябрь; принадлежит к сезону осень");
                        break;
                    case 11 :
                        System.out.println("Ноябрь; принадлежит к сезону осень");
                        break;
                    case 12 :
                        System.out.println("Декабрь; принадлежит к сезону зима");
                        break;
                    default:
                        System.out.println("такого месяца нет");

                }
            }
        }
    }
}


















