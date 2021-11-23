package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class GUI{
    public JFrame jf = new JFrame();
    public JLabel title;
    public GridBagConstraints gbc = new GridBagConstraints();

    public GUI(){
        jf.setLayout(new GridBagLayout());
        jf.setVisible(true);
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title = new JLabel("Car Factory");
        title.setFont(new FontUIResource(FontUIResource.SERIF, FontUIResource.ITALIC , 24));

        gbc.gridx = 0;
        gbc.gridy = -2;
        jf.add(title);
    }
}
