package observer;

import javax.swing.JLabel;

public class Banner extends JLabel implements Observer {

    public Banner (String text, int pos) { 
        super (text, pos);
    }
    
    public void notify (String message) {
        this.setText (message);
    }
}
