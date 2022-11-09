import GUI.*;
import FileManagement.*;

public class DndCharacterBuilder {

    public static void main(String[] args) {

       FileManager data = new FileManager();

       PanelHolder guiPanels = new PanelHolder();
            UImanager gui = new UImanager(guiPanels, data.isReturninguser());

    }

}