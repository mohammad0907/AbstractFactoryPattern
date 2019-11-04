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
public class HPFactory extends ComputerFactory{

    @Override
    public Screen addScreen() {
        return new HPScreen();
    }

    @Override
    public Keyboard addKeyboard() {
       return new HPKeyboard();
    }
    
}
