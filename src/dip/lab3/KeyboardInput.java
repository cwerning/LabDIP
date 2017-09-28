/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author L115student
 */
public class KeyboardInput implements Input {

    String keyboardInput;

    public KeyboardInput(String KeyboardInput) {
        
        this.keyboardInput = KeyboardInput;
    }

    @Override
    public final String getInput() {
        return getKeyboardInput();
    }

    public final String getKeyboardInput() {
        return keyboardInput;
    }

    public final void setKeyboardInput(String KeyboardInput) {
        if (KeyboardInput == null || KeyboardInput.length() == 0) {

            throw new IllegalArgumentException("Error: Keyboard Input cannot be null of empty string");

        }
        this.keyboardInput = KeyboardInput;
    }

}
