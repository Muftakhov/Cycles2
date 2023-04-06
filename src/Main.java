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
        int savings = 15000;
        int q = 0;
        int i = 0;
        while (q <= 2459000) {
            q = q + savings;
            i = i+1;
        System.out.println("Месяц "+ i + " , сумма накоплений равна " + q+ " рублей" );}
    }
    public static void task2 (){
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10){
            i = i + 1;
        System.out.print(" "+i);}
        System.out.println();
        for (;i > 0;i = i - 1) {
        System.out.print (" "+i );}
    }
    public static void task3 (){
        System.out.println("Задача 3");
        int t = 17;
        int q = 8;
        int y = 12_000_000;
        int i = 0;
        while (i < 10){
            i = i + 1;
            y = y + t - q;
            System.out.println("Год "+i+ " численность населения составляет " + y);}


    }
    public static void task4 (){
        System.out.println("Задача 4");
        int i = 15000;
        int q = 0;
        while (i < 12_000_000){
            q = ++q;
            i = i + (i*7)/100;
            System.out.println("месяцев "+q+ " сумма " + i);}


    }
    public static void task5 (){
        System.out.println("Задача 5");
        int i = 15000;
        int q = 0;
        while (i < 12_000_000){
            q = q+6;
            i = (i + (i*7)/100);
            i = (i + (i*7)/100);
            i = (i + (i*7)/100);
            i = (i + (i*7)/100);
            i = (i + (i*7)/100);
            i = (i + (i*7)/100);
            System.out.println("месяцев "+q+ " сумма " + i);}


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
        int q = 7;
            for (; q < 31; q = q + 7)
        System.out.println("Сегодня пятница,  "+q+ "-е число. Необходимо подготовить отчет ");

    }

    public static void task8 (){
        System.out.println("Задача 8");
        int i = 0;
        int q = 1823;
        int e = 2123;
        for (; i < 2123; i = i + 79)
        if (i > q && i < e)
        {System.out.println(+i);}




    }

}












