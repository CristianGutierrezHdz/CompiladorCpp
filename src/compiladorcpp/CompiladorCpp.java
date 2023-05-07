
package compiladorcpp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CompiladorCpp {

    public static void main(String[] args) throws Exception {
        String rutaLexer = "C:/Users/Criss/ARCHIVOS/REPOSITORY/JAVA/CompiladorCpp/src/compiladorcpp/Lexer.flex";
        String rutaLexerCup = "C:/Users/Criss/ARCHIVOS/REPOSITORY/JAVA/CompiladorCpp/src/compiladorcpp/LexerCup.flex";
        String rutaSintax = "C:/Users/Criss/ARCHIVOS/REPOSITORY/JAVA/CompiladorCpp/src/compiladorcpp/Sintax.cup";
        
        generarArchivos(rutaLexer, rutaLexerCup, rutaSintax);
    }
    
    public static void generarArchivos(String rutaLexer, String rutaLexerCup, String rutaSintax) throws IOException, Exception {
        File archivoUno;
        archivoUno = new File(rutaLexer);
        JFlex.Main.generate(archivoUno);
        // Jflex genera el archivo .java en la misma ubicacion que el .flex
        
        File archivo;
        archivo = new File(rutaLexerCup);
        JFlex.Main.generate(archivo);
        // Jflex genera el archivo .java en la raiz del proyecto  
        
        java_cup.Main.main(new String[] { "-parser", "Sintax", rutaSintax});
        // JCup genera el archivo .java en la raiz del proyecto  
        
        // Files.move(origen, destino, opciones)
        Path rutaSym = Paths.get("C:/Users/Criss/ARCHIVOS/REPOSITORY/JAVA/CompiladorCpp/src/compiladorcpp/Sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Path rutaSource = Paths.get("C:/Users/Criss/ARCHIVOS/REPOSITORY/JAVA/CompiladorCpp/Sym.java");
        Path rutaTarget = Paths.get("C:/Users/Criss/ARCHIVOS/REPOSITORY/JAVA/CompiladorCpp/src/compiladorcpp/Sym.java");
        Files.move(rutaSource, rutaTarget);
        
        
        Path rutaSin = Paths.get("C:/Users/Criss/ARCHIVOS/REPOSITORY/JAVA/CompiladorCpp/src/compiladorcpp/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        } // (otra forma de escribir las lineas 35 - 37 )
        Files.move(
                Paths.get("C:/Users/Criss/ARCHIVOS/REPOSITORY/JAVA/CompiladorCpp/Sintax.java"),
                Paths.get("C:/Users/Criss/ARCHIVOS/REPOSITORY/JAVA/CompiladorCpp/src/compiladorcpp/Sintax.java")   
        );
    } 
}
