/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject7;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author amawt
 */
public class InformacionCarrera extends JFrame{
    
    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private List<JButton> jButtonList;
    private List<JTextField> jTextFieldsList;
    private List<JComboBox> jComboBoxList;


    public InformacionCarrera(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 600);
        this.setLocation(200, 100);
        this.setSize(400, 400);
        this.setLocation(500, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();
        this.iniciarJButtons();
        this.iniciarCombos();
        this.iniciarJPanel();
        this.iniciarJLabel();
        this.iniciarJComboBox();
        this.iniciarJButton();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarPanels() {

        this.jPanelList = new ArrayList<>();

        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.BLACK);
        this.jPanelList.get(0).setLayout(new GridLayout(8, 1));
        this.jPanelList.get(1).setBackground(Color.CYAN);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);
        this.jPanelList.get(8).setBackground(Color.WHITE);

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
         this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(0).add(this.jPanelList.get(8));

    }

    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("INFORMACION DE LA CARRERA"));
        jLabelList.get(0).setForeground(Color.white);
        this.jLabelList.get(0).setFont(new Font("Calibri", Font.PLAIN, 20));
        this.jLabelList.add(new JLabel("Periodo Academico:"));
        this.jLabelList.add(new JLabel("2022-2023"));
        this.jLabelList.add(new JLabel("Carrera:"));
        this.jLabelList.add(new JLabel("Modalidad:"));
        this.jLabelList.add(new JLabel("Sede:"));
        this.jLabelList.add(new JLabel("Jornada:"));
        this.jLabelList.add(new JLabel("Fecha de registro:"));
        this.jLabelList.add(new JLabel("5/12/2022"));

        this.jLabelList.add(new JLabel("Periodo academico"));
        this.jLabelList.add(new JLabel("Carrera "));
        this.jLabelList.add(new JLabel("Modalidad "));
        this.jLabelList.add(new JLabel("Sede "));
        this.jLabelList.add(new JLabel("Campus"));
        this.jLabelList.add(new JLabel("Jornada"));
        this.jLabelList.add(new JLabel("Fecha de registro"));
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField(5));
        /*this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(10));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(10));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(5));*/
        this.jTextFieldList.add(new JTextField(5));
        this.jPanelList.get(1).add(this.jLabelList.get(0));

        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        this.jPanelList.get(7).add(this.jLabelList.get(8));

        this.jPanelList.get(3).add(this.jLabelList.get(2));

        this.jPanelList.get(4).add(this.jLabelList.get(3));

        this.jPanelList.get(5).add(this.jLabelList.get(4));

        this.jPanelList.get(6).add(this.jLabelList.get(5));

        this.jPanelList.get(7).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jTextFieldList.get(6));
    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();

        this.jButtonList.add(new JButton("Siguiente"));

        this.jPanelList.get(8).add(this.jButtonList.get(0));

    }

    public void iniciarCombos() {
        this.jComboBoxList = new ArrayList<>();
        var PerAcademico = new String[1];
        PerAcademico[0] = "2021-2022";
        PerAcademico[1] = "2022-2023";

        var carrera = new String[3];
        carrera[0] = "Computacion";
        carrera[1] = "Ing.Automotriz";
        carrera[2] = "Psicologia";

        var modalidad = new String[3];
        carrera[0] = "Hibrida";
        carrera[1] = "En linea";
        carrera[2] = "Presencial";

        var sede = new String[3];
        carrera[0] = "Matriz Cuenca";
        carrera[1] = "Matriz Quito";
        carrera[2] = "Matriz Guayaquil";

        var campus = new String[3];
        carrera[0] = "El vecino";
        carrera[1] = "Ricaute";
        carrera[2] = "El valle";
        var jornada = new String[3];
        carrera[0] = "Matutina";
        carrera[1] = "Despertina";
        carrera[2] = "Nocturna";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(carrera)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(modalidad)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(sede)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(campus)));
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(jornada)));
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());

        this.jPanelList.get(1).add(this.jComboBoxList.get(0));
        this.jPanelList.get(2).add(this.jComboBoxList.get(1));
        this.jPanelList.get(3).add(this.jComboBoxList.get(2));
        this.jPanelList.get(4).add(this.jComboBoxList.get(3));
        this.jPanelList.get(5).add(this.jComboBoxList.get(4));
        this.jPanelList.get(6).add(this.jComboBoxList.get(5));
        this.jPanelList.get(7).add(this.jComboBoxList.get(6));


        this.jComboBoxList.get(0).addItem("Computacion");
        this.jComboBoxList.get(0).addItem("Ing. Civil");
        this.jComboBoxList.get(0).addItem("Ing. Automotriz");
        this.jComboBoxList.get(0).addItem("Veterinaria");

        this.jComboBoxList.get(1).addItem("Presencial");
        this.jComboBoxList.get(1).addItem("Virtual");
        this.jComboBoxList.get(1).addItem("Hibrida");

        this.jComboBoxList.get(2).addItem("Matriz Quito");
        this.jComboBoxList.get(2).addItem("Matriz Cuenca");
        this.jComboBoxList.get(2).addItem("Matriz Guayaquil");

        this.jComboBoxList.get(3).addItem("Matutina");
        this.jComboBoxList.get(3).addItem("Despertina");
        this.jComboBoxList.get(3).addItem("Nocturna");

        this.jPanelList.get(3).add(this.jComboBoxList.get(0));
        this.jPanelList.get(4).add(this.jComboBoxList.get(1));
        this.jPanelList.get(5).add(this.jComboBoxList.get(2));
        this.jPanelList.get(6).add(this.jComboBoxList.get(3));
    }

    public void iniciarJButton(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Siguiente"));
        this.jPanelList.get(8).add(this.jButtonList.get(0));


    }

    private void iniciarJComboBox() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void iniciarJLabel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void iniciarJPanel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
