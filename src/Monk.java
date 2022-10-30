public class Monk extends  BaseHero{
    private boolean magic;

    public Monk() {
        super(String.format("Monk#%d", ++Monk.number),
                30, 12, 7, 0, new int[]{-4, 0}, 5);
        magic = true;
    }

    /*@Override
    public void strike(BaseHero hero){
    }
    @Override
    public void getDamage(int damagePower){
    }
    @Override
    public boolean changePosition(){return false;}
    @Override
    public String indicateStatus()){return null;}*/
    @Override
    public String getInfo() { return String.format("%s magic: %b", super.getInfo(), magic);
    }
}
