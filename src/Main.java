/*
Create a Java program that uses lambda expressions with a generic
type functional interface. Define a functional interface:
GroupOneFunctionalInterface<T, R> with a single abstract method
‘transform’ with one type param and a return type. Use a lambda
expression to implement the functional interface. The lambda
expression takes a String input and returns its length as an Integer.
Create an instance of the functional interface ‘transformer’ and use it to
transform a string to its length and then display the length of the input
string.
 */

public class Main {
    public static void main(String[] args) {

        GroupFiveFunctionalInterfac <String, Integer> Obj = (str)-> str.length();
        System.out.println(Obj.transform("String length"));
    }
}