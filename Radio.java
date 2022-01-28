public interface Radio {
  public void encenderApagar(); //cambia el estado encendido/apagado
  public String guardarEmisoraActual(int numBoton); //guarda la emisora como favorita en el botón indicado (array de 12 espacios).
  public String seleccionarEmisoraGuardada(int numBoton); //reproduce la emisora guardada en uno de los 12 botones.
  public String cambiarSenal(Boolean opcion); //true: AM //false: FM
  public Boolean getTipoSenal(); //true: AM //false: FM
  public void subirEmisora(); //aumenta la emisora actual en 0.2 si la señal actual es FM, o en 10 si es AM
  public void bajarEmisora(); //disminuye la emisora actual en 0.2 si la señal actual es FM, o en 10 si es AM
  public float getEmisoraActual(); //obtiene la emisora actual
  public boolean comprobarEncendida(); //true: encendida, false: apagada
}
