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
    @author: José Pablo Kiesling Lange
    @author: 
    Nombre del programa: Vista.java
    @version: 
        - Creación: 28/01/2021
        - Última modificación: 

    Clase que tiene como fin ser un sistema I/O para la manipulación del programa
    */ 

    //---------------------------PROPIEDADES--------------------------
    private Scanner scan;

    //---------------------------MÉTODOS------------------------------

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

    //---------------------------MENÚ---------------------------------
    /*****************************************************************
     * bienvenida: imprime un mensaje de bienvenida
     */
    public void bienvenida(){
        System.out.println("\n");
    }
    //****************************************************************

    /*****************************************************************
     * menuOpciones: despliega el menú y recibe la opción del usuario
     * @return opcion
     * @throws Exception 
     * @throws InputMismatchException
     */
    public int menuOpciones() throws Exception, InputMismatchException{
        int opcion = -1;
        boolean bandera = false;

        try{
            //Despliegue de menú de opciones  
            System.out.println("\n\nMano, ¿que opcion va a querer realizar?");
            System.out.println("\n\n1. Publicar Post");
            System.out.println("2. Ver los post");
            System.out.println("3. Salir\n\n");

            while (!bandera){ //Ciclo para evaluar si se ingresó una opcion válida
                opcion = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (opcion > 0 && opcion <= 3) //Opciones válidas
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
     * despedida: imprime un mensaje de despedida
     */
    public void despedida(){
        System.out.println("\nOraleMano, espero vuelva pronto a realizar posts por mensajitos");
    }
    //****************************************************************

    /*****************************************************************
     * menuOpcionesBusqueda: despliega el menú de búsqueda y recibe la opción del usuario
     * @return opcion
     * @throws Exception 
     * @throws InputMismatchException
     */
    public int menuOpcionesBusqueda() throws Exception, InputMismatchException{
        int opcion = -1;
        boolean bandera = false;

        try{
            //Despliegue de menú de opciones de búsqueda  
            System.out.println("\n\nMano, ¿bajo que criterio desea hacer su busqueda?");
            System.out.println("\n\n1. Fecha de publicacion");
            System.out.println("2. Hashtag\n\n");

            while (!bandera){ //Ciclo para evaluar si se ingresó una opcion válida
                opcion = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (opcion > 0 && opcion <= 2) //Opciones válidas
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
     * menuOpcionesInteraccion: despliega el menú de interaccion y recibe la opción del usuario
     * @return opcion
     * @throws Exception 
     * @throws InputMismatchException
     */
    public int menuOpcionesInteraccion() throws Exception, InputMismatchException{
        int opcion = -1;
        boolean bandera = false;

        try{
            //Despliegue de menú de opciones  
            System.out.println("\n\nMano, ¿como desea interactuar con los post?");
            System.out.println("\n\n1. Reproducir");
            System.out.println("2. Dar like");
            System.out.println("3. Comentar\n\n");

            while (!bandera){ //Ciclo para evaluar si se ingresó una opcion válida
                opcion = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (opcion > 0 && opcion <= 3) //Opciones válidas
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
     * menuOpcionesPost: despliega el menú de tipos de post y recibe la opción del usuario
     * @return opcion
     * @throws Exception 
     * @throws InputMismatchException
     */
    public int menuOpcionesPost() throws Exception, InputMismatchException{
        int opcion = -1;
        boolean bandera = false;

        try{
            //Despliegue de menú de opciones  
            System.out.println("\n\nMano, ¿que tipo de post desea publicar?");
            System.out.println("\n\n1. Texto");
            System.out.println("2. Multimedia");
            System.out.println("3. Emoticon\n\n");

            while (!bandera){ //Ciclo para evaluar si se ingresó una opcion válida
                opcion = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (opcion > 0 && opcion <= 3) //Opciones válidas
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
     * menuOpcionesMultimedia: despliega el menú de tipos de multimedia y recibe la opción del usuario
     * @return opcion
     * @throws Exception 
     * @throws InputMismatchException
     */
    public int menuOpcionesMultimedia() throws Exception, InputMismatchException{
        int opcion = -1;
        boolean bandera = false;

        try{
            //Despliegue de menú de opciones  
            System.out.println("\n\nMano, ¿que tipo de multimedia desea publicar?");
            System.out.println("\n\n1. Audio");
            System.out.println("2. Imagen");
            System.out.println("3. Video\n\n");

            while (!bandera){ //Ciclo para evaluar si se ingresó una opcion válida
                opcion = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (opcion > 0 && opcion <= 3) //Opciones válidas
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
     * pedirUsuario: pide el Usuario que hará el post
     * @return usuario
     * @throws Exception
     */
    public String pedirUsuario() throws Exception{
        String usuario = "";
        try{
            System.out.println("Mano, ingrese su usuario");
            usuario = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  usuario + ": " + e.toString();
            throw new Exception(s);
        }
        return usuario;
    }
    //****************************************************************

    /*****************************************************************
     * pedirFecha: pide la fecha de publicación del post
     * @return fecha
     * @throws Exception
     */
    public String pedirFecha() throws Exception{
        String fecha = "";
        
        try{
            System.out.println("Mano, ingrese la fecha de publicacion del post (dd/mm/aaaa)");
            fecha = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  fecha + ": " + e.toString();
            throw new Exception(s);
        }
        return fecha;
    }
    //****************************************************************

    /*****************************************************************
     * pedirFechaBuscar: pide la fecha de publicación que quiere buscar del post
     * @return fecha
     * @throws Exception
     */
    public String pedirFechaBuscar() throws Exception{
        String fecha = "";
        
        try{
            System.out.println("Mano, ingrese la fecha de publicacion del post que quiere buscar (dd/mm/aaaa)");
            fecha = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  fecha + ": " + e.toString();
            throw new Exception(s);
        }
        return fecha;
    }
    //****************************************************************

    /*****************************************************************
     * pedirHashtagBuscar: pide el hashtag que quiere buscar
     * @return hashtag
     * @throws Exception
     */
    public String pedirHashtagBuscar() throws Exception{
        String hashtag = "";
        
        try{
            System.out.println("Mano, ingrese el hashtag de las publicaciones que quiere buscar");
            hashtag = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  hashtag + ": " + e.toString();
            throw new Exception(s);
        }
        return hashtag;
    }
    //****************************************************************

    /*****************************************************************
     * pedirHora: pide la hora de publicación del post
     * @return hora
     * @throws Exception
     */
    public String pedirHora() throws Exception{
        String hora = "";
        
        try{
            System.out.println("Mano, ingrese la hora de publicacion del post (hh:mm)");
            hora = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  hora + ": " + e.toString();
            throw new Exception(s);
        }
        return hora;
    }
    //****************************************************************

    /*****************************************************************
     * pedirTexto: pide el texto que tendrá el post
     * @return texto
     * @throws Exception
     */
    public String pedirTexto() throws Exception{
        String texto = "";
        boolean bandera = false;

        try{
            System.out.println("Mano, ingrese el texto del post que desea publicar (maximo 20 caracteres)");
            while (!bandera){ 
                texto = scan.nextLine();
                System.out.println();
                if (texto.length() <= 20) //Si la extensión es admitida
                    bandera = true;
                else 
                    System.out.println("ERROR: Extension invalida"); 
            }
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  texto + ": " + e.toString();
            throw new Exception(s);
        }
        return texto;
    }
    //****************************************************************

    /*****************************************************************
     * pedirPost: pide el número de post al que quiere reaccionar
     * @return post
     * @throws Exception
     * @throws InputMismatchException
     */
    public int pedirPost() throws Exception, InputMismatchException{
        int post = 0;
        boolean bandera = false;

        try{
            System.out.println("Mano, ingrese el numero de post mostrado en pantalla al que quiere reaccionar");
        
            while (!bandera){ //Ciclo para evaluar si se ingresó un número de post correcto
                post = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (post >= 0) //Verificar si el número es válido
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un numero de post valido"); 
            }
            
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + post + ": " + e.toString(); 
            throw new InputMismatchException(s);

        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  post + ": " + e.toString();
            throw new Exception(s);
        }
        return post;
    }
    //****************************************************************

    /*****************************************************************
     * pedirHashtag: pide los hashtags que tendrá el post
     * @return texto
     * @throws Exception
     */
    public String pedirHashtags() throws Exception{
        String hashtag = "";
        boolean bandera = false;
        try{
            while (!bandera){ 
                System.out.println("Mano, ingrese los hashtags que tendra su post (no tiene que poner #)");
                hashtag += scan.nextLine() + "#";
                System.out.println();
                System.out.println("Mano, ¿desea ingresar otro hashtag? (Si/No)");
                if (scan.nextLine().toLowerCase().equals("no")) 
                    bandera = true;
                System.out.println();
            }
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  hashtag + ": " + e.toString();
            throw new Exception(s);
        }
        return hashtag;
    }
    //****************************************************************

    /*****************************************************************
     * pedirURL: pide la URL del contenido multimedia que quiere publicar
     * @return url
     * @throws Exception
     */
    public String pedirURL() throws Exception{
        String url = "";
        
        try{
            System.out.println("Mano, ingrese la URL del contenido multimedia");
            url = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  url + ": " + e.toString();
            throw new Exception(s);
        }
        return url;
    }
    //****************************************************************

    /*****************************************************************
     * pedirTamano: pide el tamano del contenido multimedia
     * @return tamano
     * @throws Exception
     * @throws InputMismatchException
     */
    public int pedirTamano() throws Exception, InputMismatchException{
        int tamano = 0;
        boolean bandera = false;

        try{
            System.out.println("Mano, ingrese el tamano del contenido multimedia en kB");
        
            while (!bandera){
                tamano = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (tamano > 0) //Verificar si el tamano es válido
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un tamano de valido"); 
            }
            
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + tamano + ": " + e.toString(); 
            throw new InputMismatchException(s);

        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  tamano + ": " + e.toString();
            throw new Exception(s);
        }
        return tamano;
    }
    //****************************************************************

    /*****************************************************************
     * pedirFormato: pide el formato de la imagen que quiere publicar
     * @return formato
     * @throws Exception
     */
    public String pedirFormato() throws Exception{
        String formato = "";
        
        try{
            System.out.println("Mano, ingrese el formato de la imagen");
            formato = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  formato + ": " + e.toString();
            throw new Exception(s);
        }
        return formato;
    }
    //****************************************************************

    /*****************************************************************
     * pedirResolucion: pide la resolucion de la imagen
     * @return resolucion
     * @throws Exception
     * @throws InputMismatchException
     */
    public int pedirResolucion() throws Exception, InputMismatchException{
        int resolucion = 0;
        boolean bandera = false;

        try{
            System.out.println("Mano, ingrese la resolucion de la imagen en megapixeles");
        
            while (!bandera){
                resolucion = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (resolucion > 0) //Verificar si el tamano es válido
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un tamano de valido"); 
            }
            
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + resolucion + ": " + e.toString(); 
            throw new InputMismatchException(s);

        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  resolucion + ": " + e.toString();
            throw new Exception(s);
        }
        return resolucion;
    }
    //****************************************************************

    /*****************************************************************
     * pedirSampleRate: pide los samples por segundo del audio
     * @return sampleRate
     * @throws Exception
     * @throws InputMismatchException
     */
    public int pedirSampleRate() throws Exception, InputMismatchException{
        int sampleRate = 0;
        boolean bandera = false;

        try{
            System.out.println("Mano, ingrese los samples por segundo del audio en kHz");
        
            while (!bandera){
                sampleRate = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (sampleRate > 0) //Verificar si los samples son validos
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un tamano de valido"); 
            }
            
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + sampleRate + ": " + e.toString(); 
            throw new InputMismatchException(s);

        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  sampleRate + ": " + e.toString();
            throw new Exception(s);
        }
        return sampleRate;
    }
    //****************************************************************

    /*****************************************************************
     * pedirBitDelph: pide los bits del audio
     * @return bitDelph
     * @throws Exception
     * @throws InputMismatchException
     */
    public int pedirbitDelph() throws Exception, InputMismatchException{
        int bitDelph = 0;
        boolean bandera = false;

        try{
            System.out.println("Mano, ingrese los bit del audio");
        
            while (!bandera){
                bitDelph = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (bitDelph > 0) //Verificar si los bits son validos
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un tamano de valido"); 
            }
            
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + bitDelph + ": " + e.toString(); 
            throw new InputMismatchException(s);

        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  bitDelph + ": " + e.toString();
            throw new Exception(s);
        }
        return bitDelph;
    }
    //****************************************************************

    /*****************************************************************
     * pedirFrameRate: pide los frames por segundo del audio
     * @return frameRate
     * @throws Exception
     * @throws InputMismatchException
     */
    public int pedirFrameRate() throws Exception, InputMismatchException{
        int frameRate = 0;
        boolean bandera = false;

        try{
            System.out.println("Mano, ingrese los frames por segundo del audio en kHz");
        
            while (!bandera){
                frameRate = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (frameRate > 0) //Verificar si los frames son validos
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un tamano de valido"); 
            }
            
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + frameRate + ": " + e.toString(); 
            throw new InputMismatchException(s);

        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  frameRate + ": " + e.toString();
            throw new Exception(s);
        }
        return frameRate;
    }
    //****************************************************************

    /*****************************************************************
     * pedirEmoticon: pide el emoticón que quiere realizar el usuario
     * @return emoticon
     * @throws Exception
     * @throws InputMismatchException
     */
    public String pedirEmoticon() throws Exception{
        String emoticon = "";
        
        try{
            System.out.println("Mano, ingrese el emoticon que quiere publicar");
            emoticon = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  emoticon + ": " + e.toString();
            throw new Exception(s);
        }
        return emoticon;
    }
    //****************************************************************

    /*****************************************************************
     * ingreso: verifica al usuario si se pudo realizar el post
     * @param ingreso
     */
    public void ingreso(boolean ingreso){
        if (ingreso)
            System.out.println("Post publicado correctamente");
        else
            System.out.println("Ha ocurrido un error. Intentarlo más tarde");
    }
    //****************************************************************

    /*****************************************************************
     * busqueda: muestra todos los posts que cumplen con el criterio de busqueda que pidió el usuario
     * @param posts
     */
    public void busqueda(String posts){
        System.out.println(posts);
    }
    //****************************************************************

    /*****************************************************************
     * 
     * @param reaccion
     */
    public void reaccion(boolean reaccion){
        if (reaccion)
            System.out.println("Su reaccion se ha procesado correctamente");
        else
            System.out.println("Ha ocurrido un error. Intentarlo más tarde");
    }
    //****************************************************************

}
