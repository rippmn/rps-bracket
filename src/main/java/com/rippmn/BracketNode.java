package com.rippmn;

public class BracketNode {
    private int position;
    private int insertValue;
    private int level;

    public BracketNode(int position) {
        this.position = position;

        assert position > 0;

        if (position == 1) {
            this.level = 0;
            this.insertValue = 0;
        } else {
            BracketNode parent = new BracketNode(position / 2);
            this.level = parent.getLevel() + 1;
            this.insertValue = parent.getInsertValue() + ((int)Math.pow(2, this.level-1) * (position % 2));
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
