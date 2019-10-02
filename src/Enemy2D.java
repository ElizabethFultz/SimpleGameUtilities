/**
 * This class provides methods and attributes that would be useful
 * for an enemy character in a game
 * 
 * @author Elizabeth Fultz
 * @version 1.2
 * Programming Project 3
 * SP19
 */

public class Enemy2D extends NonPlayerCharacter implements Reportable{

	private int xPos; //the objects location on the x-axis
	private int yPos; //the objects location on the y-axis
	private int numberTorpedoes; //the number of torpedoes the object can shoot
	
	
	/**
	 * This empty argument constructor initializes the instance variables
	 */
	public Enemy2D() {
		
		super();
		xPos = 0;
		yPos = 0;
		numberTorpedoes = 5;
		
	}//end empty constructor
	
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param numberOfTorpedoes
	 */
	public Enemy2D(int x, int y, int numberOfTorpedoes) {
		
		super();
		setxPos(x);
		setyPos(y);
		setNumberTorpedoes(numberOfTorpedoes);
				
	}//end preferred constructor
	
	
	/**
	 * 
	 * @param x the position to move to on the x-axis
	 * @param y the position to move to on the y-axis
	 */
	public void move(int x, int y) {
		
		setxPos(x);
		setyPos(y);
		
	}//end move
	
	/**
	 * This method determines if the object can fire a torpedo
	 * @return boolean value of if the object fired
	 */
	public boolean fire() {
		
		if(numberTorpedoes > 0) {
			numberTorpedoes--;
			return true;
		}//end if
		
		else 
			return false;
		
	}//end fire
	

	@Override
	public String introduce() {
		
		return "How unfortunate that out of everyone, the two of us had to cross paths."; 
		
	}//end introduce
	
	
	@Override
	public String exclaim() {
		
		int rand = (int)(Math.random() * (4 - 1) + 1) + 1;
		
		switch(rand) {
		
		case 1:
			return "Alright, we'll call it a draw";
		case 2:
			return "Tis but a scratch";
		case 3:
			return "Oh, oh I see. Running away, eh?! Come back here and take what's coming to you! I'll bite your legs off!";
		case 4:
			return "I've had worse";
		default:
			return "Chicken! Chicken!";
		
		}//end switch
		
	}//end exclaim
	
	
	/**
	 * @return the xPos
	 */
	public int getxPos() {
		
		return xPos;
	
	}//end get xPos


	/**
	 * @param xPos the xPos to set
	 */
	public void setxPos(int xPos) {
		
		this.xPos = xPos;
	
	}//end setxPos


	/**
	 * @return the yPos
	 */
	public int getyPos() {
		
		return yPos;
	
	}//end getyPos


	/**
	 * @param yPos the yPos to set
	 */
	public void setyPos(int yPos) {
		
		this.yPos = yPos;
	
	}//end setyPos


	/**
	 * @return the numberTorpedoes
	 */
	public int getNumberTorpedoes() {
		
		return numberTorpedoes;
	
	}//end getNumberTorpedoes


	/**
	 * @param numberTorpedoes the numberTorpedoes to set
	 */
	public void setNumberTorpedoes(int numberTorpedoes) {
		
		if(numberTorpedoes > 0)
			this.numberTorpedoes = numberTorpedoes;
		else
			this.numberTorpedoes = 0;
	
	}//end setNumberTorpedoes
	
	
	@Override
	public String reportStructure() {
		
		String declration = "---------------------------------------------------------\n";
		declration+=        "                      | Enemy2D |                        \n";
		declration+=        "---------------------------------------------------------\n";
		declration+=        "|SUBCLASS Of NonHumanPlayer                             |\n";
		declration+=        "---------------------------------------------------------\n";
		declration+=        "| uniqueID: " + uniqueID + "                            |\n";
		declration+=        "| intelligence: "+ intelligence + "                     |\n";
		declration+=        "| personality: " + personality + "                      |\n";
		declration+=        "| active: " + active + "                                |\n";
		declration+=        "---------------------------------------------------------\n";
		declration+=        "| x position: " + xPos + "                              |\n";
		declration+=        "| y position: " + yPos + "                              |\n";
		declration+=        "| number of torpedoes: " + numberTorpedoes + "          |\n";
		declration+=        "---------------------------------------------------------\n";
		return declration;
		
	}//end reportStructure
	
	
	
}//end class
