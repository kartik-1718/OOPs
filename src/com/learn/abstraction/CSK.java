package com.learn.abstraction;

public class CSK extends IPL{


    void play() {
        System.out.println("CSK is not playing good cricket in IPL and they are loosing matches");
    }

    public static void main(String[] args) {
        CSK obj = new CSK();
        obj.play();
    }
}
