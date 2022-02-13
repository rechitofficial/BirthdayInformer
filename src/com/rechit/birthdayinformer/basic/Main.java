package com.rechit.birthdayinformer.basic;

import com.rechit.birthdayinformer.basic.birthday.ListKnownBirthdays;
import com.rechit.birthdayinformer.basic.wishes.ListOfWishes;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Again!");
        ListKnownBirthdays.showBirthday();
        
        Date today = new Date();
        System.out.println("Hari ini hari " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok itu hari " + tomorrow);
        ListOfWishes.showListOfWishes();

    }
}
