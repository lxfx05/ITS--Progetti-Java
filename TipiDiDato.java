public class TipiDiDato {
    
    public static void main(String[] args) {

        boolean ilBoolean = true; //variabile booleana
        byte ilByte = 127; //variabile byte, puo contenere valori da -128 a 127
        short loShort = 32767; //variavile short, puo contenere valori da -32767 a 32767
        int ilInt = 2147483647; //variabile int, puo contenere valori da -2^31 a 2^31-1
        Long ilLong = 9223372036854775807L; //variabile long, puo contenere valori da -2^63 a 2^63-1
    
        float ilFloat = 5.3456111f; //variabile float, puo contenere valori con la virgola
        double ilDouble = 5.345611111111111111; //variabile double, puo contenere valori con la virgola con piu precisione

        char ilChar = 'A'; //variabile char, puo contenere un singolo carattere
    
        //il singolo apice '' identifica il char; il doppio apice "" identifica le stringhe
    
        String laStringa = "Ciao, sono una stringa!"; //variabile stringa, puo contenere piu caratteri
        
        System.out.println(laStringa); //stampa la stringa
        System.out.println(laStringa.toUpperCase()); //stampa la stringa in maiuscolo

    }
}

// Le primitive sono variabili base in java (e iniziano co la minuscola);
// Le reference sono variabili che fanno riferimento ad un oggetto (e iniziano con la maiuscola) -e sono più complesse delle primitive;