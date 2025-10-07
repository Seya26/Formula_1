package it.unicam.cs.MDP.Formula_1.Model;

public enum TrackCellType {

    FINISH('F'),
    START('S'),
    RACE('-'),
    WALL('x');

    private final char value;

    TrackCellType(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

}
