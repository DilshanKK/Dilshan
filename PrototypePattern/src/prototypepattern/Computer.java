package prototypepattern;

public abstract class Computer {

    String brand;
    String perfomenceLevel;
    String levelOfMemoty;
    boolean webcam;
    byte usbPorts;
    byte vgaPort;
    String vgaSize;
    double display;
    String hdd;
    boolean floppyDisk = true;
    boolean hdmi;

    public abstract  String toString();
    
}
