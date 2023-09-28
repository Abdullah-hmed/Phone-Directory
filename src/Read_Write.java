
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Read_Write {
    DLL ll = new DLL();
    DLL fav = new DLL();
    File f = new File("lloutput.txt");
    
    
    public void readFile(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("lloutput.txt"));
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",",2);
                String name = parts[0];
                String num = parts[1];
                ll.insertEnd(name, num);
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void readFavFile(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("favorites.txt"));
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",",2);
                String name = parts[0];
                String num = parts[1];
                fav.insertEnd(name, num);
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
