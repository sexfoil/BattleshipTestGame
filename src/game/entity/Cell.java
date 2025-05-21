package game.entity;

public abstract class Cell implements Shootable {

    protected String symbol;
    protected boolean wasShot;

    protected abstract String print();

    @Override
    public String toString() {
        return this.print();
    }
}
