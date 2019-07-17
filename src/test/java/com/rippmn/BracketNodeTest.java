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



}
