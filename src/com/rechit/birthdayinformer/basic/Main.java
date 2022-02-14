package com.rechit.birthdayinformer.basic;

import com.rechit.birthdayinformer.basic.birthday.ListItemsNeeded;
import com.rechit.birthdayinformer.basic.birthday.ListKnownBirthdays;
import com.rechit.birthdayinformer.basic.gifts.ListOfGifts;
import com.rechit.birthdayinformer.basic.wishes.ListOfWishes;
import org.apache.commons.lang3.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Again!");
        ListKnownBirthdays.showBirthday();
        
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String formattedDate = sdf.format(today);
        System.out.println("Hari ini hari " + today + " atau jika diformat menjadi " + formattedDate);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok itu hari " + tomorrow);
        //ARRAY//
        ListOfWishes.showListOfWishes();
        //COLLECTION//
        ListOfGifts.showGifts();
        //GENERIC//
        ListItemsNeeded.showItems();

    }
}
