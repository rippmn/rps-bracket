package com.rippmn;

import junit.framework.TestCase;

public class BracketNodeTest extends TestCase {

    public void testPositionZero(){
        try{
            BracketNode bn = new BracketNode(0);
        }catch (AssertionError e){
        }catch (Error e){
            fail("did not catch assertion error");
        }
    }

    public void testRootNode(){
        BracketNode bn = new BracketNode(1);
        assertEquals(0, bn.getLevel());
        assertEquals(0, bn.getInsertValue());
    }

    public void testLevel1(){
        BracketNode bn = new BracketNode(2);
        assertEquals(1, bn.getLevel());
        assertEquals(0, bn.getInsertValue());

        bn = new BracketNode(3);
        assertEquals(1, bn.getLevel());
        assertEquals(1, bn.getInsertValue());
    }

    public void testLevel2(){
        BracketNode bn = new BracketNode(4);
        assertEquals(2, bn.getLevel());
        assertEquals(0, bn.getInsertValue());

        bn = new BracketNode(5);
        assertEquals(2, bn.getLevel());
        assertEquals(2, bn.getInsertValue());

        bn = new BracketNode(6);
        assertEquals(2, bn.getLevel());
        assertEquals(1, bn.getInsertValue());

        bn = new BracketNode(7);
        assertEquals(2, bn.getLevel());
        assertEquals(3, bn.getInsertValue());
    }

    public void testLeval8(){
        BracketNode bn = new BracketNode(256);
        assertEquals(8, bn.getLevel());
        assertEquals(0, bn.getInsertValue());

        bn = new BracketNode(257);
        assertEquals(8, bn.getLevel());
        assertEquals((int)Math.pow(2,7), bn.getInsertValue());
    }


}
