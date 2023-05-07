
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri May 05 23:37:11 CDT 2023
//----------------------------------------------------

package compiladorcpp;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri May 05 23:37:11 CDT 2023
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\002\004\000\002\002\003\000\002\003" +
    "\003\000\002\003\004\000\002\004\010\000\002\005\004" +
    "\000\002\006\003\000\002\006\004\000\002\007\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\003\000\002" +
    "\007\003\000\002\010\007\000\002\010\005\000\002\011" +
    "\003\000\002\011\005\000\002\012\006\000\002\012\006" +
    "\000\002\013\003\000\002\013\005\000\002\014\003\000" +
    "\002\015\007\000\002\016\003\000\002\017\011\000\002" +
    "\020\005\000\002\021\003\000\002\021\003\000\002\021" +
    "\003\000\002\022\003\000\002\022\003\000\002\022\003" +
    "\000\002\023\007\000\002\024\003\000\002\024\003\000" +
    "\002\024\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\107\000\010\004\010\005\012\006\004\001\002\000" +
    "\004\031\uffe5\001\002\000\004\031\015\001\002\000\012" +
    "\002\uffff\004\010\005\012\006\004\001\002\000\004\002" +
    "\000\001\002\000\004\031\uffe7\001\002\000\004\002\013" +
    "\001\002\000\004\031\uffe6\001\002\000\004\002\001\001" +
    "\002\000\004\002\ufffe\001\002\000\004\015\017\001\002" +
    "\000\004\017\021\001\002\000\004\016\020\001\002\000" +
    "\004\017\ufffc\001\002\000\020\004\010\005\012\006\004" +
    "\007\025\010\031\012\024\031\035\001\002\000\022\004" +
    "\ufff8\005\ufff8\006\ufff8\007\ufff8\010\ufff8\012\ufff8\020\ufff8" +
    "\031\ufff8\001\002\000\022\004\uffec\005\uffec\006\uffec\007" +
    "\uffec\010\uffec\012\uffec\020\uffec\031\uffec\001\002\000\010" +
    "\026\041\027\046\030\044\001\002\000\004\017\102\001" +
    "\002\000\004\031\071\001\002\000\022\004\ufff9\005\ufff9" +
    "\006\ufff9\007\ufff9\010\ufff9\012\ufff9\020\ufff9\031\ufff9\001" +
    "\002\000\004\020\070\001\002\000\004\015\055\001\002" +
    "\000\022\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\012" +
    "\ufff6\020\ufff6\031\ufff6\001\002\000\022\004\uffea\005\uffea" +
    "\006\uffea\007\uffea\010\uffea\012\uffea\020\uffea\031\uffea\001" +
    "\002\000\022\004\010\005\012\006\004\007\025\010\031" +
    "\012\024\020\ufffb\031\035\001\002\000\004\021\040\001" +
    "\002\000\022\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5" +
    "\012\ufff5\020\ufff5\031\ufff5\001\002\000\022\004\ufff7\005" +
    "\ufff7\006\ufff7\007\ufff7\010\ufff7\012\ufff7\020\ufff7\031\ufff7" +
    "\001\002\000\012\026\041\027\046\030\044\031\043\001" +
    "\002\000\006\013\uffe4\016\uffe4\001\002\000\004\013\052" +
    "\001\002\000\006\013\uffee\024\050\001\002\000\006\013" +
    "\uffe2\016\uffe2\001\002\000\004\013\047\001\002\000\006" +
    "\013\uffe3\016\uffe3\001\002\000\022\004\ufff0\005\ufff0\006" +
    "\ufff0\007\ufff0\010\ufff0\012\ufff0\020\ufff0\031\ufff0\001\002" +
    "\000\004\031\043\001\002\000\004\013\uffed\001\002\000" +
    "\022\004\uffef\005\uffef\006\uffef\007\uffef\010\uffef\012\uffef" +
    "\020\uffef\031\uffef\001\002\000\004\020\ufffa\001\002\000" +
    "\004\017\065\001\002\000\004\031\056\001\002\000\010" +
    "\021\061\022\057\023\060\001\002\000\010\026\uffdf\027" +
    "\uffdf\030\uffdf\001\002\000\010\026\uffde\027\uffde\030\uffde" +
    "\001\002\000\010\026\uffe0\027\uffe0\030\uffe0\001\002\000" +
    "\010\026\041\027\046\030\044\001\002\000\004\016\064" +
    "\001\002\000\006\013\uffe1\017\uffe1\001\002\000\020\004" +
    "\010\005\012\006\004\007\025\010\031\012\024\031\035" +
    "\001\002\000\004\020\067\001\002\000\022\004\uffeb\005" +
    "\uffeb\006\uffeb\007\uffeb\010\uffeb\012\uffeb\020\uffeb\031\uffeb" +
    "\001\002\000\012\002\ufffd\004\ufffd\005\ufffd\006\ufffd\001" +
    "\002\000\010\013\ufff2\014\074\021\075\001\002\000\004" +
    "\013\073\001\002\000\022\004\ufff3\005\ufff3\006\ufff3\007" +
    "\ufff3\010\ufff3\012\ufff3\020\ufff3\031\ufff3\001\002\000\004" +
    "\031\100\001\002\000\010\026\041\027\046\030\044\001" +
    "\002\000\004\013\077\001\002\000\022\004\ufff4\005\ufff4" +
    "\006\ufff4\007\ufff4\010\ufff4\012\ufff4\020\ufff4\031\ufff4\001" +
    "\002\000\006\013\ufff2\014\074\001\002\000\004\013\ufff1" +
    "\001\002\000\020\004\010\005\012\006\004\007\025\010" +
    "\031\012\024\031\035\001\002\000\004\020\104\001\002" +
    "\000\004\011\105\001\002\000\004\015\055\001\002\000" +
    "\004\013\107\001\002\000\022\004\uffe9\005\uffe9\006\uffe9" +
    "\007\uffe9\010\uffe9\012\uffe9\020\uffe9\031\uffe9\001\002\000" +
    "\004\013\111\001\002\000\022\004\uffe8\005\uffe8\006\uffe8" +
    "\007\uffe8\010\uffe8\012\uffe8\020\uffe8\031\uffe8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\107\000\012\002\010\003\006\004\005\021\004\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\003\013" +
    "\004\005\021\004\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\005\015\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\026\006\027" +
    "\007\033\010\026\012\035\014\021\015\022\016\036\017" +
    "\032\020\031\021\025\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\022\107\001\001\000\002\001\001\000" +
    "\004\011\071\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\023\053\001\001\000\002\001\001\000\002\001" +
    "\001\000\026\006\052\007\033\010\026\012\035\014\021" +
    "\015\022\016\036\017\032\020\031\021\025\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\013\041\022\044\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\013\050\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\024\061\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\022\062\001\001\000\002\001\001\000\002\001" +
    "\001\000\026\006\065\007\033\010\026\012\035\014\021" +
    "\015\022\016\036\017\032\020\031\021\025\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\011" +
    "\100\001\001\000\004\022\075\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\026\006\102\007\033\010\026\012\035\014\021\015\022" +
    "\016\036\017\032\020\031\021\025\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\023\105\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;}

    public Symbol getS(){
        return this.s;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // OPERADOR_COMP ::= MENORQ 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_COMP",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // OPERADOR_COMP ::= MAYORQ 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_COMP",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // OPERADOR_COMP ::= IGUAL 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("OPERADOR_COMP",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // CONDICIONAL ::= P_OPEN IDENTIFICADOR OPERADOR_COMP DATO P_CLOSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONDICIONAL",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // DATO ::= FLOAT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DATO",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // DATO ::= INT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DATO",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // DATO ::= CADENA_CARACT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DATO",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // TIPO_DATO ::= TD_CHAR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO_DATO",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // TIPO_DATO ::= TD_STRING 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO_DATO",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // TIPO_DATO ::= TD_INT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO_DATO",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // RETURN ::= PR_RETURN DATO PUNTOYC 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("RETURN",14, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // CLICLO_DO_WHILE ::= PR_DO LLAVES_APER CONTS LLAVES_CIERR PR_WHILE CONDICIONAL PUNTOYC 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CLICLO_DO_WHILE",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // CICLOS ::= CLICLO_DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CICLOS",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // SENTENCIA_IF ::= PR_IF CONDICIONAL LLAVES_APER CONTS LLAVES_CIERR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_IF",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SENTENCIAS ::= SENTENCIA_IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIAS",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // ASIGNACIONES ::= IDENTIFICADOR O_SUMA ASIGNACIONES 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ASIGNACIONES",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // ASIGNACIONES ::= IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ASIGNACIONES",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ASIGNACION_VARIABLE ::= IDENTIFICADOR IGUAL ASIGNACIONES PUNTOYC 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ASIGNACION_VARIABLE",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // ASIGNACION_VARIABLE ::= IDENTIFICADOR IGUAL DATO PUNTOYC 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ASIGNACION_VARIABLE",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // IDENTIFICADORES ::= IDENTIFICADOR COMA IDENTIFICADORES 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IDENTIFICADORES",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // IDENTIFICADORES ::= IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IDENTIFICADORES",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // DECLARACION_VARIABLE ::= TIPO_DATO IDENTIFICADORES PUNTOYC 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_VARIABLE",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // DECLARACION_VARIABLE ::= TIPO_DATO IDENTIFICADOR IGUAL DATO PUNTOYC 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_VARIABLE",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // CONT ::= ASIGNACION_VARIABLE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONT",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // CONT ::= RETURN 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONT",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // CONT ::= CICLOS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONT",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // CONT ::= SENTENCIAS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONT",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // CONT ::= DECLARACION_VARIABLE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONT",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // CONTS ::= CONT CONTS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONTS",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CONTS ::= CONT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONTS",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ARGUMENTOS_FUNCION ::= P_OPEN P_CLOSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ARGUMENTOS_FUNCION",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // FUNCION ::= TIPO_DATO IDENTIFICADOR ARGUMENTOS_FUNCION LLAVES_APER CONTS LLAVES_CIERR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // FUNCIONES ::= FUNCION FUNCIONES 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCIONES",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // FUNCIONES ::= FUNCION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCIONES",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= FUNCIONES 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

