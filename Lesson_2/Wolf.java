public class Wolf {

    private boolean isMale;
    private String name;
    private int weight;
    private int age;
    private String color;

    public void setIsMale(boolean newIsMale) {
        isMale = newIsMale;
    }

    public boolean IsMale() {
        return isMale;
    }


    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }


    public void setWeight(int newWeight) {
        weight = newWeight;
    }

    public int getWeight() {
        return weight;
    }


    public void setAge(int newAge) {
        if (newAge > 8) {
            System.out.println("Incorrect age");
        } else {
            age = newAge;
        }
    }

    public int getAge() {
        return age;
    }


    public void setColor(String newColor) {
        color = newColor;
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
