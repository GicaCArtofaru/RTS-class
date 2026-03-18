package exercise1;

public class Fir extends Thread {
    private int id;
    private Window win;
    private int processorLoad;

    Fir(int id, int priority, Window win, int procLoad) {
        this.id = id;
        this.win = win;
        this.processorLoad = procLoad;
        this.setPriority(priority);
    }

    public void run() {
        int c = 0;
        while (c < 1000) {
            double result = 0;
            for (int j = 0; j < this.processorLoad; j++) {
                result += Math.sqrt(j) * Math.sin(j);
            }
            c++;
            this.win.setProgressValue(id, c);
        }
    }
}