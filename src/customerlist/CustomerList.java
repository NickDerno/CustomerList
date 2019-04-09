/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customerlist;

import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nider6687
 */
public class CustomerList {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    static int i;
    public static void main(String[] args) throws IOException {
    
    PrintWriter fileOut = new PrintWriter(new FileWriter("CustomerList.txt"));
    String customers = JOptionPane.showInputDialog("How many people are in your list?");
    int number = Integer.parseInt(customers);
    for (i = 1; i < number+1; i++) {
        CustomerName();

    }
}
    public static void CustomerName() {
        String name = JOptionPane.showInputDialog("What is the name of Customer #" + i);
        //fileOut.println(name);
    }
}

    

