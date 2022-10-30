import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Lesson1 {
    public static void main(String[] args) {

        List<BaseHero> darkSide = new ArrayList<>();
        List<BaseHero> whiteSide = new ArrayList<>();

        darkSide.add(new Witch());
        darkSide.add(new Spearman());
        darkSide.add(new Robber());
        darkSide.add(new Sniper());
        Random rnd = new Random();
        for(int i=0; i<4; i++){
            switch (rnd.nextInt( 4)){
                case 0:
                    darkSide.add(new Peasant());
                    break;
                case 1:
                    darkSide.add(new Crossbowman());
                    break;
                case 2:
                    darkSide.add(new Monk());
                    break;
                default:
                    darkSide.add(new Peasant());
            }
        }

        whiteSide.add(new Witch());
        whiteSide.add(new Spearman());
        whiteSide.add(new Robber());
        whiteSide.add(new Sniper());
        for(int i=0; i<4; i++){
            switch (rnd.nextInt(4)){
                case 0:
                    whiteSide.add(new Peasant());
                    break;
                case 1:
                    whiteSide.add(new Crossbowman());
                    break;
                case 2:
                    whiteSide.add(new Monk());
                    break;
                default:
                    whiteSide.add(new Peasant());
            }
        }
        whiteSide.forEach(n-> System.out.println(n.getInfo()));
        System.out.println();
        darkSide.forEach(n-> System.out.println(n.getInfo()));
    }
}
