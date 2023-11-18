import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {


    Container c;
    JButton addButton, subButton, productButton,divButton;
    JLabel firstNumText , secondNumText , answerText, solution;
    TextField firstNumField , secondNumField;

    Frame(){
        setTitle("Calculator");
        setSize(350,300);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        c = getContentPane();

        firstNumText = new JLabel("First Number");
        firstNumText.setBounds(20,50,100,20);
        c.add(firstNumText);

        secondNumText = new JLabel("Second Number");
        secondNumText.setBounds(20,80,100,20);
        c.add(secondNumText);

        answerText = new JLabel("Solution: ");
        answerText.setBounds(20,140,100,20);
        c.add(answerText);

        solution = new JLabel();
        solution.setBounds(140,140,250,20);
        c.add(solution);

        firstNumField = new TextField();
        firstNumField.setBounds(130,50,120,20);
        c.add(firstNumField);

        secondNumField = new TextField();
        secondNumField.setBounds(130,80,120,20);
        c.add(secondNumField);

        addButton = new JButton("+");
        addButton.setBounds(20,120,50,20);
        c.add(addButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double sum = Double.parseDouble(firstNumField.getText()) + Double.parseDouble(secondNumField.getText());
                    solution.setText(Double.toString(sum));
                }catch (NumberFormatException a){
                    solution.setText("enter a valid input number");

                }


            }
        });

        subButton = new JButton("-");
        subButton.setBounds(90,120,50,20);
        c.add(subButton);
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double subtraction = Double.parseDouble(firstNumField.getText()) - Double.parseDouble(secondNumField.getText());
                    solution.setText(Double.toString(subtraction));
                }catch (NumberFormatException a){
                    solution.setText("enter a valid input number");
                }

            }
        });

        productButton = new JButton("x");
        productButton.setBounds(160,120,50,20);
        c.add(productButton);
        productButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double product = Double.parseDouble(firstNumField.getText()) * Double.parseDouble(secondNumField.getText());
                    solution.setText(Double.toString(product));
                }catch (NumberFormatException a){
                    solution.setText("enter a valid input number");
                }

            }
        });

        divButton = new JButton("/");
        divButton.setBounds(230,120,50,20);
        c.add(divButton);
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Double.parseDouble(secondNumField.getText())==0){
                        solution.setText("Not Defined");
                    }else {
                        double division = Double.parseDouble(firstNumField.getText()) / Double.parseDouble(secondNumField.getText());
                        solution.setText(Double.toString(division));
                    }
                }catch (NumberFormatException a){
                    solution.setText("enter a valid input number");
                }

            }
        });

        setVisible(true);


    }


}

/*
class Addition implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
class Subtraction implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
class Product implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
class Division implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
*/
