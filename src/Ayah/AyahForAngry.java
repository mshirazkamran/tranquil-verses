package Ayah;

public class AyahForAngry extends Ayah {
    
	private String tip;
	private static final String filepath = "";

	public AyahForAngry (String text, String translation, String location) {
        super(text, translation, location);
        //TODO: add tip from data utils
    }


    @Override
    public String toString() {
        return super.toString() + 
        String.format("tip: %s%n", this.tip);
    }
}
