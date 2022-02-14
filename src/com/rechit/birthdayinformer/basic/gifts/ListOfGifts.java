package com.rechit.birthdayinformer.basic.gifts;

import java.util.*;

public class ListOfGifts {
    // this is part of my collection java study
    public static void showGifts(){
        // list
        List<String> gifts = new ArrayList<>(); // <> merupakan type-parameter bisa jadi objek buatan snediri lo
        gifts.add("Notebook");
        gifts.add("Gaming Laptop");
        gifts.add("Desk");
        gifts.add("Lamp");
        // Set
        Set<String> setgifts = new HashSet<>();
        setgifts.add("Money");
        setgifts.add("Book");
        setgifts.add("Electronics");
        setgifts.remove("Money");
        // Map
        Map<String, Givers> givers = new HashMap();
        givers.put("Pemberi pertama", new Givers("Claudete", "friend", 1));
        givers.put("Pemberi kedua", new Givers("Hamham", "brother", 2));
        System.out.println("Necklace");
        System.out.println("Congratulation you get " + setgifts.size()+gifts.size() + " amount of gifts");
        System.out.println("Your gifts are: ");
        for(String gift : gifts){
            System.out.println("- " + gift);
        }
        System.out.println("You also get a set of gifts: ");
        for(String setOfGifts: setgifts){
            System.out.println("- " + setOfGifts);
        }
        System.out.println("Who on earth this generous people are? Here are they: ");
        for (Givers giver : givers.values()){
            System.out.println(giver);
        }
    }
}
