package com.practice;

/**
 * Hello world!
 *
 */
public class App
{
    
   String firstName = getFirstName();   //String overrides equals
String lastName = getLastName();

if (firstName == lastName) { ... };   // Non-compliant; false even if the strings have the same value
    public static void main( String[] args )
    {
        System.out.println( "Hello Sam!"+"teste de     alteração" );
    }
}
