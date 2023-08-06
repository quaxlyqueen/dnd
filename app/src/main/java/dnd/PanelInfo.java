package dnd;

/**
 * Bulky text info holder.
 */
public class PanelInfo {
    public static String[] getSpeciesOptions() {
        return new String[]{
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
    }

    public static String[] getSpeciesDescriptions() {
        return new String[]{
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
    }

    public static String[] getClassOptions() {
        return new String[]{
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
    }

    public static String[] getClassDescriptions() {
        return new String[]{
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
    }

    public static String[] getStatOptions() {
        return new String[]{ 
            "strength",
            "Dexterity",
            "Constitution",
            "Intelligence",
            "Widsom",
            "Charisma"
        };
    }

    public static String[] getStatDescriptions() {
        return new String[]{
            "A Strength check can model any attempt to lift, push, pull, or break something, to force your body through a space, or to otherwise apply brute force to a situation. You add your Strength modifier to your attack roll and your damage roll when attacking with a melee weapon Skills: Athletics",
            "A Dexterity check can model any attempt to move nimbly, quickly, or quietly, or to keep from falling on tricky footing. You add your Dexterity modifier to your attack roll and your damage roll when attacking with a ranged weapon, or a melee weapon that has the finesse property. Skills: Acrobatics, Sleight of Hand, Stealth",
            "Constitution checks are uncommon, and no skills apply to Constitution checks, because the endurance this ability represents is largely passive rather than involving a specific effort on the part of a character or monster. A Constitution check can model your attempt to push beyond normal limits, however. Your Constitution modifier contributes to your hit points. Typically, you add your Constitution modifier to each Hit Die you roll for your hit points.",
            "An Intelligence check comes into play when you need to draw on logic, education, memory, or deductive reasoning. Skills: Arcana, History, Investigation, Nature, Religion",
            "A Wisdom check might reflect an effort to read body language, understand someone’s feelings, notice things about the environment, or care for an injured person. Skills: Animal Handling, Insight, Medicine, Perception, Survival",
            "A Charisma check might arise when you try to influence or entertain others, when you try to make an impression or tell a convincing lie, or when you are navigating a tricky social situation. Skills: Deception, Intimidation, Performance, Persuasion"
        };
    }

    public static String[] getCharacteristics() {
        return new String[]{
                "Name",
                "Age",
                "Height",
                "Weight",
                "Eyes",
                "Hair"
        };
    }

    public static String[] getAlignmentOptions() {
        return new String[]{
                "Lawful Good",
                "Neutral Good",
                "Chaotic Good",
                "Lawful Neutral",
                "True Neutral",
                "Chaotic Neutral",
                "Lawful Evil",
                "Neutral Evil",
                "Chaotic Evil"
        };
    }

    public static String[] getAlignmentDescriptions() {
        return new String[]{
                "Lawful Good (LG) creatures can be counted on to do the right thing as expected by society. Gold dragons and paladins are typically lawful good.",
                "Neutral Good (NG) folk do the best they can to help others according to their needs. Many celestials are neutral good.",
                "cChaotic Good (CG) creatures act as their conscience directs, with little regard for what others expect. Copper dragons and unicorns are typically chaotic good.",
                "Lawful Neutral (LN) individuals act in accordance with law, tradition, or personal codes. Modrons and many wizards and monks are lawful neutral.",
                "Neutral (N) is the alignment of those who prefer to steer clear of moral questions and don’t take sides, doing what seems best at the time. Druids are traditionally neutral, as are typical townsfolk.",
                "Chaotic Neutral (CN) creatures follow their whims, holding their personal freedom above all else. Many rogues and bards are chaotic neutral.",
                "Lawful Evil (LE) creatures methodically take what they want, within the limits of a code of tradition, loyalty, or order. Devils and blue dragons are typically lawful evil.",
                "Neutral Evil (NE) is the alignment of those who do whatever they can get away with, without compassion or qualms. Yugoloths are typically neutral evil.",
                "Chaotic Evil (CE) creatures act with arbitrary violence, spurred by their greed, hatred, or bloodlust. Demons and red dragons are typically chaotic evil."
        };
    }

    public static String[] getBackgroundOptions() {
        return new String[]{
                "Acolyte",
                "Charlatan",
                "Criminal",
                "Entertainer",
                "Folk Hero",
                "Gladiator",
                "Guild Artisan",
                "Guild Merchant",
                "Hermit",
                "Knight",
                "Noble",
                "Outlander",
                "Pirate",
                "Sage",
                "Sailor",
                "Soldier",
                "Spy",
                "Urchin"
        };
    }

    public static String[] getBackgroundDescriptions() {
        return new String[]{
            //Acolyte
            "You have spent your life in the service of a temple to a specific god or pantheon of gods. You act as an intermediary between the realm of the holy and the mortal world, performing sacred rites and offering sacrifices in order to conduct worshipers into the presence of the divine. You are not necessarily a cleric—performing sacred rites is not the same thing as channeling divine power. Feature: Shelter of the Faithful Proficiencies: Insight, Religion",
            //Charlatan
            "You have always had a way with people. You know what makes them tick, you can tease out their hearts’ desires after a few minutes of conversation, and with a few leading questions you can read them like they were children’s books. It’s a useful talent, and one that you’re perfectly willing to use for your advantage. Feature: False Identity Proficiencies: Deception, Sleight of Hand",
            //Criminal
            "You are an experienced criminal with a history of breaking the law. You have spent a lot of time among other criminals and still have contacts within the criminal underworld. You’re far closer than most people to the world of murder, theft, and violence that pervades the underbelly of civilization, and you have survived up to this point by flouting the rules and regulations of society. Feature: Criminal Contact Proficiencies: Deception, Stealth",
            //Entertainer
            "You thrive in front of an audience. You know how to entrance them, entertain them, and even inspire them. Your poetics can stir the hearts of those who hear you, awakening grief or joy, laughter or anger. Your music raises their spirits or captures their sorrow. Your dance steps captivate, your humor cuts to the quick. Whatever techniques you use, your art is your life. Feature: By Popular Demand Proficiencies: Acrobatics, Performance",
            //Folk Hero
            "You come from a humble social rank, but you are destined for so much more. Already the people of your home village regard you as their champion, and your destiny calls you to stand against the tyrants and monsters that threaten the common folk everywhere. Feature: Rustic Hospitality Proficiencies: Animal Handling, Survival",
            //Gladiator
            "A gladiator is as much an entertainer as any minstrel or circus performer, trained to make the arts of combat into a spectacle the crowd can enjoy. This kind of flashy combat is your entertainer routine, though you might also have some skills as a tumbler or actor. Feature: By Popular Demand Proficiencies: Acrobatics, Performance",
            //Guild Artisan
            "You are a member of an artisan’s guild, skilled in a particular field and closely associated with other artisans. You are a well-established part of the mercantile world, freed by talent and wealth from the constraints of a feudal social order. You learned your skills as an apprentice to a master artisan, under the sponsorship of your guild, until you became a master in your own right. Feature: Guild Membership Proficiencies: Insight, Persuasion",
            //Guild Merchant
            "Instead of an artisans’ guild, you might belong to a guild of traders, caravan masters, or shopkeepers. You don’t craft items yourself but earn a living by buying and selling the works of others (or the raw materials artisans need to practice their craft). Your guild might be a large merchant consortium (or family) with interests across the region. Perhaps you transported goods from one place to another, by ship, wagon, or caravan, or bought them from traveling traders and sold them in your own little shop. In some ways, the traveling merchant’s life lends itself to adventure far more than the life of an artisan. Feature: Guild Membership Proficiencies: Insight, Persuasion",
            //Hermit
            "You lived in seclusion — either in a sheltered community such as a monastery, or entirely alone — for a formative part of your life. In your time apart from the clamor of society, you found quiet, solitude, and perhaps some of the answers you were looking for. Feature: Discovery Proficiencies: Medicine, Religion",
            //Knight
            "A knighthood is among the lowest noble titles in most societies, but it can be a path to higher status. One of your commoner retainers is a noble who serves as your squire, aiding you in exchange for training on his or her own path to knighthood. Your two remaining retainers might include a groom to care for your horse and a servant who polishes your armor (and even helps you put it on).  Feature: Retainers Proficiencies: History, Persuasion",
            //Noble
            "You understand wealth, power, and privilege. You carry a noble title, and your family owns land, collects taxes, and wields significant political influence. You might be a pampered aristocrat unfamiliar with work or discomfort, a former merchant just elevated to the nobility, or a disinherited scoundrel with a disproportionate sense of entitlement. Or you could be an honest, hard-working landowner who cares deeply about the people who live and work on your land, keenly aware of your responsibility to them. Feature: Position of Privilege Proficiencies: History, Persuasion",
            //Outlander
            "You grew up in the wilds, far from civilization and the comforts of town and technology. You’ve witnessed the migration of herds larger than forests, survived weather more extreme than any city-dweller could comprehend, and enjoyed the solitude of being the only thinking creature for miles in any direction. The wilds are in your blood, whether you were a nomad, an explorer, a recluse, a hunter-gatherer, or even a marauder. Even in places where you don’t know the specific features of the terrain, you know the ways of the wild. Feature: Wanderer Proficiencies: Athletics, Survival",
            //Pirate
            "You spent your youth under the sway of a dread pirate, a ruthless cutthroat who taught you how to survive in a world of sharks and lawlessness. You’ve indulged in larceny on the high seas and sent more than one deserving soul to a briny grave. Fear and bloodshed are no strangers to you, and you’ve garnered a somewhat unsavory reputation in many a port town. Feature: Bad Reputation Proficiencies: Athletics, Perception",
            //Sage
            "You spent years learning the lore of the multiverse. You scoured manuscripts, studied scrolls, and listened to the greatest experts on the subjects that interest you. Your efforts have made you a master in your fields of study. Feature: Researcher Proficiencies: Arcana, History",
            //Sailer
            "You sailed on a seagoing vessel for years. In that time, you faced down mighty storms, monsters of the deep, and those who wanted to sink your craft to the bottomless depths. Your first love is the distant line of the horizon, but the time has come to try your hand at something new. Feature: Ship's Passage Proficiencies: Athletics, Perception",
            //Soldier
            "War has been your life for as long as you care to remember. You trained as a youth, studied the use of weapons and armor, learned basic survival techniques, including how to stay alive on the battlefield. You might have been part of a standing national army or a mercenary company, or perhaps a member of a local militia who rose to prominence during a recent war. Feature: Military Rank Proficiencies: Athletics, Intimidation",
            //Spy
            "Although your capabilities are not much different from those of a burglar or smuggler, you learned and practiced them in a very different context: as an espionage agent. You might have been an officially sanctioned agent of the crown, or perhaps you sold the secrets you uncovered to the highest bidder. Feature: Criminal Contact Proficiencies: Deception, Stealth",
            //Urchin
            "You grew up on the streets alone, orphaned, and poor. You had no one to watch over you or to provide for you, so you learned to provide for yourself. You fought fiercely over food and kept a constant watch out for other desperate souls who might steal from you. You slept on rooftops and in alleyways, exposed to the elements, and endured sickness without the advantage of medicine or a place to recuperate. You’ve survived despite all odds, and did so through cunning, strength, speed, or some combination of each. Feature: City Secrets Proficiencies: Sleight of Hand, Stealth"
        };
    }
}
