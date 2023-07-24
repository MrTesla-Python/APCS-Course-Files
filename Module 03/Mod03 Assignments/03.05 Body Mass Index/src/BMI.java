/*
 * 
 * The BMI class takes in the name, weight, and height of a person
 * then converts the weight and height and prints their BMI and then what that corresponds to
 * 
 * Tristan Darnell
 * 07/24/23
 */

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name (first last): ");

        String first = in.next();
        String last = in.nextLine();

        System.out.print("Enter your weight in pounds (e.g. 175): ");
        String weight = in.next();

        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        String feet = in.next();
        String inches = in.next();

        System.out.println();
        System.out.println("Body Mass Index Calculator");
        System.out.println("===============================");
        System.out.println("Name: " + first + " " + last);
        
        double heightInch = Integer.parseInt(feet) * 12 + Integer.parseInt(inches);
        double heightM = heightInch * 0.0254;
        double weightKg = Integer.parseInt(weight) * 0.45359237;

        System.out.println("Height (m): " + Math.round(heightM * 10) / 10.0);
        System.out.println("Weight (kg): " + Math.round(weightKg * 10) / 10.0);
        
        double BMI = weightKg / Math.pow(heightM, 2);
        System.out.println("BMI: " + Math.round(BMI * 10) / 10.0);

        if (BMI >= 29.9)
        {
            System.out.println("Category: Obese");
        }

        else if (BMI >= 25.0)
        {
            System.out.println("Category: Overweight");
        }
        else if (BMI >= 18.5)
        {
            System.out.println("Category: Normal or Healthy Weight");
        }
        else 
        {
            System.out.println("Category: Underweight");
        }
    }
}
 