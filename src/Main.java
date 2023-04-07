import java.util.Date;

public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();

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
        int birthRate = 17;
        int mortality = 8;
        int size = 12_000_000;
        int year = 0;
        while (year < 10){
            year = year + 1;
            size = size + birthRate - mortality;
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
        int InitialAmount = 15000;
        int savingAfter = 0;
        while (InitialAmount < 12_000_000){
            savingAfter = savingAfter + 6;
            InitialAmount = (InitialAmount + (InitialAmount*7)/100);
            InitialAmount = (InitialAmount + (InitialAmount*7)/100);
            InitialAmount = (InitialAmount + (InitialAmount*7)/100);
            InitialAmount = (InitialAmount + (InitialAmount*7)/100);
            InitialAmount = (InitialAmount + (InitialAmount*7)/100);
            InitialAmount = (InitialAmount + (InitialAmount*7)/100);
            System.out.println("месяцев "+savingAfter+ " сумма " + InitialAmount);}


    }
    public static void task6 (){
        System.out.println("Задача 6");
        int i = 15000;
        int q = 0;
        while (i < 12_000_000 && q < 72){
            q = q + 6;
            i = (i + (i*7)/100);
            i = (i + (i*7)/100);
            i = (i + (i*7)/100);
            i = (i + (i*7)/100);
            i = (i + (i*7)/100);
            i = (i + (i*7)/100);
            System.out.println("месяцев "+q+ " сумма " + i);}
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
        for (; cometFliesBy < 2123; cometFliesBy = cometFliesBy + 79)
        if (cometFliesBy > untilTheCurrent2023 && cometFliesBy < afterTheCurrent2023)
        {System.out.println(+cometFliesBy);}




    }

}












