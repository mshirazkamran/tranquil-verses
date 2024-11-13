import java.nio.channels.InterruptedByTimeoutException;

import Ayah.Ayah;
import ProgramBuilder.ProgramBuilder;

public class App {

    public static void main(String[] args) throws InterruptedException {
       
        ProgramBuilder.runProgram();

        // String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        // System.out.println("Available Fonts:");
        // for (String font : fonts) {
        //     System.out.println(font);
        // }
    }
}
