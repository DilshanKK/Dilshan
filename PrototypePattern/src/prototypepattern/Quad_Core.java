package prototypepattern;

class Quad_Core extends Computer{

    void build() {
        brand = "COMPAQ Pressario";
        perfomenceLevel = "Intel Pentium Quad Core Processor";
        levelOfMemoty = "4 Gb";
        webcam = true;
        usbPorts = 4;
        vgaPort = 2;
        vgaSize = "2 GB";
        display = 15.0;
        hdd= "500 GB";
        floppyDisk= false;

    }

    @Override
    public String toString() {
        return null;
    }
}
