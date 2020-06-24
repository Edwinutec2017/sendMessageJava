/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;
import javafx.concurrent.Task;

/**
 *
 * @author alex
 */
public interface IMensage {
   Boolean AdjuntoArchivo(List<String> ubicacion);
   Boolean ParametrosDinamicos(Object parametros);
   Boolean Correo(String asunto, List<String> para, List<String> cc);
}
