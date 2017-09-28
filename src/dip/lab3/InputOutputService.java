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
public class InputOutputService {

    private Input input;
    private Output output;

    public InputOutputService(Output output) {
        this.output = output;
    }

    public InputOutputService(Input input) {
        this.input = input;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public String getTheInput() {
        return input.getInput();
    }

    public String getTheOutput() {
        return output.getOutput();
    }

}
