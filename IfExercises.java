public class IfExercises {

    public static void main(String[] args) {minuscole
        boolean isOnline = true;
        String nome = "Luca";

        String nomePulito = nome.trim();
                                            
        if (nomePulito.equalsIgnoreCase("Luca")) {
            System.out.println("è Luca");
        } else if (nomePulito.equalsIgnoreCase("Marco")) {
            System.out.println("è Marco");
        } else {
            System.out.println("è qualcun altro");
        }
    }
}
