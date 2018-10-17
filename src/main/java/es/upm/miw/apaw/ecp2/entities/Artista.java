import java.util.ArrayList;


public class Artista extends Profesional {
    int idArtista;
    boolean anonimo;
    Agente suAgente;
    AgenteFactory agenteFactory;
    ArrayList<Album> susAlbumes;
    ArtistaBuilder artistaBuilder;



    public Artista(ArtistaBuilder artistaBuilder) {
        this.idArtista = artistaBuilder.getIdArtista();
        this.nombre = artistaBuilder.getNombre();
        this.pseudonimo = artistaBuilder.getPseudonimo();
        this.anonimo = artistaBuilder.isAnonimo();
        this.suAgente = artistaBuilder.getSuAgente();
        this.susAlbumes = artistaBuilder.getSusAlbumes();
    }

    public int getIdArtista() {
        return idArtista;
    }

    public Agente getSuAgente(){
        return suAgente;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public ArrayList<Album> getSusAlbumes() {
        return susAlbumes;
    }

    public void setSusAlbumes(ArrayList<Album> susAlbumes) {
        this.susAlbumes = susAlbumes;
    }

    public Boolean getAnonimo() {
        return anonimo;
    }

    public void setAnonimo(Boolean anonimo) {
        this.anonimo = anonimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }
}
