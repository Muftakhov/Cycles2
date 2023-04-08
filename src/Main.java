import java.util.Date;

public class Main {
    public static void main(String[] args) {


        task6();


    }
    public static void task1 (){
        System.out.println("Задача 1");
        int savingsMoney = 15000;
        int rubles = 0;
        int month = 0;
        while (rubles <= 2459000) {
            rubles = rubles + savingsMoney;
            month = month +1;
        System.out.println("Месяц "+ month + " , сумма накоплений равна " + rubles+ " рублей" );}
    }
    public static void task2 (){
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10){
            number = number + 1;
        System.out.print(" "+number);}
        System.out.println();
        for (;number > 0;number = number - 1) {
        System.out.print (" "+number );}
    }
    public static void task3 (){
        System.out.println("Задача 3");
        float birthRate = (float) 17/1000;
        float mortality = (float) 8/1000;
        int size = 12_000_000;
        for (int year = 1 ;year < 11; ++year) {
            size = (int) (size + (birthRate * size) - (mortality*size));
        System.out.println("Год "+year+ " численность населения составляет " + size);}


    }
    public static void task4 (){
        System.out.println("Задача 4");
        int InitialAmount= 15000;
        int month = 0;
        while (InitialAmount < 12_000_000){
            month = ++month;
            InitialAmount = InitialAmount + (InitialAmount * 7)/100;
            System.out.println("месяцев "+month+ " сумма " + InitialAmount);}


    }
    public static void task5 (){
        System.out.println("Задача 5");
        int InitialAmount= 15000;
        int month = 1;
        while (InitialAmount <= 12_000_000){
            InitialAmount = InitialAmount + (InitialAmount * 7)/100;
        if (month % 6 == 0){
            System.out.println("месяцев "+month + " сумма " + InitialAmount);}
            month = month + 1;
        }
    }
    public static void task6 (){
        System.out.println("Задача 6");
        int InitialAmount = 15000;
        int month = 0;
        while (month <= 109){
            InitialAmount = InitialAmount + (InitialAmount*7)/100;{
            if (month % 6 == 0)
            System.out.println("месяцев "+month+ " сумма " + InitialAmount);}
            month = month + 1;}
    }
    public static void task7 (){
        System.out.println("Задача 7");
        int friday = 7;
            for (; friday < 31; friday = friday + 7)
        System.out.println("Сегодня пятница,  "+friday+ "-е число. Необходимо подготовить отчет ");

    }

    public static void task8 (){
        System.out.println("Задача 8");
        int cometFliesBy = 0;
        int untilTheCurrent2023 = 1823;
        int afterTheCurrent2023= 2123;
        for (; cometFliesBy < afterTheCurrent2023; cometFliesBy = cometFliesBy + 79)
        if (cometFliesBy > untilTheCurrent2023)
        {System.out.println(+cometFliesBy);}




    }

}












