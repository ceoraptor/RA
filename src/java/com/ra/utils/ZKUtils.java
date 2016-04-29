/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.utils;

import org.zkoss.zul.Toolbarbutton;

/**
 *
 * @author ceoraptor
 */
public class ZKUtils {
    public static Toolbarbutton createToolBarBtn(String label, String image) {
        Toolbarbutton tbBtn = new Toolbarbutton(label, image);
        return tbBtn;
    }
    public static Toolbarbutton createToolBarBtn(String image) {
        return createToolBarBtn(null, image);
    }
}
