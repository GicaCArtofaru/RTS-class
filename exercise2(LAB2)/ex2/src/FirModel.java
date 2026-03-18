import java.util.Observable;

public class FirModel extends Observable {
    private int id;
    private int progress;

    public FirModel(int id) {
        this.id = id;
        this.progress = 0;
    }

    public void setProgress(int progress) {
        this.progress = progress;
        setChanged();
        notifyObservers(this.id);
    }

    public int getProgress() {
        return progress;
    }
}
