/**
 * This class provides methods and attributes that would be useful
 * for a human character in a game
 * 
 * @author Elizabeth Fultz
 * @version 1.2
 * Programming Project 3
 * SP19
 */

public class HumanPlayer implements Reportable{
	
	protected String uniqueID; //used to identify the player character
	private String name; //used as a String representation of the player character
	private SkillLevel skillLevel; //used to adjust the difficulty of the game
	
	/**
	 * This empty argument constructor initializes the instance variables
	 */
	public HumanPlayer() {
		
		uniqueID = GameUtilities.generateID();
		setName("Aelin Ashryver Galathynius");
		setSkillLevel(SkillLevel.MASTER);
		
	}//end empty constructor
	
	/**
	 * 
	 * @param n the player character name
	 * @param s the desired skill level
	 */
	public HumanPlayer (String n, SkillLevel s) {
		
		uniqueID = GameUtilities.generateID();
		setName(n);
		setSkillLevel(s);
		
	}//end preferred constructor
	
	
	/**
	 * @return the uniqueID
	 */
	public String getUniqueID() {
		
		return uniqueID;
	
	}//end getUniqueID


	/**
	 * @return the name
	 */
	public String getName() {
		
		return name;
	
	}//end getName


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		
		this.name = name;
	
	}//end setName


	/**
	 * @return the skillLevel
	 */
	public SkillLevel getSkillLevel() {
		
		return skillLevel;
	
	}//end getSkillLevel


	/**
	 * @param skillLevel the skillLevel to set
	 */
	public void setSkillLevel(SkillLevel skillLevel) {
		
		this.skillLevel = skillLevel;
	
	}//end setSkillLevel


	@Override
	public String reportStructure() {
		
		String declration = "---------------------------------------------------------\n";
		declration+=        "                    | HumanPlayer |                      \n";
		declration+=        "---------------------------------------------------------\n";
		declration+=        "| NOT A SUBCLASS                                        |\n";
		declration+=        "---------------------------------------------------------\n";
		declration+=        "| uniqueID: " + uniqueID + "                            |\n";
		declration+=        "| name: " + name + "                                    |\n";
		declration+=        "| skillLevel: " + skillLevel + "                        |\n";
		declration+=        "---------------------------------------------------------\n";
		return declration;
	
	}//end reportStructure
	
}//end class
