import GUI.*;
import FileManagement.*;

public class DndCharacterBuilder {

    public static void main(String[] args) {

       FileManager data = new FileManager();

            GUImanager gui = new GUImanager(data.isReturninguser());
                gui.setVisible(true);

    }

}