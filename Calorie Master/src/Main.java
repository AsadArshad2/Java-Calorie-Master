import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final int age;
        final int weight; //KG
        final int height; //CM
        final char gender; //M or F
        double bmr;
        int bmrRounded;

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
            System.out.println("You have a BMR of " + bmrRounded);
        }
        //Hellow world 








        System.out.println("end");
    }

}