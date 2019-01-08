package control;

public class Isoccer {

    private static Isoccer instance;


    private Isoccer() {}

    public static Isoccer getInstance() {

        if(instance == null) {
            instance = new Isoccer();
        }

        return instance;
    }
}
