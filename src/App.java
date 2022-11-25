public class App {

    public static void main(String[] args) {

        FileManager data = new FileManager();

        GUImanager gui = new GUImanager(data.isReturninguser());
            gui.setVisible(true);

    }

}
