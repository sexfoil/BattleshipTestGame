package game.entity;

public interface Shootable {

    void onShot();

    static void showShooting() {
        System.out.println("Boom!");
    }
}
