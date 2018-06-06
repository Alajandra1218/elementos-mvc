package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosMvcApplication implements CommandLineRunner{

    @Autowired ServicioTarjeta servicio;
    @Autowired RepositorioMensaje repoMensaje;
    
	public static void main(String[] args) {
		SpringApplication.run(ElementosMvcApplication.class, args);
                
                
	}

    @Override
    public void run(String... args) throws Exception {
     
        //servicio.obtenerSaldo().obtenerSaldo();
        //LocalDate fecha=LocalDate.now();
        //repoMensaje.save(new Mensaje("hola",fecha,"cerdito"));
        
        //2)BUSCAR TODOS LOS MENSAJES YA
        
        /*for(Mensaje mensa: repoMensaje.findAll()){
            System.out.println(mensa);
        }*/
        
        //3)BUSCAR MENSAJE POR ID
        //System.out.println(repoMensaje.findByCuerpo("cerdito"));
        //System.out.println(repoMensaje.findById("5b08c8811d021019cc3843c2").get());
        
        //4)ACTUALIZAR
        
        //5)BORRAR
        /*Mensaje m=new Mensaje();
        m.setId("hola");
        repoMensaje.delete(m);*/
       
    }
}
