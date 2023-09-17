package GK5a0;

public class GewinnSpiel {

    public static void main(String[] args) {
        GewinnView view = new GewinnView();
        GewinnModel model = new GewinnModel();
        GewinnController controller = new GewinnController(model, view);
    }

}
