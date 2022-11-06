import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Lesson1 {
    public static void main(String[] args) {

        List<BaseHero> darkSide = new ArrayList<>();
        List<BaseHero> whiteSide = new ArrayList<>();

        whiteSide.add(new Witch());
        whiteSide.add(new Peasant());
        whiteSide.add(new Robber());
        whiteSide.add(new Sniper());
        Random rnd = new Random();
        for(int i=0; i<4; i++){
            switch (rnd.nextInt(4)) {
                case 0 -> whiteSide.add(new Robber());
                case 1 -> whiteSide.add(new Crossbowman());
                case 2 -> whiteSide.add(new Spearman());
                default -> whiteSide.add(new Peasant());
            }
        }

        darkSide.add(new Monk());
        darkSide.add(new Peasant());
        darkSide.add(new Robber());
        darkSide.add(new Sniper());
        for(int i=0; i<4; i++){
            switch (rnd.nextInt(4)) {
                case 0 -> darkSide.add(new Spearman());
                case 1 -> darkSide.add(new Crossbowman());
                case 2 -> darkSide.add(new Monk());
                default -> darkSide.add(new Peasant());
            }
        }

        whiteSide.forEach(n-> System.out.println(n.getInfo()));
        System.out.println();
        darkSide.forEach(n-> System.out.println(n.getInfo()));
    }
}
