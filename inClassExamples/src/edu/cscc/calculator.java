package edu.cscc;

import javax.swing.*;
import java.awt.*;

/* Gage Farmer
    9/7/2021
    calculator.java
 */

class gui{
    public static void main(String args[]){
        JFrame frame = new JFrame("Epic Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        // Menu Bar
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m12 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m12);

        // NUMBER BUTTONS AND PANEL
        JPanel numbers = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        c.gridx = 1;
        c.gridy = 3;
        numbers.add(zero, c);
        c.gridx = 0;
        c.gridy = 2;
        numbers.add(one, c);
        c.gridx = 1;
        c.gridy = 2;
        numbers.add(two, c);
        c.gridx = 2;
        c.gridy = 2;
        numbers.add(three, c);
        c.gridx = 0;
        c.gridy = 1;
        numbers.add(four, c);
        c.gridx = 1;
        c.gridy = 1;
        numbers.add(five, c);
        c.gridx = 2;
        c.gridy = 1;
        numbers.add(six, c);
        c.gridx = 0;
        c.gridy = 0;
        numbers.add(seven, c);
        c.gridx = 1;
        c.gridy = 0;
        numbers.add(eight, c);
        c.gridx = 2;
        c.gridy = 0;
        numbers.add(nine, c);


        // OPERATORS AND PANEL
        JPanel operators = new JPanel(new GridBagLayout());
        GridBagConstraints o = new GridBagConstraints();
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton divide = new JButton("/");
        JButton multi = new JButton("*");
        o.gridx = 0;
        o.gridy = 0;
        operators.add(plus, o);
        o.gridx = 1;
        o.gridy = 0;
        operators.add(minus, o);
        o.gridx = 0;
        o.gridy = 1;
        operators.add(divide, o);
        o.gridx = 1;
        o.gridy = 1;
        operators.add(multi, o);

        // TEXT AREA?
        JTextArea ta = new JTextArea();

        // ARRANGEMENTS
        frame.getContentPane().add(BorderLayout.LINE_START, numbers);
        frame.getContentPane().add(BorderLayout.PAGE_END, operators);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.EAST, ta);
        frame.setVisible(true);
    }
}

public class calculator {


    public static void main(String[] args) {

        /* TO-DO:
            get input from UI window
            have input and output visible
            eval equation
            return answer
         */

    }
}

