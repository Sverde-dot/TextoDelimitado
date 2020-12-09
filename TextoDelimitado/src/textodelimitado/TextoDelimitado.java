package textodelimitado;

import java.io.*;

public class TextoDelimitado {

    public static void main(String[] args) {
        PrintWriter escritor=null;
        String[] entrada=new String[3];
        Producto[] productos=new Producto[3];
        File archivo = new File ("productos.txt");
        try {
            escritor = new PrintWriter(archivo);
        }catch(IOException e){
            System.out.println("no se pudo abrir el archivo");
        }
        Producto pr1 = new Producto("cod1","parafusos",3);
        Producto pr2 = new Producto("cod2","cravos",4);
        Producto pr3 = new Producto("cod3","tachas",5);

        Lector.Escribir(escritor,pr1);
        Lector.Escribir(escritor,pr2);
        Lector.Escribir(escritor,pr3);
        escritor.close();
        Lector.Leer(archivo, productos);
        for(int i=0;i<3;i++){
            System.out.println(productos[i]);
        }
    }
}
