package com.learn.oop;

public class TV
{

    //Defined Field for Televison
    String Brand;
    String ModelName;
    Integer ScreenSize;
    Integer Price;
    String Color;
    String DisplayType;

    void insertData(String B , String MName , Integer SSize , Integer P , String C, String DType ){
        Brand = B;
        ModelName = MName;
        ScreenSize = SSize;
        Price = P;
        Color = C;
        DisplayType = DType;
    }

    void displayTv(){
        System.out.println(Brand+ " "+ ModelName );
    }

    //defined main method
    public static void main(String[] args) {
        TV lgOled = new TV();
        TV SamsungFrame = new TV();   //creating objects/instances of the class

        lgOled.Brand = "LG";
        lgOled.ModelName = "4k Oled 75 inch ";
        lgOled.ScreenSize = 75;
        lgOled.Price = 90000;
        lgOled.Color = "Black";
        lgOled.DisplayType= "Oled";


        System.out.println(lgOled.Brand+ " " + lgOled.ModelName + " " + lgOled.ScreenSize + " " + lgOled.Price + " " + lgOled.Color + " " + lgOled.DisplayType);

        SamsungFrame.insertData("Samsung ", "Qled Ultra", 50 , 90000, "Black" , "Qled" );



        System.out.println(SamsungFrame.Brand+ " " + SamsungFrame.ModelName + " " + SamsungFrame.ScreenSize + " " + SamsungFrame.Price + " " + SamsungFrame.Color + " " + SamsungFrame.DisplayType);

        lgOled.displayTv();
        SamsungFrame.displayTv();


    }


}
