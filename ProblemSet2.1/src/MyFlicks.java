//MyFlicks.java
/*This Class contains the main method that will call on the displayFilms
method found also in this Class.
 */

import javax.swing.*;
import java.awt.*;

public class MyFlicks {

    public static void main(String[] args) {

        Film[] catalog;
        boolean[] catalogSlot;
        JTextArea myTextArea = new JTextArea();
        Font myFont = new Font(Font.MONOSPACED, Font.PLAIN, 16);
        myTextArea.setFont(myFont);

        boolean userIntends = true, atLeastOne = false;
        int amount, duration=-1, dialogButton;
        String title, director;


        //The user decides how big the Film[] needs to be
        amount = Integer.parseInt(JOptionPane.showInputDialog("How many films " +
                "would you like to enter?"));
        catalog = new Film[amount];
        catalogSlot = new boolean[amount];

        //The user is asked to confirm their choice.
        //If negative, Exit Program
        dialogButton = JOptionPane.showConfirmDialog(null,
                "You have entered " + amount + ". Would You " +
                        "like to proceed?", "DVD Info",
                JOptionPane.YES_NO_OPTION);

        if (dialogButton == JOptionPane.YES_OPTION) {
            while (userIntends)
            {
                //Ensuring that each corresponding boolean[] value is false
                for(int j=0;j<catalogSlot.length;j++)
                    catalogSlot[j] = false;

                //The user populates the Film[]
                for (int i = 0; i < amount; i++)
                {
                    //The user enters the attributes needed for the Film
                    director = JOptionPane.showInputDialog("Film " + (i+1) +
                            ". Please enter the name of the Director");

                    title = JOptionPane.showInputDialog("Film " + (i+1) + ". Please " +
                            "enter the name of the film");

                    duration = Integer.parseInt(JOptionPane.showInputDialog("Film " +
                            (i+1) + ". In minutes, Please enter the duration of the film"));

                    //The Film Object is created
                    Film myFilm = new Film(director, title, duration);

                    //The user has entered any String value for each attribute, so the program has information to display

                    if(!director.equals("") && !title.equals("") && duration!=-1)
                        atLeastOne = true;

                    //This instance of the film is added to the Film[]
                    catalog[i] = myFilm;
                    catalogSlot[i] = true;

                    //The user has a choice to leave the program
                    dialogButton = JOptionPane.showConfirmDialog(null,
                            "Thank you! Continue?","DVD Info",
                            JOptionPane.YES_NO_OPTION);
                    if(dialogButton == JOptionPane.NO_OPTION)
                    {
                        //Exits the main loop and proceeds to display info
                        userIntends = false;
                        break;
                    }
                }
            }
            if(atLeastOne)
            {
                //If the user has entered at least one Film, then add the String values of
                //its attributes to the Text Area
                myTextArea.append(displayMessage(catalog, catalogSlot));
                myTextArea.append("\n\nYou have entered " + Film.filmNo + " films");

                JOptionPane.showMessageDialog(null, myTextArea, "DVD Info", JOptionPane.PLAIN_MESSAGE);
            }
        }
        System.exit(0);
    }

    public static String displayMessage(Film[] catalog, boolean[] catalogSlot)
    {
        String filmText="";

        for(int i = 0;i<catalogSlot.length;i++)
            if(catalogSlot[i])
                filmText += catalog[i].toString();

        return filmText;
    }
}