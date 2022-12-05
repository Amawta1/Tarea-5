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
import javax.swing.BorderFactory;
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
public class DatoPersonal extends JFrame {
    
     public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;
    
    public DatoPersonal (String title) throws HeadlessException {
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;

    public DatoPersonal(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 600);
        this.setLocation(200, 100);
        this.setSize(500, 500);
        this.setLocation(1000, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();

        this.iniciarJPanel();
        this.iniciarJLabel();
        this.iniciarJTexTField();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarPanels() {
    public void iniciarJPanel() {
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
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(0).setLayout(new GridLayout(10, 1));
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));

        this.jPanelList.get(0).setLayout(new GridLayout(9, 1));
        this.jPanelList.get(1).setBackground(Color.CYAN);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);
        this.jPanelList.get(8).setBackground(Color.WHITE);
        this.jPanelList.get(9).setBackground(Color.WHITE);
        this.jPanelList.get(10).setBackground(Color.WHITE);

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(0).add(this.jPanelList.get(9));

   }

    public void iniciarJTextFields() {
        this.jPanelList.get(0).add(this.jPanelList.get(10));
    }
    public void iniciarJLabel() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel("Apellidos"));
        this.jLabelList.add(new JLabel("Nombre"));
        this.jLabelList.add(new JLabel("Nacionalidad"));
        this.jLabelList.add(new JLabel("Genero "));
        this.jLabelList.add(new JLabel("Correo Personal"));
        this.jLabelList.add(new JLabel("Fecha de Nacimiento "));
        this.jLabelList.add(new JLabel("Telefono Domicilio"));
        this.jLabelList.add(new JLabel("Telefono celular"));
        this.jLabelList.add(new JLabel("whatshap "));

        this.jTextFieldList = new ArrayList<>();

        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(10));
        this.jTextFieldList.add(new JTextField(10));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(10));
        this.jTextFieldList.add(new JTextField(5));



        this.jLabelList.add(new JLabel("DATOS PERSONALES"));
        this.jLabelList.get(0).setForeground(Color.white);
        this.jLabelList.get(0).setFont(new Font("Calibri", Font.PLAIN, 20));
        this.jLabelList.add(new JLabel("Apellidos:"));
        this.jLabelList.add(new JLabel("Guaman"));
        this.jLabelList.add(new JLabel("Nombres:"));
        this.jLabelList.add(new JLabel("Pepe"));
        this.jLabelList.add(new JLabel("Nacionalidad:"));
        this.jLabelList.add(new JLabel("Ecuatoriano"));
        this.jLabelList.add(new JLabel("Genero:"));
        this.jLabelList.add(new JLabel("Masculino"));
        this.jLabelList.add(new JLabel("Correo Electronico Personal:"));
        this.jLabelList.add(new JLabel("pepe@gmail.com"));
        this.jLabelList.add(new JLabel("Fecha de nacimiento:"));
        this.jLabelList.add(new JLabel("128/05/2000"));
        this.jLabelList.add(new JLabel("Telefono del domicilio:"));
        this.jLabelList.add(new JLabel("02875872"));
        this.jLabelList.add(new JLabel("Telefono  celular:"));
        this.jLabelList.add(new JLabel("0997730499"));
        this.jLabelList.add(new JLabel("Whatsapp"));

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jTextFieldList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jTextFieldList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jTextFieldList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jTextFieldList.get(3));
        this.jPanelList.get(5).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jTextFieldList.get(4));
        this.jPanelList.get(6).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jTextFieldList.get(5));
        this.jPanelList.get(7).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jTextFieldList.get(6));
        this.jPanelList.get(8).add(this.jLabelList.get(7));
        this.jPanelList.get(8).add(this.jTextFieldList.get(7));
        this.jPanelList.get(9).add(this.jLabelList.get(8));
        this.jPanelList.get(9).add(this.jTextFieldList.get(8));


        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(3).add(this.jLabelList.get(4));
        this.jPanelList.get(4).add(this.jLabelList.get(5));
        this.jPanelList.get(4).add(this.jLabelList.get(6));
        this.jPanelList.get(5).add(this.jLabelList.get(7));
        this.jPanelList.get(5).add(this.jLabelList.get(8));
        this.jPanelList.get(6).add(this.jLabelList.get(9));
        this.jPanelList.get(6).add(this.jLabelList.get(10));
        this.jPanelList.get(7).add(this.jLabelList.get(11));
        this.jPanelList.get(7).add(this.jLabelList.get(12));
        this.jPanelList.get(8).add(this.jLabelList.get(13));
        this.jPanelList.get(8).add(this.jLabelList.get(14));
        this.jPanelList.get(9).add(this.jLabelList.get(15));
        this.jPanelList.get(9).add(this.jLabelList.get(16));
        this.jPanelList.get(10).add(this.jLabelList.get(17));
    }
    public void iniciarJTexTField() {
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField(10));
        this.jPanelList.get(10).add(this.jTextFieldList.get(0));
    }

    
}
