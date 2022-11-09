public interface Actions {
    void strike(BaseHero hero);
    void getDamage(int damagePower);
    boolean changePosition();
    String indicateStatus();
    String getInfo();
}
