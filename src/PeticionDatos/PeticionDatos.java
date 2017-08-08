/*
Esto es un comentario
*/

package PeticionDatos;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

/**
 * @author DiegoYandun
 */
public class PeticionDatos extends MIDlet {
    public Display pantalla;
    public Form frmDatos;
    public TextField txtNombre, txtApe, txtTel;
    
    public void startApp() {
        pantalla = Display.getDisplay(this);
        frmDatos = new Form("Peticion de Datos");
        txtNombre = new TextField("Nombre", "", 20, TextField.ANY);
        txtApe = new TextField("Apellidos","",20,TextField.ANY);
        //Any permite escribir campos de texto
        txtTel = new TextField("Telefono", "", 12, TextField.PHONENUMBER);
        //Agregando los componentes
        frmDatos.append(txtNombre);
        frmDatos.append(txtApe);
        frmDatos.append(txtTel);
        pantalla.setCurrent(frmDatos);
        
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
