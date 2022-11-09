package FileManagement;

import java.io.*;

import Character.*;

public class FileManager {

    private File[] savedCharacters;

    public FileManager() {

        findSavedCharacters();

    }

    public boolean isReturninguser() {

        return savedCharacters.length > 0;

    }

    public CharacterSheet readCharacter(int index) {

        CharacterSheet sheet = null;

        try {

            FileInputStream fileIn = new FileInputStream("/tmp/" + savedCharacters[index].getPath() + ".dnd");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            sheet = (CharacterSheet) in.readObject();
            in.close();
            fileIn.close();

        } catch (IOException i) {

            i.printStackTrace();

        } catch (ClassNotFoundException c) {

            System.out.println("Employee class not found");
            c.printStackTrace();

        }

        return sheet;

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

    public void deleteCharacter(int index) {

        File[] tmp = new File[savedCharacters.length - 1];

        for (int i = 0; i < savedCharacters.length; i++) {

            if(i != index) {

                tmp[i] = savedCharacters[i];

            }

        }

        savedCharacters = tmp;

    }

    // TODO: Need to implement. Should create an array of Files corresponding to user-created characters.
    private void findSavedCharacters() {

        savedCharacters = new File("/bin/").listFiles();

    }

}
