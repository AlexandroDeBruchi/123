public class person {
    private String name;
    private int age;
    private float weight;
    private float height;

    public String getName() {
        return name;
    }

    public void setName(String name,
                        int age,
                        float weight,
                        float height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
