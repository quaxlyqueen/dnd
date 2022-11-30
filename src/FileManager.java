import java.awt.*;
import java.io.*;
import java.util.*;

public class FileManager {

    private String filepath;
    private boolean returningUser;

    private ArrayList<File> saveFiles;
    private ArrayList<CharacterSheet> saves;

    public FileManager() {

        filepath = System.getProperty("user.dir");

        saveFiles = new ArrayList<>();

        setSaveFiles();

        loadFont();

    } 

   public String getOSFilepath() {

       return filepath;

   }

   public boolean isReturningUser() {

       return returningUser;

   }

   public CharacterSheet readSavedCharacter(int index) {

       return readCharacter(saveFiles.get(index)); 

   }

   public void saveCharacter(CharacterSheet completedCharacter) {

       writeCharacter(completedCharacter);

   }

   public ArrayList<CharacterSheet> getSaves() {

       return saves;

   }

   // TODO: Need to implement.
   public void deleteCharacter() {

   }

   private void loadFont() {

       try {

           GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

           ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(filepath + "/.resources/SanSalvi.ttf")));
           
       } catch(IOException | FontFormatException e) {

           System.out.println("Filepath of font not found: " + filepath + "/.resources/SanSalvi.ttf does not exist.");

       }

   }

   private void setSaveFiles() {

       File[] tmp = new File(filepath + "/.savedSheets/").listFiles();

       if(tmp != null) {

           for(int i = 0; i < tmp.length; i++) {

               saveFiles.add(tmp[i]);

           }

           returningUser = true;

       } else {

           returningUser = false;

       } 

       saves = new ArrayList<>();

       for(File file : saveFiles) {

           saves.add(readCharacter(file));

       }

   }

   private CharacterSheet readCharacter(File file) {

       CharacterSheet sheet = null;

       System.out.println("filepath: " + file.getPath());

       try {

           FileInputStream fileIn = new FileInputStream(file.getPath());

           ObjectInputStream in = new ObjectInputStream(fileIn);

           sheet = (CharacterSheet) in.readObject();

           in.close();
           fileIn.close();

       } catch (IOException | ClassNotFoundException e) {

           System.out.println("No saved characters were found");

       }

       return sheet;

   }

   private void writeCharacter(CharacterSheet sheet) {

       try(

               FileOutputStream fileOut = new FileOutputStream(filepath + "/.savedSheets/" + sheet.getName() + ".dnd");

               ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

          ) {

           System.out.println("Inside saving char method.");

           objOut.writeObject(sheet);

           setSaveFiles();

System.out.println("Object written to file.");

       } catch (IOException e) {

           System.out.println("ERROR: ");

           e.printStackTrace();

           System.out.println("\nERROR: Unable to write character sheet object to \n" + filepath + "/.savedSheets");

       }

   }

}
