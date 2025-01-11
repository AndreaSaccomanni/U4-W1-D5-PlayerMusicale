import Interfacce.GestioneVolume;

public class Registrazione extends ElementoMultimediale implements GestioneVolume {
    private int volume;
    private int durata;

    public Registrazione(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }


    public int getVolume() {
        return volume;
    }


//    @Override
//    public String getTitolo() {
//        return super.getTitolo();
//    }

    @Override
    public int aumentaVolume(int aumentaVolumeDi) {
        volume += aumentaVolumeDi;
        return volume;
    }

    @Override
    public int diminuisciVolume(int diminuisciVolumeDi) {
        volume -= diminuisciVolumeDi;
        return volume;
    }

    public void play() {
        String valoreVolume = "*".repeat(volume);
        //String playTitolo = getTitolo().repeat(durata);
        //System.out.println(playTitolo + ". Il valore del volume è: " + valoreVolume);
        for (int i = 0; i < durata; i++) {
            System.out.println("Titolo registrazione riprodotta: " + getTitolo() + " - Il valore del volume è: " + valoreVolume);
        }
    }
}
