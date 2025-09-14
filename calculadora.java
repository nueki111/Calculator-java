import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraJava {
    private JFrame janela;
    private JTextField display;
    private String expressao = "";

    public CalculadoraJava() {
        janela = new JFrame("Calculadora");
        janela.setSize(300, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout