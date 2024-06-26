package br.com.nobanks.controller;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author Rosicléia Frasson
 */

public class DataTable extends JFrame {
    JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;

    Object [][] dados = {
        {"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com"},
        {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com"},
        {"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com"}
    };

    String [] colunas = {"Nome", "Telefone", "Email"};


    public DataTable() {
        super ("Contatos");
    }

    public void criaJanela(){

        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(1, 1));
        tabela = new JTable(dados, colunas);
        barraRolagem = new JScrollPane(tabela);
        painelFundo.add(barraRolagem);

        getContentPane().add(painelFundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
    	DataTable lc = new DataTable();
        lc.criaJanela();
    }
}