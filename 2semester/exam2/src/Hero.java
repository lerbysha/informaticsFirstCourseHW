public class Hero {
    String name ;
    int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    private AttackStrategy currentAttackStrategy ;
    public void setCurrentAttackStrategy(   AttackStrategy a){
        currentAttackStrategy = a;
    }
    public void attack(){
        currentAttackStrategy.attack();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hero)) return false;

        Hero hero = (Hero) o;

        if (hp != hero.hp) return false;
        return name != null ? name.equals(hero.name) : hero.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + hp;
        return result;
    }
}
