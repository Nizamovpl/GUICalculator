//import statements

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame{
    
    private JFrame frame;

    
    public Calculator(){
        initUI(); 
    }

    private void initUI(){
        
        frame.setSize(400,400); 

        var one = new JButton("1");
        var two = new JButton("2");
        var three = new JButton("3"); 
        var four = new JButton("4");
        var five = new JButton("5");
        var six = new JButton("6");
        var seven = new JButton("7");
        var eight = new JButton("8");
        var nine = new JButton("9");
        var plus = new JButton("+");
        var minus = new JButton("-");
        var multiply = new JButton("*");
        var divide = new JButton("/"); 

        one.addActionListener(placeholder()); 
        two.addActionListener();
    }

    public void placeholder(){
        numOne = one; 
    }; 

    public void setNum(){
        
        if(plus == true){
            ans = numOne+numTwo; 

        }

        if(minus == true){
            ans = numOne + numTwo; 
        }

        //etc
         
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            var calculator = new Calculator();
            calculator.setVisible(true);
        });

        if(numOne = true && plus == true || minus == true || multiply == true || division == true){
            setNum(); 
        }
    }

}