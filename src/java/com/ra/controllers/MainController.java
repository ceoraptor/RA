/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.controllers;

import java.util.HashMap;
import java.util.Map;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Center;

/**
 *
 * @author ceoraptor
 */
public class MainController extends SelectorComposer<Component>{
    
    @Wire
    Center contenido;
    
    private static final String MODULOS = "modules";
    private static final String ACTIVIDADES = "activities";
    private static final String TIPOS = "types";
    
    private HashMap<String, String> listZul;
    
    public MainController() {
        listZul = new HashMap<>();
        listZul.put(MODULOS, "/catalogos/catModulos.zul");
        listZul.put(ACTIVIDADES, "/catalogos/catActividades.zul");
        listZul.put(TIPOS, "/catalogos/catTipos.zul");
    }
    
    @Listen ("onClick = #catModulos")
    public void doCatModules() {
        openCat("Modulos", MODULOS);
    }
    @Listen ("onClick = #catActividades")
    public void doCatActivities() {
        openCat("Actividades", ACTIVIDADES);
    }
    @Listen ("onClick = #catTipos")
    public void doCatTipos() {
        openCat("Tipos", TIPOS);
    }
    
    public void openCat(String title, String catalogue) {
        contenido.getChildren().clear();
        Map arg = new HashMap();
        arg.put("title", title);
        arg.put("cat", listZul.get(catalogue));
        Executions.createComponents("/catalogos/catMain.zul", contenido, arg);
    }
}
