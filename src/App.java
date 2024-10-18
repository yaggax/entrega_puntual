import com.coti.tools.Esdia;
import clases.Almacen;

public class App {
    public static void main(String[] args) throws Exception {

        
        
        float totalp,totall;
        int opcion,i=0,j,velocidad=0;
        Almacen almacen = new Almacen();
        do{
            System.out.printf("|---------------------------------------------------|\r\n"   + //
                          "| MIS LIBROS                                        |\r\n"   + //
                          "|---------------------------------------------------|\r\n"   + //
                          "   1) Nuevo almacén de libros\r\n"                           + //
                          "   2) Establecer ritmo de lectura (páginas/minuto)\r\n"  + //
                          "   3) Añadir un nuevo libro al almacén\r\n"                  + //
                          "   4) Mostrar información actual de libros\r\n"              + //
                          "   5) Salir (se borrará toda la información)\r\n"            + //
                          "|---------------------------------------------------|");

            System.out.println();
            System.out.println();

            opcion = Esdia.readInt("Que opción desea seleccionar?\n");
            System.out.println();


            switch (opcion) {
                
                case 1:
                    almacen.setTam(Esdia.readInt("Tamaño del array de libros:   "));
                    i=0;
                    totall=0;
                    totalp=0;
                    break;
                
                case 2:
                    velocidad = Esdia.readInt("Velocidad de lectura:  ");
                    break;
                
                case 3:
                    if(i>=almacen.getTam()){
                        System.out.println("No queda espacio en el almacen.");
                        break;
                    }
                    almacen.libros[i].a1.setNombre(Esdia.readString("Nombre del autor:   "));
                    almacen.libros[i].a1.setApellidos(Esdia.readString("Apellidos del autor:   "));
                    almacen.libros[i].a1.setPremio(Esdia.yesOrNo("Tiene algún premio planeta:    "));
                    almacen.libros[i].setTitulo(Esdia.readString("Titulo del libro:    "));

                    //UTILIZANDO FUNCION ESDIA, pero nos hace poner un minimo el cual es complicado de determinar
                    //almacen.libros[i].setAño(Esdia.readInt("Año del libro:  ",-4000,2025));

                    do{
                        almacen.libros[i].setAño(Esdia.readInt("Año del libro(<2025):  "));
                    }while(almacen.libros[i].getAño()>2024);
                    do{
                        almacen.libros[i].setNumPag(Esdia.readInt("Numero de paginas del libro(>0):     "));
                    }while(almacen.libros[i].getNumPag()<=0);
                    do{
                        almacen.libros[i].setPrecio(Esdia.readFloat("Precio del libro(>0):      "));
                    }while(almacen.libros[i].getPrecio()<0);
                    ++i;
                    break;

                case 4:
                    totall=0;
                    totalp=0;
                    System.out.printf("-----------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                                "| LIBROS EN EL ALMACÉN                                                                                                  |\r\n" + //
                                                "|-----------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                                "|  Título   |  Año Publicación|       Autor       |  Premio planeta   |  Páginas  |   Tiempo lectura minutos  |  Precio |\r\n" + //
                                                "|-----------------------------------------------------------------------------------------------------------------------|\n");
                    for(j=0;j<i;j++){
                        System.out.printf("|  %s  |    %d    |  %s %s  |     %s    |    %d    |    %d   |    %.2f€   |\n",almacen.libros[j].getTitulo(),almacen.libros[j].getAño(),almacen.libros[j].a1.getNombre(),almacen.libros[j].a1.getApellidos(),almacen.libros[j].a1.getPremio() ? "Si" : "No",almacen.libros[j].getNumPag(),almacen.libros[j].getNumPag()*velocidad,almacen.libros[j].getPrecio());
                        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|\n");
                        totall+=(almacen.libros[j].getNumPag()*velocidad);
                        totalp+=almacen.libros[j].getPrecio();
                    }
                    System.out.printf("| Tiempo de lectura total del almacén:       %f min |\r\n",totall);
                    System.out.printf("| Valor total del almacén:                   %.2f € |\r\n",totalp);
                    System.out.printf("|-----------------------------------------------------------------------------------------------------------------------\n");
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opcion no válida.");
                    break;
            }
            
        }while(opcion!=5);
        System.out.println("Saliendo del programa...");

    }
    
    
}
