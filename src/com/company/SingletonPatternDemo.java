package com.company;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
