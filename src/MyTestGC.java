public class MyTestGC {

    String name;

    private byte[] b;

    public MyTestGC(int index) {
        this.name = "" + index;
        this.b = new byte[1024 * 1024 * 100];
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroyed " + name);
    }
}
