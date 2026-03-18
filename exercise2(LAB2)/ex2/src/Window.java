import javax.swing.*;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;

public class Window extends JFrame implements Observer {
    private ArrayList<JProgressBar> bars = new ArrayList<>();

    public Window(int nrThreads) {
        setLayout(null);
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init(nrThreads);
        setVisible(true);
    }

    private void init(int n) {
        for (int i = 0; i < n; i++) {
            JProgressBar pb = new JProgressBar(0, 1000);
            pb.setBounds(50, (i + 1) * 40, 350, 24);
            add(pb);
            bars.add(pb);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        int threadId = (int) arg;
        FirModel model = (FirModel) o;

            bars.get(threadId).setValue(model.getProgress());

    }
}
