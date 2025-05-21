package game.entity;

import game.constants.Symbols;

public class Water extends Cell implements Shootable {

    public Water() {
        this.symbol = Symbols.WATER;
    }

    @Override
    public void onShot() {
        this.wasShot = true;
        System.out.println("Water splash...");
    }

    @Override
    protected String print() {
        return this.wasShot ? Symbols.HITTED : this.symbol;
    }
}
