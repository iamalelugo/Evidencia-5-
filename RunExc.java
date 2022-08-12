public class RunExc {
public static void main(String[] args) {
    EdadException edExc= new EdadException();
    try{
        edExc.validarEdad(50);
        //registrar.programador(edad);
        //...

    }catch(EdadException ex){
        edExc.getMessage();
    } finally{
        //
    }
}
}