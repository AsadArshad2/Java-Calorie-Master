import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final int age;
        final int weight; //KG
        final int height; //CM
        final char gender; //M or F
        double bmr = 0;
        int bmrRounded = 0;
        int activityLevel; //
        double tdee = 0;

        Scanner scanner = new Scanner(System.in);
        // Plan
        // 1 Ask for Age, Gender, Weight, Height
        // 2 Return BMR
        //Men: BMR = 88.362 + (13.397 x weight in kg) + (4.799 x height in cm) – (5.677 x age in years)
        // 3 Ask for activity level
        // 4 Return Rough TDEE
        // 5 Ask if person would like to lose or gain weight
        // 6 Print suggested daily calorie intake for Goal
        System.out.println("Welcome to Asad's Calorie Master \nPlease answer these quick questions\nWhat is your age?");
        age = scanner.nextInt();
        System.out.println("What is your weight?");
        weight = scanner.nextInt();
        System.out.println("What is your height?");
        height = scanner.nextInt();
        System.out.println("What is your gender? Please enter the letter M or F");
//        while(scanner.hasNext()) {
//            System.out.println("What is your gender? Please enter the letter M or F");
//        }
        gender = scanner.next().charAt(0);


        if (gender == 'M' || gender == 'm') {
            bmr = 88.362 + (13.397*weight) + (4.799 * height) +  - (6.677 * age);
            bmrRounded = (int) bmr;
            System.out.println("You have a BMR of " + bmrRounded);
        }

        if (gender == 'F' || gender == 'f') {
            bmr = 447.593 + (9.247*weight) + (3.098*height) - (4.330*age);
            bmrRounded = (int) bmr;
            System.out.println("You have a Basal Metabolic Rate of " + bmrRounded);
        }
        System.out.println("What would you say your activity level is?");
        System.out.println("0 = Couch Potato \n1 = Lightly Active \n2 = Moderately Active \n3 = Very Active \n4 = Extremely Active");
        activityLevel = scanner.nextInt();

        if (activityLevel == 0) {
            tdee = (bmr * 1.2);
        }

        if (activityLevel == 1) {
            tdee = (bmr * 1.375);
        }

        if (activityLevel == 2) {
            tdee = (bmr * 1.55);
        }

        if (activityLevel == 3) {
            tdee = (bmr * 1.725);
        }

        if (activityLevel == 4) {
            tdee = (bmr * 1.9);
        }
        System.out.println(tdee);
    }


}