/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *
 * @author ubuntu1
 */
public class RAActivityDetBean {
    
    private int ra_activitydet_id = 0;
    private boolean isactive = Boolean.FALSE;
    private Timestamp created = null;
    private int createdby = 0;
    private Timestamp updated = null;
    private int updatedby = 0;
    private Timestamp entrydate = null;
    private int ra_activities_id = 0;
    private BigDecimal hours = BigDecimal.ZERO;   
    

    public int getRa_activitydet_id() {
        return ra_activitydet_id;
    }

    public void setRa_activitydet_id(int ra_activitydet_id) {
        this.ra_activitydet_id = ra_activitydet_id;
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

    public Timestamp getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Timestamp entrydate) {
        this.entrydate = entrydate;
    }

    public int getRa_activities_id() {
        return ra_activities_id;
    }

    public void setRa_activities_id(int ra_activities_id) {
        this.ra_activities_id = ra_activities_id;
    }

    public BigDecimal getHours() {
        return hours;
    }

    public void setHours(BigDecimal hours) {
        this.hours = hours;
    }
 
    
    
}
