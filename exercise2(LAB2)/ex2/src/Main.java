import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int nrThreads = 6;
        Window window = new Window(nrThreads);
        ArrayList<FirModel> models = new ArrayList<>();

        for (int i = 0; i < nrThreads; i++) {
            FirModel model = new FirModel(i);
            model.addObserver(window); 
            models.add(model);
            new Fir(i, Thread.NORM_PRIORITY, model, 10000).start();
        }
    }
}
