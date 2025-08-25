package com.mehodover;
class Aa {
    void m1() {
        System.out.println("m1 in a");
    }
}
class Bb extends Aa {
    void m1() {
        System.out.println("m1 in b");
    }
}

class Testt1 {
    public static void main(String[] args) {
        Bb b1 = new Bb();
        b1.m1();
    }
}
