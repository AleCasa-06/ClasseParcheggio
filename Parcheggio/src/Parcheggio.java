import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Parcheggio {
    private ArrayList<Auto> listaAuto;
    private String nome;

    public Parcheggio(String n){
        nome = n;
        listaAuto = new ArrayList<Auto>();
    }
    @Override
    public String toString() {
        return "Parcheggio{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void inserisciAuto(String t, String m, String mod){

        try {
            if(!trovaAuto(t)){
                listaAuto.add(new Auto(t, m, mod));
            }
            else{
                throw new AlreadyExistingTarg(t);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    public boolean trovaAuto(String t){
        for(Auto a : listaAuto){
            if(a.getTarga() == t){
                System.out.println("auto trovata");
                return true;
            }
        }
        System.out.println("auto NON trovata");
        return false;
    }

    public void rimuoviAuto(Auto a){
        if(listaAuto.isEmpty()){
            System.out.println("parcheggio vuoto");
        }
        else{
            listaAuto.remove(a);
        }
    }

    public boolean SalvaAuto(String path){
        try{
            FileWriter fw = new FileWriter(new File(path));
            for(Auto a : listaAuto){
                fw.write("Targa: " + a.getTarga() + "\n" + "Marca: " + a.getMarca() + "\n" + "Modello: " + a.getModello() + "\n");

            }
            fw.flush();
            fw.close();
        }
        catch(IOException e){
            e.getMessage();
            return false;
        }
        return true;
    }
}
