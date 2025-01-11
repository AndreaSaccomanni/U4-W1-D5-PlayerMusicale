import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5];

    public static void main(String[] args) {


//        System.out.println("-----FUNIONAMENTO IMMAGINI--------");
//
//        Immagine img1 = new Immagine("tramonto", 5);
//        Immagine img2 = new Immagine("alba", 7);
//
//        System.out.println("IMMAGINE 1:");
//        img1.show();
//        System.out.println("IMMAGINE 2:");
//        img2.show();
//        System.out.println("Metodo Aumenta Luminosità immagine1 di 2: ");
//        img1.aumentaLight(2);
//        System.out.println("Ora la luminosità è: " + img1.getLight());
//        img1.show();
//        System.out.println("Metodo Diminuisci Luminosità immagine1 di 5: ");
//        img1.diminuisciLight(5);
//        System.out.println("Ora la luminosità è: " + img1.getLight());
//        img1.show();
//
//        System.out.println("-----FUNIONAMENTO REGISTRAZIONI--------");
//
//        Registrazione rec1 = new Registrazione("rec1", 5, 3);
//        Registrazione rec2 = new Registrazione("rec2", 3, 8);
//
//        System.out.println("REGISTRAZIONE 1: ");
//        rec1.play();
//        System.out.println("REGISTRAZIONE 2: ");
//        rec2.play();
//        System.out.println("Metodo aumenta volume Registrazione1 di 3: ");
//        rec1.aumentaVolume(3);
//        System.out.println("Ora il volume di " + rec1.getTitolo() + " è: " + rec1.getVolume());
//        rec1.play();
//        System.out.println("Metodo diminuisci volume Registrazione1 di 7: ");
//        rec1.diminuisciVolume(7);
//        System.out.println("Ora il volume di " + rec1.getTitolo() + " è: " + rec1.getVolume());
//        rec1.play();
//
//        System.out.println("-----FUNIONAMENTO VIDEO--------");
//
//        Video video1 = new Video("Video1", 5, 3, 5);
//        Video video2 = new Video("Video2", 1, 1, 1);
//
//        System.out.println("VIDEO1: ");
//        video1.play();
//        System.out.println("VIDEO2: ");
//        video2.play();
//
//        System.out.println("---------");
//
//        System.out.println("Metodo Aumenta Luminosità Video1 di 2: ");
//        video1.aumentaLight(2);
//        System.out.println("Ora la luminosità è: " + video1.getLight());
//        video1.play();
//        System.out.println("Metodo Diminuisci Luminosità Video1 di 5: ");
//        video1.diminuisciLight(5);
//        System.out.println("Ora la luminosità è: " + video1.getLight());
//        video1.play();
//
//        System.out.println("---------");
//
//        System.out.println("Metodo aumenta volume Video1 di 3: ");
//        video1.aumentaVolume(3);
//        System.out.println("Ora il volume di " + video1.getTitolo() + " è: " + video1.getVolume());
//        video1.play();
//        System.out.println("Metodo diminuisci volume Video1 di 7: ");
//        video1.diminuisciVolume(7);
//        System.out.println("Ora il volume di " + video1.getTitolo() + " è: " + video1.getVolume());
//        video1.play();


        Scanner scanner = new Scanner(System.in);


        int i = -1;
        while (i != 0) {
            if (arrayPieno(elementiMultimediali)) {
                System.out.println("L'array è pieno!");
            } else {
                System.out.println("Inserisci 1 per creare un'immagine");
                System.out.println("Inserisci 2 per creare un video");
                System.out.println("Inserisci 3 per creare una registrazione");
                System.out.println("Inserisci 4 per riprodurre gli elementi multimediali");
                System.out.println("Inserisci 5 per modificare gli elementi multimediali");

                if (scanner.hasNextInt()) {
                    i = scanner.nextInt();
                } else {
                    System.out.println("Errore: Devi inserire un numero valido.");
                    scanner.next();
                    continue;
                }

                switch (i) {
                    case 1:
                        aggiungiElemento(creaImmagine());

                        System.out.println("Ora gli elementi multimediali sono: ");
                        int posizione = 1;
                        for (ElementoMultimediale elemento : elementiMultimediali) {
                            if (elemento != null) {
                                System.out.println(posizione + ") " + elemento.getTitolo());
                            }
                            posizione++;
                        }
                        ;
                        break;
                    case 2:
                        aggiungiElemento(creaVideo());

                        System.out.println("Ora gli elementi multimediali sono: ");
                        posizione = 1;
                        for (ElementoMultimediale elemento : elementiMultimediali) {
                            if (elemento != null) {
                                System.out.println(posizione + ") " + elemento.getTitolo());
                                posizione++;
                            }
                        }
                        ;

                        break;
                    case 3:
                        aggiungiElemento(creaRegistrazione());

                        System.out.println("Ora gli elementi multimediali sono: ");
                        posizione = 1;
                        for (ElementoMultimediale elemento : elementiMultimediali) {
                            if (elemento != null) {
                                System.out.println(posizione + ") " + elemento.getTitolo());
                            }
                            posizione++;
                        }
                        ;

                        break;
                    case 4:
                        riproduci();
                        break;
//                case "5":
//                    modifica();
//                    break;


                    default:
                        System.out.println("Seleziona un numero da 1 a 5");

                }


            }

        }
    }

    private static void aggiungiElemento(ElementoMultimediale elemento) {
        for (int j = 0; j < elementiMultimediali.length; j++) {
            if (elementiMultimediali[j] == null) {
                elementiMultimediali[j] = elemento;

                return;
            }
        }
    }


    private static ElementoMultimediale creaImmagine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo per l'immagine");
        String titolo = scanner.nextLine();
        System.out.println("Inserisci un valore per la luminosità");
        int light = scanner.nextInt();
        Immagine immagine = new Immagine(titolo, light);
        //immagine.show();
        return immagine;


    }

    private static ElementoMultimediale creaVideo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo per il video");
        String titolo = scanner.nextLine();
        System.out.println("Inserisci un valore per il volume");
        int volume = scanner.nextInt();
        System.out.println("Inserisci un valore per la durata");
        int durata = scanner.nextInt();
        System.out.println("Inserisci un valore per la luminosità");
        int light = scanner.nextInt();
        Video video = new Video(titolo, volume, durata, light);
        //video.play();
        return video;

    }

    private static ElementoMultimediale creaRegistrazione() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo per la registrazione");
        String titolo = scanner.nextLine();
        System.out.println("Inserisci un valore per il voluume");
        int volume = scanner.nextInt();
        System.out.println("Inserisci un valore per la durata");
        int durata = scanner.nextInt();
        Registrazione registrazione = new Registrazione(titolo, volume, durata);
        //registrazione.play();
        return registrazione;

    }

    private static void riproduci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gli elementi multimediali da riprodurre o mostrare sono: ");
        int posizione = 1;
        for (ElementoMultimediale elemento : elementiMultimediali) {
            if (elemento != null) {
                System.out.println(posizione + ") " + elemento.getTitolo());
            }
            posizione++;
        }
        System.out.println("Digita il numero dell'elemento che vuoi riprodurre o mostrare");
        int risposta = scanner.nextInt();

        if (risposta >= 1 && risposta <= 5) {
            int elementoSelezionato = 1;
            for (ElementoMultimediale elemento : elementiMultimediali) {
                if (elemento != null) {
                    if (risposta == elementoSelezionato) {
                        if (elemento instanceof Immagine) {
                            System.out.println("Mostro l'immagine " + elemento.getTitolo() + ": ");
                            ((Immagine) elemento).show();

                        } else if (elemento instanceof Video) {
                            System.out.println("Riproduco il video " + elemento.getTitolo() + ": ");
                            ((Video) elemento).play();

                        } else if (elemento instanceof Registrazione) {
                            System.out.println("Riproduco la registrazione " + elemento.getTitolo() + ": ");
                            ((Registrazione) elemento).play();

                        }
                        break;
                    }
                    elementoSelezionato++;
                }
            }
        } else {
            System.out.println("Devi inserire un numero valido in base agli elementi disponibili");


        }
    }

    private static boolean arrayPieno(ElementoMultimediale[] array) {
        int numeroElementi = 0;
        for (ElementoMultimediale elemento : array) {

            if (elemento != null) {
                numeroElementi++;
            }
        }

        return numeroElementi == array.length;
    }
}
