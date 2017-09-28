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
public class Startup {

    public static void main(String[] args) {

        KeyboardInput input1 = new KeyboardInput("Hello World");
        InputOutputService inOutService1 = new InputOutputService(input1);
        String message1 = inOutService1.getTheInput();
        System.out.println(message1);
        
//        FileInput input2 = new FileInput("ReadIt.txt");
//        InputOutputService inOutService4 = new InputOutputService(input2);
//        String message4 = inOutService4.getTheInput();
//        System.out.println(message4);

        ConsoleOutput output1 = new ConsoleOutput(message1);
        InputOutputService inOutService2 = new InputOutputService(output1);
        String message2 = inOutService2.getTheOutput();
        System.out.println(message2);
        
        GuiOutput output2 = new GuiOutput(message1);
        InputOutputService inOutService3 = new InputOutputService(output2);
        String message3 = inOutService3.getTheOutput();
        System.out.println(message3);
        

    }
}
