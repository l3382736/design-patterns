package observer;

import java.util.ArrayList;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextSource extends JTextField implements Subject {

    private ArrayList<Observer> obs;

    public TextSource() {
        this.addActionListener (new Listener());
        obs = new ArrayList<Observer>();
    }

    public void attach (Observer o) {
        obs.add (o);
    }

    public void detach (Observer o) {
        obs.remove (o);
    }

    public void notifyObservers (String message) {
        for (Observer o : obs) {
            o.notify (message);
        }
    }

    private class Listener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String message = TextSource.this.getText();
            TextSource.this.setText ("");
            TextSource.this.notifyObservers (message);
        }
    }
}
