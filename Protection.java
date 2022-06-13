// ques 17

import Protection.*;

public interface Protection {
    public static void main(String args[]) {
        Protection2package p2 = new Protection2package();
        Protectionpackage p1 = new Protectionpackage();
        p1.readString();
        p2.readStringextends();
        System.out.println("Public string accessible outside package :" + p1.str1);
        System.out.println("Private string is not accessible outside package");
        System.out.println("Protected string is not accessible outside package");

    }
}