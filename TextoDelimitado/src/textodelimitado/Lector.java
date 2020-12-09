package textodelimitado;
import java.io.*;

public class Lector {
     public static void Escribir(PrintWriter escritor, Producto product){
         escritor.println(product.getCodigo()+product.getDescripcion()+product.getPrecio());
         
    }
     public static void Leer(File archivo,Producto[]productos){
         BufferedReader LectorBuffered=null;
         String[]entrada=new String[3];
         try{
             LectorBuffered=new BufferedReader(new FileReader(archivo));
             for(int i=0;i<3;i++){
                entrada=LectorBuffered.readLine().split("\t");
                productos[i]=new Producto(entrada[0],entrada[1],Double.parseDouble(entrada[2]));
            }
            LectorBuffered.close();
        }catch (IOException e){
            System.out.println("Hubo un error al abrir el archivo");
        }      
     }
}


