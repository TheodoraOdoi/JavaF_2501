package sess10_datetimeapi_enums;

/**
 * Enumeration to represent the four suits in a standard deck of playing cards.
 * The 4 suits are:
 * 1. Hearts
 * 2. Diamonds
 * 3. Clubs
 * 4. Spades
 * 
 * @author Window
 */
public enum CardSuit
{
    //==========================================
    // Card Suits
    //==========================================
    HEARTS("Hearts","Red"),
    DIAMONDS("Diamonds","Red"),
    CLUBS("Clubs","Black"),
    SPADES("Spades","Black");
    
    //==========================================
    // Card Suit Fields
    //==========================================
    private String suitName;
    private String colour;
    
    //==========================================
    // Constructors
    //==========================================
    private CardSuit(String suitName, String colour)
    {
        this.suitName = suitName;
        this.colour = colour;
    }
    
    //=============================================
    // Getters & Setters
    //=============================================
    public String getSuitName()
    {
        return suitName;
    }

    public void setSuitName(String suitName)
    {
        this.suitName = suitName;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }
    
    //=============================================
    // Overridden Methods
    //=============================================
    @Override
    public String toString()
    {
        return String.format("Suit Detaild" 
                + "\n" + "-".repeat(55)
                + "\nSuit: %s"
                + "\nColour: %s"
                + "\n" + "-".repeat(55), suitName, colour);
    }
    
    //Main method begins program execution
    public static void main(String[]args)
    {
        // loop through all suits in the enumeration & display info
        System.out.println("Demonstrating the 4 suits in a standard deck of " + "playing cards:\n");
        for(CardSuit suit: CardSuit.values())
            System.out.println(suit); // Display info about each suit
        
        //Example of how to get a specific suit by name
        System.out.println("\nAccessing a specific suit (e.g., Hearts):");
        CardSuit heartSuit = CardSuit.valueOf("HEARTS");
        System.out.println("Specific suit: " + heartSuit.getSuitName() + ", Colour: " + heartSuit.getColour());
    }
}
