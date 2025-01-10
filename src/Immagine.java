public class Immagine extends ElementoMultimediale{
    private int light;

    public Immagine(String titolo, int light){
        super(titolo);
        this.light = light;
    }

    public void show(){
        System.out.println("Il titolo dell'immagine è: " + getTitolo() + " Il valore della luminosità è: " + this.light );
    }
}
