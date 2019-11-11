import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Driver extends JFrame implements ActionListener {
   private JLabel petLabel;
   private JLabel ownerLabel;    
   private JTextField petField; 
   private JTextField ownerField; 


   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   Driver() {
      // Used to specify GUI component layout
      GridBagConstraints layoutConst = null;

      // Set frame's title
      setTitle("Pet Groomers");

      petLabel = new JLabel("Pet Name:");
      ownerLabel = new JLabel("Owner:");

  
      petField = new JTextField(15);
      petField.setEditable(true);
      petField.setText("0");
      petField.addActionListener(this);

      ownerField = new JTextField(15);
      ownerField.setEditable(false);

      // Use a GridBagLayout
      setLayout(new GridBagLayout());
      layoutConst = new GridBagConstraints();

      // Specify component's grid location
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;

      // 10 pixels of padding around component
      layoutConst.insets = new Insets(10, 10, 10, 10);

      // Add component using the specified constraints
      add(petLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(petField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(ownerLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(ownerField, layoutConst);
   }


   @Override
   public void actionPerformed(ActionEvent event) {
      String userInput;     


      userInput = petField.getText();
      

      //get owner from hashmap
      //salField.setText());
   }

 
   public static void main(String[] args) {

      Driver myFrame = new Driver();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}

