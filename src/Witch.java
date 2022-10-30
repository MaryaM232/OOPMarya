public class Witch extends BaseHero{
    public Witch () { super(String.format("Witch#%d", ++Witch.number),
            30, 17, 12, 0, new int[]{-5, 0}, 9);}
}
