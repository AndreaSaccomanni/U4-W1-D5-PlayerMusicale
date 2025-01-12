import Interfacce.GestioneLight;
import Interfacce.GestioneVolume;

public class Video extends ElementoMultimediale implements GestioneVolume, GestioneLight {
    private int volume;
    private int durata;
    private int light;

    public Video(String titolo, int volume, int durata, int light) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
        this.light = light;
    }


    //LUMINOSITA'

    public int getLight() {
        return this.light;
    }

    @Override
    public int aumentaLight(int aumentaLightDi) {
        light += aumentaLightDi;
        return light;
    }

    @Override

    public int diminuisciLight(int diminuisciLightDi) {
        light -= diminuisciLightDi;
        return light;
    }

    //VOLUME

    public int getVolume() {
        return volume;
    }

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

    //DURATA

    public int getDurata() {
        return durata;
    }



    public int tagliaVideo(int diminuisciDurataDi) {
        durata -= diminuisciDurataDi;
        return durata;
    }


    public void play() {
        String valoreVolume = "!".repeat(volume);
        String valoreLight = "*".repeat(light);
        //String playTitolo = getTitolo().repeat(durata);
        //System.out.println(playTitolo + ". Il valore del volume è: " + valoreVolume);
        for (int i = 0; i < durata; i++) {
            System.out.println("Titolo del video riprodotto: " + getTitolo() + " - Il valore del volume è: " + valoreVolume + " - Il valore  della luminosità è: " + valoreLight);
        }
    }
}
