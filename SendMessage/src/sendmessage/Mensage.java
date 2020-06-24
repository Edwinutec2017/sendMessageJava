/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendmessage;

import Interface.Base64FileRequest;
import Interface.IMensage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javafx.concurrent.Task;

/**
 *
 * @author alex
 */
public class Mensage implements IMensage{
    
        private String parametros = null;
        private String name = null;
        private String file;
        private String hostName, user, pass, cuenta, de, canal, llave;
        private List<Base64FileRequest> base64 ;
    
    public Mensage(String host, String user, String pass, String canal, String llave,String cuenta, String de){
            this.hostName = host;
            this.user = user;
            this.pass = pass;
            this.canal = canal;
            this.llave = llave;
             this.cuenta = cuenta;
            this.de = de;
    }
    

    @Override
    public Boolean AdjuntoArchivo(List<String> ubicacion) {
        Boolean resp = false;
            try {
                
            base64= new ArrayList<Base64FileRequest>();
                if (ubicacion!=null) {
                    if (ubicacion.size() > 0)
                    {
                        for (String ruta : ubicacion)
                        {
                            if (ruta != null && !"".equals(ruta)) {
                                File file = new File(ruta);
                                name = file.getName();
                                byte[] input_file = Files.readAllBytes(Paths.get(ruta));
                                byte[] encodedBytes = Base64.getEncoder().encode(input_file);
                                Base64FileRequest base= new Base64FileRequest();
                                base.FileName=name;
                                base.Base64Data=new String(encodedBytes);
                                base64.add(base);
                            }

                        }
                        resp = true;
                    }
                }
               
            }
            catch (Exception ex) {

                resp = false;
            }
          
            return resp;
    }

 

    @Override
    public Boolean ParametrosDinamicos(Object parametros) {
       Boolean resp=false;
            try
            {
            if (parametros !=null) {
                Gson gson = new Gson();
                this.parametros = gson.toJson(parametros);
                    resp = true;
                  
            }
            } catch (Exception ex) {
           
                resp = false;
            }
            return resp;
    }

    @Override
    public Boolean Correo(String asunto, List<String> para, List<String> cc) {
        
    }
    
}
