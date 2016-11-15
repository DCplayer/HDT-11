

/*
 * Hoja de Trabajo No 11
 * Jose Jo
 * Diego Castaneda
 * Jonathan Juarez
 * Davis Alvarez
 */
public interface Interfaz<K,E> {
    /**
     * Método para agregar etiquetas a la matriz
     */
    public void agregar(K ciudad);

    /**
     * Agregar subgrafo
     */
    public void agregarGrafo(K ciudad1, K ciudad2, E distancia);
    
    /**
     * Devuelve la etiqueta(ciudad) dependiendo de la posicion en matriz
     */
    public K get(int posicion);
    
    /**
     * Retorna la distancia
     */
    public int getD(K ciudad1, K ciudad2);
    
    /**
     * Verifica si el elemento esta en la matriz
     */
    public boolean contenido(K ciudad);
    
    /**
     *Devuelve el indice de un elemento en la matriz
     */
    public int getIndice(K ciudad);

    
    /**
     *Mostrar resultados
     */
    public void mostrar();
    
    /**
     * retorna el tamaño de la matríz
     */
    public int largo();
    
}
