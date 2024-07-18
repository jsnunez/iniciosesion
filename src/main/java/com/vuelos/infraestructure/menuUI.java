package com.vuelos.infraestructure;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class menuUI  {



    public String mostrarMenu() {
    ArrayList<String> tiposUsuario = new ArrayList<>();
        tiposUsuario.add("Cliente");
        tiposUsuario.add("Empleado");
        JComboBox<String> comboBoxTipoUser = new JComboBox<>(tiposUsuario.toArray(new String[0]));

        JPanel panelTipoUser = new JPanel(new GridLayout(0, 1));
        panelTipoUser.add(new JLabel("Seleccione tipo usuario:"));
        panelTipoUser.add(comboBoxTipoUser);

        String tipousuario="";
        int resultTipo = JOptionPane.showConfirmDialog(null, panelTipoUser, "Tipo Usuario",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (resultTipo == JOptionPane.OK_OPTION) {
                    tipousuario= (String) comboBoxTipoUser.getSelectedItem();    
      }
      return tipousuario;

    }

    public void menuObtenerDatos() {
        ArrayList<String> tipoDocumento = new ArrayList<>();
        tipoDocumento.add("Cliente");
        tipoDocumento.add("Empleado");
    JPanel panel = new JPanel(new GridLayout(0, 2));
    panel.add(new JLabel("Seleccione tipo documento:"));
    panel.add(new JTextField());
    panel.add(new JLabel("Ingrese numero documento: "));
    panel.add(new JTextField());

    panel.add(new JLabel("Ingrese password: "));
    panel.add(new JTextField());

    int result = JOptionPane.showConfirmDialog(null, panel, "inicio de sesion",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
}}
