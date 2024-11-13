package Emotion;

import Exceptions.EmotionNotFoundException;

public final class Emotion {

    private String emotion;
    private static String[] availableEmotions 
        = {"Happy", "Sad", "Neutral", "Angry"};


    public Emotion(String userEmotion) throws EmotionNotFoundException {

        boolean isAvaialbe = false;

        for (String emotion : availableEmotions) {
            if (userEmotion.equals(emotion)) {
                isAvaialbe = true;
                break;
            }
        }

        if (isAvaialbe == false) {
            throw new EmotionNotFoundException("Emotion is not available!");
        }
    }
    
}
