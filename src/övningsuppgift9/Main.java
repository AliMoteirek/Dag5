package övningsuppgift9;

public class Main {
    public static void main(String[] args) {

        RomerskaSiffror [] allRomerskaSiffror = RomerskaSiffror.values() ;
        for (RomerskaSiffror romerskaSiffror : allRomerskaSiffror) {
            System.out.println(romerskaSiffror + " is \'" + romerskaSiffror.getNum() + "\': " + romerskaSiffror.getNumString());
        }

       // for (RomerskaSiffror r : RomerskaSiffror.values()) {
       //     System.out.println(r + " is \'" + r.getNum() + "\': " + r.getNumString());
       // }
    }
}
