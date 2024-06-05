import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
    MyFrame() {
        super("My Application"); // Call to JFrame constructor with title
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class CustomFrame extends MyFrame {
    CustomFrame() {
        super(); // Call to MyFrame constructor
        JButton button = new JButton("Click Me");
        add(button);
    }
}

public class Super {
    public static void main(String[] args) {
        CustomFrame frame = new CustomFrame();
        frame.setVisible(true);
    }
}
//code reusalibility
//proper initialization
//tight coupling/complexity