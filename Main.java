/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
import java.io.*;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Calculadora main = new Calculadora();
        File opera = new File(System.getProperty("user.dir")+"\\"+"prueba.txt");
        FileReader leer = new FileReader(opera);
        BufferedReader buff = new BufferedReader(leer);
        Scanner sc = new Scanner(System.in);
        String linea;
        while((linea = buff.readLine()) != null){
          System.out.println(linea);
          boolean x = true;
                        while(x){
                            System.out.println("MENU");
                            System.out.println("1. Arraylist");
                            System.out.println("2. Vector");
                            System.out.println("3. Lista Single");
                            System.out.println("4. Lista Doble");
                            System.out.println("5. Lista Circular");
                            System.out.println("6. Salir");
                            int ope =  sc.nextInt();
                            if((ope<1)||(ope>6)){  //Opcion de validacion
                                System.out.println("Error");
                            }else
                            if(ope==6){   //Opcion si quiere salir del programa
                                x = false;
                            }else{    //Opcion si eligio alguna de las opciones
                                switch (ope) {
                                    case 1:
                                        {
                                            System.out.println("Respuesta: " + main.calcular(linea,"1") + "\n");            
                                        }
                                    case 2:
                                        {
                                            System.out.println("Respuesta: " + main.calcular(linea,"2") + "\n");      
                                        }
                                    case 3:
                                        {
                                            System.out.println("Respuesta: " + main.calcular(linea,"3") + "\n");                
                                        }
                                    case 4:
                                    {
                                        System.out.println("Respuesta: " + main.calcular(linea,"4") + "\n");      
                                    }
                                    case 5:
                                    { 
                                       System.out.println("Respuesta: " + main.calcular(linea,"5") + "\n");                
                                        
                                    }
                                

        
        
        
                                     }
    
                            }
                        }
            }
    }
}
