package com.sparta.ji;

public class Greeter {

    public static String getGreeting(int timeOfDay){
        String message;
        if (timeOfDay>=5 && timeOfDay<=12){
            message = "Good morning";
        }
        else if (timeOfDay >=12 && timeOfDay <=18){
            message = "Good afternoon";
        }
        else {
            message = "Good evening";
        }
        return message;
    }
}
