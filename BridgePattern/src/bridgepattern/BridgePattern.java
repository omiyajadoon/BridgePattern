/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridgepattern;

/**
 *
 * @author CUI
 */
public class BridgePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
   testDevice(new Tv());
        testDevice(new Radio());
        testDevice(new AC());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

        System.out.println("Tests with universal remote.");
        UniversalRemote universalRemote = new UniversalRemote(device);
        universalRemote.power();
        universalRemote.maxVolume();
        device.printStatus();
    }
    }
    

