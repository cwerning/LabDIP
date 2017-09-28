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
import javax.swing.JOptionPane;

public class GuiOutput implements Output {
    
    String input;

    public GuiOutput(String input) {
        this.input = input;
    }
    
    @Override
    public String getOutput(){
       return JOptionPane.showInputDialog(null, input);
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    

}
