

import java.awt.*;
import javax.swing.*;



public class content {
    public static void ok(String[] args) {
        // Define emoji string
        String emojisss = "❤️ Keep Going! <br>💪 You're Strong! <br>💖 Spread Love!";
        
        // Create JFrame
        JFrame f = new JFrame("Motivational Emojis");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 200);  // Set window size

        // Create JLabel and set emoji text
        JLabel em = new JLabel(emojisss);
        
        // Set font to one that supports emojis, like "Segoe UI Emoji"
        // em.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 24));  // Use Segoe UI Emoji if available
        
        // Align the text within the JLabel
        em.setHorizontalAlignment(SwingConstants.CENTER);
        em.setVerticalAlignment(SwingConstants.CENTER);

        // Add label to frame
        f.add(em);
        
        // Make the frame visible
        f.setVisible(true);

        // Print emoji to the console (just to show how it prints in console)
        System.out.println("\u2764");  // ❤️
    }
}
