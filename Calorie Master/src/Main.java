import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final int age;
        final int weight; //KG
        final int height; //CM
        final char gender; //M or F
        Scanner scanner = new Scanner(System.in);
        // Plan
        // 1 Ask for Age, Gender, Weight, Height
        // 2 Return BMR
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
        gender = scanner.next().charAt(0);

        System.out.println(age + " " + weight + " " + height + " " + gender);








        System.out.println("Hello world!");
    }

}