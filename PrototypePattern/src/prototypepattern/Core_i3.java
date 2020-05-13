package prototypepattern;

class Core_i3 extends Computer{


    void build() {
        brand = "COMPAQ Pressario";
        perfomenceLevel = "Intel Pentium Core i3 Processor";
        levelOfMemoty = "4 Gb";
        webcam = true;
        usbPorts = 4;
        vgaPort = 2;
        vgaSize = "2 GB";
        display = 15.0;
        hdd= "500 GB";
        floppyDisk= false;
        hdmi = true;

    }

    @Override
    public String toString() {
        return null;
    }
}
