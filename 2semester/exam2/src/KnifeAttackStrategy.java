public class KnifeAttackStrategy extends AttackStrategy{
    Hero hero;

    @Override
    public int attack() {
     int hp =  hero.getHp();
     int newHp = hp - 15;
     return newHp;
    }
}
