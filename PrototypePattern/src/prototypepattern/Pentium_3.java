package prototypepattern;

class  Pentium_3 extends Computer{


    void build() {
        brand = "COMPAQ";
        perfomenceLevel = "Intel Pentium III Processor";
        levelOfMemoty = "512MB";
        webcam = false;
        usbPorts = 2;
        vgaPort = 1;
        vgaSize = "32Mb";
        display = 13.0;
        hdd= "60 GB";

    }

    @Override
    public String toString() {
        return null;
    }
}
