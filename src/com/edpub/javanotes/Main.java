package com.edpub.javanotes;

class Main {
    public static void main(String args[]){
        System.out.println("Hello World");
    }

    void variables(){
//        1) Local Variable
//        A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
//        A local variable cannot be defined with "static" keyword.
//
//        2) Instance Variable
//        A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.
//        It is called an instance variable because its value is instance-specific and is not shared among instances.
//
//        3) Static variable
//        A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.
    }

    void dataTypes(){
//        Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
//        Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.

        int x = 10;
        float y = 10.0F;
        double z = 10.0;
        char c = 'c';
        boolean d = true;
        byte e = 10;
        short f = 10;
        long g = 100;
        String a = "Hello" ;
    }
};//Semicolon at end of class is optional in java