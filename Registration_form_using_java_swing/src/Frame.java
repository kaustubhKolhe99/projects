import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    JLabel tName, tMobile , tGender, tDOB, tAddress, tRegistrationStatus,tRegistrationForm;
    JTextArea taDisplay, taAddress;
    JButton bSubmit;
    JRadioButton rbMale , rbFemale;
    JCheckBox cbTermAndCond;
    JTextField tfName, tfMobile;
    JComboBox DOB1, DOB2,DOB3;
    ButtonGroup bgGender;


    public Frame(){
        setTitle("Registration Form");
        setSize(800,650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        tRegistrationForm = new JLabel("Registration Form");
        tRegistrationForm.setBounds(160,20,150,25);
        tRegistrationForm.setFont(new Font("Arial", Font.BOLD,17));
        c.add(tRegistrationForm);

        tName = new JLabel("Name");
        tName.setBounds(25,75,100,20);
        c.add(tName);

        tMobile = new JLabel("Mobile");
        tMobile.setBounds(25,125,100,20);
        c.add(tMobile);

        tGender = new JLabel("Gender");
        tGender.setBounds(25,175,100,20);
        c.add(tGender);

        tDOB = new JLabel("DOB");
        tDOB.setBounds(25,225,100,20);
        c.add(tDOB);

        tAddress = new JLabel("Address");
        tAddress.setBounds(25,275,100,20);
        c.add(tAddress);

        tfName = new JTextField();
        tfName.setBounds(130,75,120,20);
        c.add(tfName);

        tfMobile = new JTextField();
        tfMobile.setBounds(130,125,120,20);
        c.add(tfMobile);

        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        rbMale.setFont(new Font("Arial",Font.BOLD,12));
        rbFemale.setFont(new Font("Arial", Font.BOLD,12));
        rbMale.setBounds(130,175,100,20);
        rbFemale.setBounds(230,175,100,20);
        c.add(rbMale);
        c.add(rbFemale);
        rbMale.setSelected(true);

        bgGender = new ButtonGroup();
        bgGender.add(rbMale);
        bgGender.add(rbFemale);
        String[] day = new String[32] ;
        for (int i = 1; i <=31 ; i++) {
//            day[i-1] = String.valueOf(i);
            String temp = String.valueOf(i);
            day[i-1] = temp;

        }
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] year = new String[101];
        for (int i = 1930; i <=2030 ; i++) {
            String temp = String.valueOf(i);
            year[i-1930]=temp;
        }
        System.out.println(year[26]);
        DOB1 = new JComboBox(day);
        DOB1.setBounds(130,225,55,20);
        c.add(DOB1);

        DOB2 = new JComboBox(month);
        DOB2.setBounds(200,225,80,20);
        c.add(DOB2);

        DOB3 = new JComboBox(year);
        DOB3.setBounds(295,225,55,20);
        c.add(DOB3);

        taAddress = new JTextArea();
        taAddress.setBounds(130,265,250,60);
        c.add(taAddress);

        cbTermAndCond = new JCheckBox();
        cbTermAndCond.setText("Please Accept Terms and Condition");
        cbTermAndCond.setBounds(50,365,300,20);
        c.add(cbTermAndCond);

        tRegistrationStatus = new JLabel("Registration Successful!");
        tRegistrationStatus.setBounds(50,475,250,20);
        c.add(tRegistrationStatus);
        tRegistrationStatus.setVisible(false);
        System.out.println(rbFemale.getText());

        bSubmit = new JButton("Submit");
        bSubmit.setBounds(150,425,80,20);
        c.add(bSubmit);
//        bSubmit.setEnabled(false);
        bSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tRegistrationStatus.setVisible(true);
                String Gender;
                if(rbFemale.isSelected()){
                    Gender = rbFemale.getText();
                }else{
                    Gender= rbMale.getText();
                }

                String details = "Name - " + tfName.getText() + "\n"+"Mobile - "+ tfMobile.getText() +"\n" +
                       "Gender - " + Gender +"\n"+ "DOB - " +  DOB1.getSelectedItem()+
                        "-"+ DOB2.getSelectedItem() + "-"+  DOB3.getSelectedItem() +"\n"+
                        "Address - "+ taAddress.getText();
                taDisplay.setText(details);
            }
        });


















        taDisplay = new JTextArea();
        taDisplay.setBounds(400,70,350,400);
        c.add(taDisplay);

        setVisible(true);
    }
}
