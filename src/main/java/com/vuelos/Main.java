package com.vuelos;

import javax.swing.*;

import com.vuelos.application.inisiarsesion;
import com.vuelos.domain.Service.menuService;
import com.vuelos.infraestructure.menuRepository;
import com.vuelos.infraestructure.menuUI;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
menuService menuService =new menuRepository();
inisiarsesion findUser =new inisiarsesion(menuService);
        menuRepository menuRepository = new menuRepository();
        menuRepository.conexion();


menuUI menuUI =new menuUI();
menuUI.mostrarMenu();
    }
}