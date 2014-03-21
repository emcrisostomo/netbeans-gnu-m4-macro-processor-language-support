/* Generated By:JavaCC: Do not edit this line. M4ParserConstants.java */
package org.netbeans.gnu.m4.lexer.javacc;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface M4ParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int WHITESPACE = 1;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 2;
  /** RegularExpression Id. */
  int DNL_COMMENT = 3;
  /** RegularExpression Id. */
  int LBRACKET = 4;
  /** RegularExpression Id. */
  int MLBRACKET = 5;
  /** RegularExpression Id. */
  int MRBRACKET = 6;
  /** RegularExpression Id. */
  int RBRACKET = 7;
  /** RegularExpression Id. */
  int LPAREN = 8;
  /** RegularExpression Id. */
  int RPAREN = 9;
  /** RegularExpression Id. */
  int LBRACE = 10;
  /** RegularExpression Id. */
  int RBRACE = 11;
  /** RegularExpression Id. */
  int SEMICOLON = 12;
  /** RegularExpression Id. */
  int COMMA = 13;
  /** RegularExpression Id. */
  int DOT = 14;
  /** RegularExpression Id. */
  int ASSIGN = 15;
  /** RegularExpression Id. */
  int LT = 16;
  /** RegularExpression Id. */
  int BANG = 17;
  /** RegularExpression Id. */
  int TILDE = 18;
  /** RegularExpression Id. */
  int HOOK = 19;
  /** RegularExpression Id. */
  int COLON = 20;
  /** RegularExpression Id. */
  int EQ = 21;
  /** RegularExpression Id. */
  int LE = 22;
  /** RegularExpression Id. */
  int GE = 23;
  /** RegularExpression Id. */
  int NE = 24;
  /** RegularExpression Id. */
  int SC_OR = 25;
  /** RegularExpression Id. */
  int SC_AND = 26;
  /** RegularExpression Id. */
  int INCR = 27;
  /** RegularExpression Id. */
  int DECR = 28;
  /** RegularExpression Id. */
  int PLUS = 29;
  /** RegularExpression Id. */
  int MINUS = 30;
  /** RegularExpression Id. */
  int STAR = 31;
  /** RegularExpression Id. */
  int SLASH = 32;
  /** RegularExpression Id. */
  int BIT_AND = 33;
  /** RegularExpression Id. */
  int BIT_OR = 34;
  /** RegularExpression Id. */
  int XOR = 35;
  /** RegularExpression Id. */
  int REM = 36;
  /** RegularExpression Id. */
  int LSHIFT = 37;
  /** RegularExpression Id. */
  int PLUSASSIGN = 38;
  /** RegularExpression Id. */
  int MINUSASSIGN = 39;
  /** RegularExpression Id. */
  int STARASSIGN = 40;
  /** RegularExpression Id. */
  int SLASHASSIGN = 41;
  /** RegularExpression Id. */
  int ANDASSIGN = 42;
  /** RegularExpression Id. */
  int ORASSIGN = 43;
  /** RegularExpression Id. */
  int XORASSIGN = 44;
  /** RegularExpression Id. */
  int REMASSIGN = 45;
  /** RegularExpression Id. */
  int LSHIFTASSIGN = 46;
  /** RegularExpression Id. */
  int RSIGNEDSHIFTASSIGN = 47;
  /** RegularExpression Id. */
  int ELLIPSIS = 48;
  /** RegularExpression Id. */
  int LBRACKET_QG = 49;
  /** RegularExpression Id. */
  int RBRACKET_QG = 50;
  /** RegularExpression Id. */
  int DOLLAR_QG = 51;
  /** RegularExpression Id. */
  int BANG_QG = 52;
  /** RegularExpression Id. */
  int LBRACE_QG = 53;
  /** RegularExpression Id. */
  int RBRACE_QG = 54;
  /** RegularExpression Id. */
  int EMPTY_QG = 55;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 56;
  /** RegularExpression Id. */
  int DECIMAL_LITERAL = 57;
  /** RegularExpression Id. */
  int HEX_LITERAL = 58;
  /** RegularExpression Id. */
  int OCTAL_LITERAL = 59;
  /** RegularExpression Id. */
  int FLOATING_POINT_LITERAL = 60;
  /** RegularExpression Id. */
  int DECIMAL_FLOATING_POINT_LITERAL = 61;
  /** RegularExpression Id. */
  int DECIMAL_EXPONENT = 62;
  /** RegularExpression Id. */
  int HEXADECIMAL_FLOATING_POINT_LITERAL = 63;
  /** RegularExpression Id. */
  int HEXADECIMAL_EXPONENT = 64;
  /** RegularExpression Id. */
  int CHARACTER_LITERAL = 65;
  /** RegularExpression Id. */
  int STRING_LITERAL = 66;
  /** RegularExpression Id. */
  int M4_MACRO = 67;
  /** RegularExpression Id. */
  int M4_MACRO_INVOCATION = 68;
  /** RegularExpression Id. */
  int MACRO_NAME = 69;
  /** RegularExpression Id. */
  int IDENTIFIER = 70;
  /** RegularExpression Id. */
  int LETTER = 71;
  /** RegularExpression Id. */
  int PART_LETTER = 72;
  /** RegularExpression Id. */
  int MTEXT = 73;
  /** RegularExpression Id. */
  int TEXT = 74;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int MCOMMENT = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<WHITESPACE>",
    "<SINGLE_LINE_COMMENT>",
    "<DNL_COMMENT>",
    "\"[\"",
    "\"[\"",
    "\"]\"",
    "\"]\"",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"=\"",
    "\"<\"",
    "\"!\"",
    "\"~\"",
    "\"?\"",
    "\":\"",
    "\"==\"",
    "\"<=\"",
    "\">=\"",
    "\"!=\"",
    "\"||\"",
    "\"&&\"",
    "\"++\"",
    "\"--\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"&\"",
    "\"|\"",
    "\"^\"",
    "\"%\"",
    "\"<<\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"&=\"",
    "\"|=\"",
    "\"^=\"",
    "\"%=\"",
    "\"<<=\"",
    "\">>=\"",
    "\"...\"",
    "\"@<:@\"",
    "\"@:>@\"",
    "\"@S|@\"",
    "\"@%:@\"",
    "\"@{:@\"",
    "\"@:}@\"",
    "\"@&t@\"",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<DECIMAL_FLOATING_POINT_LITERAL>",
    "<DECIMAL_EXPONENT>",
    "<HEXADECIMAL_FLOATING_POINT_LITERAL>",
    "<HEXADECIMAL_EXPONENT>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "<M4_MACRO>",
    "<M4_MACRO_INVOCATION>",
    "<MACRO_NAME>",
    "<IDENTIFIER>",
    "<LETTER>",
    "<PART_LETTER>",
    "<MTEXT>",
    "<TEXT>",
  };

}
