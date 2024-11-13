package ProgramBuilder;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingContainer;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Ayah.Ayah;
import Emotion.Emotion;
import Exceptions.EmotionNotFoundException;

public class ProgramBuilder {

    private static final int height = 400;
    private static final int width = 400;
    private static final Scanner scan = new Scanner(System.in);
    private static final String[] emotions
        = {"Happy", "Sad", "Neutral", "Angry"};

    // Ayah ayah
    public static void runProgram() throws InterruptedException {

        System.out.println("\t\t\t//////////////////////////");
        System.out.println("\t\t\tWelcome to Tanquil Verses");
        System.out.println("\t\t\t//////////////////////////\n");

        while (true) {

            System.out.println("""
            Please enter your mood: 
            Happy
            Sad
            Neutral
            Angry
            (exit) to quit the program!
            """);

            Emotion emotion;
            String input = scan.nextLine();

            if (input.equals("exit")) {
                System.exit(1);
            }

            try {
                emotion = new Emotion(input);
            } catch (EmotionNotFoundException e) {
                
                System.out.println("Please add available emotions!");
                Thread.currentThread().sleep(1400);
                continue;
            }

            ProgramBuilder.buildGUI(emotion);

        }
    }


    private static void buildGUI(Emotion emotion) {


        JFrame frame = new JFrame("Tranquil Verses");

        frame.setSize(ProgramBuilder.height, ProgramBuilder.width);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // JLabel label = new JLabel("shiraz kamiran");
        // label.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 22));
        // label.setHorizontalAlignment(SwingConstants.CENTER  + 10);
    
        JLabel ayahText = new JLabel("demo text");

        ayahText.setFont(new Font("Calibri", Font.BOLD, 22));
        ayahText.setHorizontalAlignment(SwingConstants.CENTER);
        
    
        frame.add(ayahText);
        frame.setVisible(true);
        // frame.toFront();
        frame.setAlwaysOnTop(true);
    
    }
}
