package controlFlow;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check +ve or -ve");
        int num = sc.nextInt();
        //positive or negative
        if (num > 0) {
            System.out.println("positive");
        } else if (num == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }

        //even or odd
        if(num % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }

        //marks of student
        System.err.println("enter marks (0 - 100 only)");
        int marks = sc.nextInt();
        if(marks < 0 || marks > 100){
            System.out.println("Invalid score");
        }
        if(marks >=0 && marks < 60){
            System.out.println("Grade - F");
        } 
        else if(marks >=90 && marks <= 100){
            System.out.println("Grade - A");
        } 
        else if(marks >=80 && marks < 90){
            System.out.println("Grade - B");
        } 
        else if(marks >=70 && marks < 80){
            System.out.println("Grade - C");
        } 
        else if(marks >=60 && marks < 70){
            System.out.println("Grade - D");
        } 

        //Scholarship eligibility
        System.out.println("Enter gpa (1 - 10) : - ");
        int gpa = sc.nextInt();
        System.out.println("Enter score (1 - 10) : - ");
        int score = sc.nextInt();
        System.out.println("Enter test marks");
        int testMarks = sc.nextInt();
        int eligibility = 7;
        if (testMarks >= 50 && (score >= eligibility || gpa >= eligibility)) {
            System.out.println("Eligible for scholarship");
        } else {
            System.out.println("Not eligible for scholarship");
        }

        // Switch case
        System.out.println("enter a number to get day");
        int number = sc.nextInt();
        switch (number) {
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            case 7 : 
                System.out.println("Sunday");
            default:
                System.out.println("enter number between 1 - 7 only");
                break;
        }

        //Ternary
        System.out.println("Enter two numbers to check big one");
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        //*****Using if else************
        int big;
        if(num1 > num2){
            big = num1;
        } else {
             big = num2;
        }
        System.out.println(big);

        //  ***using Ternary***
        int bigNum = (num1 > num2) ? num1 : num2;
        System.out.println(bigNum);
        
        sc.close();
    }
}
