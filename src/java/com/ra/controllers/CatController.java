/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.controllers;

import com.ra.utils.ZKUtils;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Toolbar;
import org.zkoss.zul.Toolbarbutton;

/**
 *
 * @author ceoraptor
 */
public class CatController extends SelectorComposer<Component>{
    @Wire
    Toolbar catToolbar;
    
    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        
        catToolbar.appendChild(ZKUtils.createToolBarBtn("/images/24x24/new.png"));
        
        
        createToolbarBtn("/images/24x24/rollback.png");
        createToolbarBtn("/images/24x24/trash.png");
        createToolbarBtn("/images/24x24/save.png");
        
        createToolbarBtn("/images/24x24/first.png");
        createToolbarBtn("/images/24x24/previous.png");
        createToolbarBtn("/images/24x24/next.png");
        createToolbarBtn("/images/24x24/last.png");
        
    }
    
    private void createToolbarBtn(String image) {
        Toolbarbutton tbBtn = new Toolbarbutton("", image);
        catToolbar.appendChild(tbBtn);
    }
    
    public CatController() {
        /*Toolbarbutton btnNew = new Toolbarbutton("Nuevo");
        catToolbar.appendChild(btnNew);*/
    }
}
