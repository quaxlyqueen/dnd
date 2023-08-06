package dnd;

import javax.swing.*;
import java.awt.*;
import java.util.*;

import static dnd.AppConstants.*;
import dnd.species.*;

public class GUImanager extends JFrame {

    private FileManager fileManager;
    private ArrayList<CharacterSheet> saves;
    private ArrayList<DefaultButton> savesButtons;

    private static JPanel[] panels;
    private int lastPanel;
    private int currentPanel;
    private int nextPanel;

    private String[] raceOptions = PanelInfo.getSpeciesOptions();
    private String[] raceDescriptions = PanelInfo.getSpeciesDescriptions();
    private String[] classOptions = PanelInfo.getClassOptions();
    private String[] classDescriptions = PanelInfo.getClassDescriptions();
    private int raceChoice;
    private int classChoice;

    private String[] statOptions = PanelInfo.getStatOptions();
    private String[] statDescriptions = PanelInfo.getStatDescriptions();
    private String[] characteristics = PanelInfo.getCharacteristics();
    private String[] alignmentOptions = PanelInfo.getAlignmentOptions();
    private String[] alignmentDescriptions = PanelInfo.getAlignmentDescriptions();
    private String[] backgroundOptions = PanelInfo.getBackgroundOptions();
    private String[] backgroundDescriptions = PanelInfo.getBackgroundDescriptions();
    private int[] selectedStats = {8, 8, 8, 8, 8, 8};

    public GUImanager() {
        super("D&D Character Builder");
        fileManager = new FileManager();
        frameSetup();

        ImageManager images = new ImageManager();
        this.panels = new JPanel[]{
                new MainMenuPanel(createNewCharacterButton(), createRandomCharacterButton(), createLoadButton()),
                new BasicPanel(createNavPanel(), raceOptions, raceDescriptions, "Step 1: Choose Your Race", images), // To choose Race.
                new BasicPanel(createNavPanel(), classOptions, classDescriptions, "Step 2: Choose Your Class", images), // To choose Class.
                new ChooseAbilityScoresPanel(createNavPanel(1), statOptions, statDescriptions, selectedStats, "Step 3: Choose Your Ability Scores"),
                new DescriptionPanel(createNavPanel(), characteristics, alignmentOptions, alignmentDescriptions, backgroundOptions, backgroundDescriptions, "Step 4: Describe your character"),
                new LoadCharacterPanel(createBackPanel(), loadableCharacters()),
                new ViewCharacterPanel(createBackPanel(), new CharacterSheet("Josh", 21, 5, 8, 180, "Brown", "Dark Brown", new Elf(), new Fighter(), "Neutral", "Nomad", new CharacterStats(9, 15, 12, 10, 13, 10)))
        };

        if (fileManager.isReturningUser()) this.currentPanel = 0;
        else this.currentPanel = 1;

        this.lastPanel = currentPanel - 1;
        this.nextPanel = currentPanel + 1;
        add(panels[currentPanel]);
    }

    private void frameSetup() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(750, 550));
        setSize(getPreferredSize());
        setResizable(false);
        setLocationRelativeTo(null);
        try { UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); }
        catch (Exception e) { System.out.println("Error with cross platform look/feel in frameSetup()."); }
    }

    private BasicNavPanel createNavPanel() {
        return new BasicNavPanel(createBackButton(), createContinueButton(), 0);
    }

    private BasicNavPanel createNavPanel(int continueRequirement) {
        return new BasicNavPanel(createBackButton(), createContinueButton(), continueRequirement);
    }

    private BasicNavPanel createBackPanel() {
        return new BasicNavPanel(createBackButton(0), null, 0);
    }

    private DefaultButton createBackButton() {
        DefaultButton button = new DefaultButton("Back");
            button.addActionListener(
                    e -> {
                        lastPanel--;
                        currentPanel--;
                        nextPanel--;

                        clearAndReset();
                    }
            );
        return button;
    }

    private DefaultButton createBackButton(int manualBackPoint) {
        DefaultButton button = new DefaultButton("Back");
            button.addActionListener(
                    e -> {
                        lastPanel = 0;
                        currentPanel = manualBackPoint;
                        nextPanel = 0;

                        clearAndReset();
                    }
            );
        return button;
    }

    private DefaultButton createContinueButton() {
        DefaultButton button = new DefaultButton("Continue");
            button.addActionListener(
                    e -> {
                        lastPanel++;
                        currentPanel++;
                        nextPanel++;

                        clearAndReset();
                    }
            );
        return button;
    }

    private DefaultButton createNewCharacterButton() {
        DefaultButton button = createContinueButton();
            button.setText("Create New Character");
            button.addActionListener(
                e -> {
                    lastPanel = 0;
                    currentPanel = 0;
                    nextPanel = 1; 

                    clearAndReset();
                }
            );
        return button;
    }

    // TODO: Need to implement.
    private DefaultButton createRandomCharacterButton() {
        DefaultButton button = new DefaultButton("Create Random Character");
            button.addActionListener(
                    e -> {
                        createRandomCharacter();

                        lastPanel = currentPanel;
                        currentPanel = 3;
                        nextPanel = currentPanel + 1;
                        clearAndReset();
                    }
            );
        return button;
    }

    // TODO: Need to implement with exact indices and file manager logic.
    private DefaultButton createSaveButton() {
        DefaultButton button = new DefaultButton("Save");
            button.addActionListener(
                    e -> {
                        lastPanel = currentPanel;
                        currentPanel = 6;
                        nextPanel = currentPanel + 1;
                        clearAndReset();
                    }
            );
        return button;
    }

    private DefaultButton createLoadButton() {
        DefaultButton button = new DefaultButton("Load");
            button.addActionListener(
                    e -> {
                        lastPanel = currentPanel;
                        currentPanel = 5;
                        clearAndReset();
                    }
            );
            return button;
    }

    private ArrayList<DefaultButton> loadableCharacters() {
        saves = fileManager.getSaves();
        savesButtons = new ArrayList<>();
        for(int i = 0; i < saves.size(); i++) savesButtons.add(createLoadNCharacterButton(i));
        for(int i = 0; i < saves.size(); i++) System.out.println(saves.get(i).toString());

        return savesButtons;
    }

    private DefaultButton createLoadNCharacterButton(int index) {
        if(index < 0) return new DefaultButton("INDEX OUT OF BOUNDS");
        DefaultButton button = new DefaultButton(saves.get(index).getName());
        button.addActionListener(
            e -> {
                lastPanel = currentPanel;
                panels[6] = new ViewCharacterPanel(createBackPanel(), saves.get(index));
                currentPanel = 6;
                clearAndReset();
            }
        );
        return button;
    }

    // TODO: Need to implement random character creation.
    private void createRandomCharacter() { 
        System.out.println("Request to create random character. Need to implement.");
    }

    private void clearAndReset() {
        getContentPane().removeAll();
        add(panels[currentPanel]);
        repaint();
        revalidate();
        pack();
    }
}
