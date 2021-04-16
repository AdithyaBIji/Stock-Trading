package com.example.java;

import java.util.Scanner;

public class Stock {

    public static void main(String[] args) {

        float a, b, c, d, e, f, g;

        String by, sl, hd, dv, dx, xp, tp;

        float profit = 0.0f;

        int cnt=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE ENTER THE STOCK PRICES FOR EACH DAY OF THE WEEK IN ASCENDING ORDER");

        System.out.println("Enter the stock price of day 1: ");
        a = Float.parseFloat(sc.nextLine());
        System.out.println("Enter the stock price of day 2: ");
        b = Float.parseFloat(sc.nextLine());
        System.out.println("Enter the stock price of day 3: ");
        c = Float.parseFloat(sc.nextLine());
        System.out.println("Enter the stock price of day 4: ");
        d = Float.parseFloat(sc.nextLine());
        System.out.println("Enter the stock price of day 5: ");
        e = Float.parseFloat(sc.nextLine());
        System.out.println("Enter the stock price of day 6: ");
        f = Float.parseFloat(sc.nextLine());
        System.out.println("Enter the stock price of day 7: ");
        g = Float.parseFloat(sc.nextLine());

        //Day 1 Trading

        System.out.println("Stock price for day 1 is Rs.:" + a);
        System.out.println("Please select the transaction mode for the day --> Buy/Sell");
        by = sc.nextLine();

        if(by.equals("Buy") || by.equals("buy")){

            System.out.println("Your stock has been bought for the day at Rs."+a);
            ++cnt;

        }
        else
        {

            System.out.println("Please buy a stock first ");
        }

        //Day 2 Trading

        System.out.println("Stock price for day 2 is Rs.:" + b);
        System.out.println("Please select the transaction mode for the day --> Buy/Sell/Hold");
        sl = sc.nextLine();

        float calc1 = 0.0f;
        if(sl.equals("Buy") || sl.equals("buy"))
        {

            System.out.println("Your stock has been bought for the day at Rs."+b);
            ++cnt;

        }
        else if(sl.equals("Sell") || sl.equals("sell")){

            System.out.println("Your stock has been sold for the day at Rs."+b);
            calc1 = b-a;
        }
        else
        {

            System.out.println("Your stock will be held until an action has been taken by you");
        }

        //Day 3 Trading

        System.out.println("Stock price for day 3 is Rs:" + c);
        System.out.println("Please select the transaction mode for the day --> Buy/Sell/Hold");
        hd = sc.nextLine();
        float calc2=0.0f;

        if(hd.equals("Buy") || hd.equals("buy"))
        {

            System.out.println("Your stock has been bought for the day at Rs."+c);
            ++cnt;


        }
        else if(hd.equals("Sell") || hd.equals("sell")){

            System.out.println("Your stock has been sold for the day at Rs."+c);
            calc2 = c-a;
            calc2 = c-b;
        }
        else
        {

            System.out.println("Your stock will be held until an action has been taken by you");
        }

        //Day 4 Trading

        System.out.println("Stock price for day 4 is Rs.:" + d);
        System.out.println("Please select the transaction mode for the day --> Buy/Sell/Hold");
        dv = sc.nextLine();
        float calc3=0.0f;

        if(dv.equals("Buy") || dv.equals("buy"))
        {

            System.out.println("Your stock has been bought for the day at Rs."+d);
            ++cnt;


        }
        else if(dv.equals("Sell") || dv.equals("sell")){

            System.out.println("Your stock has been sold for the day at Rs."+d);
            calc3 = d-a;
            calc3 = d-b;
            calc3 = d-c;
        }
        else
        {

            System.out.println("Your stock will be held until an action has been taken by you");
        }

        //Day 5 Trading

        System.out.println("Stock price for day 5 is Rs.:" + e);
        System.out.println("Please select the transaction mode for the day --> Buy/Sell/Hold");
        dx = sc.nextLine();
        float calc4=0.0f;

        if(dx.equals("Buy") || dx.equals("buy"))
        {

            System.out.println("Your stock has been bought for the day at Rs."+e);
            ++cnt;

        }
        else if(dx.equals("Sell") || dx.equals("sell")){

            System.out.println("Your stock has been sold for the day at Rs."+e);
            calc4 = e-a;
            calc4 = e-b;
            calc4 = e-c;
            calc4 = e-d;
        }
        else
        {

            System.out.println("Your stock will be held until an action has been taken by you");
        }

        //Day 6 Trading

        System.out.println("Stock price for day 6 is Rs.:" + f);
        System.out.println("Please select the transaction mode for the day --> Buy/Sell/Hold");
        xp = sc.nextLine();
        float calc5=0.0f;

        if(xp.equals("Buy") || xp.equals("buy"))
        {

            System.out.println("Your stock has been bought for the day at Rs."+f);
            ++cnt;

        }
        else if(xp.equals("Sell") || xp.equals("sell")){

            System.out.println("Your stock has been sold for the day at Rs."+f);
            calc5 = f-a;
            calc5 = f-b;
            calc5 = f-c;
            calc5 = f-d;
            calc5 = f-e;
        }
        else
        {

            System.out.println("Your stock will be held until an action has been taken by you");
        }

        //Day 7 Trading

        System.out.println("Stock price for day 7 is Rs.:" + g);
        System.out.println("Please select the transaction mode for the day --> Sell/Exit");
        tp = sc.nextLine();

        float calc6=0.0f;
        if(tp.equals("Sell") || tp.equals("sell")){

            System.out.println("Your stock has been sold for the day at Rs."+g);
            calc6 = g-a;
            calc6 = g-b;
            calc6 = g-c;
            calc6 = g-d;
            calc6 = g-e;
            calc6 = g-f;
        }
        else
        {

            System.out.println("You have successfully completed this week's trading!!");
        }

        //Trading Ends

        profit = calc1 + calc2 + calc3 + calc4 + calc5 + calc6;

        System.out.println("The stock prices for each day are as follows: Day 1 -->"+ a + "Day 2 -->"+ b +"Day 3 -->"+ c + "Day 4 -->"+ d + "Day 5 -->"+ e + "Day 6 -->"+ f + "Day 7 -->"+ g);
        System.out.println("The total no. of transactions performed this week =" +cnt);
        System.out.println("The total profit earned for this week = "+ profit);

    }

}
