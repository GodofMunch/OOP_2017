public class Animal {

    private String type;
    private String[] continents;
    private int age;
    private double weight;

    public String getType() { return type; }

    public int getAge() { return age; }

    public double getWeight() { return weight; }

    public String[] getContinents() { return continents; }

    public void setType(String type) { this.type = type; }

    public void setAge(int age) { this.age = age;}

    public void setWeight(double weight) { this.weight = weight; }

    public void setContinents(String continents[]) {this.continents = continents; }

    public Animal() {this ("Null", String[], 12, 450.00); }

    public Animal(String type, String continents[], int age, double weight) {

        setType(type);
        setContinents(continents[]);
        setAge(age);
        setWeight(weight);


    }
}
