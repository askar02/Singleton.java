package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        User user1=new User();

        System.out.println("Enter your firs name");
        user1.setFirstName(scanner.nextLine());

        System.out.println("Enter your second name");
        user1.setSecondName(scanner.nextLine());

        System.out.println("Age");
        user1.setAge(scanner.nextLine());

        System.out.println("date of birth");
        user1.setDateOfBirth(scanner.nextLine());

        System.out.println("password");
        user1.setPassword(scanner.nextLine());


        Validator.checkFSname(user1.getFirstName(),user1.getSecondName());
        Validator.checkAge(user1.getAge());
        Validator.checkDate(user1.getDateOfBirth());
        Validator.checkPassword(user1.getPassword());


    }
}
