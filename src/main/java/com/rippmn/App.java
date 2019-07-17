package com.rippmn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        for (int i = 256; i <= 511; i++) {
            BracketNode bn = new BracketNode(i);
            if(i%64==0){
                System.out.println("\n------------------\n");
            }
            System.out.println((bn.getInsertValue()+1));
        }
    }
}
