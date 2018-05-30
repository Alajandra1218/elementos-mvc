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
       // repoMensaje.save(new Mensaje("hola",fecha,"cerdito"));
       //2.buscar todos los mensajes ya
      
             //for(Mensaje mensa: repoMensaje.findAll())
            // {
                // System.out.println(mensa);
           //  }

       //3.Mensaje por ID

        //System.out.println(repoMensaje.findById("5b0dfe1fc4d6f30dec4e1976").get());
       //3.1 buscar por otro campo
         //  System.out.println(repoMensaje.findByCuerpo("cerdito"));
       //4.Actualizar un mensaje
       
       //5.Eliminar un mensaje
       
       // Mensaje e=new Mensaje();
       //e.setId("hola");
       
      // repoMensaje.deleteById("5b0e0055c4d6f30dec4e1978");
    }
}
