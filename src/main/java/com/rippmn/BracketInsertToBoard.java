package com.rippmn;

public class BracketInsertToBoard {
    public static void main(String[] args) {

        BracketNode[] nodes = new BracketNode[256];
        for (int i = 256; i <= 511; i++) {
            BracketNode bn = new BracketNode(i);

            //hmmm I wonder if this is mutable
            nodes[bn.getInsertValue()]=bn;
        }

        for(BracketNode bn:nodes){
            int pos = bn.getPosition();
            //the correct fomula to find the bord position is just modulus(yes) but also works to subtract (board-1)*64 from position
            System.out.println((pos/64)-3+"-"+((pos%64)+1)+"-"+ (pos-255));
        }

    }
}
