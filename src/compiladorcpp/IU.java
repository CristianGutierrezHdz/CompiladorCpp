/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package compiladorcpp;

import static compiladorcpp.Tokens.*;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

public class IU extends javax.swing.JFrame {

    public IU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaCode = new javax.swing.JTextArea();
        BtnCodeExample = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaLexico = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaAnalizar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnAnalizar = new javax.swing.JButton();
        BtnLimpiarAnalizador = new javax.swing.JButton();
        BtnAnalizarLexico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextAreaCode.setColumns(20);
        TextAreaCode.setRows(5);
        jScrollPane1.setViewportView(TextAreaCode);

        BtnCodeExample.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        BtnCodeExample.setText("Ejemplo");
        BtnCodeExample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCodeExampleActionPerformed(evt);
            }
        });

        TextAreaLexico.setColumns(20);
        TextAreaLexico.setRows(5);
        jScrollPane2.setViewportView(TextAreaLexico);

        TextAreaAnalizar.setColumns(20);
        TextAreaAnalizar.setRows(5);
        jScrollPane3.setViewportView(TextAreaAnalizar);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Script");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Analizador Lexico");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Analizador Sintactico / Semantico");

        BtnAnalizar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        BtnAnalizar.setText("Analizar");
        BtnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnalizarActionPerformed(evt);
            }
        });

        BtnLimpiarAnalizador.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        BtnLimpiarAnalizador.setText("Limpiar todo");

        BtnAnalizarLexico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        BtnAnalizarLexico.setText("Analizar");
        BtnAnalizarLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnalizarLexicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCodeExample))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAnalizarLexico)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(BtnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(BtnLimpiarAnalizador))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnCodeExample, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnAnalizarLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpiarAnalizador, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCodeExampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCodeExampleActionPerformed

        TextAreaCode.setText("int main() {\n"
                + "    int num1 = 10;\n"
                + "    string texto2 = \"Hola \";\n"
                + "\n"
                + "    do {\n"
                + "        if ( num1 > 5 ) {\n"
                + "            num1 = 2;\n"
                + "        } \n"
                + "    } while ( num1 < 5 );\n"
                + "\n"
                + "    return 0;\n"
                + "}");

    }//GEN-LAST:event_BtnCodeExampleActionPerformed

    private void BtnAnalizarLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnalizarLexicoActionPerformed

        try {
            analizadorLexico();
        } catch (IOException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAnalizarLexicoActionPerformed

    private void BtnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnalizarActionPerformed

        TextAreaAnalizar.setText("");
        String mensaje = "";
        String ST = TextAreaCode.getText();
        Sintax s = new Sintax(new compiladorcpp.LexerCup(new StringReader(ST)));

        try {
            s.parse();
            mensaje = "Sintaxis Correcta\n";
            TextAreaAnalizar.setForeground(new Color(25, 111, 61));
            if (semantico()) {
                mensaje += "Semantica Correcta";
            } else {
                mensaje += "Semantica incorrecta";
            }
        } catch (Exception ex) {
            Symbol sym = s.getS();
            mensaje = ("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            TextAreaAnalizar.setForeground(Color.red);
        }
        TextAreaAnalizar.setText(mensaje);
    }//GEN-LAST:event_BtnAnalizarActionPerformed

    public static void main(String args[]) {
        /* prueba commit*/

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IU().setVisible(true);
            }
        });
    }

    public void analizadorLexico() throws FileNotFoundException, IOException {
        String resultado = "";
        byte linea = 1;

        File fichero = new File("fichero.txt");
        PrintWriter writer;

        try {
            writer = new PrintWriter(fichero);

            writer.print(TextAreaCode.getText());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Reader reader = new BufferedReader(new FileReader("fichero.txt"));
            Lexer lexer = new Lexer(reader);

            resultado = "▄▄ LINEA ▄ 1 ▄▄▄\n";
            while (true) {
                Tokens token = lexer.yylex();
                if (token != null) {

                    switch (token) {
                        /* */
                        case TD_INT, TD_STRING, PR_DO, PR_IF, PR_WHILE, PR_RETURN, PUNTOYC, COMA, P_OPEN, P_CLOSE, LLAVES_APER, LLAVES_CIERR, IGUAL, MAYORQ, MENORQ, CADENA_CARACT, INT, FLOAT, IDENTIFICADOR, ERROR: {
                            resultado += lexer.lexeme + "\t\t" + token + "\n";
                            break;
                        }
                        /* 
                        case SALTO_DL: {
                            linea++;
                            resultado += "\n▄▄ LINEA ▄ " + linea + " ▄▄▄\n";
                            break;
                        }
                        case TD_INT, TD_STRING: {
                            resultado += "  " + lexer.lexeme + "\tPalabra reservada (definir tipos de datos)\n";
                            break;
                        }
                        case PR_DO, PR_WHILE: {
                            resultado += "  " + lexer.lexeme + "\tPalabra reservada (definir bucles)\n";
                            break;
                        }
                        case PR_IF: {
                            resultado += "  " + lexer.lexeme + "\tPalabra reservada (definir sentencias)\n";
                            break;
                        }
                        case PR_RETURN: {
                            resultado += "  " + lexer.lexeme + "\tPalabra reservada\n";
                            break;
                        }
                        case PUNTOYC, COMA, P_OPEN, P_CLOSE, LLAVES_APER, LLAVES_CIERR: {
                            resultado += "  " + lexer.lexeme + "\tSimbolo\n";
                            break;
                        }
                        case IGUAL, MAYORQ, MENORQ: {
                            resultado += "  " + lexer.lexeme + "\tOperador de comparacion\n";
                            break;
                        }
                        case CADENA_CARACT, INT, FLOAT: {
                            resultado += "  " + lexer.lexeme + "\tDato\n";
                            break;
                        }
                        case IDENTIFICADOR: {
                            resultado += "  " + lexer.lexeme + "\tIdentificador\n";
                            break;
                        }
                        case ERROR: {
                            resultado += "ERROR! CARACTER NO DEFINIDO\n";
                            break;
                        }
                        /* */
                    }

                } else {
                    TextAreaLexico.setText(resultado);
                    return;
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean semantico() throws FileNotFoundException, IOException {
        boolean estado = true;
        String[] variablesInt = new String[]{};
        String[] variableString = new String[]{};
        
        int count = 0; // test

        File fichero = new File("fichero.txt");
        PrintWriter writer;

        try {
            writer = new PrintWriter(fichero);

            writer.print(TextAreaCode.getText());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Reader reader = new BufferedReader(new FileReader("fichero.txt"));
            Lexer lexer = new Lexer(reader);

            while (estado) {
                Tokens token = lexer.yylex();
                if (token != null) {
                    switch (token) {

                        // DECLARANDO EL TIPO DE DATO DE UNA VARIABLE O FUNCION
                        case TD_INT: {
                            // NO MOVEMOS 2 TOKENS ADELANTE
                            for (int i = 0; i < 2; i++) {
                                token = lexer.yylex();
                                // EN EL TOKEN DEL IDENTIFICADOR GUARDAMOS EL NOMBRE Y LO AGREGAMOS 
                                // A NUSTRO ARRGLO DONDE CONTENEMOS IDENTIFICADORES DE UN MISMO TIPO DE DATO
                                if (token == IDENTIFICADOR) {
                                    // AGREGAR UN DATO AL FINAL DE UN ARREGLO NO INICIALIZADO
                                    variablesInt = Arrays.copyOf(variablesInt, variablesInt.length + 1);
                                    variablesInt[variablesInt.length - 1] = lexer.lexeme;                                
                                    /*
                                        La clase Arrays de Jaglo con una capacidad mayor y devuelve el nuevo arreglo. En este caso, va 
                                        proporciona el método copyOf, que copia el arreglo original a un nuevo arrese copia el 
                                        arreglo original miArreglo a un nuevo arreglo con una capacidad mayor que se utiliza para agregar 
                                        el nuevo dato. El nuevo dato se agrega al final del nuevo arreglo en la posición miArreglo.length - 1, 
                                        y finalmente se asigna el nuevo arreglo a la variable miArreglo.
                                    
                                        De esta manera, se puede agregar un dato a un arreglo que no ha sido inicializado con un tamaño específico en Java.                                  
                                    */
                                }
                            }
                            // SI DOS TOKEN DEPUES SE ENCUENTRA CON PARENTESIS. ES UNA FUNCION
                            if (token == P_OPEN) {

                            }
                            // SI DOS TOKENS DESPUES SE ENCUETRA CON UN SIGNO IGUAL. ES UNA INICIALIZACÍON DE VARIABLE
                            if (token == IGUAL) {
                                // PASAMOS UN TOKEN MAS ADELANTE
                                token = lexer.yylex();

                                // LA VARIABLE DECLARADA DE TIPO INT DEBE SER INICIALIZADA CON UN DATO DEL MISMO TIPO
                                if (token != INT) {
                                    estado = false;
                                }
                            }
                            break;
                        }
                        case TD_STRING: {
                            for (int i = 0; i < 2; i++) {
                                token = lexer.yylex();
                                if (token == IDENTIFICADOR) {
                                    variableString = Arrays.copyOf(variableString, variableString.length + 1);
                                    variableString[variableString.length - 1] = lexer.lexeme;                                                                 
                                }
                            }
                            if (token == P_OPEN) {
                                /* */
                            }
                            if (token == IGUAL) {
                                token = lexer.yylex();
                                if (token != CADENA_CARACT) {
                                    estado = false;
                                }
                            }
                            break;
                        }

                        // ASIGNACION_VARIABLE
                        case IDENTIFICADOR: {
                            // VARIABLES DE TIPO INT
                            for (int i = 0; i < variablesInt.length; i++) {
                                //System.out.print("DATO DEL ARREGLO: " + variablesInt[i] + "\n");
                                if (variablesInt[i].equals(lexer.lexeme)) {
                                    //System.out.print("SI HUBO COINCIDENCIAS EN EL ARREGLO CON EL IDENTIFICADOR: " + lexer.lexeme + "\n");
                                    token = lexer.yylex();
                                    token = lexer.yylex();
                                    if (token != INT) {
                                        estado = false;
                                    }
                                } else {
                                    //System.out.print("NO HUBO COINCIDENCIAS EN EL ARREGLO CON EL IDENTIFICADOR: " + lexer.lexeme + "\n");
                                }
                            }
                            // VARIABLES DE TIPO STRING
                            for (int i = 0; i < variableString.length; i++) {
                                if (variableString[i].equals(lexer.lexeme)) {
                                    token = lexer.yylex();
                                    token = lexer.yylex();
                                    if (token != CADENA_CARACT) {
                                        estado = false;
                                    }
                                }
                            }
                            break;
                        }
                        case ERROR: {
                            break;
                        }
                    }
                } else {
                    return estado;
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnalizar;
    private javax.swing.JButton BtnAnalizarLexico;
    private javax.swing.JButton BtnCodeExample;
    private javax.swing.JButton BtnLimpiarAnalizador;
    private javax.swing.JTextArea TextAreaAnalizar;
    private javax.swing.JTextArea TextAreaCode;
    private javax.swing.JTextArea TextAreaLexico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
