package com.rechit.birthdayinformer.basic.gifts;

public class Givers {
    private String name;
    private String relation;
    private int numberOfGift;

    public Givers (String name, String relation, int numberOfGift){
        this.name = name;
        this.relation = relation;
        this.numberOfGift = numberOfGift;
    }

    @Override
    public String toString() {
        return "The names are " + name +
                ", relation is " + relation +
                " with the number of gift approximately " + numberOfGift;
    }
}
