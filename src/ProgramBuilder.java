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


    private static final ArrayList<AyahForSad> sadAyahs 
        = AyahForSad.loadAyahsForSadFromFile();

    private static final ArrayList<AyahForHappy> happyAyahs 
        = AyahForHappy.loadAyahsForHappyfromFile();

    private static final ArrayList<AyahForNeutral> neutralAyahs 
        = AyahForNeutral.loadAyahsForNeutralFromFile();

    private static final ArrayList<AyahForAngry> angryAyahs 
        = AyahForAngry.loadAyahsForAngryFromFile();
    

    public static void runProgram() throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        System.out.println("\t\t\t\t\u001B[36m/////////////////////////\u001B[0m");
        System.out.println("\t\t\t\t\u001B[32mWelcome to Tanquil Verses\u001B[0m");
        System.out.println("\t\t\t\t\u001B[36m/////////////////////////\u001B[0m\n");

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

            // exit the program
            if (input.equals("exit")) {
                System.exit(1);
            }

            try {
                emotion = new Emotion(input.toLowerCase());
                ProgramBuilder.GUIbuilder(emotion);
                
            } catch (EmotionNotFoundException e) {
                
                System.out.println("Please add available emotions!");
                Thread.currentThread().sleep(1400);  // to show a little pause to the user
            }
        }
    }


    private static void GUIbuilder(Emotion emotion) {


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

        JFrame frame = new JFrame("Tranquil Verses");

        frame.setSize(650, 400);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel ayahText = new JLabel();

        ayahText.setText(ayahToDisplay.toString());
        ayahText.setFont(new Font("Arial", Font.BOLD, 22));
        ayahText.setHorizontalAlignment(SwingConstants.CENTER);

    
        frame.add(ayahText);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
    }


    private static int randNum() {

        Random random = new Random();
        int num = random.nextInt(5);
        return num;
    }

}