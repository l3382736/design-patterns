package observer;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class TestObserver {
    public static void test() {
        JFrame mainFrame = new JFrame ("Test observer");
        mainFrame.setSize (400, 400);
        mainFrame.setLayout (new GridLayout (2,0));
        mainFrame.setDefaultCloseOperation (
                JFrame.EXIT_ON_CLOSE);
        Banner ban = 
            new Banner ("hola", javax.swing.JLabel.CENTER);
        TextSource source = new TextSource();
        source.attach (ban);
        // gui
        mainFrame.add (ban);
        mainFrame.add (source);
        mainFrame.setVisible (true);
    }
}
