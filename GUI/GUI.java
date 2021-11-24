package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;


public class GUI {
    public JFrame jf = new JFrame();
    public JLabel title = new JLabel("Car Factory");
    public JLabel title1 = new JLabel("Car Factory");
    public GridBagConstraints gbc = new GridBagConstraints();
    public JButton startFactoryButton = new JButton("Start Factory");
    public JTextField numOfAssemblyLinesField = new JTextField(20);

    public GUI() {
        jf.setLayout(new GridBagLayout());
        jf.setVisible(true);
        jf.setSize(600, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title.setFont(new FontUIResource(FontUIResource.SANS_SERIF, FontUIResource.ITALIC, 24));

        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(5,10,5, 0);

        for (int i = 0; i < 10; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            System.out.println(1);
            jf.add(new JLabel("Car Factory"), gbc); 
        }

        startFactoryButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Assembler assembler = new Assembler();
                // assembler.runFactory();

                numOfAssemblyLinesField.setUI(new HintTextFieldUI("Number of Assembly Lines", true));
                jf.remove(title);
                jf.remove(startFactoryButton);
                jf.add(numOfAssemblyLinesField);
                jf.revalidate();
                jf.repaint();
            }

        });


        // gbc.gridx = 0;
        // gbc.gridy = 4;
        // jf.add(startFactoryButton, gbc);

    }
}
