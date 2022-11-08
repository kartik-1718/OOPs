package com.learn.abstraction;

public class KartikTech implements ITCompanies{

   public void Working(){
        System.out.println("Kartik is working on Java Project");
    }

    public static void main(String[] args) {
        KartikTech kartik = new KartikTech();
        kartik.Working();
    }
}
