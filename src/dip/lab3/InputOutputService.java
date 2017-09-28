/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.io.FileNotFoundException;

/**
 *
 * @author L115student
 */
public class InputOutputService {

    private Input input;
    private Output output;

    public InputOutputService(Output output) {
        this.setOutput(output);
    }

    public InputOutputService(Input input) {
        this.input = input;
    }

    public Output getOutput() {
        return output;
    }

    public final void setOutput(Output output) {
        if (output == null) {

            throw new IllegalArgumentException("Error: Keyboard output cannot be null.");

        }
        this.output = output;
    }

    public final Input getInput() {
        return input;
    }

    public final void setInput(Input input) {
        if (input == null) {

            throw new IllegalArgumentException("Error: Keyboard Input cannot be null.");

        }
        this.input = input;
    }

    public final String getTheInput() throws FileNotFoundException {
        return input.getInput();
    }

    public final String getTheOutput() {
        return output.getOutput();
    }

}
