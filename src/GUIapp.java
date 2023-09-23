import javax.swing.JOptionPane;


public class GUIapp { //GUI addition, for WindowsDialogue Box..

    public static void graphics() {
        String fn = JOptionPane.showInputDialog("Enter first number");
        String sn = JOptionPane.showInputDialog("Enter second number");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "Answer:- " + sum, "Addition", JOptionPane.PLAIN_MESSAGE);
    }
}

