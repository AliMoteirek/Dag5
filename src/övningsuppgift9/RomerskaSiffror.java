package övningsuppgift9;

public enum RomerskaSiffror {
    I (1, "ett") , V (5, "fem") , X(10, "tio") , L(50, "femtio") , C (100, "hundra") ,
    D (500, "femhundra") , M (1000, "tusen") ;

    public final int num ;
    public final String numString ;

    RomerskaSiffror(int num, String numString) {
        this.num = num;
        this.numString = numString;
    }

    public int getNum() {
        return num;
    }

    public String getNumString() {
        return numString;
    }
}
