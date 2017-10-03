public class Bicycle {

    private String name, make;
    private double value;

    public String getName() { return name; }

    public String getMake() { return make; }

    public  double getValue() { return value; }

    public void setName(String name) { this.name = name;}

    public void setMake(String make) { this.make = make;}

    public void setValue(double value) { this.value = value;}

    public Bicycle() {this ("", 0.0, ""); }


    public Bicycle(String name, double value, String make) {
        setName(name);
        setValue(value);
        setMake(make);
    }

    public double costPrice(double value)
    {
        return value;
    }

    public void salePrice(double discount)
    {
         value = value - discount;
    }

    public String toString() {
        String list = "";

        list = String.format("%-20s%-20.2f%-20s\n", getName(), getValue(), getMake());

        return list;
    }
}
