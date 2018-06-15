package com.practice;

/**
 * Hello world!
 *
 */
public class App
{
    
    int target = -5;
int num = 3;

target =- num;  // Noncompliant; target = -3. Is that really what's meant?
target =+ num; // Noncompliant; target = 3
    public static void main( String[] args )
    {
        System.out.println( "Hello Sam!"+"teste de     alteração" );
    }
}
