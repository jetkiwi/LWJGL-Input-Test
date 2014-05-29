package net.ja731j.lwjgl_test;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 * Hello
 * world!
 *
 */
public class App {

    public static void main(String[] args) {
        try {
            Display.setDisplayMode(new DisplayMode(320, 240));
            Display.create();

            while (!Display.isCloseRequested()) {
                while (Keyboard.next()) {
                    char c = Keyboard.getEventCharacter();
                    if (c != 0) {
                        System.out.println(String.valueOf(Keyboard.getEventKeyState())+" :"+c);
                    }
                }
                Display.update();
            }
        } catch (LWJGLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } finally {
            Display.destroy();
        }
    }
}
