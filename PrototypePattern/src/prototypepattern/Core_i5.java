package prototypepattern;

class Core_i5 extends Computer{

    void build() {
        brand = "COMPAQ Pressario";
        perfomenceLevel = "Intel Pentium Core i5 Processor";
        levelOfMemoty = "8 Gb";
        webcam = true;
        usbPorts = 4;
        vgaPort = 2;
        vgaSize = "2 GB";
        display = 15.4;
        hdd= "1 TB";
        floppyDisk= false;
        hdmi = true;
    }

    @Override
    public String toString() {
        return null;
    }
}
