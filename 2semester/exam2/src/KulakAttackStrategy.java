public class KulakAttackStrategy extends AttackStrategy {
    Hero hero;
    @Override
    public int attack() {
       int hp = hero.getHp();
       int newHp = hp-5;
       return newHp;
    }
}
