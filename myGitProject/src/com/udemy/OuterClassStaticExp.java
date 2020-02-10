package com.udemy;

public class OuterClassStaticExp {

    private static int outerData = 4000;
    public int nonStaticData = 2000;

        public OuterClassStaticExp(){
            System.out.println("Inside outer class constructor");
        }

      static class InnerClass{
        private int innerData = 3000;
        private int nonstaticInnerData = 600;

        public InnerClass(){
            System.out.println("Inside static inner class constructor");
        }

        public void invoke(){
            System.out.println("Call outer static variable outerData "+outerData);
            //innerData = 200;

            //nonstaticInnerData = innerData;

            //OuterClassStaticExp ot = new OuterClassStaticExp();    //display method is non - static, then create object to call display,
            //ot.display();
            //ot.nonStaticData=700;                                    // also the only way to use nonstaticData inside static class

            display();                                              // if display method is static, then call the method directly

        }
    }

    public static void display(){
        System.out.println("OuterClass display method is called");
        InnerClass innerClass = new InnerClass();
        System.out.println("Accessing inner class variable innerData "+innerClass.innerData);
    }

    public static void main(String [] args){
        OuterClassStaticExp.InnerClass inner = new OuterClassStaticExp.InnerClass();
        OuterClassStaticExp ot = new OuterClassStaticExp();

    }

}

class ClientTest{
    OuterClassStaticExp ot = new OuterClassStaticExp();

    public static void callMethod(){

        OuterClassStaticExp.InnerClass inner = new OuterClassStaticExp.InnerClass();

        OuterClassStaticExp ot = new OuterClassStaticExp();

        inner.invoke();       // if invoke method is non - static or static

        // if invoke method is static
        //OuterClassStaticExp.InnerClass.invoke();
    }
}
