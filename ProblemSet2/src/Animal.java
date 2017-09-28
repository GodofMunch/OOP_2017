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

    public Animal() {this ("Null", null, 0, 0.00); }

    public Animal(String type, String continents[], int age, double weight) {

        setType(type);
        setContinents(continents);
        setAge(age);
        setWeight(weight);
    }

    public String toString() {

        String contList = "\n";
        if(continents!=null) {
            for (int i = 0; i < continents.length; i++) {
                if(i<(continents.length-1))
                    contList += String.format("%-25s%s\n", "",continents[i]);
                else
                    contList += String.format("%-25s%s", "",continents[i] + "\n");
            }
        }
        else
            contList = "Null";

        return String.format("%-25s%-25s\n%-25s%-25s\n%-25s%-25d\n%-25s%.2f", "Type of animal: ",
                type, "Continent: ", contList, "Age of the animal: ", age, "Weight of the animal: ", weight);
    }
}
