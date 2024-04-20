public class Laptop extends Articulo {

    String idiomaTeclado;
    String sistemaOperativo;

    public Laptop(Articulo articulo, String idiomaTeclado, String sistemaOperativo) {
        super(articulo);
        this.idiomaTeclado = idiomaTeclado;
        this.sistemaOperativo = sistemaOperativo;
    }


    public Laptop() {
    }

    public String getIdiomaTeclado() {
        return idiomaTeclado;
    }

    public void setIdiomaTeclado(String idiomaTeclado) {
        this.idiomaTeclado = idiomaTeclado;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String obtenerDescripcion(String descripcion) {
        return descripcion;
    }

    public float obtenerPrecio(float precio) {
        return precio;
    }
}
