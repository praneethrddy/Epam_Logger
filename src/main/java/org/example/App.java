package org.example;

import org.example.interest.*;
import org.example.homecost.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.logger1;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
         final logger1 logger1 = LogManager.getlogger1(org.example.App.class);
         Scanner sc = new Scanner(System.in);
         logger1.info("1. Simple Interest\n2. Compound Interest\n3.Construction cost\nEnter your choice:");
         int choice = sc.nextInt();
         switch(choice){
             case 1: {
                 logger1.info("Enter p,r,t:");
                 double p = sc.nextDouble();
                 double r = sc.nextDouble();
                 double t = sc.nextDouble();
                 Interest i = new Interest(p,r,t);
                 logger1.info(i.Calculate_SI());
                 break;
             }
             case 2:{
                 logger1.info("Enter p,r,t:");
                 double p = sc.nextDouble();
                 double r = sc.nextDouble();
                 double t = sc.nextDouble();
                 Interest i = new Interest(p,r,t);
                 logger1.info(i.Calculate_CI());
                 break;
             }
             case 3:{
                 int Typeofmaterial;
                 double HouseArea;
                 boolean isAutomated;
                 Typeofmaterial = sc.nextInt();
                 HouseArea = sc.nextDouble();
                 isAutomated = sc.nextBoolean();
                 EstimateHomeCost e = new EstimateHomeCost(Typeofmaterial,HouseArea,isAutomated);
                 logger1.info(e.Estimate());
                 break;
             }
             default:{
                 logger1.warn("That's not a valid option");
             }

         }

    }
}
