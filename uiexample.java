package ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class uiexample {
    

    ArrayList<Integer> playerOne = new ArrayList>=
    

    JFrame window = new JFrame(title: "Example App");

    JPanel myPanel = new JPanel();

    JTextField emaiField new JTextField("Enter your email");

    JButton myButton = new JButton(text: "Click here");

    int flag= one

    void drawui(){
        myPanel.add(emailField);
        myPanel.add(myButton);
        myPanel.setLayout(new GridLayout(rows:1, cols:2));
        window.add(myPanel);
        myPanel.setLayout(new GridLayout(rows:2, cols:1));

        window.setSize(: 300, : 500);
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
        
}

    public static void main(String[] args) {
        uiexample uiexample = new uiexample();
        uiexample.drawui();
    }
    
    void drawui(){
        myPanel.add(btn1);
        myPanel.add(btn2);
        myPanel.add(btn3);
        myPanel.add(btn4);
        myPanel.add(btn5);
        myPanel.add(btn6);
        myPanel.add(btn7);
        myPanel.add(btn8);
        myPanel.add(btn9);

        playerOne.add(1);
        playerOne.add(2);
        playerOne.add(3);  
    }