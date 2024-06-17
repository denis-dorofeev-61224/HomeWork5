import java.net.Socket;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello JavaDeveloper!");

        //task1
        System.out.println("Если у вас iOS нажмите 0, если Android нажмите 1");
        Scanner scanner = new Scanner(System.in);
        int clientOS = scanner.nextInt();
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Внимательней будь! Неверное число или символ!!!!");
        }
        System.out.println("*****");

        //task2
        // в рекомендациях предложили захордкожить значения,но я НЕ ДОДУМАЛСЯ как лаконично организовать
        //предлагаю АЛЬТЕРНАТИВНОЕ РЕШЕНИЕ.Решил поэеспериментировать со сканером и пришлось немного
        //заползти в следующий урок применив знания оттуда.Единственное на что я аока не понял как
        //повлиять это "некая цикличность"задачи 2 пока не юзер не нажмёт "N"

        Scanner cosnole = new Scanner(System.in);
        int num1;
        int num2;
        do {
            System.out.println("Если у вас iOS нажмите 1,если Андроид нажмите 0");
            num1 = cosnole.nextInt();
            System.out.println("Введите год версии вашей ОС");
            num2 = cosnole.nextInt();
            if (num1 > 0 && num2 > 2015) {
                System.out.println("Установите версию мобильного приложения по ссылке");
            } else if (num1 > 0 && num2 < 2015) {
                System.out.println("Установите lite-версию вашего приложения по ссылке");
            } else if (num1 == 0 && num2 > 2015) {
                System.out.println("Установите версию вашего приложения по ссылке");
            } else
                System.out.println("Установите lite-версию вашего приложения по ссылке");
            System.out.println("Продолжить?(y/n)");
            String answer = cosnole.next();
            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);
        System.out.println("*****");


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
        int mothNumber = 6;
        switch (mothNumber) {
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