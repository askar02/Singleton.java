package com.company;

import java.io.*;
import javax.swing.*;

public final class Validator {

    public static final int PASSWORD_LENGTH = 8;
    public static void checkFSname(String firstName,String secondName){
        boolean isEmpty1 = firstName == null || firstName.trim().length() == 0;
        boolean isEmpty2 = secondName == null || secondName.trim().length() == 0;
          if ((isEmpty1)||(isEmpty2)){
            JOptionPane.showMessageDialog(null, "Вы не ввели Имя или Фамилию! Повторите все занова и введиите данные пожалуйста!");
        }
    }


    public static boolean checkAge(String age){
        boolean isEmpty = age == null || age.trim().length() == 0;
        if (isEmpty){
            JOptionPane.showMessageDialog(null, "Вы не ввели свой возраст. Введите свой возраст");
        return false;
        }
        if(Integer.parseInt(age) > 17){
            JOptionPane.showMessageDialog(null, "Все отлично");
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Ваш возраст меньше 18!");
            return false;
        }

    }


    public static boolean checkPassword(String password){
        boolean isEmpty = password == null || password.trim().length() == 0;
        if (isEmpty){
            JOptionPane.showMessageDialog(null, "Вы не ввели пароль. Пожалуйста введиите пароль");
            return false;
        }
        String regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@^$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if(password.matches(regexp) && (8<=password.length() )){
            JOptionPane.showMessageDialog(null, "Password matches!");
            return true;

        }

        else{
            JOptionPane.showMessageDialog(null, "Password does not match!");
            return false;
        }
    }

    public static boolean checkDate(String date){
        boolean isEmpty = date == null || date.trim().length() == 0;
        if (isEmpty){
            JOptionPane.showMessageDialog(null, "Вы не ввели дату рождения! Повторите все занова и введиите данные пожалуйста!");
        }
        String[] splittedDate = date.split("/");
        int z,x,g,d,f,a;
        x=Integer.parseInt(splittedDate[2]);
        d=Integer.parseInt(splittedDate[1]);
        a=Integer.parseInt(splittedDate[0]);
        if (((x % 4 == 0 && x % 100 != 0) || x % 400 == 0)) {
            g = 1;
        }
        else {
            g = 2;
        }
        if ((d == 1 || d == 3 || d == 5 || d == 7 || d == 8 || d == 10 || d == 12) && a <= 31) {
            f = 1;
        }
        else if ((d == 4 || d == 6 || d == 9 || d == 11) && a <= 30) {
            f = 1;
        }
        else if (d==2 && g==1 && a<=29) {
            f = 1;
        }
        else if (d == 2 && g==2 && a<=28) {
            f = 1;
        }
        else {
            f = 2;
        }
        if(splittedDate.length == 3){

            if(f==1 ){
                JOptionPane.showMessageDialog(null, "Correct date!");
                return true;
            }
            else
                JOptionPane.showMessageDialog(null, "Incorrect date");
                return false;


        }

        else
            JOptionPane.showMessageDialog(null, "Incorrect date");
            return false;
    }




}
