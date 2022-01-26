public interface Radio {
boolean encenderApagar();
String guardarEmisoraActual(int numBoton);
String seleccionarEmisoraGuardada(int numBoton);
String cambiarSenal(int opcion);
void subirEmisora();
void bajarEmisora();
float getEmisoraActual();
boolean comprobarEncendida();
}
