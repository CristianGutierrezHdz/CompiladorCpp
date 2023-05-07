
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class IU extends javax.swing.JFrame {

    public IU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaCode = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaLexico = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaAnalizar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnAnalizar = new javax.swing.JButton();
        BtnAnalizarLexico = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextAreaCode.setColumns(20);
        TextAreaCode.setRows(5);
        jScrollPane1.setViewportView(TextAreaCode);

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
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnAnalizar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        BtnAnalizar.setText("Analizar");
        BtnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnalizarActionPerformed(evt);
            }
        });

        BtnAnalizarLexico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        BtnAnalizarLexico.setText("Analizar");
        BtnAnalizarLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnalizarLexicoActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EJEMPLO 1", "EJEMPLO 2" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "TOKENS", "CANTIDAD", "TIPO"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jTextArea1.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Validar que los tipos de datos sean correctos:\n\n    - El dato con el que se inizialize, una variable sea del mismo tiopo del que se definio\n\n    -  El tipo de dato con el que se relacione una variable sea del mismo tipo del que se definio\n\n    - Las variables primero deben ser definidas  antes de inicializarlas o relacionarlas.\n");
        jTextArea1.setBorder(null);
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Reglas Semanticas");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnAnalizarLexico))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAnalizarLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAnalizarLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnalizarLexicoActionPerformed

        try {
            analizadorLexico();
            tablaDeAnalisisLexico();
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
            if (semantico()) {
                mensaje += "Semantica Correcta";
                TextAreaAnalizar.setForeground(new Color(25, 111, 61));
            } else {
                mensaje += "Semantica incorrecta";
                TextAreaAnalizar.setForeground(Color.red);
            }
        } catch (Exception ex) {
            Symbol sym = s.getS();
            mensaje = ("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            TextAreaAnalizar.setForeground(Color.red);
        }
        TextAreaAnalizar.setText(mensaje);
    }//GEN-LAST:event_BtnAnalizarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String myVariable = jComboBox1.getSelectedItem().toString();
        switch (myVariable){
            case "EJEMPLO 1": {
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
                break;
            }
            case "EJEMPLO 2": {
                TextAreaCode.setText("int main() {\n"
                        + "\n"
                        + "    int A, B, C, Res;\n"
                        + "    char nombre, pater, materia, Res2;\n"
                        + "\n"
                        + "    Res2 = A + B + C;\n"
                        + "    Res1 = nombre + pater + materia;\n"
                        + "\n"
                        + "}");
                break;
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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

            //resultado = "▄▄ LINEA ▄ 1 ▄▄▄\n";
            while (true) {
                Tokens token = lexer.yylex();
                if (token != null) {

                    switch (token) {
                        /* */
                        case TD_INT, TD_STRING, TD_CHAR, PR_DO, PR_IF, PR_WHILE, PR_RETURN, PUNTOYC, COMA, P_OPEN, P_CLOSE, LLAVES_APER, LLAVES_CIERR, 
                                IGUAL, MAYORQ, MENORQ,  O_SUMA, O_RESTA, CADENA_CARACT, INT, FLOAT, IDENTIFICADOR, ERROR: {
                            resultado += lexer.lexeme + "\t\t" + token + "\n";
                            break;
                        }
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
    
    public void tablaDeAnalisisLexico(){
        byte fila = -1; // al iniciar el ciclo se incrementa en uno (el valor inicial seria 0)   
        int cantidad;
        
        
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        table.setRowCount(0); // limpiamos la tabla
        
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
            Reader reader = new BufferedReader (new FileReader("fichero.txt"));
            Lexer lexer = new Lexer (reader);     
             
            while (true){
                Tokens token = lexer.yylex();
                fila++;
                if (token != null) {
                   switch (token){
                        case TD_INT: 
                            controlFilas(token.toString(), "TIPO DE DATO ENTERO"); break;
                        
                        case TD_STRING: 
                            controlFilas(token.toString(), "TIPO DE DATO STRING"); break;
                        
                        case TD_CHAR: 
                            controlFilas(token.toString(), "TIPO DE DATO CHAR"); break;

                        case PR_DO: 
                            controlFilas(token.toString(), "PALABRA RESERVADA"); break;
                        
                        case PR_IF: 
                            controlFilas(token.toString(), "PALABRA RESERVADA"); break;
                        
                        case PR_WHILE: 
                            controlFilas(token.toString(), "PALABRA RESERVADA"); break;
                        
                        case PR_RETURN: 
                            controlFilas(token.toString(), "PALABRA RESERVADA"); break;
                        
                        case PUNTOYC: 
                            controlFilas(token.toString(), "SIMBOLO"); break;
                        
                        case COMA: 
                            controlFilas(token.toString(), "SIMBOLO"); break;
                        
                        case P_OPEN: 
                            controlFilas(token.toString(), "SIMBOLO"); break;
                        
                        case P_CLOSE: 
                            controlFilas(token.toString(), "SIMBOLO"); break;
                        
                        case LLAVES_APER: 
                            controlFilas(token.toString(), "SIMBOLO"); break;
                        
                        case LLAVES_CIERR: 
                            controlFilas(token.toString(), "SIMBOLO"); break;
                                                
                        case IGUAL: 
                            controlFilas(token.toString(), "OPERADOR"); break;
                        
                        case MAYORQ: 
                            controlFilas(token.toString(), "OPERADOR"); break;
                        
                        case MENORQ: 
                            controlFilas(token.toString(), "OPERADOR"); break;
                        
                        case O_SUMA: 
                            controlFilas(token.toString(), "OPERADOR"); break;
                        
                        case O_RESTA: 
                            controlFilas(token.toString(), "OPERADOR"); break;
                        
                        case IDENTIFICADOR:
                            controlFilas(token.toString(), "IDENTIFICADOR"); break;
                        
                        case CADENA_CARACT: 
                            controlFilas(token.toString(), "CADENA DE CARACTERES"); break;
                        
                        case INT: 
                            controlFilas(token.toString(), "NUMERO ENTERO"); break;
                        
                        case FLOAT: 
                            controlFilas(token.toString(), "NUMERO FLOTANTE"); break;                                             
                   }
                                                      
                } else {
                    return;
                }               
            }    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void controlFilas(String token, String mensajeTipo){
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int cantidad = 0;
        // DEFINIR EL PRIMER TOKEN DE LA TABLA
        if (table.getRowCount() < 1){
            table.addRow(new Object[]{token, 1, mensajeTipo});
            return;
        }
        // ACTUALIZAR LA CANTIDAD DEL TOKEN EN LA TABLA
        for (int i = 0; i < table.getRowCount(); i++) {
            if (table.getValueAt(i, 0) == token) {
                cantidad = Integer.parseInt(table.getValueAt(i, 1).toString());
                table.setValueAt(cantidad + 1, i, 1);
                return;
            }
        }
        // AGREGAR EL NUEVO TOKEN A LA TABLA
        for (int i = 0; i < table.getRowCount(); i++) {
            if (table.getValueAt(i, 0) != token) {
                table.addRow(new Object[]{token, 1, mensajeTipo});
                return;
            }
        }
        
    }

    public boolean semantico() throws FileNotFoundException, IOException {
        boolean estado = true;
        
        String[] fullIdentificadores = new String[]{};
        String[] variablesInt = new String[]{};
        String[] variableString = new String[]{};
        String[] variablesChar = new String[]{};
        
        
        boolean bandera = true; // test

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
                            token = lexer.yylex();
                            // EN EL TOKEN DEL IDENTIFICADOR GUARDAMOS EL NOMBRE Y LO AGREGAMOS 
                            // A NUSTRO ARRGLO DONDE CONTENEMOS IDENTIFICADORES DE UN MISMO TIPO DE DATO
                            if (token == IDENTIFICADOR) {
                                // AGREGAR UN DATO AL FINAL DE UN ARREGLO NO INICIALIZADO
                                //JOptionPane.showMessageDialog(null, "IDENTIFICADOR: " + lexer.lexeme);
                                variablesInt = Arrays.copyOf(variablesInt, variablesInt.length + 1);
                                variablesInt[variablesInt.length - 1] = lexer.lexeme;
                                
                                
                                fullIdentificadores = Arrays.copyOf(fullIdentificadores, fullIdentificadores.length + 1);
                                fullIdentificadores[fullIdentificadores.length - 1] = lexer.lexeme;
                                
                                
                                
                                
                                /*
                                    La clase Arrays de Jaglo con una capacidad mayor y devuelve el nuevo arreglo. En este caso, va 
                                    proporciona el método copyOf, que copia el arreglo original a un nuevo arrese copia el 
                                    arreglo original miArreglo a un nuevo arreglo con una capacidad mayor que se utiliza para agregar 
                                    el nuevo dato. El nuevo dato se agrega al final del nuevo arreglo en la posición miArreglo.length - 1, 
                                    y finalmente se asigna el nuevo arreglo a la variable miArreglo.

                                    De esta manera, se puede agregar un dato a un arreglo que no ha sido inicializado con un tamaño específico en Java.                                  
                                */
                            }
                            token = lexer.yylex();
                            // SI DOS TOKEN DEPUES SE ENCUENTRA CON PARENTESIS. ES UNA FUNCION
                            if (token == P_OPEN) {
                                
                            }
                            
                            // DECLARACIONES MULTIPLES
                            if (token == COMA) {
                                do{
                                    token = lexer.yylex();

                                    if (token == IDENTIFICADOR) {

                                        variablesInt = Arrays.copyOf(variablesInt, variablesInt.length + 1);
                                        variablesInt[variablesInt.length - 1] = lexer.lexeme;
                                        
                                        fullIdentificadores = Arrays.copyOf(fullIdentificadores, fullIdentificadores.length + 1);
                                        fullIdentificadores[fullIdentificadores.length - 1] = lexer.lexeme;
                                    }
                                    token = lexer.yylex();
                                } while (token == COMA);
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
                            token = lexer.yylex();
                            if (token == IDENTIFICADOR) {
                                fullIdentificadores = Arrays.copyOf(fullIdentificadores, fullIdentificadores.length + 1);
                                fullIdentificadores[fullIdentificadores.length - 1] = lexer.lexeme;
                                        
                                variableString = Arrays.copyOf(variableString, variableString.length + 1);
                                variableString[variableString.length - 1] = lexer.lexeme;
                            }
                            token = lexer.yylex();
                            if (token == P_OPEN) {
                                /* */
                            }
                            if (token == COMA) {
                                do{
                                    token = lexer.yylex();
                                    if (token == IDENTIFICADOR) {
                                        fullIdentificadores = Arrays.copyOf(fullIdentificadores, fullIdentificadores.length + 1);
                                        fullIdentificadores[fullIdentificadores.length - 1] = lexer.lexeme;

                                        variableString = Arrays.copyOf(variableString, variableString.length + 1);
                                        variableString[variableString.length - 1] = lexer.lexeme;
                                    }
                                    token = lexer.yylex();
                                } while (token == COMA);
                            }
                            if (token == IGUAL) {
                                token = lexer.yylex();
                                if (token != CADENA_CARACT) {
                                    estado = false;
                                }
                            }
                            break;
                        }
                        case TD_CHAR: {
                            token = lexer.yylex();
                            if (token == IDENTIFICADOR) {
                                fullIdentificadores = Arrays.copyOf(fullIdentificadores, fullIdentificadores.length + 1);
                                fullIdentificadores[fullIdentificadores.length - 1] = lexer.lexeme;
                                
                                variablesChar = Arrays.copyOf(variablesChar, variablesChar.length + 1);
                                variablesChar[variablesChar.length - 1] = lexer.lexeme;
                            }
                            token = lexer.yylex();
                            if (token == P_OPEN) {
                                /* */
                            }
                            if (token == COMA) {
                                do{
                                    token = lexer.yylex();

                                    if (token == IDENTIFICADOR) {
                                        fullIdentificadores = Arrays.copyOf(fullIdentificadores, fullIdentificadores.length + 1);
                                        fullIdentificadores[fullIdentificadores.length - 1] = lexer.lexeme;

                                        variablesChar = Arrays.copyOf(variablesChar, variablesChar.length + 1);
                                        variablesChar[variablesChar.length - 1] = lexer.lexeme;
                                    }
                                    token = lexer.yylex();
                                } while (token == COMA);
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
                            estado = false;
                            for (String identificador : fullIdentificadores){
                                if (identificador.equals(lexer.lexeme)){
                                    estado = true;
                                    
                                    for (String variablesInt1 : variablesInt) {
                                        if (variablesInt1.equals(lexer.lexeme)) {
                                            token = lexer.yylex();
                                            token = lexer.yylex();
                                            
                                            if (token != INT) {
                                                estado = false;
                                                do{
                                                    if (token != IDENTIFICADOR && token == O_SUMA){
                                                        token = lexer.yylex();
                                                        estado = false;
                                                    }
                                                    if (token == IDENTIFICADOR) {
                                                        for (String variablesInt2 : variablesInt) {
                                                            if (variablesInt2.equals(lexer.lexeme)){
                                                                //JOptionPane.showMessageDialog(null, "IDENTIFICADOR DE TIPO INT (TRUE)");
                                                                estado = true;
                                                            }
                                                        }
                                                    }
                                                    token = lexer.yylex();
                                                } while (token == O_SUMA);
                                            }
                                        }
                                    }
                                    for (int i = 0; i < variableString.length; i++) {
                                        if (variableString[i].equals(lexer.lexeme)) {
                                            token = lexer.yylex();
                                            token = lexer.yylex();
                                            
                                            if (token != CADENA_CARACT) {
                                                estado = false;
                                                do{
                                                    if (token != IDENTIFICADOR && token == O_SUMA){
                                                        token = lexer.yylex();
                                                        estado = false;
                                                    }
                                                    if (token == IDENTIFICADOR) {
                                                        for (String String : variableString) {
                                                            if (String.equals(lexer.lexeme)){
                                                                estado = true;
                                                            }
                                                        }
                                                    }
                                                    token = lexer.yylex();
                                                } while (token == O_SUMA);
                                            }
                                        }
                                    }
                                    for (String variable : variablesChar) {
                                        if (variable.equals(lexer.lexeme)) {
                                            token = lexer.yylex();
                                            token = lexer.yylex();
                                            
                                            if (token != CADENA_CARACT) {
                                                estado = false;
                                                do{
                                                    if (token != IDENTIFICADOR && token == O_SUMA){
                                                        token = lexer.yylex();
                                                        estado = false;
                                                    }
                                                    if (token == IDENTIFICADOR) {
                                                        for (String identificadorchar : variablesChar) {
                                                            if (identificadorchar.equals(lexer.lexeme)){
                                                                estado = true;
                                                            } 
                                                        }
                                                    }
                                                    token = lexer.yylex();
                                                } while (token == O_SUMA);
                                            }
                                        }
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
    private javax.swing.JTextArea TextAreaAnalizar;
    private javax.swing.JTextArea TextAreaCode;
    private javax.swing.JTextArea TextAreaLexico;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
