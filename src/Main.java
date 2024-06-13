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
        int yearOfRelease = 2015;
        int clientOS2 = 1;
        boolean isLiteVersion = yearOfRelease < 2015;
        if (clientOS2 == 0) {
            if (isLiteVersion) {
                System.out.println("Установите lite-версию для iOS по ссылке");
            } else {System.out.println("Установите версию приложения для iOS по ссылке");}
                               }
        else if (clientOS2==1){
            if(isLiteVersion) {
                System.out.println("Установите lite-версию для Android по ссылке");
            } else {System.out.println("Установите версию приложения для Android по ссылке");}
        }
        System.out.println("*****");
        //считаю что в общем виде задача решена верно.Идея отработала норм.Однако,если честно возник вопрос
        //по идее нужно сделать составное условие и ввести его через сканер"версию ОС+год выпуска"
        //но не додумался как сделать мультиввод данных через сканер все 4метода (основных)считывают
        //либо строки,либо даблы


        //task3
        int year=1600;
        if((year>1584)&&(year%4==0&&year%100 !=0||year%4==0)){
            System.out.println(year+"--високосный год.");
        }else {
            System.out.println(year + "не является високосным годом.");
              }
        System.out.println("*****");

        //task4
        int deliveryDistance=378;//км
        //int timeOfDelivery=1;//день
        if (deliveryDistance<=20){
            System.out.println("Доставка займёт один день");}
        else if (deliveryDistance>20 && deliveryDistance<=60){
            System.out.println("Доставка займёт два дня");}
        else if (deliveryDistance>60 && deliveryDistance<=100) {
            System.out.println("Доставка займёт три дня");                                     }
        else {
            System.out.println("Невозможно рассчитать срок доставки");}
            System.out.println("*****");

        //task5
        int mothNumber=6;
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
          

