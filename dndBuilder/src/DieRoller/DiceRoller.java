/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Character.Classes/Main.java to edit this template
 */
package DieRoller;

import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DiceRoller
{

    public static void main(String[] args)
    {

        JTextField diceNum = new JTextField();
        JTextField diceMod = new JTextField();
        String[] diceTypes = { "4", "6", "8", "10", "12", "20", "100"};
        JComboBox diceSize = new JComboBox(diceTypes);
        Object[] fields = {"Number of dice", diceNum, "Type of dice", diceSize, "Modifier", diceMod};

        
        JOptionPane.showConfirmDialog(null, fields, "Dice Roller",JOptionPane.OK_CANCEL_OPTION);
        
        
        int numberOfDice = Integer.parseInt(diceNum.getText());
        int sizeOfDice = Integer.parseInt(diceSize.getSelectedItem().toString());
        int modifier = Integer.parseInt(diceMod.getText());
        int[] diceRolls = rollDice(numberOfDice, sizeOfDice);
        int rollTotal = rollTotal(diceRolls, modifier);
        
        String rollString = numberOfDice + "d" + sizeOfDice + modifierString(modifier) + "\nRolled: " + Arrays.toString(diceRolls) + "\nRoll Total";
        if (modifier == 0)
            rollString += ": " + rollTotal;
        else 
            rollString += " with " + modifierString(modifier) + " modifier: " + rollTotal;
       JOptionPane.showMessageDialog(null,rollString,"Dice Rolls", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int[] rollDice(int numberOfDice, int sizeOfDice)
    {
        int[] diceRolls = new int[numberOfDice];
        for (int rolledDice = 0; rolledDice < diceRolls.length; rolledDice++)
        {
            diceRolls[rolledDice] = (int) (Math.random() * sizeOfDice) + 1;
        }
        return diceRolls;
    }

    public static int rollTotal(int[] diceRolls, int modifier)
    {
        int rollTotal = 0;
        for (int index = 0; index < diceRolls.length; index++)
        {
            rollTotal += diceRolls[index];
        }
        rollTotal += modifier;
        return rollTotal;
    }
    
    public static String modifierString(int modifier)
    {
        String modifierString = "";
        if (modifier < 0)
            modifierString += modifier;
        if (modifier > 0)
            modifierString+= "+" + modifier;
        return modifierString;
    }
}
