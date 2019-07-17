package com.rippmn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        for (int i = 8; i < 16; i++) {
            BracketNode bn = new BracketNode(i);
            System.out.println(bn.getInsertValue());
        }
    }
}
