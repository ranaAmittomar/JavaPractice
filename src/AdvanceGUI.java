import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdvanceGUI extends JFrame {
    private JLabel item1;

    public AdvanceGUI() {
        super("The title bar");
        setLayout(new FlowLayout());

        item1 = new JLabel("This is a static text");
        item1.setToolTipText("This is hover text");
        add(item1);
    }
}
