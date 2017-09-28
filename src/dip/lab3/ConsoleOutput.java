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
    public String getOutput(){
        return input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    
    
}
