/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Carro implements Radio{
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Carro.java
    @version: 
        - Creación: 28/01/2022
        - Última modificación: 29/01/2022

    Clase que implementa la interfaz de radio 
    */

    //---------------------------PROPIEDADES-------------------------
    private boolean encendido; 
    private boolean tipoSenal; 
    private float AMactual; 
    private float FMactual; 
    private Float[] emisorasGuardadas;
    

    //---------------------------METODOS-----------------------------
    /****************************************************************
     * Carro: constructor que instancia y asigna valores iniciales a propiedades
     */
    public Carro(){
        this.encendido = false;
        this.AMactual = 530F;
        this.FMactual = 87.9F;
        this.emisorasGuardadas = new Float[12];
    }
    //****************************************************************

    /*****************************************************************
     * encenderApagar: cambia el estado encendido/apagado
     */
    public void encenderApagar() {
        this.encendido = !this.encendido;
    }
    //****************************************************************

    /*****************************************************************
     * guardarEmisoraActual: guarda la emisora en que se encuentra en un arreglo
     * @param numBoton
     * @return String
     */
    public String guardarEmisoraActual(int numBoton) {
        if (tipoSenal){
            emisorasGuardadas[numBoton-1] = AMactual;
            return "La estacion " + AMactual + " se ha guardado exitosamente en " + numBoton;
        }
        else{
            emisorasGuardadas[numBoton-1] = FMactual;
            return "La estacion " + FMactual + " se ha guardado exitosamente en " + numBoton;
        }
        
    }
    //****************************************************************

    /*****************************************************************
     * seleccionarEmisoraGuardada: Reproduce la emisora según la posicion que pida el usuario
     * @param numBoton
     * @return String
     */
    public String seleccionarEmisoraGuardada(int numBoton) {
        if (emisorasGuardadas[numBoton - 1] != null){
            float emisora = emisorasGuardadas[numBoton-1];
            if (emisora < 200F && tipoSenal)
                return "Tiene que cambiar el tipo de senal a FM";
            else if (emisora > 200F && !this.tipoSenal)
                return "Tiene que cambiar el tipo de senal a AM";
            else
                return "Reproduciendo la emisora " + emisora;
            }
            else
            return "No hay una emisora guardada";
    }
    //****************************************************************

    /*****************************************************************
     * cambiarSenal: cambia de FM a AM o viceversa
     * @param opcion
     * @return String
     */
    public String cambiarSenal(boolean opcion) {
        this.tipoSenal = opcion;
        if (opcion)
            return "Se ha cambiado a AM. Estación " + AMactual;
        else
            return "Se ha cambiado a FM. Estación " + FMactual;
    }
    //****************************************************************

    /*****************************************************************
     * getTipoSenal: retorna el tipo de senal
     * @return tipoSenal
     */
    public boolean getTipoSenal() {
        return this.tipoSenal;
    }
    //****************************************************************

    /*****************************************************************
     * subirEmisora: Sube la frecuencia 
     */
    public void subirEmisora() {
        if (this.tipoSenal) {
            this.AMactual += 10F;
            if (this.AMactual == 1620F)
                this.AMactual = 530F;
        }
        else{
            this.FMactual += 0.2F;
            if (this.FMactual > 107.9F)
                this.FMactual = 87.9F;
        }
    }
    //****************************************************************

    /*****************************************************************
     * bajarEmisora: baja la frecuencia
     */
    public void bajarEmisora() {
        if (this.tipoSenal) {
            this.AMactual -= 10F;
            if (this.AMactual == 520F)
                this.AMactual = 1610F;
        }
        else{
            this.FMactual -= 0.2F;
            if (this.FMactual < 87.9F)
                this.FMactual = 107.9F;
        }
    }
    //****************************************************************

    /*****************************************************************
     * getEmisoraActual: retorna el numero de emisora actual
     */
    public float getEmisoraActual() {
        if(tipoSenal)
            return this.AMactual;
        else
            return this.FMactual;
    }
    //****************************************************************

    /*****************************************************************
     * comprobarEncendida: retorna el estado de la radio
     */
    public boolean comprobarEncendida() {
        return this.encendido;
    }
    //****************************************************************
}