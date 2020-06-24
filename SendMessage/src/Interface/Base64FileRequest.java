/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author alex
 */
public class Base64FileRequest {

    public String getBase64Data() {
        return Base64Data;
    }

    public void setBase64Data(String Base64Data) {
        this.Base64Data = Base64Data;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String FileName) {
        this.FileName = FileName;
    }
       public String Base64Data; 
        public String FileName;
         
}
