package GUI;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class LearnSwingWorker extends SwingWorker<Integer, Integer> {
    public JFrame jf;
    public JButton b;

    LearnSwingWorker(JFrame jf, JButton b) {
        this.jf = jf;
        this.b = b;
    }

    protected Integer doInBackground() throws Exception {
        // Do a time-consuming task.
        System.out.println(1);
        Thread.sleep(1000);
        return 42;

    }

    protected void done() {
        try {

            System.out.println(22222);
            JLabel l = new JLabel("Completed");
            jf.add(l);
            jf.revalidate();
            jf.repaint();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
