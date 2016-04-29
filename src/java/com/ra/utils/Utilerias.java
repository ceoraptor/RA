/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ceoraptor
 */
public class Utilerias {
    public static Properties readPropFile(String filename) {
        Properties prop = new Properties();
	InputStream input = null;
        try {
            input = Utilerias.class.getResourceAsStream(filename);
            prop.load(input);
        } catch (Exception ex) {
            Logger.getLogger(Utilerias.class.getName()).log(Level.SEVERE, "Error al leer archivo", ex);
            prop = null;
	} finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex) {
                    Logger.getLogger(Utilerias.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
	}
        return prop;
    }
    
    public static String getProperty(String key) {
        Properties prop = readPropFile("/ra.properties");
        if (prop != null) {
            return prop.getProperty(key);
        } else {
            return null;
        }
    }
}
