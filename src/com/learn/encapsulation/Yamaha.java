package com.learn.encapsulation;

public class Yamaha {

    public static void main(String[] args) {
        Bike MT = new Bike();

        MT.setName("Yamaha MT15");
        MT.setCc(155);
        MT.setColor("Black");
        MT.setPrice(215000);

        System.out.println(MT.getName() + " " + MT.getCc() + " " +   MT.getColor() + " " +  MT.getPrice());
    }
}
