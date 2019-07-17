package com.rippmn;

public class BracketNode {
    private int position;
    private int insertValue;
    private int level;

    public BracketNode(int position) {
        this.position = position;

        assert position > 0;

        if (position == 1) {
            level = 0;
            insertValue = 0;
        } else {
            BracketNode parent = new BracketNode(position / 2);
            this.level = parent.getLevel() + 1;
            //not sure this is the right calc but what it should be is the parents insertOrder (needs renaming as it only matters at the leafs) + the current nodes value (level as a power of 2??)
            this.insertValue = parent.getInsertValue() + ((2 ^ (this.level - 1)) * (position % 2));
        }

    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getInsertValue() {
        return insertValue;
    }

    public void setInsertValue(int insertValue) {
        this.insertValue = insertValue;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
