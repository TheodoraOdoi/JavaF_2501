package bouncingball;

import com.adse2501.music.GameMusic;
import com.adse2501.video.GameVideo;
        
/**
 * Class with the game's launch point
 * 
 * @author todoi
 */
public class BouncingBall
{
    public static void main(String[] args)
    {
        System.out.println("Loading the Bouncing Ball game...\nPlease wait");
        
        // Declare and instantiate a GameVideo object
        GameVideo gv = new GameVideo();
        gv.playVideo();
        
        // Play the game music
        new GameMusic().playMusic();
    }
    
}
