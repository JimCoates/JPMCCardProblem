package cards;

public enum Value {

    ACE("A", 11),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    JACK("J", 11),
    QUEEN("Q", 12),
    KING("K", 13);

    String faceValue;
    int value;


    Value(String f, int v) {
        this.faceValue = f;
        this.value = v;
    }

    public String getFaceValue(){
        return faceValue;
    }

    public int getValue(){
        return this.value;
    }
}
