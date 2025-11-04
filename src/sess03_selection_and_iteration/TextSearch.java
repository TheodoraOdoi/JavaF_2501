package sess03_selection_and_iteration;

/**
 * Java program to search for some text in a paragrph using a while loop
 * @author todoi
 */
public class TextSearch
{
    //main method begins program execution
    public static void main(String[] args)
    {
        //Paragraph to search text within
        String paragraph = "Video provides a powerful way to help you prove "
                + "your point. "
                + "When you click Online Video, you can paste in the embed "
                + "code for the video you want to add. "
                + "You can also type a keyword to search online for the "
                + "video that best fits your document. "
                + "To make your document look professionally produced, "
                + "Word provides header, footer, cover page, and text "
                + "box designs that complement each other. For example, "
                + "you can add a matching cover page, header, and sidebar."
                + " Click Insert and then choose the elements you want "
                + "from the different galleries. Themes and styles also "
                + "help keep your document coordinated. When you click "
                + "Design and choose a new Theme, the pictures, charts, "
                + "and SmartArt graphics change to match your new theme.";
        
        //word/text to search for
        String textToSearch = "document";
        boolean found = false;//variable to indicate whether the text has been found or not
        int index = 0;
        
        // use a while loop to search for the text
        while(index < paragraph.length())
        {
            // check if the substring matches the text to search
            if(index + textToSearch.length() <= paragraph.length() && 
                    paragraph.substring(index, index + textToSearch.length()).equals(textToSearch))
            {
                found = true;
                break; //exit the loop when the text is found
            }
            index++; // increment the index to check the next character
        }
        
        // output the results
        if(found)
        {
            System.out.println("The text/word '" + textToSearch + "' was found " + "at index " + index);
        }
        else
          System.out.println("Unfortunately the text/word '" + textToSearch + "' was not found in the paragraph. ");  
    }
    
}
