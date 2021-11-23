package GUI;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.*;
// import javax.swing.border.Border;
// import javax.swing.border.CompoundBorder;
// import javax.swing.border.EmptyBorder;

// public class GUI extends JFrame {

//     JLabel l;
//     JTextField t1;
//     JTextField t2;
//     JButton b;
//     JFrame jf = new JFrame();

//     GridBagConstraints gbc = new GridBagConstraints();

//     GUI() {
//         l = new JLabel("Calculator");
//         t1 = new JTextField(20);
//         t2 = new JTextField(20);
//         b = new JButton("Start Factory");

//         b.addActionListener(new ActionListener() {

//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 System.out.println(t1.getText());
//                 new Worker(jf, b).execute();
                
//             }  
//         });

//         jf.setLayout(new GridBagLayout());

//         gbc.gridx = 2;
//         gbc.gridy = 0;

//         Border border = l.getBorder();
//         Border margin = new EmptyBorder(10, 10, 10, 10);
//         l.setBorder(new CompoundBorder(border, margin));
//         jf.add(l, gbc);

//         gbc.gridx = 0;
//         gbc.gridy = 1;
//         gbc.gridwidth = 3;
//         gbc.fill = GridBagConstraints.HORIZONTAL;
//         jf.add(t1, gbc);

//         gbc.gridx = 0;
//         gbc.gridy = 2;
//         gbc.fill = GridBagConstraints.HORIZONTAL;
//         jf.add(t2, gbc);

//         gbc.gridx = 0;
//         gbc.gridy = 3;
//         gbc.fill = GridBagConstraints.NONE;
//         jf.add(b);

//         jf.setVisible(true);
//         jf.setSize(400, 600);
//         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public static void main(String[] args) {
//         new GUI();
//     }

// }
