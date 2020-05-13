package prototypepattern;

class Dual_Core extends Computer{


    void build() {
        brand = "COMPAQ Pressario";
        perfomenceLevel = "Intel Pentium Dual core Processor";
        levelOfMemoty = "2 Gb";
        webcam = true;
        usbPorts = 4;
        vgaPort = 2;
        vgaSize = "1 GB";
        display = 14.0;
        hdd= "160 GB";
        floppyDisk= false;


    }

    @Override
    public String toString() {
        return null;
    }
}
