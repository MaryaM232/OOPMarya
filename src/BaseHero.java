public abstract class BaseHero implements Actions{
    protected static int number;
    private String name;
    private  int attack;
    private int protection;
    private int shots;
    private int[] damage;
    private int health;
    private int speed;
    private boolean status;

    static {
        number = 0;
    }

    public BaseHero(String name, int health) {
        this.name = name;
        this.health = health;
        status = true;
    }
    public BaseHero(String name, int health, int attack,
                    int protection, int shots, int[] damage, int speed){
        this(name, health);
        this.attack = attack;
        this.protection = protection;
        this.shots = shots;
        this.damage = damage;
        this.speed = speed;
    }

    public String getInfo(){
        return String.format("%s: %s hlth: %d attk: %d protect: %d shot: %d dng: %d-%d speed: %d",
        this.getClass().getSimpleName(), name, health, attack, protection, shots, damage[0], damage[1], speed);
    }

    public String getName() { return name; }
    public int getAttack() { return attack; }
    public int getProtection() { return protection; }
    public int[] getDamage() { return damage; }
    public int getHealth() { return health; }
    public int getShots() { return shots; }
    public int getSpeed() { return speed; }
    public boolean getStatus() { return status; }

    public static int getNumber(){return  number;}

    @Override
    public void strike(BaseHero hero){
    }
    @Override
    public void getDamage(int damagePower){
    }
    @Override
    public boolean changePosition(){return false;}
    @Override
    public String indicateStatus(){return null;}
}
