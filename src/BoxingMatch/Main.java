package BoxingMatch;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);

        Fighter firstAttacker;
        int firstAttackerDraw = (int) (Math.random() * 2);
        
        if (firstAttackerDraw == 1){
            firstAttacker = marc;
        }else {
            firstAttacker = alex;
        }

        Ring r = new Ring(marc,firstAttacker , 90 , 100);
        r.run();
    }
}
