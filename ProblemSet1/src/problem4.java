import javax.swing.*;

public class problem4 {
    public static void main(String[] args) {

        String name, caps, surname;
        int i, nameLength, spaceFinder=0;
        char firstInitial;

        name = JOptionPane.showInputDialog("Please enter your full name");

        nameLength=name.length();
        firstInitial = name.charAt(0);
        caps = name.toUpperCase();

        for(i=0;i<nameLength;i++)
          if(name.charAt(i)==' ')
              spaceFinder=i;

        spaceFinder = name.lastIndexOf(' ');
        surname = name.substring(spaceFinder, nameLength);

        JOptionPane.showMessageDialog(null, name + "\n" +
                nameLength + "\n" + firstInitial + "\n" + caps + "\n" + surname);

    }
}
