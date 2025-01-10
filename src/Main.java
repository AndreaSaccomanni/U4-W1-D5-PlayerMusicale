//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("-----FUNIONAMENTO IMMAGINI--------");

        Immagine img1 = new Immagine("tramonto", 5);
        Immagine img2 = new Immagine("alba", 7);

        System.out.println("IMMAGINE 1:" );
        img1.show();
        System.out.println("IMMAGINE 2:" );
        img2.show();
        System.out.println("Metodo Aumenta Luminosità immagine1 di 2: ");
        img1.aumentaLight( 2);
        System.out.println("Ora la luminosità è: " + img1.getLight());
        img1.show();
        System.out.println("Metodo Diminuisci Luminosità immagine1 di 5: ");
        img1.diminuisciLight(5);
        System.out.println("Ora la luminosità è: " + img1.getLight());
        img1.show();

        System.out.println("-----FUNIONAMENTO REGISTRAZIONI--------");

        Registrazione rec1 = new Registrazione( "rec1", 5, 3);
        Registrazione rec2 = new Registrazione( "rec2", 3, 8);

        System.out.println("REGISTRAZIONE 1: ");
        rec1.play();
        System.out.println("REGISTRAZIONE 2: ");
        rec2.play();
        System.out.println("Metodo aumenta volume Registrazione1 di 3: ");
        rec1.aumentaVolume(3);
        System.out.println("Ora il volume di " + rec1.getTitolo() + " è: " + rec1.getVolume());
        rec1.play();
        System.out.println("Metodo diminuisci volume Registrazione1 di 7: ");
        rec1.diminuisciVolume(7);
        System.out.println("Ora il volume di " + rec1.getTitolo() + " è: " + rec1.getVolume());
        rec1.play();

        System.out.println("-----FUNIONAMENTO VIDEO--------");

        Video video1 = new Video("Video1", 5, 3, 5);
        Video video2 = new Video("Video2", 1, 1, 1);

        System.out.println("VIDEO1: ");
        video1.play();
        System.out.println("VIDEO2: ");
        video2.play();

        System.out.println("---------");

        System.out.println("Metodo Aumenta Luminosità Video1 di 2: ");
        video1.aumentaLight(2);
        System.out.println("Ora la luminosità è: " + video1.getLight());
        video1.play();
        System.out.println("Metodo Diminuisci Luminosità Video1 di 5: ");
        video1.diminuisciLight(5);
        System.out.println("Ora la luminosità è: " + video1.getLight());
        video1.play();

        System.out.println("---------");

        System.out.println("Metodo aumenta volume Video1 di 3: ");
        video1.aumentaVolume(3);
        System.out.println("Ora il volume di " + video1.getTitolo() + " è: " + video1.getVolume());
        video1.play();
        System.out.println("Metodo diminuisci volume Video1 di 7: ");
        video1.diminuisciVolume(7);
        System.out.println("Ora il volume di " + video1.getTitolo() + " è: " + video1.getVolume());
        video1.play();


    }
}