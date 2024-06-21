

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello JavaDeveloper!");

        //task1 && task2
        short clientOS = 0;

        if (clientOS == 0) {
            System.out.printf("Установите версию приложения для iOS по ссылке.\n");
        } else {
            System.out.printf("Установите версию приложения для Android по ссылке.\n");
        }

        System.out.printf("****");

        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("\nУстановите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }


            //task3
            int year = 1600;
            //закомитил старый вариант,чтобы были видны изменения+упростил форму записи
            //if((year>1584)&&(year%4==0&&year%100 !=0||year%4==0))
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + "--високосный год.");
            } else {
                System.out.println(year + "не является високосным годом.");
            }
            System.out.println("*****");

            //task4
            int deliveryDistance = 378;//км
            //int timeOfDelivery=1;//день
            if (deliveryDistance <= 20) {
                System.out.println("Доставка займёт один день");
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Доставка займёт два дня");
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Доставка займёт три дня");
            } else {
                System.out.println("Невозможно рассчитать срок доставки");
            }
            System.out.println("*****");

            //task5
            int monthNumber = 12;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
            }
        }
    }
}
