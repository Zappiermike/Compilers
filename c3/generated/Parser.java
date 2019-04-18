
//----------------------------------------------------
// The following code was generated by CUP v0.10k TUM Edition 20050516
// Wed Apr 17 16:38:20 CDT 2019
//----------------------------------------------------


/** CUP v0.10k TUM Edition 20050516 generated parser.
  * @version Wed Apr 17 16:38:20 CDT 2019
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\003\011\000\002\002\004\000\002\004" +
    "\004\000\002\004\005\000\002\004\006\000\002\007\003" +
    "\000\002\007\005\000\002\010\005\000\002\010\003\000" +
    "\002\005\002\000\002\005\004\000\002\006\005\000\002" +
    "\006\005\000\002\006\005\000\002\006\005\000\002\006" +
    "\005\000\002\006\005\000\002\006\005\000\002\006\005" +
    "\000\002\006\005\000\002\006\005\000\002\006\005\000" +
    "\002\006\004\000\002\006\003\000\002\006\006\000\002" +
    "\006\005\000\002\006\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\073\000\004\017\005\001\002\000\004\002\075\001" +
    "\002\000\004\016\006\001\002\000\004\011\007\001\002" +
    "\000\004\012\010\001\002\000\004\021\011\001\002\000" +
    "\016\005\015\011\017\015\014\016\013\017\021\022\ufff8" +
    "\001\002\000\004\022\074\001\002\000\036\004\uffe7\005" +
    "\uffe7\006\uffe7\007\uffe7\010\uffe7\011\056\020\uffe7\024\071" +
    "\025\uffe7\026\uffe7\027\uffe7\030\uffe7\031\uffe7\032\uffe7\001" +
    "\002\000\036\004\uffea\005\uffea\006\uffea\007\uffea\010\uffea" +
    "\012\uffea\020\uffea\023\uffea\025\uffea\026\uffea\027\uffea\030" +
    "\uffea\031\uffea\032\uffea\001\002\000\012\005\015\011\017" +
    "\015\014\016\026\001\002\000\016\005\015\011\017\015" +
    "\014\016\013\017\021\022\ufff8\001\002\000\012\005\015" +
    "\011\017\015\014\016\026\001\002\000\032\004\036\005" +
    "\030\006\041\007\032\010\034\020\064\025\037\026\040" +
    "\027\042\030\033\031\031\032\035\001\002\000\004\016" +
    "\024\001\002\000\006\020\062\023\061\001\002\000\006" +
    "\020\ufff9\023\ufff9\001\002\000\010\020\ufffc\023\ufffc\024" +
    "\025\001\002\000\012\005\015\011\017\015\014\016\026" +
    "\001\002\000\040\004\uffe7\005\uffe7\006\uffe7\007\uffe7\010" +
    "\uffe7\011\056\012\uffe7\020\uffe7\023\uffe7\025\uffe7\026\uffe7" +
    "\027\uffe7\030\uffe7\031\uffe7\032\uffe7\001\002\000\034\004" +
    "\036\005\030\006\041\007\032\010\034\020\ufffb\023\ufffb" +
    "\025\037\026\040\027\042\030\033\031\031\032\035\001" +
    "\002\000\012\005\015\011\017\015\014\016\026\001\002" +
    "\000\012\005\015\011\017\015\014\016\026\001\002\000" +
    "\012\005\015\011\017\015\014\016\026\001\002\000\012" +
    "\005\015\011\017\015\014\016\026\001\002\000\012\005" +
    "\015\011\017\015\014\016\026\001\002\000\012\005\015" +
    "\011\017\015\014\016\026\001\002\000\012\005\015\011" +
    "\017\015\014\016\026\001\002\000\012\005\015\011\017" +
    "\015\014\016\026\001\002\000\012\005\015\011\017\015" +
    "\014\016\026\001\002\000\012\005\015\011\017\015\014" +
    "\016\026\001\002\000\012\005\015\011\017\015\014\016" +
    "\026\001\002\000\022\004\uffef\005\uffef\006\uffef\007\uffef" +
    "\010\uffef\012\uffef\020\uffef\023\uffef\001\002\000\036\004" +
    "\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4\012\ufff4\020\ufff4" +
    "\023\ufff4\025\037\026\040\027\042\030\033\031\031\032" +
    "\035\001\002\000\022\004\ufff0\005\ufff0\006\ufff0\007\ufff0" +
    "\010\ufff0\012\ufff0\020\ufff0\023\ufff0\001\002\000\022\004" +
    "\ufff1\005\ufff1\006\ufff1\007\ufff1\010\ufff1\012\ufff1\020\ufff1" +
    "\023\ufff1\001\002\000\036\004\ufff6\005\ufff6\006\041\007" +
    "\032\010\034\012\ufff6\020\ufff6\023\ufff6\025\037\026\040" +
    "\027\042\030\033\031\031\032\035\001\002\000\022\004" +
    "\uffec\005\uffec\006\uffec\007\uffec\010\uffec\012\uffec\020\uffec" +
    "\023\uffec\001\002\000\036\004\ufff2\005\ufff2\006\ufff2\007" +
    "\ufff2\010\ufff2\012\ufff2\020\ufff2\023\ufff2\025\037\026\040" +
    "\027\042\030\033\031\031\032\035\001\002\000\022\004" +
    "\uffee\005\uffee\006\uffee\007\uffee\010\uffee\012\uffee\020\uffee" +
    "\023\uffee\001\002\000\036\004\ufff3\005\ufff3\006\ufff3\007" +
    "\ufff3\010\ufff3\012\ufff3\020\ufff3\023\ufff3\025\037\026\040" +
    "\027\042\030\033\031\031\032\035\001\002\000\022\004" +
    "\uffed\005\uffed\006\uffed\007\uffed\010\uffed\012\uffed\020\uffed" +
    "\023\uffed\001\002\000\036\004\ufff5\005\ufff5\006\041\007" +
    "\032\010\034\012\ufff5\020\ufff5\023\ufff5\025\037\026\040" +
    "\027\042\030\033\031\031\032\035\001\002\000\012\005" +
    "\015\011\017\015\014\016\026\001\002\000\032\004\036" +
    "\005\030\006\041\007\032\010\034\012\060\025\037\026" +
    "\040\027\042\030\033\031\031\032\035\001\002\000\036" +
    "\004\uffe9\005\uffe9\006\uffe9\007\uffe9\010\uffe9\012\uffe9\020" +
    "\uffe9\023\uffe9\025\uffe9\026\uffe9\027\uffe9\030\uffe9\031\uffe9" +
    "\032\uffe9\001\002\000\004\016\024\001\002\000\016\005" +
    "\ufffe\011\ufffe\015\ufffe\016\ufffe\017\ufffe\022\ufffe\001\002" +
    "\000\006\020\ufffa\023\ufffa\001\002\000\016\005\uffff\011" +
    "\uffff\015\uffff\016\uffff\017\uffff\022\uffff\001\002\000\032" +
    "\004\036\005\030\006\041\007\032\010\034\012\066\025" +
    "\037\026\040\027\042\030\033\031\031\032\035\001\002" +
    "\000\036\004\uffe8\005\uffe8\006\uffe8\007\uffe8\010\uffe8\012" +
    "\uffe8\020\uffe8\023\uffe8\025\uffe8\026\uffe8\027\uffe8\030\uffe8" +
    "\031\uffe8\032\uffe8\001\002\000\004\022\ufff7\001\002\000" +
    "\036\004\uffeb\005\uffeb\006\uffeb\007\uffeb\010\uffeb\012\uffeb" +
    "\020\uffeb\023\uffeb\025\uffeb\026\uffeb\027\uffeb\030\uffeb\031" +
    "\uffeb\032\uffeb\001\002\000\012\005\015\011\017\015\014" +
    "\016\026\001\002\000\032\004\036\005\030\006\041\007" +
    "\032\010\034\020\073\025\037\026\040\027\042\030\033" +
    "\031\031\032\035\001\002\000\016\005\ufffd\011\ufffd\015" +
    "\ufffd\016\ufffd\017\ufffd\022\ufffd\001\002\000\004\002\001" +
    "\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\073\000\004\003\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\004\015\005\011\006\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\006\067\001\001\000\010\004\015\005\066\006\017\001" +
    "\001\000\004\006\064\001\001\000\002\001\001\000\006" +
    "\007\022\010\021\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\026\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\006\054\001\001\000" +
    "\004\006\053\001\001\000\004\006\052\001\001\000\004" +
    "\006\051\001\001\000\004\006\050\001\001\000\004\006" +
    "\047\001\001\000\004\006\046\001\001\000\004\006\045" +
    "\001\001\000\004\006\044\001\001\000\004\006\043\001" +
    "\001\000\004\006\042\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\006\056\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\007\062\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\071\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
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
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expr ::= LETTER 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		String l = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new LoadExpr(l, lleft); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expr ::= LPAREN expr RPAREN 
            {
              Expr RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = e; 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expr ::= LETTER LPAREN expr RPAREN 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String l = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new CallExpr(l, e); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expr ::= NUMBER 
            {
              Expr RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new ConstExpr(Integer.parseInt(n)); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr ::= MINUS expr 
            {
              Expr RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new DifferenceExpr(new ConstExpr(0), e); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr ::= expr NOTEQ expr 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new NotEqExpr(l, r); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= expr EQEQ expr 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new EqEqExpr(l, r); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= expr LESSEQ expr 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new LessEqExpr(l, r); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= expr MOREEQ expr 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new MoreEqExpr(l, r); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= expr LESS expr 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new LessExpr(l, r); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= expr MORE expr 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new MoreExpr(l, r); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= expr MOD expr 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new RemainderExpr(l, r); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= expr DIVIDE expr 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new QuotientExpr(l, r); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= expr TIMES expr 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new ProductExpr(l, r); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= expr MINUS expr 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new DifferenceExpr(l, r); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= expr PLUS expr 
            {
              Expr RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new SumExpr(l, r); 
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*expr*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // stmts ::= stmt stmts 
            {
              Stmt RESULT = null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Stmt s = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int ssleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int ssright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Stmt ss = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new SequenceStmt(s, ss); 
              CUP$Parser$result = new java_cup.runtime.Symbol(3/*stmts*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // stmts ::= 
            {
              Stmt RESULT = null;
		 RESULT = new EmptyStmt(); 
              CUP$Parser$result = new java_cup.runtime.Symbol(3/*stmts*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // decls ::= decl 
            {
              Stmt RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Stmt d = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = d; 
              CUP$Parser$result = new java_cup.runtime.Symbol(6/*decls*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // decls ::= decls COMMA decl 
            {
              Stmt RESULT = null;
		int dsleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int dsright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Stmt ds = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Stmt d = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new SequenceStmt(ds, d); 
              CUP$Parser$result = new java_cup.runtime.Symbol(6/*decls*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // decl ::= LETTER EQUALS expr 
            {
              Stmt RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String l = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new SequenceStmt(new DeclarationStmt(l, lleft), new AssignmentStmt(l,e,lleft)); 
              CUP$Parser$result = new java_cup.runtime.Symbol(5/*decl*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // decl ::= LETTER 
            {
              Stmt RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		String l = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 RESULT = new DeclarationStmt(l, lleft); 
              CUP$Parser$result = new java_cup.runtime.Symbol(5/*decl*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // stmt ::= LETTER EQUALS expr SEMI 
            {
              Stmt RESULT = null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String l = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new AssignmentStmt(l,e, lleft); 
              CUP$Parser$result = new java_cup.runtime.Symbol(2/*stmt*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // stmt ::= INT decls SEMI 
            {
              Stmt RESULT = null;
		int dsleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int dsright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Stmt ds = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = ds; 
              CUP$Parser$result = new java_cup.runtime.Symbol(2/*stmt*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // stmt ::= expr SEMI 
            {
              Stmt RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new ExprStmt(e); 
              CUP$Parser$result = new java_cup.runtime.Symbol(2/*stmt*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Procedure start_val = (Procedure)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= INT LETTER LPAREN RPAREN LCURLY stmts RCURLY 
            {
              Procedure RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		String l = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Stmt s = (Stmt)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new Procedure(l,
                                      new SequenceStmt(s,
                                                       new ReturnStmt(new ConstExpr(0)))); 
              CUP$Parser$result = new java_cup.runtime.Symbol(1/*program*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

