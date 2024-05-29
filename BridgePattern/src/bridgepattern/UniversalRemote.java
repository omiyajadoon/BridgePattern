/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgepattern;

/**
 *
 * @author CUI
 */
public class UniversalRemote extends BasicRemote
{
     public UniversalRemote(Device device) {
        super.device = device;
    }

    public void maxVolume() {
        System.out.println("Remote: max volume");
        device.setVolume(100);
    }
}
