import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = -1;
        while (i != 0) {
            if (arrayPieno(elementiMultimediali)) {
                System.out.println("Lettore Multimediale pieno");
                System.out.println("Inserisci 1 per riprodurre o mostrare gli elementi multimediali");
                System.out.println("Inserisci 2 per modificare gli elementi multimediali");
                System.out.println("Inserisci 0 per chiudere il lettore multimediale");

                if (scanner.hasNextInt()) {


                    i = scanner.nextInt();
                } else {
                    System.out.println("Errore: Devi inserire un numero valido.");
                    scanner.next();
                    continue;
                }
                switch (i) {
                    case 1:
                        riproduci();
                        break;
                    case 2:
                        modifica();
                        break;
                    case 0:
                        System.out.println("Lettore multimediale chiuso. A presto!");
                        break;

                    default:
                        System.out.println("Seleziona 1 o 2 oppure 0 per chiudere il lettore multimediale");


                }


            } else {
                System.out.println("Inserisci 1 per creare un'immagine");
                System.out.println("Inserisci 2 per creare un video");
                System.out.println("Inserisci 3 per creare una registrazione");
                System.out.println("Inserisci 4 per riprodurre o mostrare gli elementi multimediali");
                System.out.println("Inserisci 5 per modificare gli elementi multimediali");
                System.out.println("Inserisci 0 per chiudere il lettore multimediale");

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
                    case 5:
                        modifica();
                        break;
                    case 0:
                        System.out.println("Lettore multimediale chiuso. A presto!");


                        break;


                    default:
                        System.out.println("Seleziona un numero da 1 a 5 oppure 0 per chiudere il lettore multimediale");

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

    private static int controlloInputValido(String messaggio) {
        Scanner scanner = new Scanner(System.in);
        int valore = 0;
        boolean inputValido = false;

        while (!inputValido) {
            System.out.println(messaggio);
            if (scanner.hasNextInt()) {
                valore = scanner.nextInt();
                inputValido = true;
            } else {
                System.out.println("Errore: devi inserire un numero intero!");
                scanner.next();
            }
        }

        return valore;
    }


    private static ElementoMultimediale creaImmagine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo per l'immagine:");
        String titolo = scanner.nextLine();
        int light = controlloInputValido("Inserisci un valore per la luminosità (numero intero):");
        Immagine immagine = new Immagine(titolo, light);
        return immagine;
    }


    private static ElementoMultimediale creaVideo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo per il video");
        String titolo = scanner.nextLine();
        int volume = controlloInputValido("Inserisci un valore per il volume (numero intero):");
        //int volume = scanner.nextInt();
        int durata = controlloInputValido("Inserisci un valore per la durata (numero intero)");
        //int durata = scanner.nextInt();
        int light = controlloInputValido("Inserisci un valore per la luminosità (numero intero)");
        //int light = scanner.nextInt();
        Video video = new Video(titolo, volume, durata, light);
        //video.play();
        return video;

    }

    private static ElementoMultimediale creaRegistrazione() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo per la registrazione");
        String titolo = scanner.nextLine();
        int volume = controlloInputValido("Inserisci un valore per il volume (numero intero)");
        //int volume = scanner.nextInt();
        int durata = controlloInputValido("Inserisci un valore per la durata (numero intero)");
        //int durata = scanner.nextInt();
        Registrazione registrazione = new Registrazione(titolo, volume, durata);
        //registrazione.play();
        return registrazione;

    }

    private static void riproduci() {
        boolean tuttiNull = true;
        for (int i = 0; i < elementiMultimediali.length; i++) {
            if (elementiMultimediali[i] != null) {
                tuttiNull = false;
                break;
            }
        }

        if (tuttiNull) {
            System.out.println("Non ci sono elementi multimediali disponibili, una volta creati potrai riprodurli");
            return;
        }
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

    private static void modifica() {
        Scanner scanner = new Scanner(System.in);


        boolean tuttiNull = true;
        for (int i = 0; i < elementiMultimediali.length; i++) {
            if (elementiMultimediali[i] != null) {
                tuttiNull = false;
                break;
            }
        }

        if (tuttiNull) {
            System.out.println("Non ci sono elementi multimediali disponibili, una volta creati saranno modificabili");
            return;
        }


        System.out.println("Seleziona un elemento multimediale da modificare:");
        for (int i = 0; i < elementiMultimediali.length; i++) {
            if (elementiMultimediali[i] != null) {
                System.out.println((i + 1) + ") " + elementiMultimediali[i].getTitolo());
            }
        }

        int sceltaElemento = controlloInputValido("Inserisci il numero dell'elemento da modificare:") - 1;

        if (sceltaElemento >= 0 && sceltaElemento < elementiMultimediali.length && elementiMultimediali[sceltaElemento] != null) {
            ElementoMultimediale elemento = elementiMultimediali[sceltaElemento];


            if (elemento instanceof Immagine) {
                modificaLuminosita((Immagine) elemento);

            } else if (elemento instanceof Video) {
                System.out.println("Vuoi modificare: \n1) Volume \n2) Luminosità \n3) Durata");
                int scelta = controlloInputValido("Inserisci la tua scelta:");

                if (scelta == 1) {
                    modificaVolume((Video) elemento);
                } else if (scelta == 2) {
                    modificaLuminosita((Video) elemento);
                } else if (scelta == 3) {
                    modificaDurata((Video) elemento);
                }

            } else if (elemento instanceof Registrazione) {
                System.out.println("Vuoi modificare: \n1) Volume \n2) Durata");
                int scelta = controlloInputValido("Inserisci la tua scelta:");

                if (scelta == 1) {
                    modificaVolume((Registrazione) elemento);
                } else if (scelta == 2) {
                    modificaDurata((Registrazione) elemento);
                }
            }
        } else {
            System.out.println("Selezione non valida.");
        }
    }


    private static void modificaVolume(ElementoMultimediale elemento) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vuoi: \n1) Aumentare il volume \n2) Diminuire il volume");
        int scelta = controlloInputValido("Inserisci la tua scelta:");
        int valore = controlloInputValido("Di quanto vuoi modificare il volume?");

        if (scelta == 1) {
            if (elemento instanceof Video) {
                Video video = (Video) elemento;
                video.aumentaVolume(valore);
                System.out.println("Ora il valore del volume è: " + video.getVolume());
            } else if (elemento instanceof Registrazione) {
                Registrazione registrazione = (Registrazione) elemento;
                registrazione.aumentaVolume(valore);
                System.out.println("Ora il valore del volume è: " + registrazione.getVolume());
            } else {
                System.out.println("Tipo di elemento non supportato per la modifica del volume.");
            }
        } else if (scelta == 2) {
            if (elemento instanceof Video) {
                Video video = (Video) elemento;
                if (video.getVolume() - valore <= 0) {
                    System.out.println("Il valore inserito è troppo grande");
                } else {
                    video.diminuisciVolume(valore);
                    System.out.println("Ora il valore del volume è: " + video.getVolume());
                }
            } else if (elemento instanceof Registrazione) {
                Registrazione registrazione = (Registrazione) elemento;
                if (registrazione.getVolume() - valore <= 0) {
                    System.out.println("Il valore inserito è troppo grande");
                } else {
                    registrazione.diminuisciVolume(valore);
                    System.out.println("Ora il valore del volume è: " + registrazione.getVolume());
                }
            } else {
                System.out.println("Devi inserire 1 o 2");
            }
        }
    }

    private static void modificaLuminosita(ElementoMultimediale elemento) {
        System.out.println("Vuoi: \n1) Aumentare la luminosità \n2) Diminuire la luminosità");
        int scelta = controlloInputValido("Inserisci la tua scelta:");
        int valore = controlloInputValido("Di quanto vuoi modificare la luminosità?");

        if (scelta == 1) {
            if (elemento instanceof Video) {
                Video video = (Video) elemento;
                video.aumentaLight(valore);
                System.out.println("Ora il valore della luminosità è: " + video.getLight());
            } else if (elemento instanceof Immagine) {
                Immagine immagine = (Immagine) elemento;
                immagine.aumentaLight(valore);
                System.out.println("Ora il valore della luminosità è: " + immagine.getLight());
            } else {
                System.out.println("Questo elemento non è supportato per la modifica della luminosità.");
            }
        } else if (scelta == 2) {
            if (elemento instanceof Video) {
                Video video = (Video) elemento;
                if (video.getLight() - valore <= 0) {
                    System.out.println("Il valore inserito è troppo grande");
                } else {
                    video.diminuisciLight(valore);
                    System.out.println("Ora il valore della luminosità è: " + video.getLight());
                }
            } else if (elemento instanceof Immagine) {
                Immagine immagine = (Immagine) elemento;
                if (immagine.getLight() - valore <= 0) {
                    System.out.println("Il valore inserito è troppo grande");
                } else {
                    immagine.diminuisciLight(valore);
                    System.out.println("Ora il valore della luminosità è: " + immagine.getLight());
                }
            } else {
                System.out.println("Questo elemento non è supportato per la modifica della luminosità.");
            }
        }
    }


    private static void modificaDurata(ElementoMultimediale elemento) {
        int valore = controlloInputValido("Quanti minuti vuoi tagliare?");

        if (elemento instanceof Video) {
            Video video = (Video) elemento;
            if (video.getDurata() - valore <= 0) {
                System.out.println("Il valore inserito è troppo grande");
            } else {
                video.tagliaVideo(valore);
                System.out.println("Ora il video dura " + video.getDurata() + " minuti");
            }
        } else if (elemento instanceof Registrazione) {
            Registrazione registrazione = (Registrazione) elemento;
            if (registrazione.getDurata() - valore <= 0) {
                System.out.println("Il valore inserito è troppo grande");
            } else {
                registrazione.tagliaRegistrazione(valore);
                System.out.println("Ora la registrazione dura " + registrazione.getDurata() + " minuti");
            }
        }
    }



}
