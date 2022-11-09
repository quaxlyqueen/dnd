package FileManagement;

import java.io.*;

import Character.*;

public class FileManager {

    private File[] savedCharacters;

    public FileManager() {



    }

    // TODO: Need to implement. Reads file and returns a re-created CharacterSheet object.
    public CharacterSheet readCharacter(int index) {

        File character = savedCharacters[index];

        return new CharacterSheet();

    }

    public void saveCharacter (CharacterSheet completedCharacter) {

        try {

            FileOutputStream fileOut =
                    new FileOutputStream("/bin/" + completedCharacter.getName().hashCode() + ".dnd");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(completedCharacter);
            out.close();
            fileOut.close();

        } catch (IOException i) {

            i.printStackTrace();

        }

    }

    // TODO: Need to implement.
    public void deleteCharacter(int index) {



    }

    // TODO: Need to implement. Should create an array of Files corresponding to user-created characters.
    private void findSavedCharacters() {



    }

}
