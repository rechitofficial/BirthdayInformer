package com.rechit.birthdayinformer.basic.birthday;

public class ListItemsNeeded {
    // this is part of my generics java study
    public static void showItems(){
        GenericInvitation<Integer> guest_invitation = new GenericInvitation<>(70, 15, 55);
        GenericInvitation<Double> vip_invitation = new GenericInvitation<>(9.0, 4.0, 5.0);
        System.out.println("Well well well, from maximal of 10 vip and 100 guest seats how many people are coming in my birthday?: ");
        vip_invitation.isSeatEnough();
        guest_invitation.isSeatEnough();
        guest_invitation.totalGenderInvited(vip_invitation);
    }
}
