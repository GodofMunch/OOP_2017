import javax.swing.JOptionPane;

public class bikeDriver {
    public static void main(String args[])
    {
        String name="", make="", shtuff = "";
        double value=0;


        name = JOptionPane.showInputDialog("Please enter the owners name?");
        value = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of the bike"));
        make = JOptionPane.showInputDialog("Please enter the make of the bike");

        Bicycle userBike2 = new Bicycle();
        Bicycle userBike = new Bicycle(name, value, make);



        userBike2.setMake(make);
        userBike2.setName(name);
        userBike2.setValue(value);


        shtuff = String.format("%-20s%-20s%-20s\n", "Name:", "Value:", "Make:");
        shtuff += userBike2.toString();
        userBike.salePrice(10);
        shtuff += userBike.toString();




        JOptionPane.showMessageDialog(null, shtuff, "Bike", JOptionPane.INFORMATION_MESSAGE);
    }
}
