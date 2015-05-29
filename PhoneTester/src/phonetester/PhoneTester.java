

package phonetester;
import javax.swing.*;
/**
 * @title PhoneTester
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 29-May-2015 10:28:34 AM
 * @purpose The purpose of this program is to control an emulated cell phone and set its data
 */
public class PhoneTester {
  public static void main(String [] args){
      int option;
      //buttons to select metods
      String buttons[]={"Carrier","Type","Speed","Memory","Number of Apps","Done"};
    do {
        //create phone
        CellPhone p1 = new CellPhone();
        //output default data
    JOptionPane.showMessageDialog(null, p1.toString());
    do {
        //ask them to change the data
    option=JOptionPane.showOptionDialog(null, "What would you like to change?", "Phone", JOptionPane.PLAIN_MESSAGE, 3, null, buttons, buttons[0]);
    //different options they can choose
    if (option==0) {
        p1.setCarrier(JOptionPane.showInputDialog("What would you like to set it to?"));
    } else if(option==1) {
                p1.setType(JOptionPane.showInputDialog("What would you like to set it to?"));

    }else if(option==2) {
                p1.setSpeed(Double.parseDouble(JOptionPane.showInputDialog("What would you like to set it to?")));

    }else if(option==3) {
                p1.setMemory(Double.parseDouble(JOptionPane.showInputDialog("What would you like to set it to?")));

    }else if(option==4) {
                p1.setNumApps(Integer.parseInt(JOptionPane.showInputDialog("What would you like to set it to?")));

    }
    } while (option!=5);
    //output the new data
        JOptionPane.showMessageDialog(null, p1.toString());
//ask them if they want to create a new phone
    option=JOptionPane.showConfirmDialog(null, "Would you like to create another phone?");
            } while (option==0);
  }
}