//DoughnutDriver.java
/*This program assesses the users creation of a doughnut to a very strict recipe!! Its a bit over the top but
sure look it... isn't that it!*/


import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class DoughnutDriver {
    public static void main(String[] args) {

        JTextArea myText = new JTextArea();
        Font myFont = new Font(Font.MONOSPACED, Font.PLAIN, 12);
        myText.setFont(myFont);

        String text = "";
        int eggs, flour, yeast, warmWater, milk, casterSugar, butter;
        int afterButter, vegetableOil, icing, hotWater;
        double vanilla;

        eggs = Integer.parseInt(JOptionPane.showInputDialog("How many egs did you use?"));
        flour = Integer.parseInt(JOptionPane.showInputDialog("How much flour did you use?"));
        yeast = Integer.parseInt(JOptionPane.showInputDialog("How much yeast did you use?"));
        warmWater = Integer.parseInt(JOptionPane.showInputDialog("How much warm water did you use?"));
        milk = Integer.parseInt(JOptionPane.showInputDialog("How much milk did you use?"));
        casterSugar = Integer.parseInt(JOptionPane.showInputDialog("How much caster sugar did you use?"));
        butter = Integer.parseInt(JOptionPane.showInputDialog("How much butter did you use?"));
        afterButter = Integer.parseInt(JOptionPane.showInputDialog("How much butter did you put in afterwards?"));
        vegetableOil = Integer.parseInt(JOptionPane.showInputDialog("How much vegetable oil did you use?"));
        icing = Integer.parseInt(JOptionPane.showInputDialog("How much icing sugar did you use?"));
        hotWater = Integer.parseInt(JOptionPane.showInputDialog("How uch hot water did you use?"));
        vanilla = Double.parseDouble(JOptionPane.showInputDialog("How many teaspoons of vanilla extract did you use?"));

        DoughNut myDoughnut = new DoughNut(eggs, flour, yeast, warmWater, milk, casterSugar,
                butter, afterButter, vegetableOil, icing, hotWater, vanilla);

        if(DoughNut.enoughEggs(eggs)) {
            text += "\n" + "Eggs: " + "Good";

            if(DoughNut.enoughFlour(flour)){
                text += "\n"+ "Flour: " + "Good";

                if(DoughNut.enoughYeast(yeast)) {
                    text += "\n" + "Yeast: " + "Good";

                    if(DoughNut.enoughWarmWater(warmWater)) {
                        text += "\n" + "Warm Water: " + "Good";

                        if(DoughNut.enoughMilk(milk)){
                            text += "\n" + "Milk: " + "Good";

                            if(DoughNut.enoughCastorSugar(casterSugar)){
                                text += "\n" + "Castor sugar: " + "Good";

                                if(DoughNut.enoughButter(butter)) {
                                    text += "\n" + "Butter: " + "Good";

                                    if(DoughNut.enoughAfterButter(afterButter)){
                                        text += "\nAfter Butter: " + "Good";

                                        if(DoughNut.enoughVegetableOil(vegetableOil)){
                                            text += "\nVegetable Oil: " + "Good";

                                            if(DoughNut.enoughHotWater(hotWater)){
                                                text += "\nHot Water" + "Good";

                                                if(DoughNut.enoughIcingSugar(icing)){
                                                    text+= "\nIcing Sugar: " + "Good";

                                                    if(DoughNut.enoughVaniilaExtract(vanilla)){
                                                        text += "\nVanilla Extract: " + "Good";
                                                    }
                                                    else
                                                        text += "\nVanilla Extract: " + "Bad";
                                                }
                                                else
                                                    text+= "\nIcing Sugar: " + "Bad";
                                            }
                                            else
                                                text += "\nHot Water" + "Bad";
                                        }
                                        else
                                            text += "\nVegetable Oil: " + "Bad";
                                    }
                                    else
                                        text += "\nAfter Butter: " + "Bad";
                                }
                                else
                                    text += "\n" + "Butter: " + "Bad";
                            }
                            else
                                text += "\n" + "Castor sugar: " + "Bad";
                        }
                        else
                            text += "\n" + "Milk: " + "Bad";
                    }
                    else
                        text += "\n" + "Warm Water: " + "Bad";
                }
                else
                    text += "\n" + "Yeast: " + "Bad";
            }
            else
                text += "\n"+ "Flour: " + "Bad";
        }
        else
            text += "\n" + "Eggs: " + "Bad";

    myText.append(text);

    JOptionPane.showMessageDialog(null, myText);

    System.exit(0);

    }
}
