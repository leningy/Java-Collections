/** showMessageDialog(parent, message) */

import javax.swing.*;

/**
 * Simple example that uses JOptionPane showMessageDialog method.
 * 
 * @author Reges and Stepp
 */
public class MessageDialogExample {
    /**
     * Start program
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "How's the weather?");
        JOptionPane.showMessageDialog(null, "Second message");
    }
}

/////////////////////////////////////////////////////
/** showConfirmDialog(parent, message) */
import javax.swing.*;

/**
 * Simple example that uses JOptionPane showConfirmDialog method.
 * 
 * @author Reges and Stepp
 */
public class ConfirmDialogExample {
    /**
     * Start program
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Erase your hard disk?");
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Disk erased!");
        } else {
            JOptionPane.showMessageDialog(null, "Cancelled.");
        }
    }
}
