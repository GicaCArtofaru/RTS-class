public class Fir extends Thread {
    private int id;
    private FirModel model;
    private int processorLoad;

    public Fir(int id, int priority, FirModel model, int procLoad) {
        this.id = id;
        this.model = model;
        this.processorLoad = procLoad;
        this.setPriority(priority);
    }

    @Override
    public void run() {
        int c = 0;
        while (c < 1000) {
            double result = 0;
            for (int j = 0; j < processorLoad; j++) {
                result += Math.sqrt(j) * Math.sin(j);
            }
            c++;
            model.setProgress(c); // Update the model
        }
    }
}
