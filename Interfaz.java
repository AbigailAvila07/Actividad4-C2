package org.example;

import java.awt.*;
import javax.swing.*;

public class Interfaz extends JFrame {

    public Interfaz() {
        setTitle("Registro de Usuario");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Nombre:"), gbc);

        JTextField txtNombre = new JTextField(20);
        gbc.gridx = 1;
        panel.add(txtNombre, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Email:"), gbc);

        JTextField txtEmail = new JTextField(20);
        gbc.gridx = 1;
        panel.add(txtEmail, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Contraseña:"), gbc);

        JPasswordField txtPassword = new JPasswordField(20);
        gbc.gridx = 1;
        panel.add(txtPassword, gbc);

        JButton btnRegistrar = new JButton("Registrar");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(btnRegistrar, gbc);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Interfaz ventana = new Interfaz();
            ventana.setVisible(true);
        });
    }
}