public class Wolf {

    private boolean isMale;
    private String name;
    private int weight;
    private int age;
    private String color;

    public void setIsMale(boolean newIsMale) {
        isMale = newIsMale;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setWeight(int newWeight) {
        weight = newWeight;
    }

    public void setAge(int newAge) {
        if (newAge > 8) {
            System.out.println("Incorrect age");
        } else {
            age = newAge;
        }
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public boolean IsMale() {
        return isMale;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void walk() {
        System.out.println("walking");
    }

    public void sit() {
        System.out.println("sitting");
    }

    public void run() {
        System.out.println("running");
    }

    public void howl() {
        System.out.println("howling");
    }

    public void hunt() {
        System.out.println("hunting");
    }
}
