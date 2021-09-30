package övningsuppgift9;

public class Main {
    public static void main(String[] args) {
        for (RomerskaSiffror r : RomerskaSiffror.values()) {
            System.out.println(r + " is \'" + r.getNum() + "\': " + r.getNumString());
        }
    }
}
