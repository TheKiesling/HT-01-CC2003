/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Vista {
    /**
    @author: Jose Pablo Kiesling Lange
    @author: Emily Elvia Melissa Perez Alarcon
    Nombre del programa: Vista.java
    @version: 
        - Creacion: 28/01/2022
        - Última modificacion: 29/01/2022
    Clase que tiene como fin ser un sistema I/O para la manipulacion del programa
    */ 

    //---------------------------PROPIEDADES--------------------------
    private Scanner scan;

    //---------------------------METODOS------------------------------

    /*****************************************************************
     * constructor: instancia el scanner
     */
    public Vista(){
        scan = new Scanner(System.in);
    }
    //****************************************************************

    /*****************************************************************
     * error: captura errores y muestra el mensaje que se obtuvo
     * @param e
     */
    public void error(String s){
        System.out.println("Ha ocurrido un error : -- " + s); 
    }
    //****************************************************************

    //---------------------------MENU---------------------------------
    /*****************************************************************
     * bienvenida: imprime un mensaje de bienvenida
     */
    public void bienvenida(){
        System.out.println("\nBienvenido a su radio :)\n");
    }
    //****************************************************************

    /*****************************************************************
     * menuOpciones: despliega el menu y recibe la opcion del usuario
     * @return opcion
     * @throws Exception 
     * @throws InputMismatchException
     */
    public int menuOpciones() throws Exception, InputMismatchException{
        int opcion = -1;
        boolean bandera = false;

        try{
            //Despliegue de menú de opciones  
            System.out.println("\n\nQue desea realizar?");
            System.out.println("\n\n1. Encender/apagar el radio");
            System.out.println("2. Cambiar de frecuencia ");
            System.out.println("3. Avanzar emisora");
            System.out.println("4. Retroceder emisora");
            System.out.println("5. Guardar emisora");
            System.out.println("6. Elegir emisora");
            System.out.println("7. Salir\n\n");

            while (!bandera){ //Ciclo para evaluar si se ingresó una opcion válida
                opcion = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (opcion > 0 && opcion <= 8) //Opciones válidas
                    bandera = true;
                else{ 
                    System.out.println("ERROR: Ingrese una de las opciones indicadas anteriormente"); 
                }
            }
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversion con scan.nextInt() " + opcion + ": " + e.toString(); 
            throw new InputMismatchException(s);
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrio un error con scan.nextInt() " +  opcion + ": " + e.toString();
            throw new Exception(s);
        }
        return opcion;
    }
    //****************************************************************

    /*****************************************************************
     * despedida: imprime un mensaje de despedida
     */
    public void despedida(){
        System.out.println("\nVuelva pronto a escuchar buenas rolitas");
    }
    //****************************************************************

    /*****************************************************************
     * botones: despliega los botones de la radio
     * @return opcion
     * @throws Exception 
     * @throws InputMismatchException
     */
    public int botones() throws Exception, InputMismatchException{
        int opcion = -1;
        boolean bandera = false;

        try{
            //Despliegue de menú de opciones de búsqueda  
            System.out.println("\n\nElija el numero de boton");
            System.out.println("\n\nBoton 1");
            System.out.println("Boton 2");
            System.out.println("Boton 3");
            System.out.println("Boton 4");
            System.out.println("Boton 5");
            System.out.println("Boton 6");
            System.out.println("Boton 7");
            System.out.println("Boton 8");
            System.out.println("Boton 9");
            System.out.println("Boton 10");
            System.out.println("Boton 11");
            System.out.println("Boton 12\n\n");

            while (!bandera){ //Ciclo para evaluar si se ingresó una opcion válida
                opcion = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (opcion > 0 && opcion <= 12) //Opciones válidas
                    bandera = true;
                else{ 
                    System.out.println("ERROR: Ingrese una de las opciones indicadas anteriormente"); 
                }
            }
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + opcion + ": " + e.toString(); 
            throw new InputMismatchException(s);
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  opcion + ": " + e.toString();
            throw new Exception(s);
        }
        return opcion;
    }
    //****************************************************************

    /*****************************************************************
     * pedirBoton: pide el numero de boton
     * @return numBoton
     * @throws Exception
     * @throws InputMismatchException
     */
    public int pedirBoton() throws Exception, InputMismatchException{
        int numBoton = 0;
        boolean bandera = false;

        try{
            System.out.println("Ingrese el numero de boton");
        
            while (!bandera){
                numBoton = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (numBoton > 0 && numBoton <= 12) //Verificar si los samples son validos
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un tamano de valido"); 
            }
            
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + numBoton + ": " + e.toString(); 
            throw new InputMismatchException(s);

        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  numBoton + ": " + e.toString();
            throw new Exception(s);
        }
        return numBoton;
    }
    //****************************************************************

    /*****************************************************************
     * salida: Imprime un texto en pantalla
     * @param texto
     */
    public void salida(String texto){
        System.out.println(texto);
    }
    //****************************************************************
}
