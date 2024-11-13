package Emotion;

import Exceptions.EmotionNotFoundException;

public final class Emotion {

    private String emotion;
    private static String[] supportedEmotions 
            = {"happy", "sad", "neutral", "angry"};


    public Emotion(String userEmotion) throws EmotionNotFoundException {

        boolean isAvaialbe = false;

        for (String emotion : supportedEmotions) {
            if (userEmotion.equals(emotion)) {
                isAvaialbe = true;
                this.emotion = emotion;
                break;
            }
        }

        if (isAvaialbe == false) {
            throw new EmotionNotFoundException("Emotion is not available!");
        }
    }


    public String getEmotion() {
        return this.emotion;
    }


    @Override
    public String toString() {
        return "Emotion [emotion=" + emotion + "]";
    }

    
    
}
