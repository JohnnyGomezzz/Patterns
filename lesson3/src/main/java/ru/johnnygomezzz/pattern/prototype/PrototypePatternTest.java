package ru.johnnygomezzz.pattern.prototype;

public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Smartphone note10 = new Samsung("Note10");
        Smartphone iphoneX = new Apple("iPhoneX");

        System.out.println(note10);
        System.out.println(iphoneX);

        System.out.println("=== Products for VIPs ===");

        Smartphone note10Gold = note10.clone();
        note10Gold.setAdditionalPrice(50);
        System.out.println(note10Gold);

        Smartphone iphoneX128 = iphoneX.clone();
        iphoneX128.setAdditionalPrice(100);
        System.out.println(iphoneX128);
    }
}
