package GUI;

import GUI.Panels.*;
import GUI.Panels.SubPanels.NavPanel;
import Resources.CustomAssets.DefaultButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUImanager extends JFrame {

    private static JPanel[] panels;
        private int lastPanel;
        private int currentPanel;
        private int nextPanel;


    private String[] raceOptions;
    private String[] raceDescriptions;
    private String[] classOptions;
    private String[] classDescriptions;
        private int raceChoice;
        private int classChoice;

    private String[] statOptions;
    private String[] statDescriptions;
    private int[] selectedStats;



    public GUImanager (boolean returningUser) {
        super("D&D Character Builder");
        frameSetup();
            setupPanelInfo();
                this.panels = new JPanel[]{
                        new MainMenuPanel(),
                        new BasicPanel(createNavPanel(), raceOptions, raceDescriptions, "Step 1: Choose Your Race"), // To choose Race.
                        new BasicPanel(createNavPanel(), classOptions, classDescriptions, "Step 2: Choose Your Class"), // To choose Class.
                        new ChooseAbilityScoresPanel(createNavPanel(27), statOptions, statDescriptions, selectedStats, "Step 3: Choose Your Ability Scores")
                };

                this.currentPanel = 3;
                this.lastPanel = currentPanel - 1;
                this.nextPanel = currentPanel + 1;

/*                this.lastPanel = 0;
                this.currentPanel = 1;
                this.nextPanel = 2;*/

/*            if (returningUser) {

                this.currentPanel = 0;

            } else {

                this.currentPanel = 1;

            }
*/

        add(panels[currentPanel]);

    }

    private void frameSetup() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(750,550));
        setSize(getPreferredSize());
        setResizable(false);
        setLocationRelativeTo(null);

        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            System.out.println("Error with cross platform look/feel in frameSetup().");
        }

    }

    private void setupPanelInfo() {

        raceOptions = new String[]{
                "Dragonborn",
                "Dwarf",
                "Elf",
                "Gnome",
                "HalfElf",
                "Halfling",
                "Halforc",
                "Human",
                "Tiefling"
        };

        raceDescriptions = new String[]{

                "Born of dragons, as their name proclaims, the dragonborn walk proudly through a world that greets them with fearful incomprehension." + "Shaped by draconic gods or the dragons themselves, dragonborn originally hatched from dragon eggs as a unique race, combining the best attributes of dragons and humanoids." + "Some dragonborn are faithful servants to true dragons, others form the ranks of soldiers in great wars, and still others find themselves adrift, with no clear calling in life.",
                "By the numbers, dwarves are one of the best races in the Player’s Handbook. " + "" + "Their ability score increases are good, and their other racial traits make them durable and flexible enough to succeed in several classes.",
                "A staple of fantasy fiction and folklore, Elves are a simple yet effective base race with subraces which are numerous and diverse enough that elves are usable in a variety of builds and character concepts. " + "Unfortunately, because the subraces differentiate the Elf’s traits so much, it’s rare for more than one subrace to be viable in the same class unless you’re using the Customizing Your Origins optional rules presented in Tasha’s Cauldron of Everything.",
                "Gnomes have changed a lot throughout the history of Dungeons and Dragons. " + "At times they’ve been monsters. " + "At times they’ve been fey. " + "In general, DnD has always had trouble pinning down gnomes thematically in a way that distinguishes them from halflings, but I think 5th edition may have done the best job of any edition to date. " + "Gnomes have subraces which are very distinct from one another, and their traits offer some unique an interesting options.",
                "The Half-Elf is among the most powerful races in the core rules. " + "It’s a top-tier race option for several classes, and even for classes where the Half-Elf isn’t a perfect fit it’s at least workable. " + "Two flexible ability increases and two free skill proficiencies are useful on essentially any character, plus you get Darkvision and a +2 Charisma increase.",
                "Half-orcs are an easily-overlooked race. " + "Their racial traits tend to pigeon-hole them into simple martial builds, and in most official settings and works of fiction outside of D&D orcs have historically been portrayed barbaric savages, so even characters’ backstories tend to be forced into an incredibly narrow set of options. " + "Half-orcs don’t get subraces, and unlike the half-elf we haven’t seen variants of any kind, so the race offers little flexibility.",
                "Halflings are perhaps the most iconic small race in Dungeons and Dragons, dating back to its earliest editions. " + "Their mechanics have changed as much as any race, but they have consistently remained a staple option for players who enjoy playing thieves, rogues, or other stealthy characters.",
                "Human come in two flavors: the standard human and the “variant” human. " + "The standard human receives +1 increases to each ability score, making it easy to fit into any build. " + "However, it lacks any other racial traits, which makes the standard human extremely bland. " + "It also lacks the numerical appeal of a +2 ability increase, so more focused races will frequently outpace the standard human in nearly every case.",
                "Thanks to the variants presented in Sword Coast Adventurer’s Guide and the subraces presented in Mordenkainen’s Tome of Foes, the Tiefling has the longest list of subrace options of any published race, totaling an impressive 14 individual subraces and variants. " + "These options make tieflings diverse, flexible, and viable in an impressively large number of builds."

        };

        classOptions = new String[] {

                "Artificer",
                "Barbarian",
                "Bard",
                "Cleric",
                "Druid",
                "Fighter",
                "Monk",
                "Paladin",
                "Ranger",
                "Rogue",
                "Sorcerer",
                "Warlock",
                "Wizard"

        };

        classDescriptions = new String[]{

                "The Artificer is a class with a tool for every job and a solution to every problem. " + "They excel as a Support character, but make decent Defenders, Healers, and Strikers, too. " + "With the right infusions and spells, they can fill nearly any role in the party, making the Artificer’s versatility rival that of the Bard.",
                "Barbarians are all about getting angry and dealing damage. " + "They have a ton of hit points, resistance to damage, and Rage gives a wonderful bonus to damage. " + "Barbarians don’t get much in the way of skills, so generally they’re stuck as combat monsters, but they function equally well as a Defender and a Striker, and certain character options can even expand them into a limited Support role.",
                "The Bard is fantastically versatile. " + "With access to every skill, expertise, full casting, and a decent set of proficiencies, the Bard can fill essentially every role in the party. " + "Subclasses like College of Lore are more of the classic supportive Bard, with improved magical options and support abilities, while College of Swords and College of Valor can serve as front-line melee characters who can bring their spellcasting and support capabilities into the heat of battle.",
                "Clerics are among the most diverse and interesting classes in 5e DnD. " + "Because your choice of Divine Domain so greatly affects your capabilities, Clerics can fit a variety of roles and play styles. " + "More generally, Clerics are the best healers in the game, and have among the best support, utility, and divination options in the game. " + "However, they are by no means limited to healing and support roles. " + "Clerics have abundant offensive options, and can even be effective with weapons.",
                "Druids are a very versatile class. " + "Between their available archetypes, they’re able to serve mixes roles as scouts, strikers, blaster, support casters, and controllers. " + "Their spell list has a lot of unique options. " + "There is a strong emphasis on area control spells, and most of the Druid’s best spells require Concentration.",
                "The Fighter is a fantastic addition to any party. " + "While their skill and tool proficiencies are extremely limited, Fighters excel in combat. " + "They are durable, have great armor, and provide plenty of damage output. " + "Fighters get more Ability Score Increases than any other class, allowing them to easily explore feats without sacrificing crucial ability scores. " + "They also notably get more attacks than any other class, which can be a lot of fun.",
                "The Monk is the iconic martial-artist, popular among those who prefer to punch things rather than stabbing them or setting them on fire (though stabbing things and setting them on fire is still a possibility for the Monk). " + "Monks are excellent Defenders and Strikers, and typically fill a role in party as a Fighter-equivalent or Rogue-equivalent depending on your subclass and proficiencies.",
                "Paladins are the most durable, survivable, and self-sufficient class in the game. " + "As such, they both make excellent solo characters and are excellent additions to nearly any party regardless of existing capabilities. " + "In a party, they serve as a Defender, Face, and Striker. " + "They do have some healing and utility options, but not enough to replace a full spellcaster in most parties.",
                "The Ranger is an interesting mix of Druid-style spellcasting, Fighter-style combat capabilities, and Rogue-style skills. " + "Themed around nature and exploration, the Ranger is a welcome asset in parties exploring untamed lands above or below ground. " + "The Ranger can fill the role of either a Fighter-equivalent or a Rogue-equivalent (sometimes both), and works well as a Scout and Striker, but trades the Fighter’s durability for better skills and improved damage output.",
                "Rogues are the quintessential Face, Scout and Striker. " + "Sneak Attack allows them to do a huge pile of damage in a single attack, and their pile of skills allows them to easily handle locks, traps, guards, and many other challenges. " + "While a party can function just fine without a Rogue, it’s hard to compete with the sheer number of important skill and tool proficiencies offered by the Rogue.",
                "Sorcerers are a challenge, but at the same time they can be less complex than most spellcasting classes. " + "The Sorcerer’s spell list allows them to serve as a Blaster, Controller, Striker, and Utility Caster, and sorcerers make one of the easiest Faces in the game due to their skill list and their dependence on Charisma.",
                "The Warlock is likely the easiest of any spellcaster to play. " + "You get only a handful of spell slots at a time, and never have to juggle multiple spell slot levels. " + "Warlocks learn spells permanently, so you don’t need to worry about changing your spells on a daily basis. " + "Warlocks also get the most powerful damage cantrip in the game, giving them a solid, reliable option for damage output in between your big spells.",
                "The Wizard is the iconic arcane spellcaster, capable of doing all manner of fantastic tricks, and generally limited only by their spellbook and their spell slots. " + "A Wizard with a comprehensive spellbook can do essentially anything in the game, often as well as or better than a non-magical character who is built to do that thing. " + "A Wizard with Invisibility is as stealthy as a Rogue."

        };

        statOptions = new String[] {

                "Strength",
                "Dexterity",
                "Constitution",
                "Intelligence",
                "Wisdom",
                "Charisma"

        };

        statDescriptions = new String[] {

          "Strength is a thing.",
          "Dexterity is a thing",
          "Constitution is a thing",
          "Intelligence is a thing",
          "Wisdom is a thing",
          "Charisma is a thing"

        };

        selectedStats = new int[] {8, 8, 8, 8, 8, 8};

    }

    private NavPanel createNavPanel() {

        return new NavPanel(createBackButton(), createContinueButton(), 0);

    }

    private NavPanel createNavPanel(int continueRequirement) {

        return new NavPanel(createBackButton(), createContinueButton(), continueRequirement);

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

    // TODO: Need to implement.
    private DefaultButton createRandomCharacterButton() {

        DefaultButton button = new DefaultButton("Create Random Character");
        button.addActionListener(

                e -> {

                    createRandomCharacter();

                    lastPanel = currentPanel;
                    currentPanel = 6;
                    nextPanel = currentPanel + 1;
                    clearAndReset();

                }

        );

        return button;

    }

    // TODO: Need to implement.
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

    // TODO: Need to implement.
    private void createRandomCharacter() {



    }

    private void clearAndReset() {

        getContentPane().removeAll();

        add(panels[currentPanel]);

        repaint();
        revalidate();
        pack();

    }

}