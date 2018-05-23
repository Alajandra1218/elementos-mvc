/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author T-107
 */
 @SpringUI
public class MiUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
       //interfaz de usuario
        VerticalLayout  Layout=new VerticalLayout();
        Label etiqueta=new Label("BIENVENIDO A MI APLICACION");
       etiqueta.addStyleName(ValoTheme.LABEL_H2);
       Button boton=new Button("Ingresar");
       boton.addStyleName(ValoTheme.BUTTON_DANGER);
       Layout.addComponent(etiqueta);
       Layout.addComponent(boton);
        setContent(Layout);
        
    }
       
        
                
                
                
    }
    

