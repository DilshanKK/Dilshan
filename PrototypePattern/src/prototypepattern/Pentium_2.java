package prototypepattern;

class Pentium_2 extends Computer{


    void build() {
        brand = "COMPAQ Pro";
        perfomenceLevel = "Intel Pentium II Processor";
        levelOfMemoty = "64MB";
        webcam = false;
        usbPorts = 0;
        vgaPort = 1;
        vgaSize = "32Mb";
        display = 13.0;
        hdd= "40 GB";


    }

    @Override
    public String toString() {
        return null;
    }
}
