/**
 * This class provides methods and attribute that would be useful
 * for  a non-player character in a game
 * 
 * @author Elizabeth Fultz
 * @version 1.3
 * Programming Project 3
 * SP19
 */

public abstract class NonPlayerCharacter {

		protected String uniqueID; //used to identify the character
		protected IntelligenceType intelligence; //used to define the charater's intelligence level which determines how the character responds to stimulus
		protected Personality personality; //used to define the character's personality type which determines how it interacts with other objects
		protected boolean active; //used to indicate if the character is engaged with other objects
		
		/**
		 * This empty argument constructor initializes the instance variables
		 */
		public NonPlayerCharacter() {
			
			uniqueID = GameUtilities.generateID();
			intelligence = IntelligenceType.LOW;
			personality = Personality.NETURAL;
			active = true;			
			
		}//end empty constructor
		
		/**
		 * 
		 * @param i the intelligence type for the character
		 * @param p the personality type for the character
		 * @param active is the character engaged with other objects
		 */
		public NonPlayerCharacter(IntelligenceType i, Personality p, boolean active) {
			
			uniqueID = GameUtilities.generateID();
			setIntelligence(i);
			setPersonality(p);
			setActive(active);
			
		}//end preferred constructor
		
		/**
		 * Returns a string that the character uses to introduce itself
		 * @return the introduction statement
		 */
		abstract public String introduce();
		
		/**
		 * Returns a string exclamation after the character is hit
		 * @return a String after being hit
		 */
		abstract public String exclaim();
		

		/**
		 * @return the uniqueID
		 */
		public String getUniqueID() {
			
			return uniqueID;
		
		}//end getUniqueID
		

		/**
		 * @return the intelligence level
		 */
		public IntelligenceType getIntelligence() {
		
			return intelligence;
		
		}//end getIntelligence
		

		/**
		 * @param intelligence the intelligence to set
		 */
		public void setIntelligence(IntelligenceType intelligence) {
			
			this.intelligence = intelligence;
		
		}//end setIntelligence
		

		/**
		 * @return the personality type
		 */
		public Personality getPersonality() {
			
			return personality;
			
		}//end getPersonality
		

		/**
		 * @param personality the personality to set
		 */
		public void setPersonality(Personality personality) {
			
			this.personality = personality;
			
		}//end setPersonality
		

		/**
		 * @return the active value
		 */
		public boolean isActive() {
			
			return active;
			
		}//end isActive
		

		/**
		 * @param active the active to set
		 */
		public void setActive(boolean active) {
			
			this.active = active;
			
		}//end setActive


		@Override
		public String toString() {
			
			return "NonPlayerCharacter [uniqueID=" + uniqueID + ", intelligence=" + intelligence + ", personality="
					+ personality + ", active=" + active + "]";
		
		}//end toString
		
		
		
}//end class
