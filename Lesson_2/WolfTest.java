public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.name = "Bart";
        wolf.age = 7;
        wolf.color = "red";
        wolf.weight = 12;
        wolf.isMale = true;
        System.out.println(wolf.name + " is a " + wolf.color + " wolf "+ wolf.age + " years old");
        wolf.run();
        wolf.sit();
        wolf.walk();
    }
}