package Day2.Exercise20;

public abstract class Shape3D extends Shape implements Fillable {
    abstract double calculateVolume();
    @Override
    public int fill(int value) {
        return 0;
    }
}
