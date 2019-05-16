/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;

/**
 *
 * @author rdnpr
 */
public class MainClass {
    
    public static void main(String[] args) {
        Computer hp = new Computer(2, 3.4f, 6);
        Computer dell = new Computer(4, 2.4f, 8, "Dell");
        hp.printRam();
        dell.printRam();
        hp.name = "HP";
        System.out.println(hp.name);
        System.out.println(dell.name);
    }   
}
