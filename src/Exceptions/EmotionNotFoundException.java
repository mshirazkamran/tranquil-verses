package Exceptions;


/**
 * Used to show that
 * the user entered emotion 
 * is not found
 * @see Emotion
 */
public class EmotionNotFoundException extends Exception {

    public EmotionNotFoundException (String message) {
        super(message);
    }
}
