package ProgramBuilder;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Ayah.Ayah;
import Ayah.AyahForAngry;
import Ayah.AyahForHappy;
import Ayah.AyahForNeutral;
import Ayah.AyahForSad;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Emotion.Emotion;
import Exceptions.EmotionNotFoundException;

public class ProgramBuilder {

    private static final int height = 400;
    private static final int width = 400;
    private static final Scanner scan = new Scanner(System.in);

    private static final ArrayList<AyahForSad> sadAyahs 
        = AyahForSad.loadAyahsForSadFromFile();

    private static final ArrayList<AyahForHappy> happyAyahs 
        = AyahForHappy.loadAyahsForHappyfromFile();

    private static final ArrayList<AyahForNeutral> neutralAyahs 
        = AyahForNeutral.loadAyahsForNeutralFromFile();

    private static final ArrayList<AyahForAngry> angryAyahs 
        = AyahForAngry.loadAyahsForAngryFromFile();
    

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
                ProgramBuilder.GUIbuilder(emotion);
                
            } catch (EmotionNotFoundException e) {
                
                System.out.println("Please add available emotions!");
                Thread.currentThread().sleep(1400);
                continue;
            }
        }
    }


    private static void GUIbuilder(Emotion emotion) {


        JFrame frame = new JFrame("Tranquil Verses");

        frame.setSize(ProgramBuilder.height, ProgramBuilder.width);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        Ayah ToDisplay = null;

        switch (emotion.getEmotion()) {
            case "Sad" -> {
                ToDisplay = sadAyahs.get(randNum());
            }
            case "Happy" -> {
                ToDisplay = happyAyahs.get(randNum());
            }
            case "Neutral" -> {
                ToDisplay = neutralAyahs.get(randNum());
            }
            case "Angry" -> {
                ToDisplay = angryAyahs.get(randNum());
            }
        }

        JLabel ayahText = new JLabel();

        ayahText.setText(ToDisplay.toString());
        ayahText.setFont(new Font("Calibri", Font.BOLD, 22));
        ayahText.setHorizontalAlignment(SwingConstants.CENTER);
        
    
        frame.add(ayahText);
        frame.setVisible(true);
        // frame.toFront();
        frame.setAlwaysOnTop(true);
    
    }


    private static int randNum() {

        Random random = new Random();
        int num = random.nextInt(4);

        return num;
    }

}