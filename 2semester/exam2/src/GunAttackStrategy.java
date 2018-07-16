public class GunAttackStrategy extends AttackStrategy {
    Hero hero;
    @Override
    public int attack() {
        int hp = hero.getHp();
        int newHp = hp - 50;
        return newHp;
    }
}
