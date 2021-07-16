
package notepad;
import java.io.*;
import java.util.Date;
import java.awt.*;
import java.awt.Event;
import javax.swing.*;
import javax.swing.event.*;




public class FileOperation {
    Notepad pd;
    
    boolean saved;
    boolean newFileFlag;
    String fileName;
    String applicationTitle="note pad";
    
    File fileRef;
    JFileChooser chooser;
    
    boolean isSaved(){return saved;}
    void setSave(boolean saved){
        this.saved=saved;
    }
    String getFileName(){
        return new String(fileName);
    }
    void setFileName(String fileName){
        this.fileName=new String(fileName);
    }
    
    
    }
        
   

    
    public static void main(String[] args) {
        
    }
    
}
