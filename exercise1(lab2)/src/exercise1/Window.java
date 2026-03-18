package exercise1;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Window extends JFrame {

    ArrayList<JProgressBar> bars = new ArrayList<JProgressBar>();

    public Window(int nrThreads) {
        setLayout(null);
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init(nrThreads);
        this.setVisible(true);
    }

    private void init(int n) {
        for (int i = 0; i < n; i++) {
            JProgressBar pb = new JProgressBar(0, 1000);
            pb.setMaximum(1000);
            pb.setBounds(50, (i + 1) * 40, 350, 24);
            this.add(pb);
            bars.add(pb);
        }
    }

    public void setProgressValue(final int id, final int val) {
                bars.get(id).setValue(val);
    }
}