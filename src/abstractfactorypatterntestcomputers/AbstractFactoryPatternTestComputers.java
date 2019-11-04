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
public class AbstractFactoryPatternTestComputers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuildClient client = null;
        ComputerFactory factory; 
        
        factory = new DellFactory();
        client = new BuildClient(factory);
        client.print();
    }
    
}
