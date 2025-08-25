package com.constructors;

public class view {
    static int i = 10, j = 20;
}

class B extends view {
    int k = 30;

    public void display() {
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}

class Demmo {  // no public
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
