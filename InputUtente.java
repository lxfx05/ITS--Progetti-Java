import java.util.Scanner;  //importa la classe Scanner per leggere l'input dell'utente

public class InputUtente {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);  //crea un oggetto scanner per leggere l'input dell'utente

        System.out.println("Qual è il tuo nome"); //chiede all'utente di inserire il proprio nome
        String name= scanner.nextLine();

        System.out.println("Ciao " + name); //stampa il nome inserito dall'utente
    }
}