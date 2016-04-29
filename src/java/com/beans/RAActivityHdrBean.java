/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import java.sql.Timestamp;

/**
 *
 * @author ubuntu1
 */
public class RAActivityHdrBean {

    private int ra_activityhdr_id = 0;
    private boolean isactive = Boolean.FALSE;
    private Timestamp created = null;
    private int createdby = 0;
    private Timestamp updated = null;
    private int updatedby = 0;
    private int ra_modules_id = 0;
    private int ra_type_id = 0;
    private int value = 0;
    private boolean complete = Boolean.FALSE;
    private int ra_user_id = 0;
    private int ra_client_id = 0;
    
    public int getRa_activityhdr_id() {
        return ra_activityhdr_id;
    }

    public void setRa_activityhdr_id(int ra_activityhdr_id) {
        this.ra_activityhdr_id = ra_activityhdr_id;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public int getCreatedby() {
        return createdby;
    }

    public void setCreatedby(int createdby) {
        this.createdby = createdby;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public int getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(int updatedby) {
        this.updatedby = updatedby;
    }

    public int getRa_modules_id() {
        return ra_modules_id;
    }

    public void setRa_modules_id(int ra_modules_id) {
        this.ra_modules_id = ra_modules_id;
    }

    public int getRa_type_id() {
        return ra_type_id;
    }

    public void setRa_type_id(int ra_type_id) {
        this.ra_type_id = ra_type_id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public int getRa_user_id() {
        return ra_user_id;
    }

    public void setRa_user_id(int ra_user_id) {
        this.ra_user_id = ra_user_id;
    }

    public int getRa_client_id() {
        return ra_client_id;
    }

    public void setRa_client_id(int ra_client_id) {
        this.ra_client_id = ra_client_id;
    }
    
    
    
    
    
    
}
