package com.rechit.birthdayinformer.basic.birthday;

public class GenericInvitation<T extends Number> {
    T peopleInvited;
    T maleInvited;
    T femaleInvited;
    double maxVip = 10.0;
    int maxGuest = 100;
    int totalMale;
    int totalFemale;

    GenericInvitation(T ob, T ob2, T ob3){
        this.peopleInvited = ob;
        this.maleInvited = ob2;
        this.femaleInvited = ob3;
    }

    void isSeatEnough(){
        if(peopleInvited.getClass().getName() == "java.lang.Double"){
            if(peopleInvited.doubleValue() == maxVip){
                System.out.println("VIP seat is full");
            } else{
                System.out.println("VIP seat is for " + (maxVip-peopleInvited.doubleValue()) + " people left");
            }
        } else{
            if(peopleInvited.intValue() == maxGuest){
                System.out.println("Guest seat is full");
            } else if (peopleInvited.intValue() >= maxGuest){
                System.out.println("Gust seat is exceeded");
            } else{
                System.out.println("Guest seat is for " + (maxGuest-peopleInvited.intValue()) + " people left");
            }
        }
    }

    void totalGenderInvited(GenericInvitation<?> ob){
        totalMale = maleInvited.intValue() + ob.maleInvited.intValue();
        totalFemale = femaleInvited.intValue() + ob.femaleInvited.intValue();
        System.out.println("Total male is " + totalMale + " and female is " + totalFemale);
    }

    //check type of variable
    void showType() {
        System.out.println(peopleInvited.getClass().getName());
    }
}
