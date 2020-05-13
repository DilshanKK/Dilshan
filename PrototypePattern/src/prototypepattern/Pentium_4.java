package prototypepattern;

class Pentium_4 extends Computer{


    void build() {
        brand = "COMPAQ Pressario";
        perfomenceLevel = "Intel Pentium IV Processor";
        levelOfMemoty = "2 Gb";
        webcam = false;
        usbPorts = 2;
        vgaPort = 2;
        vgaSize = "512 Mb";
        display = 14.0;
        hdd= "160 GB";

    }

    @Override
    public String toString() {
        return null;
    }
}
