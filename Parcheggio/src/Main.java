public class Main {
    public static void main(String[] args) {
        Auto a = new Auto("AA111BB", "Alfa Romeo", "GT");
        Auto b = new Auto("CC222DD", "Porsche", "911");

        Parcheggio p = new Parcheggio("Itis Rossi");

        System.out.println(a.toString());
        System.out.println(b.toString());

        p.inserisciAuto("AA111BB", "Alfa Romeo", "GT");
        p.inserisciAuto("CC222BB", "Porsche", "911");
//        p.rimuoviAuto(a);
        System.out.println(p.trovaAuto("AA111BB"));

        p.SalvaAuto("C:\\Users\\casar\\Desktop\\Itis Rossi\\Java\\Parcheggio\\src\\SalvaAuto.txt");

    }
}
