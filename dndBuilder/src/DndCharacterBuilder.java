import GUI.*;
import FileManagement.*;

public class DndCharacterBuilder {

    public static void main(String[] args) {

       FileManager data = new FileManager();

       PanelHolder guiPanels = new PanelHolder();
            GUImanager gui = new GUImanager(guiPanels, data.isReturninguser());
                gui.setVisible(true);

    }

}