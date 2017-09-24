package com.example.java;

abstract class MusicalInstrument {

    abstract void playGuitar();
}

class Guitar extends MusicalInstrument {

    public void playGuitar() {
        System.out.println("Learn the basic guitar chords.");
        System.out.println("Learn some single, double, three or four chord guitar songs.");
        System.out.println("Play your own tunes and your own songs. Enjoy your music :)");
        System.out.println("Learn bar chords.");
        System.out.println("Take your playing to the next level.");
    }
}

public class AbstractClassWithAbstractMethodExample {

    public static void main(String[] args) {

        MusicalInstrument instrument = new Guitar();
        instrument.playGuitar();
    }
}
