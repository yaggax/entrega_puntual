package clases;
import clases.Libro;


public class Almacen {

    int tam = 0,i;
    public float velocidad;
    public Libro[] libros;
    //public Libro[] libros= new Libro[tam];
    /*
     * TENER CUIDADO A LA HORA DE CREAR EL VECTOR YA QUE SI SE INICIALIZA A 0
     * PUEDE DAR A CONTINUACION ERROR DE INDEX
     */
    //public Libro libro= new Libro();
    
    public void setTam(int tam) {
        this.tam = tam;
        libros=new Libro[tam];

        for(i=0;i<tam;i++){
            libros[i]= new Libro();
            libros[i].setTitulo(null);
            libros[i].setPrecio(0);
            libros[i].setNumPag(0);
            libros[i].setAño(0);
            libros[i].a1.setNombre(null);
            libros[i].a1.setApellidos(null);
            libros[i].a1.setPremio(false);
        
    }
    }

    
    
     
}
