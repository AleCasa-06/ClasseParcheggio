public class AlreadyExistingTarg extends RuntimeException{

    public AlreadyExistingTarg(){
        super("la targa esiste già");
    }

    public AlreadyExistingTarg(String targa){
        super("la targa" + targa + " esiste già");
    }

}
