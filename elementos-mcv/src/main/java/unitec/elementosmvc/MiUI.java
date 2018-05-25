
package unitec.elementosmvc;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI
public class MiUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
        //Borrar lo que se genera dentro
        //Aqui va INTERFAZ DE USUARIO
        
        VerticalLayout layout=new VerticalLayout();
        Label etiqueta=new Label("Bienvenido a mi aplicación");
        etiqueta.addStyleName(ValoTheme.LABEL_H2);
        
        Button boton=new Button("Ingresar");
        boton.addStyleName(ValoTheme.BUTTON_DANGER);
        
        //AGREGAMOS ETIQUETA Y BOTÓN A EL LAYOUT
        layout.addComponent(etiqueta);
        layout.addComponent(boton);
        
        //FINALMENTE AGREGAMOS EL LAYOUT AL CONTENEDOR PRINCIPAL DE INIT
        setContent(layout);
        
           
        
        
    }
    
    
    
}
