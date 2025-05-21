package game.entity;

import game.constants.Symbols;

public class Ship extends Cell implements Destroyable {

    private int health;

    public Ship(int health) {
        this.symbol = "" + health;
        this.health = health;
        this.wasShot = false;
    }

    @Override
    protected String print() {
        return this.wasShot ? this.symbol : Symbols.WATER;
    }

    @Override
    public void onShot() {
        this.health--;
        this.wasShot = true;
        this.symbol = "" + this.health;
        Shootable.showShooting();
        if (isDestroyed()) {
            destroy();
        } else {
            System.out.println("Still life...");
        }
    }

    @Override
    public void destroy() {
        this.symbol = Symbols.DESTROYED;
        System.out.println("Destroyed");
    }

    @Override
    public boolean isDestroyed() {
        return this.health <= 0;
    }
}
