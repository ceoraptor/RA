/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.utils;

import java.util.Map;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.util.Initiator;
import org.zkoss.zk.ui.util.InitiatorExt;

/**
 *
 * @author ceoraptor
 */
public class InitPage implements Initiator, InitiatorExt{
    @Override
    public void doInit(Page page, Map args) throws Exception {
        Utilerias.readPropFile("/ra.properties");
    }

    @Override
    public void doAfterCompose(Page page, Component[] comps) throws Exception {
        
    }

    @Override
    public boolean doCatch(Throwable ex) throws Exception {
        return false;
    }

    @Override
    public void doFinally() throws Exception {
        
    }
    
}
