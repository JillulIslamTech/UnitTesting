package com.sparta.ji;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterTest {

    @Test
    @DisplayName("This is my first test")
    void firstTest(){
        Assertions.assertEquals(1,1);
    }

    @Test
    @DisplayName("Given time is 21, return good evening")
    void givenTheTimeIs21ReturnGoodEvening(){
        Assertions.assertEquals("Good evening", Greeter.getGreeting(21));
    }

    @Test
    @DisplayName("Given time is 12, return Good afternoon")
    void givenTheTimeIs12ReturnGoodAfternoon(){
        Assertions.assertEquals("Good evening", Greeter.getGreeting(12));
    }

    @Test
    @DisplayName("Given time is 18, return good evening")
    void givenTheTimeIs18ReturnGoodEvening(){
        Assertions.assertEquals("Good evening", Greeter.getGreeting(18));
    }

    @Test
    @DisplayName("Given time is 25, return invalid input")
    void givenTheTimeIs25ReturnInvalidInput(){
        Assertions.assertEquals("Good evening", Greeter.getGreeting(25));
    }

    


}
