package com.smardec.ci_test;

/**
 * Created by gwhite 28.07.2016.
 */
public class Application {

    public void doVoid(){
        System.out.println("Application.doVoid");
    }

    public Integer doSum(Integer a, Integer b){
        if(a == null) {
            return b;
        } else if(b == null) {
            return a;
        }
        return a + b;
        //return a == null ? b: (b == null ? a : a + b);
    }

    public Boolean doBoolean(Boolean a, Boolean b){
        if(a == null) {
            return b;
        } else if(b == a) {
            return a;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Application.main");

        Application app = new Application();
        app.doVoid();

        System.out.println("Result: " + app.doSum(12, 21));
    }
}
