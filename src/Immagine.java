public class Immagine extends ElementoMultimediale {
    private int light;

    public Immagine(String titolo, int light) {
        super(titolo);
        this.light = light;
    }

    public int getLight() {
        return this.light;
    }

    public void show() {
        String valoreLight = "*".repeat(light);
        System.out.println("Il titolo dell'immagine è: " + getTitolo() + ". Il valore della luminosità è: " + valoreLight);
    }


    public int aumentaLight(int aumentaLightDi) {
        light += aumentaLightDi;
        return light;
    }

    public int diminuisciLight(int diminuisciLightDi) {
        light -= diminuisciLightDi;
        return light;
    }
}
