public class Controlador {
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Controlador.java
    @version: 
        - Creación: 29/10/2021
        - Última modificación: 30/10/2021

    Clase que comunica el modelo con la vista y controla sus acciones
    */

    //---------------------------MÉTODOS-----------------------------
    public static void main(String[] args) throws Exception{
        Vista vista = new Vista();
        Carro carro = new Carro();

        try{
            vista.bienvenida();

            int opcion = -1;
            while (opcion != 8){
                opcion = vista.menuOpciones();

                if (opcion == 1){ //Encender o Apagar
                    carro.encenderApagar();
                    if(carro.comprobarEncendida())
                        vista.salida("Se ha encendido el radio");
                    else
                        vista.salida("Se ha apagado el radio");
                }
                if (carro.comprobarEncendida()){
                    if (opcion == 2){ //Cambiar de AM a FM
                        String cambio = carro.cambiarSenal(true);
                        vista.salida(cambio);
                    }
                    if (opcion == 3){ //Cambiar de FM a AM
                        String cambio = carro.cambiarSenal(false);
                        vista.salida(cambio);
                    }
                    if (opcion == 4){ //Avanzar emisora
                        carro.subirEmisora();
                        String emisora = carro.getEmisoraActual() + "";
                        vista.salida(emisora);
                    }
                    if (opcion == 5){ //Retroceder emisora
                        carro.bajarEmisora();
                        String emisora = carro.getEmisoraActual() + "";
                        vista.salida(emisora);
                    }
                    if (opcion == 6){ //Guardar emisora
                        int numBoton = vista.botones();
                        String grabar = carro.guardarEmisoraActual(numBoton);
                        vista.salida(grabar);
                    }
                    if (opcion == 7){ //Elegir emisora
                        int numBoton = vista.botones();
                        String emisora = carro.seleccionarEmisoraGuardada(numBoton);
                        vista.salida(emisora);
                    }
                }
                else
                    vista.salida("El radio está apagado");
                if (opcion == 8){ //Salir
                    vista.despedida();
                }
            }
        } catch (Exception e){
            String s = "ERROR: " + e.getMessage();
            vista.error(s);
        }

    }
}
