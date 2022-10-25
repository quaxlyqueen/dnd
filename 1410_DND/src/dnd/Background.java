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
