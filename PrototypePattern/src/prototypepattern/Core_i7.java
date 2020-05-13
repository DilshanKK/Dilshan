package prototypepattern;

class Core_i7 extends Computer{


    void build() {
        brand = "COMPAQ Pressario";
        perfomenceLevel = "Intel Pentium Core i7 Processor";
        levelOfMemoty = "16 Gb";
        webcam = true;
        usbPorts = 2;
        vgaPort = 1;
        vgaSize = "8 GB";
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
