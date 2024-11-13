package ProgramBuilder;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Ayah.Ayah;
import Ayah.AyahForAngry;
import Ayah.AyahForHappy;
import Ayah.AyahForNeutral;
import Ayah.AyahForSad;

import java.awt.ComponentOrientation;
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
                emotion = new Emotion(input.toLowerCase());
                System.out.println(emotion);
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

        frame.setSize(650, 400);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        Ayah ayahToDisplay = null;

        switch (emotion.getEmotion()) {
            case "sad" -> {
                ayahToDisplay = sadAyahs.get(randNum());
            }
            case "happy" -> {
                ayahToDisplay = happyAyahs.get(randNum());
            }
            case "neutral" -> {
                ayahToDisplay = neutralAyahs.get(randNum());
            }
            case "angry" -> {
                ayahToDisplay = angryAyahs.get(randNum());
            }
        }

        JLabel ayahText = new JLabel();
        

        ayahText.setText(ayahToDisplay.toString());
        ayahText.setFont(new Font("Arial", Font.BOLD, 18));
        ayahText.setHorizontalAlignment(SwingConstants.CENTER);
    
        JLabel ayah = new JLabel();

        

        ayah.setText(ayahToDisplay.getAyahText());
        ayahText.setFont(new Font("Tahoma", Font.BOLD, 25));
        ayahText.setHorizontalAlignment(SwingConstants.CENTER);
        // ayah.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    
        frame.add(ayahText);
        // frame.add(ayah);
        frame.setVisible(true);
        // frame.toFront();
        frame.setAlwaysOnTop(true);
    
    }


    private static int randNum() {

        Random random = new Random();
        int num = random.nextInt(2);

        return num;
    }

}