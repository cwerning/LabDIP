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
public class ConsoleOutput implements Output{
    
    String input;

    public ConsoleOutput(String input) {
        this.input = input;
    }
    
    @Override
    public final String getOutput(){
        return input;
    }

    public final String getInput() {
        return input;
    }

    public final void setInput(String input) {
        if (input == null || input.length() <= 0) {

            throw new IllegalArgumentException("Error: Input cannot be null or have nothing.");

        }
        this.input = input;
    }
    
    
    
}
