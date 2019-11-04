/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypatterntestcomputers;

/**
 *
 * @author rashe
 */
public class BuildClient {
    private Screen screen;
    private Keyboard keyboard;
    
    public BuildClient(ComputerFactory factory){
        screen = factory.addScreen();
        keyboard = factory.addKeyboard();
    }
    
    void print(){
        screen.print();
        keyboard.print();
    }
}
