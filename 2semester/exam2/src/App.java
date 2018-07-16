public class App {
    public static void main(String[] args) {
        Hero h = new Hero("ar",100);
        h.setCurrentAttackStrategy(new GunAttackStrategy());
        h.attack();
        Hero h2=new Hero("arr",100);
        h2.setCurrentAttackStrategy(new KnifeAttackStrategy());
        h2.attack();
    }
}
