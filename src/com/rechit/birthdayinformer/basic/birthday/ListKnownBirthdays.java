package com.rechit.birthdayinformer.basic.birthday;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ListKnownBirthdays {
    public static void showBirthday(){
        String hilmy = "11/7";
        String msIndah = "14/2";
        String mrSyafingi = "11/8";
        String fahmi = "11/3";
        String lala = "11/2";
        String hamam = "11/1";
        System.out.println(hilmy);
        Date undormattedDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M");
        String today = sdf.format(undormattedDate);
        if(today.equals(hilmy)){
            System.out.println("Happi Birthday " + today + " Hilmy");
        } else if(today.equals(msIndah)){
            System.out.println("Happi Birthday " + today + " Indah Winarni");
        }else if(today.equals(mrSyafingi)){
            System.out.println("Happi Birthday " + today + " Syafingi");
        }else if(today.equals(fahmi)){
            System.out.println("Happi Birthday " + today + " Fahmi Rais");
        }else if(today.equals(lala)){
            System.out.println("Happi Birthday " + today + " Laila Azizah");
        }else if(today.equals(hamam)){
            System.out.println("Happi Birthday " + today + " Hamam Nasihuddin ");
        } else{
            System.out.println("There is no brithday today");
        }
    }
}
