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
    public String getInput() {
        return getKeyboardInput();
    }

    public String getKeyboardInput() {
        return keyboardInput;
    }

    public void setKeyboardInput(String KeyboardInput) {
        this.keyboardInput = KeyboardInput;
    }

}
