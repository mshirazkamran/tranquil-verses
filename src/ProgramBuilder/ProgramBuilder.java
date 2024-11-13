package ProgramBuilder;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyListener;

import Ayah.Ayah;

public class ProgramBuilder {

    // Ayah ayah
    public static void runProgram(Ayah ayah)  {
        
        System.out.println("Hello, World!");

        JFrame frame = new JFrame("Arabic text");

        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JLabel label = new JLabel("shiraz kamiran");
        // label.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 22));
        // label.setHorizontalAlignment(SwingConstants.CENTER  + 10);
    
        JLabel arabicText = new JLabel(ayah.toString());
        arabicText.setFont(new Font("Calibri", Font.BOLD, 22));
        arabicText.setHorizontalAlignment(SwingConstants.CENTER);
        
    
        frame.add(arabicText);
        // label.setAlignmentX(300.0f);
        // label.setAlignmentY(400.0f);
        frame.setVisible(true);


        System.out.println("لافد ميدا كومب");

        // String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        // System.out.println("Available Fonts:");
        // for (String font : fonts) {
        //     System.out.println(font);
        // }
    }
}
