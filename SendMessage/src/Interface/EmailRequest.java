/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;

/**
 *
 * @author alex
 */
public class EmailRequest {

    public String getCuentaMail() {
        return CuentaMail;
    }

    public void setCuentaMail(String CuentaMail) {
        this.CuentaMail = CuentaMail;
    }

    public String getDe() {
        return De;
    }

    public void setDe(String De) {
        this.De = De;
    }

    public List<String> getPara() {
        return Para;
    }

    public void setPara(List<String> Para) {
        this.Para = Para;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public List<String> getCC() {
        return CC;
    }

    public void setCC(List<String> CC) {
        this.CC = CC;
    }

    public List<String> getCCO() {
        return CCO;
    }

    public void setCCO(List<String> CCO) {
        this.CCO = CCO;
    }

    public String getRutaArchivo() {
        return RutaArchivo;
    }

    public void setRutaArchivo(String RutaArchivo) {
        this.RutaArchivo = RutaArchivo;
    }

    public List<Base64FileRequest> getBase64Files() {
        return Base64Files;
    }

    public void setBase64Files(List<Base64FileRequest> Base64Files) {
        this.Base64Files = Base64Files;
    }

    public String getParametrosDinamicos() {
        return ParametrosDinamicos;
    }

    public void setParametrosDinamicos(String ParametrosDinamicos) {
        this.ParametrosDinamicos = ParametrosDinamicos;
    }
    
       public String CuentaMail;
        public String De; 
        public List<String> Para; 
        public String Asunto; 
        public List<String> CC; 
        public List<String> CCO; 
        public String RutaArchivo; 
        public List<Base64FileRequest> Base64Files; 
        public String ParametrosDinamicos; 
    
}

