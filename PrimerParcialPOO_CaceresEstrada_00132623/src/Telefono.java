public class Telefono extends Articulo{

    int almacenamiento;
    float tamano;

    public Telefono(Articulo articulo, int almacenamiento, float tamano) {
        super(articulo);
        this.almacenamiento = almacenamiento;
        this.tamano = tamano;
    }

    public Telefono() {
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public String obtenerDescripcion(String descripcion) {
        return descripcion;
    }

    public float obtenerPrecio(float precio) {
        return precio;
    }


}
