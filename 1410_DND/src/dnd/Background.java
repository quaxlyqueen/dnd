package dnd;

import java.util.Arrays;

public class Background {

		private String name;
		private boolean[] proficientStatus;
		private String[] skills;
		private String feature;
		private String skillProficiencies;
		int backgroundIndex;
		
		/**
		 * @param name
		 * @param skillProficiences
		 * @param feature
		 */
		public Background(String name, boolean[] proficientStatus, String[] skills, String feature) {
			this.name = name;
			this.proficientStatus = proficientStatus;
			this.skills = skills;
			this.feature = feature;
			skillProficiencies = null;
		}
		
		public void setAcolyte(){
			name = "Acolyte";
			proficientStatus[5] = true;
			proficientStatus[14] = true;
			skillProficiencies = skills[5] + ", " + skills[14];
			feature = "Shelter of the Faithful"+ "\nAs an acolyte, you command the respect of those who share your faith, and you can perform the religious ceremonies of your deity. You and your adventuring companions can expect to receive free healing and care at a temple, shrine, or other established presence of your faith, though you must provide any material components needed for spells. Those who share your religion will support you (but only you) at a modest lifestyle."
					+ "\nYou might also have ties to a specific temple dedicated to your chosen deity or pantheon, and you have a residence there. This could be the temple where you used to serve, if you remain on good terms with it, or a temple where you have found a new home. While near your temple, you can call upon the priests for assistance, provided the assistance you ask for is not hazardous and you remain in good standing with your temple.";
		}
		
		public void setCharlatan(){
			name = "Charlatan";
			proficientStatus[4] = true;
			proficientStatus[15] = true;
			skillProficiencies = skills[4] + ", " + skills[15];
			feature = "False Identity" + "\nYou have created a second identity that includes documentation, established acquaintances, and disguises that allow you to assume that persona. Additionally, you can forge documents including official papers and personal letters, as long as you have seen an example of the kind of document or the handwriting you are trying to copy.";
		}
		
		
		public void setCriminal(){
			name = "Criminal";
			proficientStatus[4] = true;
			proficientStatus[16] = true;
			skillProficiencies = skills[4] + ", " + skills[16];
			feature = "Feature: Criminal Contact" + "\nYou have a reliable and trustworthy contact who acts as your liaison to a network of other criminals. You know how to get messages to and from your contact, even over great distances; specifically, you know the local messengers, corrupt caravan masters, and seedy sailors who can deliver messages for you.";
		}
		
		public void setSpy(){
			name = "Spy";
			proficientStatus[4] = true;
			proficientStatus[16] = true;
			skillProficiencies = skills[4] + ", " + skills[16];
			feature = "Criminal Contact" + "\nYou have a reliable and trustworthy contact who acts as your liaison to a network of other criminals. You know how to get messages to and from your contact, even over great distances; specifically, you know the local messengers, corrupt caravan masters, and seedy sailors who can deliver messages for you.";
		}
		
		public void setEntertainer(){
			name = "Entertainer";
			proficientStatus[0] = true;
			proficientStatus[12] = true;
			skillProficiencies = skills[0] + ", " + skills[12];
			feature = "By Popular Demand" + "\nYou can always find a place to perform, usually in an inn or tavern but possibly with a circus, at a theater, or even in a noble�s court. At such a place, you receive free lodging and food of a modest or comfortable standard (depending on the quality of the establishment), as long as you perform each night. In addition, your performance makes you something of a local figure. When strangers recognize you in a town where you have performed, they typically take a liking to you.";
		}
		
		public void setFolkHero(){
			name = "Folk Hero";
			proficientStatus[1] = true;
			proficientStatus[17] = true;
			skillProficiencies = skills[1] + ", " + skills[17];
			feature = "Rustic Hospitality" + "\nSince you come from the ranks of the common folk, you fit in among them with ease. You can find a place to hide, rest, or recuperate among other commoners, unless you have shown yourself to be a danger to them. They will shield you from the law or anyone else searching for you, though they will not risk their lives for you.";
		}
		
		public void setGladiator(){
			name = "Gladiator";
			proficientStatus[0] = true;
			proficientStatus[12] = true;
			skillProficiencies = skills[0] + ", " + skills[12];
			feature = "By Popular Demand" + "\nYou can always find a place to perform in any place that features combat for entertainment — perhaps a gladiatorial arena or secret pit fighting club. At such a place, you receive free lodging and food of a modest or comfortable standard (depending on the quality of the establishment), as long as you perform each night. In addition, your performance makes you something of a local figure. When strangers recognize you in a town where you have performed, they typically take a liking to you.";
		}
		
		public void setGuildArtisan(){
			name = "Guild Artisan";
			proficientStatus[6] = true;
			proficientStatus[13] = true;
			skillProficiencies = skills[6] + ", " + skills[13];
			feature = "Guild Membership" + "\nAs an established and respected member of a guild, you can rely on certain benefits that membership provides. Your fellow guild members will provide you with lodging and food if necessary, and pay for your funeral if needed. In some cities and towns, a guildhall offers a central place to meet other members of your profession, which can be a good place to meet potential patrons, allies, or hirelings."
						+"\nGuilds often wield tremendous political power. If you are accused of a crime, your guild will support you if a good case can be made for your innocence or the crime is justifiable. You can also gain access to powerful political figures through the guild, if you are a member in good standing. Such connections might require the donation of money or magic items to the guild’s coffers."
						+"\nYou must pay dues of 5 gp per month to the guild. If you miss payments, you must make up back dues to remain in the guild’s good graces.";
		}
		
		public void setGuildMerchant(){
			name = "Guild Merchant";
			proficientStatus[6] = true;
			proficientStatus[13] = true;
			skillProficiencies = skills[6] + ", " + skills[13];
			feature = "Guild Membership" + "\nAs an established and respected member of a guild, you can rely on certain benefits that membership provides. Your fellow guild members will provide you with lodging and food if necessary, and pay for your funeral if needed. In some cities and towns, a guildhall offers a central place to meet other members of your profession, which can be a good place to meet potential patrons, allies, or hirelings."
						+"\nGuilds often wield tremendous political power. If you are accused of a crime, your guild will support you if a good case can be made for your innocence or the crime is justifiable. You can also gain access to powerful political figures through the guild, if you are a member in good standing. Such connections might require the donation of money or magic items to the guild’s coffers."
						+"\nYou must pay dues of 5 gp per month to the guild. If you miss payments, you must make up back dues to remain in the guild’s good graces.";
		}
		
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @return the skillProficiencies
		 */
		public String getskillProficiences() {
			return skillProficiencies;
		}
		/**
		 * @return the feature
		 */
		public String getDescription() {
			return feature;
		}
		
		/**
		 * @return the proficientStatus
		 */
		public boolean[] getProficientStatus() {
			return proficientStatus;
		}

		@Override
		public String toString() {
			return "Background: " + name + "\nSkill Proficiencies: " + skillProficiencies + "\nFeature: "
					+ feature;
		}
		
		
		
}
