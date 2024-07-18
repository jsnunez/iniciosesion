package com.vuelos.application;

import java.sql.SQLException;

import com.vuelos.domain.Service.menuService;

public class inisiarsesion {
    private final menuService menuService;

    public inisiarsesion(com.vuelos.domain.Service.menuService menuService) {
        this.menuService = menuService;
    }

    
    public void execute() throws SQLException {
     
        menuService.inciarSesion();
     
    }
}
