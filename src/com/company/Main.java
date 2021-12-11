package com.company;
import java.util.Scanner;
class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year) {
        if(day>0 && day<=31 ) {
            this.day = day;
        }
        if(month>0 && month<=12)
            this.month=month;
        if(year>0)
            this.year=year;
    }
    public int getDay() {
        return this.day;
    }
    public int getMonth()
    {
        return this.month;
    }
    public int getYear()
    {
        return this.year;
    }
    public void DisplayDate() {
        if (getDay()>29 && getMonth()==2) {
            System.out.println("Ошибка в феврале не может быть больше 29 дней!");
        }
        else
            System.out.println("Дата: "+ getDay() + "/" + getMonth()+"/"+getYear());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date1 = new Date(21, 2, 2001);
        date1.DisplayDate();
    }
}

