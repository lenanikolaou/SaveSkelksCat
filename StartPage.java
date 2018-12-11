import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartPage {
  static  JFrame frame;
  static  JPanel panel;


    public static void Frame() {
        // Create and set up a frame window
        frame = new JFrame("Start Menu");
        panel = new JPanel();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("BoxLayout Example X_AXIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the panel to add buttons

        panel = new JPanel();
;

    BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
    // Set border for the panel

        panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
    //panel.setBorder(new EmptyBorder(new Insets(50, 80, 50, 80)));
    // Define new buttons
        JButton jb1 = new JButton("Start Game");
        jb1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            System.out.println("If you're reading this it's too Late");


            button.setActionCommand();
            add(button);

            JButton jb3 = new JButton("Difficulty");
            JRadioButton smallButton = new JRadioButton(“Easy”);
            JRadioButton mediumButton = new JRadioButton(“Medium”);
            JRadioButton largeButton = new JRadioButton(“Difficult”);
            ButtonGroup group = new ButtonGroup();
            group.add(easyButton);
            group.add(mediumButton);
            group.add(DifficultButton);

            if (easyButton.isSelected()); {
              difficulty = EASY_DIFFICULTY;
            }
            else {
              JOptionPane.showMessageDialog(frame, "Difficulty not selected");
            }
            if (mediumButton.isSelected()){
              difficulty = MEDIUM_DIFFICULTY;
            }
            else {
              JOptionPane.showMessageDialog(frame, "Difficulty not selected");
            }

            if (difficultButton.isSelected()){
              difficulty = DIFFICULT_DIFFICULTY;
            }
            else {
              JOptionPane.showMessageDialog(frame, "Difficulty not selected");
            }


            JComboBox combo = new JComboBox("Game Mode");
            combo.addItem("To the bitter end");
            combo.addItem("Best upper bound in a fixed time frame");
            combo.addItem("Random order");

            String select = (String)combo.getSelectedItem();
          }
        });


          }
        }


        // Add buttons to the frame (and spaces between buttons)
        panel.add(jb1);

        // Set size for the frame
        //frame.setSize(300, 300);



        // Set the window to be visible as the default to be false

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);



    }



    public static void addSpace(int size) {
      var a = new JPanel();
      a.setPreferredSize(new Dimension(0,size));
      panel.add(a);
    }




}
