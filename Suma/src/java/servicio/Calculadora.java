/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jesus Bayona
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {

    /**
     * This is a sample web service operation
     * @param numeroUno
     * @param numeroDos
     */
    @WebMethod(operationName = "sumarNumeros")
    public int sumarNumeros(@WebParam(name = "numeroUno") int numeroUno, @WebParam(name = "numeroDos") int numeroDos ) {
        int resultado;
        resultado = numeroUno + numeroDos;
        return resultado;
    }
}
