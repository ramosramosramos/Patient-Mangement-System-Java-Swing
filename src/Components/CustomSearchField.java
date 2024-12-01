
package Components;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CustomSearchField extends JTextField{

    public CustomSearchField() {
       this.setLayout(new BorderLayout());
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(getClass().getResource("/Images/search_icon.png")));
        this.add(label,BorderLayout.EAST);
    }
    
}
