
package _99_extra;

import java.net.URI;
import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		String userMood = JOptionPane.showInputDialog(null,"What mood are you?");
		if (userMood.equals("stressed")) {
			playVideo("http://bit.ly/video-for-happy");
		}
		if (userMood.equals("sad")) {
			playVideo("http://bit.ly/video-for-sad");
		}
		if (userMood==("angry")) {
			playVideo("http://bit.ly/video-for-angry");
					}
	}
				
		

				
		
		// 2. Their answer is stored in the userMood variable. Print it out.
		
		

		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
		

		
		// 4. Play different songs for other moods.

/**
* If you can't think of any, here are some you can use...
*	http://bit.ly/video-for-happy
*	http://bit.ly/video-for-sad
*	http://bit.ly/video-for-angry
**/
		
		// If you are seeing ads at the beginning of your videos, install Adblock.

	

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



