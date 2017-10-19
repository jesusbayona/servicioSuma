package co.edu.javeriana.servicios;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class calculadora {
    public calculadora() {
        super();
    }

    @WebMethod
    public int suma (@WebParam(name = "numeroUno") int numeroUno, @WebParam(name = "numeroDos") int numeroDos){
        int resultado; 
        resultado = numeroUno + numeroDos;
        
        return resultado;
    }
}
