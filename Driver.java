/*
 * Interface for a dog groomer's. Displays frame titled Pet Groomers. With an input field to type in a pet name and
 * displays pets corresponding owner
 */

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Driver extends JFrame implements ActionListener {
   private JLabel petLabel;
   private JLabel ownerLabel;    
   private JTextField petField; 
   private JTextField ownerField;
   
   private HashMap<Dog, Owner> map;
   private Queue<Dog> groomingQueue;
   private Set<Owner> prizeDrawing;
   private Stack<Dog> groomingStack;


   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   Driver() {
	   map = new HashMap<Dog, Owner>();
	   groomingQueue = new LinkedList<Dog>();
	   prizeDrawing = new TreeSet<Owner>();
	   groomingStack = new Stack<Dog>();
	   
      // Used to specify GUI component layout
      GridBagConstraints layoutConst = null;

      // Set frame's title
      setTitle("Pet Groomers");

      petLabel = new JLabel("Pet Name:");
      ownerLabel = new JLabel("Owner:");

  
      petField = new JTextField(15);
      petField.setEditable(true);
      petField.setText("");
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
      Owner owner = map.get(userInput);

      //get owner from hashmap
      ownerField.setText(owner.toString());
   }
   
   private void groomingOrder(Owner o, Dog d) {
	   map.put(d, o);
	   prizeDrawing.add(o);
	   groomingQueue.add(d);
	   groomingStack.add(d);
   }

 
   public static void main(String[] args) {

      Driver myFrame = new Driver();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}

