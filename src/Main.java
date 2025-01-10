//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("-----FUNIONAMENTO IMMAGINI--------");

        Immagine img1 = new Immagine("tramonto", 5);
        Immagine img2 = new Immagine("alba", 7);

//        System.out.println("IMMAGINE 1:" );
//        img1.show();
//        System.out.println("IMMAGINE 2:" );
//        img2.show();
//        System.out.println("Metodo Aumenta Luminosità immagine1 di 2: ");
//        img1.aumentaLight( 2);
//        img1.show();
//        System.out.println("Ora la luminosità è: " + img1.getLight());
//        System.out.println("Metodo Diminuisci Luminosità immagine1 di 5: ");
//        img1.diminuisciLight(5);
//        System.out.println("Ora la luminosità è: " + img1.getLight());
//        img1.show();

        System.out.println("-----FUNIONAMENTO REGISTRAZIONI--------");

        Registrazione rec1 = new Registrazione( "rec1", 5, 3);
        Registrazione rec2 = new Registrazione( "rec2", 3, 8);

        System.out.println("REGISTRAZIONE 1: ");
        rec1.play();
        System.out.println("REGISTRAZIONE 2: ");
        rec2.play();
        System.out.println("Metodo aumenta volume Registrazione1 di 3: ");
        rec1.aumentaVolume(3);
        rec1.play();
        System.out.println("Ora il volume di " + rec1.getTitolo() + " è: " + rec1.getVolume());
        System.out.println("Metodo diminuisci volume Registrazione1 di 7: ");
        rec1.diminuisciVolume(7);
        rec1.play();
        System.out.println("Ora il volume di " + rec1.getTitolo() + " è: " + rec1.getVolume());

    }
}