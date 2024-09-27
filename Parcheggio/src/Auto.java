import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auto {
    private String targa;
    private String marca;
    private String modello;


    public Auto(String t, String m, String mod){
        if(Controllo(t)){
            targa = t;
            marca = m;
            modello = mod;
        }

    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
    public boolean Controllo(String targa){
        String patternTarga = "^[A-Z]{2}\\d{3}[A-Z]{2}$";
        Pattern pattern = Pattern.compile(patternTarga);
        Matcher matcher = pattern.matcher(targa);

        if(!matcher.matches()){
            throw new IllegalArgumentException("la targa: " + targa + " non è valida");
        }
        return true;
    }



}
