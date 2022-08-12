public class EdadException extends Exception {
    //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html
    public static final long serialVersionUID = 700L;
    
    public EdadException(){
        
    }
    
    public EdadException(String mensaje){
        super(mensaje);
    }

    public EdadException(int edad) throws EdadException {
        this.validarEdad(edad);
    }

    public void validarEdad(int edad) throws EdadException{
            if(!(edad>=18 && edad<=45)){
                System.out.println(" La edad capturada no pertenece al rango permitido (18 a 45 años), favor de capturar nuevamente.");
                throw new EdadException("Error de edad.");//Esta instruccion es la que lanzara el error para que la maquina virtual de java pueda
							//ver que existe una exception que necesita tratamiento de un try catch, utilizamos el constructor
							//para establecer el mensaje de error. ES LA LINEA MAS IMPORTANTE
            }
    }
}
