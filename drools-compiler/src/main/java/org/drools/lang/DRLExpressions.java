// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g 2011-03-14 12:59:18

    package org.drools.lang;

    import java.util.LinkedList;
    import org.drools.compiler.DroolsParserException;
    import org.drools.lang.ParserHelper;
    import org.drools.lang.DroolsParserExceptionFactory;
    import org.drools.CheckedDroolsException;

    import org.drools.lang.descr.AtomicExprDescr;
    import org.drools.lang.descr.BaseDescr;
    import org.drools.lang.descr.ConstraintConnectiveDescr;
    import org.drools.lang.descr.RelationalExprDescr;
    


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class DRLExpressions extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EOL", "WS", "Exponent", "FloatTypeSuffix", "FLOAT", "HexDigit", "IntegerTypeSuffix", "HEX", "DECIMAL", "EscapeSequence", "STRING", "TimePeriod", "UnicodeEscape", "OctalEscape", "BOOL", "NULL", "AT", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "DECR", "INCR", "ARROW", "SEMICOLON", "COLON", "EQUALS", "NOT_EQUALS", "GREATER_EQUALS", "LESS_EQUALS", "GREATER", "LESS", "EQUALS_ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_SQUARE", "RIGHT_SQUARE", "LEFT_CURLY", "RIGHT_CURLY", "COMMA", "DOT", "DOUBLE_AMPER", "DOUBLE_PIPE", "QUESTION", "NEGATION", "TILDE", "PIPE", "AMPER", "XOR", "MOD", "STAR", "MINUS", "PLUS", "SH_STYLE_SINGLE_LINE_COMMENT", "C_STYLE_SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "IdentifierStart", "IdentifierPart", "ID", "DIV", "MISC"
    };
    public static final int EOF=-1;
    public static final int EOL=4;
    public static final int WS=5;
    public static final int Exponent=6;
    public static final int FloatTypeSuffix=7;
    public static final int FLOAT=8;
    public static final int HexDigit=9;
    public static final int IntegerTypeSuffix=10;
    public static final int HEX=11;
    public static final int DECIMAL=12;
    public static final int EscapeSequence=13;
    public static final int STRING=14;
    public static final int TimePeriod=15;
    public static final int UnicodeEscape=16;
    public static final int OctalEscape=17;
    public static final int BOOL=18;
    public static final int NULL=19;
    public static final int AT=20;
    public static final int PLUS_ASSIGN=21;
    public static final int MINUS_ASSIGN=22;
    public static final int MULT_ASSIGN=23;
    public static final int DIV_ASSIGN=24;
    public static final int AND_ASSIGN=25;
    public static final int OR_ASSIGN=26;
    public static final int XOR_ASSIGN=27;
    public static final int MOD_ASSIGN=28;
    public static final int DECR=29;
    public static final int INCR=30;
    public static final int ARROW=31;
    public static final int SEMICOLON=32;
    public static final int COLON=33;
    public static final int EQUALS=34;
    public static final int NOT_EQUALS=35;
    public static final int GREATER_EQUALS=36;
    public static final int LESS_EQUALS=37;
    public static final int GREATER=38;
    public static final int LESS=39;
    public static final int EQUALS_ASSIGN=40;
    public static final int LEFT_PAREN=41;
    public static final int RIGHT_PAREN=42;
    public static final int LEFT_SQUARE=43;
    public static final int RIGHT_SQUARE=44;
    public static final int LEFT_CURLY=45;
    public static final int RIGHT_CURLY=46;
    public static final int COMMA=47;
    public static final int DOT=48;
    public static final int DOUBLE_AMPER=49;
    public static final int DOUBLE_PIPE=50;
    public static final int QUESTION=51;
    public static final int NEGATION=52;
    public static final int TILDE=53;
    public static final int PIPE=54;
    public static final int AMPER=55;
    public static final int XOR=56;
    public static final int MOD=57;
    public static final int STAR=58;
    public static final int MINUS=59;
    public static final int PLUS=60;
    public static final int SH_STYLE_SINGLE_LINE_COMMENT=61;
    public static final int C_STYLE_SINGLE_LINE_COMMENT=62;
    public static final int MULTI_LINE_COMMENT=63;
    public static final int IdentifierStart=64;
    public static final int IdentifierPart=65;
    public static final int ID=66;
    public static final int DIV=67;
    public static final int MISC=68;

    // delegates
    // delegators


        public DRLExpressions(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DRLExpressions(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DRLExpressions.tokenNames; }
    public String getGrammarFileName() { return "/home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g"; }


        private ParserHelper helper;
                                                        
        public DRLExpressions(TokenStream input,
                              RecognizerSharedState state,
                              ParserHelper helper ) {
            this( input,
                  state );
            this.helper = helper;
        }

        public ParserHelper getHelper()                           { return helper; }
        public boolean hasErrors()                                { return helper.hasErrors(); }
        public List<DroolsParserException> getErrors()            { return helper.getErrors(); }
        public List<String> getErrorMessages()                    { return helper.getErrorMessages(); }
        public void enableEditorInterface()                       {        helper.enableEditorInterface(); }
        public void disableEditorInterface()                      {        helper.disableEditorInterface(); }
        public LinkedList<DroolsSentence> getEditorInterface()    { return helper.getEditorInterface(); }
        public void reportError(RecognitionException ex)          {        helper.reportError( ex ); }
        public void emitErrorMessage(String msg)                  {}
        
        private boolean buildDescr;
        public void setBuildDescr( boolean build ) { this.buildDescr = build; }
        public boolean isBuildDescr() { return this.buildDescr; }
        
        public void setLeftMostExpr( String value ) { helper.setLeftMostExpr( value ); }
        public String getLeftMostExpr() { return helper.getLeftMostExpr(); }


    public static class literal_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "literal"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:64:1: literal : ( STRING | DECIMAL | HEX | FLOAT | BOOL | NULL );
    public final DRLExpressions.literal_return literal() throws RecognitionException {
        DRLExpressions.literal_return retval = new DRLExpressions.literal_return();
        retval.start = input.LT(1);

        Token STRING1=null;
        Token DECIMAL2=null;
        Token HEX3=null;
        Token FLOAT4=null;
        Token BOOL5=null;
        Token NULL6=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:65:5: ( STRING | DECIMAL | HEX | FLOAT | BOOL | NULL )
            int alt1=6;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt1=1;
                }
                break;
            case DECIMAL:
                {
                alt1=2;
                }
                break;
            case HEX:
                {
                alt1=3;
                }
                break;
            case FLOAT:
                {
                alt1=4;
                }
                break;
            case BOOL:
                {
                alt1=5;
                }
                break;
            case NULL:
                {
                alt1=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:65:7: STRING
                    {
                    STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_literal83); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      	helper.emit(STRING1, DroolsEditorType.STRING_CONST);	
                    }

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:66:7: DECIMAL
                    {
                    DECIMAL2=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_literal98); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      	helper.emit(DECIMAL2, DroolsEditorType.NUMERIC_CONST);	
                    }

                    }
                    break;
                case 3 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:67:7: HEX
                    {
                    HEX3=(Token)match(input,HEX,FOLLOW_HEX_in_literal112); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      	helper.emit(HEX3, DroolsEditorType.NUMERIC_CONST);	
                    }

                    }
                    break;
                case 4 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:68:7: FLOAT
                    {
                    FLOAT4=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal130); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      	helper.emit(FLOAT4, DroolsEditorType.NUMERIC_CONST);	
                    }

                    }
                    break;
                case 5 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:69:7: BOOL
                    {
                    BOOL5=(Token)match(input,BOOL,FOLLOW_BOOL_in_literal146); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      	helper.emit(BOOL5, DroolsEditorType.BOOLEAN_CONST);	
                    }

                    }
                    break;
                case 6 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:70:7: NULL
                    {
                    NULL6=(Token)match(input,NULL,FOLLOW_NULL_in_literal163); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      	helper.emit(NULL6, DroolsEditorType.NULL_CONST);	
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class operator_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "operator"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:73:1: operator : ( EQUALS | NOT_EQUALS | relationalOp ) ;
    public final DRLExpressions.operator_return operator() throws RecognitionException {
        DRLExpressions.operator_return retval = new DRLExpressions.operator_return();
        retval.start = input.LT(1);

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:74:3: ( ( EQUALS | NOT_EQUALS | relationalOp ) )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:74:5: ( EQUALS | NOT_EQUALS | relationalOp )
            {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:74:5: ( EQUALS | NOT_EQUALS | relationalOp )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EQUALS) ) {
                alt2=1;
            }
            else if ( (LA2_0==NOT_EQUALS) ) {
                alt2=2;
            }
            else if ( ((LA2_0>=GREATER_EQUALS && LA2_0<=LESS)) ) {
                alt2=3;
            }
            else if ( (LA2_0==ID) && ((((helper.validateIdentifierKey(DroolsSoftKeywords.NOT)))||((helper.isPluggableEvaluator(false)))))) {
                alt2=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:74:7: EQUALS
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_operator189); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:75:7: NOT_EQUALS
                    {
                    match(input,NOT_EQUALS,FOLLOW_NOT_EQUALS_in_operator197); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:76:7: relationalOp
                    {
                    pushFollow(FOLLOW_relationalOp_in_operator205);
                    relationalOp();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operator"


    // $ANTLR start "relationalOp"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:80:1: relationalOp : ( LESS_EQUALS | GREATER_EQUALS | LESS | GREATER | not_key neg_operator_key ( ( squareArguments )=> squareArguments )? | operator_key ( ( squareArguments )=> squareArguments )? ) ;
    public final void relationalOp() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:81:3: ( ( LESS_EQUALS | GREATER_EQUALS | LESS | GREATER | not_key neg_operator_key ( ( squareArguments )=> squareArguments )? | operator_key ( ( squareArguments )=> squareArguments )? ) )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:81:5: ( LESS_EQUALS | GREATER_EQUALS | LESS | GREATER | not_key neg_operator_key ( ( squareArguments )=> squareArguments )? | operator_key ( ( squareArguments )=> squareArguments )? )
            {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:81:5: ( LESS_EQUALS | GREATER_EQUALS | LESS | GREATER | not_key neg_operator_key ( ( squareArguments )=> squareArguments )? | operator_key ( ( squareArguments )=> squareArguments )? )
            int alt5=6;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==LESS_EQUALS) ) {
                alt5=1;
            }
            else if ( (LA5_0==GREATER_EQUALS) ) {
                alt5=2;
            }
            else if ( (LA5_0==LESS) ) {
                alt5=3;
            }
            else if ( (LA5_0==GREATER) ) {
                alt5=4;
            }
            else if ( (LA5_0==ID) && ((((helper.validateIdentifierKey(DroolsSoftKeywords.NOT)))||((helper.isPluggableEvaluator(false)))))) {
                int LA5_5 = input.LA(2);

                if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.NOT)))) ) {
                    alt5=5;
                }
                else if ( (((helper.isPluggableEvaluator(false)))) ) {
                    alt5=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:81:7: LESS_EQUALS
                    {
                    match(input,LESS_EQUALS,FOLLOW_LESS_EQUALS_in_relationalOp228); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:82:7: GREATER_EQUALS
                    {
                    match(input,GREATER_EQUALS,FOLLOW_GREATER_EQUALS_in_relationalOp236); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:83:7: LESS
                    {
                    match(input,LESS,FOLLOW_LESS_in_relationalOp245); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:84:7: GREATER
                    {
                    match(input,GREATER,FOLLOW_GREATER_in_relationalOp254); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:85:7: not_key neg_operator_key ( ( squareArguments )=> squareArguments )?
                    {
                    pushFollow(FOLLOW_not_key_in_relationalOp262);
                    not_key();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_neg_operator_key_in_relationalOp264);
                    neg_operator_key();

                    state._fsp--;
                    if (state.failed) return ;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:85:32: ( ( squareArguments )=> squareArguments )?
                    int alt3=2;
                    alt3 = dfa3.predict(input);
                    switch (alt3) {
                        case 1 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:85:33: ( squareArguments )=> squareArguments
                            {
                            pushFollow(FOLLOW_squareArguments_in_relationalOp272);
                            squareArguments();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:86:7: operator_key ( ( squareArguments )=> squareArguments )?
                    {
                    pushFollow(FOLLOW_operator_key_in_relationalOp282);
                    operator_key();

                    state._fsp--;
                    if (state.failed) return ;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:86:21: ( ( squareArguments )=> squareArguments )?
                    int alt4=2;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:86:22: ( squareArguments )=> squareArguments
                            {
                            pushFollow(FOLLOW_squareArguments_in_relationalOp291);
                            squareArguments();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relationalOp"


    // $ANTLR start "typeList"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:90:1: typeList : type ( COMMA type )* ;
    public final void typeList() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:91:5: ( type ( COMMA type )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:91:7: type ( COMMA type )*
            {
            pushFollow(FOLLOW_type_in_typeList320);
            type();

            state._fsp--;
            if (state.failed) return ;
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:91:12: ( COMMA type )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:91:13: COMMA type
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_typeList323); if (state.failed) return ;
            	    pushFollow(FOLLOW_type_in_typeList325);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "typeList"

    public static class type_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "type"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:94:1: type : tm= typeMatch ;
    public final DRLExpressions.type_return type() throws RecognitionException {
        DRLExpressions.type_return retval = new DRLExpressions.type_return();
        retval.start = input.LT(1);

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:95:5: (tm= typeMatch )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:95:8: tm= typeMatch
            {
            pushFollow(FOLLOW_typeMatch_in_type347);
            typeMatch();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"


    // $ANTLR start "typeMatch"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:98:1: typeMatch : ( ( primitiveType )=> ( primitiveType ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )* ) | ( ID ( ( typeArguments )=> typeArguments )? ( DOT ID ( ( typeArguments )=> typeArguments )? )* ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )* ) );
    public final void typeMatch() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:99:5: ( ( primitiveType )=> ( primitiveType ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )* ) | ( ID ( ( typeArguments )=> typeArguments )? ( DOT ID ( ( typeArguments )=> typeArguments )? )* ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )* ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                int LA12_1 = input.LA(2);

                if ( (((synpred3_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE))))||(synpred3_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))||(synpred3_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF))))||(synpred3_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT))))||(synpred3_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.LONG))))||(synpred3_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE))))||(synpred3_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT))))||(synpred3_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))))) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:99:8: ( primitiveType )=> ( primitiveType ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )* )
                    {
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:99:27: ( primitiveType ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )* )
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:99:29: primitiveType ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )*
                    {
                    pushFollow(FOLLOW_primitiveType_in_typeMatch378);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return ;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:99:43: ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==LEFT_SQUARE) && (synpred4_DRLExpressions())) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:99:44: ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE
                    	    {
                    	    match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_typeMatch388); if (state.failed) return ;
                    	    match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_typeMatch390); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:7: ( ID ( ( typeArguments )=> typeArguments )? ( DOT ID ( ( typeArguments )=> typeArguments )? )* ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )* )
                    {
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:7: ( ID ( ( typeArguments )=> typeArguments )? ( DOT ID ( ( typeArguments )=> typeArguments )? )* ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )* )
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:9: ID ( ( typeArguments )=> typeArguments )? ( DOT ID ( ( typeArguments )=> typeArguments )? )* ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )*
                    {
                    match(input,ID,FOLLOW_ID_in_typeMatch404); if (state.failed) return ;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:12: ( ( typeArguments )=> typeArguments )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==LESS) ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1==ID) && (synpred5_DRLExpressions())) {
                            alt8=1;
                        }
                        else if ( (LA8_1==QUESTION) && (synpred5_DRLExpressions())) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:13: ( typeArguments )=> typeArguments
                            {
                            pushFollow(FOLLOW_typeArguments_in_typeMatch411);
                            typeArguments();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:46: ( DOT ID ( ( typeArguments )=> typeArguments )? )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==DOT) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:47: DOT ID ( ( typeArguments )=> typeArguments )?
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_typeMatch416); if (state.failed) return ;
                    	    match(input,ID,FOLLOW_ID_in_typeMatch418); if (state.failed) return ;
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:54: ( ( typeArguments )=> typeArguments )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==LESS) ) {
                    	        int LA9_1 = input.LA(2);

                    	        if ( (LA9_1==ID) && (synpred6_DRLExpressions())) {
                    	            alt9=1;
                    	        }
                    	        else if ( (LA9_1==QUESTION) && (synpred6_DRLExpressions())) {
                    	            alt9=1;
                    	        }
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:55: ( typeArguments )=> typeArguments
                    	            {
                    	            pushFollow(FOLLOW_typeArguments_in_typeMatch425);
                    	            typeArguments();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:91: ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==LEFT_SQUARE) && (synpred7_DRLExpressions())) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:92: ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE
                    	    {
                    	    match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_typeMatch440); if (state.failed) return ;
                    	    match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_typeMatch442); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }


                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "typeMatch"


    // $ANTLR start "typeArguments"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:103:1: typeArguments : LESS typeArgument ( COMMA typeArgument )* GREATER ;
    public final void typeArguments() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:104:5: ( LESS typeArgument ( COMMA typeArgument )* GREATER )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:104:7: LESS typeArgument ( COMMA typeArgument )* GREATER
            {
            match(input,LESS,FOLLOW_LESS_in_typeArguments467); if (state.failed) return ;
            pushFollow(FOLLOW_typeArgument_in_typeArguments469);
            typeArgument();

            state._fsp--;
            if (state.failed) return ;
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:104:25: ( COMMA typeArgument )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:104:26: COMMA typeArgument
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_typeArguments472); if (state.failed) return ;
            	    pushFollow(FOLLOW_typeArgument_in_typeArguments474);
            	    typeArgument();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,GREATER,FOLLOW_GREATER_in_typeArguments478); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "typeArguments"


    // $ANTLR start "typeArgument"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:107:1: typeArgument : ( type | QUESTION ( ( extends_key | super_key ) type )? );
    public final void typeArgument() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:108:5: ( type | QUESTION ( ( extends_key | super_key ) type )? )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==QUESTION) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:108:7: type
                    {
                    pushFollow(FOLLOW_type_in_typeArgument495);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:109:7: QUESTION ( ( extends_key | super_key ) type )?
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_typeArgument503); if (state.failed) return ;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:109:16: ( ( extends_key | super_key ) type )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==ID) && ((((helper.validateIdentifierKey(DroolsSoftKeywords.SUPER)))||((helper.validateIdentifierKey(DroolsSoftKeywords.EXTENDS)))))) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:109:17: ( extends_key | super_key ) type
                            {
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:109:17: ( extends_key | super_key )
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==ID) && ((((helper.validateIdentifierKey(DroolsSoftKeywords.SUPER)))||((helper.validateIdentifierKey(DroolsSoftKeywords.EXTENDS)))))) {
                                int LA14_1 = input.LA(2);

                                if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.EXTENDS)))) ) {
                                    alt14=1;
                                }
                                else if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.SUPER)))) ) {
                                    alt14=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 14, 1, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 0, input);

                                throw nvae;
                            }
                            switch (alt14) {
                                case 1 :
                                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:109:18: extends_key
                                    {
                                    pushFollow(FOLLOW_extends_key_in_typeArgument507);
                                    extends_key();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:109:32: super_key
                                    {
                                    pushFollow(FOLLOW_super_key_in_typeArgument511);
                                    super_key();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_type_in_typeArgument514);
                            type();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "typeArgument"


    // $ANTLR start "dummy"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:117:1: dummy : expression ( AT | SEMICOLON | EOF | ID ) ;
    public final void dummy() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:118:5: ( expression ( AT | SEMICOLON | EOF | ID ) )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:118:7: expression ( AT | SEMICOLON | EOF | ID )
            {
            pushFollow(FOLLOW_expression_in_dummy538);
            expression();

            state._fsp--;
            if (state.failed) return ;
            if ( input.LA(1)==EOF||input.LA(1)==AT||input.LA(1)==SEMICOLON||input.LA(1)==ID ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dummy"


    // $ANTLR start "dummy2"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:120:1: dummy2 : relationalExpression EOF ;
    public final void dummy2() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:121:5: ( relationalExpression EOF )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:121:8: relationalExpression EOF
            {
            pushFollow(FOLLOW_relationalExpression_in_dummy2574);
            relationalExpression();

            state._fsp--;
            if (state.failed) return ;
            match(input,EOF,FOLLOW_EOF_in_dummy2576); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dummy2"


    // $ANTLR start "expression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:124:1: expression returns [BaseDescr result] : left= conditionalExpression ( ( assignmentOperator )=>op= assignmentOperator left= expression )? ;
    public final BaseDescr expression() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr left = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:125:5: (left= conditionalExpression ( ( assignmentOperator )=>op= assignmentOperator left= expression )? )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:125:7: left= conditionalExpression ( ( assignmentOperator )=>op= assignmentOperator left= expression )?
            {
            pushFollow(FOLLOW_conditionalExpression_in_expression599);
            left=conditionalExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:126:9: ( ( assignmentOperator )=>op= assignmentOperator left= expression )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:126:10: ( assignmentOperator )=>op= assignmentOperator left= expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression620);
                    assignmentOperator();

                    state._fsp--;
                    if (state.failed) return result;
                    pushFollow(FOLLOW_expression_in_expression624);
                    left=expression();

                    state._fsp--;
                    if (state.failed) return result;

                    }
                    break;

            }


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "expression"


    // $ANTLR start "conditionalExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:129:1: conditionalExpression returns [BaseDescr result] : left= conditionalOrExpression ( QUESTION ts= expression COLON fs= expression )? ;
    public final BaseDescr conditionalExpression() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr left = null;

        BaseDescr ts = null;

        BaseDescr fs = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:130:5: (left= conditionalOrExpression ( QUESTION ts= expression COLON fs= expression )? )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:130:9: left= conditionalOrExpression ( QUESTION ts= expression COLON fs= expression )?
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression651);
            left=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:131:9: ( QUESTION ts= expression COLON fs= expression )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==QUESTION) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:131:11: QUESTION ts= expression COLON fs= expression
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression665); if (state.failed) return result;
                    pushFollow(FOLLOW_expression_in_conditionalExpression669);
                    ts=expression();

                    state._fsp--;
                    if (state.failed) return result;
                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression671); if (state.failed) return result;
                    pushFollow(FOLLOW_expression_in_conditionalExpression675);
                    fs=expression();

                    state._fsp--;
                    if (state.failed) return result;

                    }
                    break;

            }


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "conditionalExpression"


    // $ANTLR start "conditionalOrExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:134:1: conditionalOrExpression returns [BaseDescr result] : left= conditionalAndExpression ( DOUBLE_PIPE right= conditionalAndExpression )* ;
    public final BaseDescr conditionalOrExpression() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr left = null;

        BaseDescr right = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:135:3: (left= conditionalAndExpression ( DOUBLE_PIPE right= conditionalAndExpression )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:135:5: left= conditionalAndExpression ( DOUBLE_PIPE right= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression700);
            left=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:136:3: ( DOUBLE_PIPE right= conditionalAndExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==DOUBLE_PIPE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:136:5: DOUBLE_PIPE right= conditionalAndExpression
            	    {
            	    match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_conditionalOrExpression709); if (state.failed) return result;
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression713);
            	    right=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       if( buildDescr && state.backtracking == 0 ) {
            	                     ConstraintConnectiveDescr descr = ConstraintConnectiveDescr.newOr(); 
            	                     descr.addOrMerge( result );  
            	                     descr.addOrMerge( right ); 
            	                     result = descr;
            	                 }
            	               
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "conditionalOrExpression"


    // $ANTLR start "conditionalAndExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:147:1: conditionalAndExpression returns [BaseDescr result] : left= inclusiveOrExpression ( DOUBLE_AMPER right= inclusiveOrExpression )* ;
    public final BaseDescr conditionalAndExpression() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr left = null;

        BaseDescr right = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:148:3: (left= inclusiveOrExpression ( DOUBLE_AMPER right= inclusiveOrExpression )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:148:5: left= inclusiveOrExpression ( DOUBLE_AMPER right= inclusiveOrExpression )*
            {
            pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression750);
            left=inclusiveOrExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:149:3: ( DOUBLE_AMPER right= inclusiveOrExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==DOUBLE_AMPER) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:149:5: DOUBLE_AMPER right= inclusiveOrExpression
            	    {
            	    match(input,DOUBLE_AMPER,FOLLOW_DOUBLE_AMPER_in_conditionalAndExpression758); if (state.failed) return result;
            	    pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression762);
            	    right=inclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       if( buildDescr && state.backtracking == 0 ) {
            	                     ConstraintConnectiveDescr descr = ConstraintConnectiveDescr.newAnd(); 
            	                     descr.addOrMerge( result );  
            	                     descr.addOrMerge( right ); 
            	                     result = descr;
            	                 }
            	               
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "conditionalAndExpression"


    // $ANTLR start "inclusiveOrExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:160:1: inclusiveOrExpression returns [BaseDescr result] : left= exclusiveOrExpression ( PIPE right= exclusiveOrExpression )* ;
    public final BaseDescr inclusiveOrExpression() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr left = null;

        BaseDescr right = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:161:3: (left= exclusiveOrExpression ( PIPE right= exclusiveOrExpression )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:161:5: left= exclusiveOrExpression ( PIPE right= exclusiveOrExpression )*
            {
            pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression798);
            left=exclusiveOrExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:162:3: ( PIPE right= exclusiveOrExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==PIPE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:162:5: PIPE right= exclusiveOrExpression
            	    {
            	    match(input,PIPE,FOLLOW_PIPE_in_inclusiveOrExpression806); if (state.failed) return result;
            	    pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression810);
            	    right=exclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       if( buildDescr && state.backtracking == 0 ) {
            	                     ConstraintConnectiveDescr descr = ConstraintConnectiveDescr.newIncOr(); 
            	                     descr.addOrMerge( result );  
            	                     descr.addOrMerge( right ); 
            	                     result = descr;
            	                 }
            	               
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "inclusiveOrExpression"


    // $ANTLR start "exclusiveOrExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:173:1: exclusiveOrExpression returns [BaseDescr result] : left= andExpression ( XOR right= andExpression )* ;
    public final BaseDescr exclusiveOrExpression() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr left = null;

        BaseDescr right = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:174:3: (left= andExpression ( XOR right= andExpression )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:174:5: left= andExpression ( XOR right= andExpression )*
            {
            pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression846);
            left=andExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:175:3: ( XOR right= andExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==XOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:175:5: XOR right= andExpression
            	    {
            	    match(input,XOR,FOLLOW_XOR_in_exclusiveOrExpression854); if (state.failed) return result;
            	    pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression858);
            	    right=andExpression();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       if( buildDescr && state.backtracking == 0 ) {
            	                     ConstraintConnectiveDescr descr = ConstraintConnectiveDescr.newXor(); 
            	                     descr.addOrMerge( result );  
            	                     descr.addOrMerge( right ); 
            	                     result = descr;
            	                 }
            	               
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "exclusiveOrExpression"


    // $ANTLR start "andExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:186:1: andExpression returns [BaseDescr result] : left= equalityExpression ( AMPER right= equalityExpression )* ;
    public final BaseDescr andExpression() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr left = null;

        BaseDescr right = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:187:3: (left= equalityExpression ( AMPER right= equalityExpression )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:187:5: left= equalityExpression ( AMPER right= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_andExpression896);
            left=equalityExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:188:3: ( AMPER right= equalityExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AMPER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:188:5: AMPER right= equalityExpression
            	    {
            	    match(input,AMPER,FOLLOW_AMPER_in_andExpression904); if (state.failed) return result;
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression908);
            	    right=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       if( buildDescr && state.backtracking == 0 ) {
            	                     ConstraintConnectiveDescr descr = ConstraintConnectiveDescr.newIncAnd(); 
            	                     descr.addOrMerge( result );  
            	                     descr.addOrMerge( right ); 
            	                     result = descr;
            	                 }
            	               
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "andExpression"


    // $ANTLR start "equalityExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:199:1: equalityExpression returns [BaseDescr result] : left= instanceOfExpression ( (op= EQUALS | op= NOT_EQUALS ) right= instanceOfExpression )* ;
    public final BaseDescr equalityExpression() throws RecognitionException {
        BaseDescr result = null;

        Token op=null;
        BaseDescr left = null;

        BaseDescr right = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:200:3: (left= instanceOfExpression ( (op= EQUALS | op= NOT_EQUALS ) right= instanceOfExpression )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:200:5: left= instanceOfExpression ( (op= EQUALS | op= NOT_EQUALS ) right= instanceOfExpression )*
            {
            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression948);
            left=instanceOfExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:201:3: ( (op= EQUALS | op= NOT_EQUALS ) right= instanceOfExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=EQUALS && LA25_0<=NOT_EQUALS)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:201:5: (op= EQUALS | op= NOT_EQUALS ) right= instanceOfExpression
            	    {
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:201:5: (op= EQUALS | op= NOT_EQUALS )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==EQUALS) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==NOT_EQUALS) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:201:7: op= EQUALS
            	            {
            	            op=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_equalityExpression960); if (state.failed) return result;

            	            }
            	            break;
            	        case 2 :
            	            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:201:19: op= NOT_EQUALS
            	            {
            	            op=(Token)match(input,NOT_EQUALS,FOLLOW_NOT_EQUALS_in_equalityExpression966); if (state.failed) return result;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression972);
            	    right=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       if( buildDescr && state.backtracking == 0 ) {
            	                     result = new RelationalExprDescr( (op!=null?op.getText():null), left, right );
            	                 }
            	               
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "equalityExpression"


    // $ANTLR start "instanceOfExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:209:1: instanceOfExpression returns [BaseDescr result] : left= inExpression (op= instanceof_key right= type )? ;
    public final BaseDescr instanceOfExpression() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr left = null;

        DRLExpressions.instanceof_key_return op = null;

        DRLExpressions.type_return right = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:210:3: (left= inExpression (op= instanceof_key right= type )? )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:210:5: left= inExpression (op= instanceof_key right= type )?
            {
            pushFollow(FOLLOW_inExpression_in_instanceOfExpression1008);
            left=inExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:211:3: (op= instanceof_key right= type )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==ID) && (((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF))))) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:211:4: op= instanceof_key right= type
                    {
                    pushFollow(FOLLOW_instanceof_key_in_instanceOfExpression1017);
                    op=instanceof_key();

                    state._fsp--;
                    if (state.failed) return result;
                    pushFollow(FOLLOW_type_in_instanceOfExpression1021);
                    right=type();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       if( buildDescr && state.backtracking == 0 ) {
                                     result = new RelationalExprDescr( (op!=null?input.toString(op.start,op.stop):null), left, new AtomicExprDescr((right!=null?input.toString(right.start,right.stop):null)) );
                                 }
                               
                    }

                    }
                    break;

            }


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "instanceOfExpression"


    // $ANTLR start "inExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:219:1: inExpression returns [BaseDescr result] : left= relationalExpression ( not_key in= in_key LEFT_PAREN expression ( COMMA expression )* RIGHT_PAREN | in= in_key LEFT_PAREN expression ( COMMA expression )* RIGHT_PAREN )? ;
    public final BaseDescr inExpression() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr left = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:220:3: (left= relationalExpression ( not_key in= in_key LEFT_PAREN expression ( COMMA expression )* RIGHT_PAREN | in= in_key LEFT_PAREN expression ( COMMA expression )* RIGHT_PAREN )? )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:220:5: left= relationalExpression ( not_key in= in_key LEFT_PAREN expression ( COMMA expression )* RIGHT_PAREN | in= in_key LEFT_PAREN expression ( COMMA expression )* RIGHT_PAREN )?
            {
            pushFollow(FOLLOW_relationalExpression_in_inExpression1056);
            left=relationalExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:221:5: ( not_key in= in_key LEFT_PAREN expression ( COMMA expression )* RIGHT_PAREN | in= in_key LEFT_PAREN expression ( COMMA expression )* RIGHT_PAREN )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==ID) ) {
                    int LA29_3 = input.LA(3);

                    if ( (LA29_3==LEFT_PAREN) && (((helper.validateIdentifierKey(DroolsSoftKeywords.NOT))))) {
                        alt29=1;
                    }
                }
                else if ( (LA29_1==LEFT_PAREN) && (((helper.validateIdentifierKey(DroolsSoftKeywords.IN))))) {
                    alt29=2;
                }
            }
            switch (alt29) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:221:7: not_key in= in_key LEFT_PAREN expression ( COMMA expression )* RIGHT_PAREN
                    {
                    pushFollow(FOLLOW_not_key_in_inExpression1066);
                    not_key();

                    state._fsp--;
                    if (state.failed) return result;
                    pushFollow(FOLLOW_in_key_in_inExpression1070);
                    in_key();

                    state._fsp--;
                    if (state.failed) return result;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_inExpression1072); if (state.failed) return result;
                    pushFollow(FOLLOW_expression_in_inExpression1074);
                    expression();

                    state._fsp--;
                    if (state.failed) return result;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:221:47: ( COMMA expression )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==COMMA) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:221:48: COMMA expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_inExpression1077); if (state.failed) return result;
                    	    pushFollow(FOLLOW_expression_in_inExpression1079);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return result;

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_inExpression1083); if (state.failed) return result;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:222:7: in= in_key LEFT_PAREN expression ( COMMA expression )* RIGHT_PAREN
                    {
                    pushFollow(FOLLOW_in_key_in_inExpression1093);
                    in_key();

                    state._fsp--;
                    if (state.failed) return result;
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_inExpression1095); if (state.failed) return result;
                    pushFollow(FOLLOW_expression_in_inExpression1097);
                    expression();

                    state._fsp--;
                    if (state.failed) return result;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:222:39: ( COMMA expression )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==COMMA) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:222:40: COMMA expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_inExpression1100); if (state.failed) return result;
                    	    pushFollow(FOLLOW_expression_in_inExpression1102);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return result;

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_inExpression1106); if (state.failed) return result;

                    }
                    break;

            }


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "inExpression"


    // $ANTLR start "relationalExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:226:1: relationalExpression returns [BaseDescr result] : left= shiftExpression ( ( orRestriction[null] )=>right= orRestriction[$result] )* ;
    public final BaseDescr relationalExpression() throws RecognitionException {
        BaseDescr result = null;

        DRLExpressions.shiftExpression_return left = null;

        BaseDescr right = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:227:3: (left= shiftExpression ( ( orRestriction[null] )=>right= orRestriction[$result] )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:227:5: left= shiftExpression ( ( orRestriction[null] )=>right= orRestriction[$result] )*
            {
            pushFollow(FOLLOW_shiftExpression_in_relationalExpression1133);
            left=shiftExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { 
                        result = ( (left!=null?left.result:null) != null && 
                                    ( (!((left!=null?left.result:null) instanceof AtomicExprDescr)) || 
                                      ((left!=null?input.toString(left.start,left.stop):null).equals(((AtomicExprDescr)(left!=null?left.result:null)).getExpression())) )) ? 
                                  (left!=null?left.result:null) : 
                                  new AtomicExprDescr( (left!=null?input.toString(left.start,left.stop):null) ) ; 
                    } 
                  
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:236:3: ( ( orRestriction[null] )=>right= orRestriction[$result] )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:236:5: ( orRestriction[null] )=>right= orRestriction[$result]
            	    {
            	    pushFollow(FOLLOW_orRestriction_in_relationalExpression1154);
            	    right=orRestriction(result);

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       if( buildDescr && state.backtracking == 0 ) {
            	                     result = right;
            	                 }
            	               
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "relationalExpression"


    // $ANTLR start "orRestriction"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:244:1: orRestriction[BaseDescr inp] returns [BaseDescr result] : left= andRestriction[$inp] ( ( DOUBLE_PIPE andRestriction[null] )=>lop= DOUBLE_PIPE right= andRestriction[$inp] )* ( EOF )? ;
    public final BaseDescr orRestriction(BaseDescr inp) throws RecognitionException {
        BaseDescr result = null;

        Token lop=null;
        BaseDescr left = null;

        BaseDescr right = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:245:3: (left= andRestriction[$inp] ( ( DOUBLE_PIPE andRestriction[null] )=>lop= DOUBLE_PIPE right= andRestriction[$inp] )* ( EOF )? )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:245:5: left= andRestriction[$inp] ( ( DOUBLE_PIPE andRestriction[null] )=>lop= DOUBLE_PIPE right= andRestriction[$inp] )* ( EOF )?
            {
            pushFollow(FOLLOW_andRestriction_in_orRestriction1191);
            left=andRestriction(inp);

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:246:5: ( ( DOUBLE_PIPE andRestriction[null] )=>lop= DOUBLE_PIPE right= andRestriction[$inp] )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:246:7: ( DOUBLE_PIPE andRestriction[null] )=>lop= DOUBLE_PIPE right= andRestriction[$inp]
            	    {
            	    lop=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_orRestriction1211); if (state.failed) return result;
            	    pushFollow(FOLLOW_andRestriction_in_orRestriction1215);
            	    right=andRestriction(inp);

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       if( buildDescr && state.backtracking == 0 ) {
            	                     ConstraintConnectiveDescr descr = ConstraintConnectiveDescr.newOr(); 
            	                     descr.addOrMerge( result );  
            	                     descr.addOrMerge( right ); 
            	                     result = descr;
            	                 }
            	               
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:254:7: ( EOF )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==EOF) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==EOF) ) {
                    int LA32_3 = input.LA(3);

                    if ( (LA32_3==EOF) ) {
                        alt32=1;
                    }
                }
                else if ( ((LA32_1>=AT && LA32_1<=MOD_ASSIGN)||(LA32_1>=SEMICOLON && LA32_1<=RIGHT_PAREN)||LA32_1==RIGHT_SQUARE||(LA32_1>=RIGHT_CURLY && LA32_1<=COMMA)||(LA32_1>=DOUBLE_AMPER && LA32_1<=QUESTION)||(LA32_1>=PIPE && LA32_1<=XOR)||LA32_1==ID) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:254:7: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_orRestriction1236); if (state.failed) return result;

                    }
                    break;

            }


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "orRestriction"


    // $ANTLR start "andRestriction"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:257:1: andRestriction[BaseDescr inp] returns [BaseDescr result] : left= singleRestriction[$inp] ( ( DOUBLE_AMPER singleRestriction[null] )=>lop= DOUBLE_AMPER right= singleRestriction[$inp] )* ;
    public final BaseDescr andRestriction(BaseDescr inp) throws RecognitionException {
        BaseDescr result = null;

        Token lop=null;
        BaseDescr left = null;

        BaseDescr right = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:258:3: (left= singleRestriction[$inp] ( ( DOUBLE_AMPER singleRestriction[null] )=>lop= DOUBLE_AMPER right= singleRestriction[$inp] )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:258:5: left= singleRestriction[$inp] ( ( DOUBLE_AMPER singleRestriction[null] )=>lop= DOUBLE_AMPER right= singleRestriction[$inp] )*
            {
            pushFollow(FOLLOW_singleRestriction_in_andRestriction1261);
            left=singleRestriction(inp);

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:259:3: ( ( DOUBLE_AMPER singleRestriction[null] )=>lop= DOUBLE_AMPER right= singleRestriction[$inp] )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:259:5: ( DOUBLE_AMPER singleRestriction[null] )=>lop= DOUBLE_AMPER right= singleRestriction[$inp]
            	    {
            	    lop=(Token)match(input,DOUBLE_AMPER,FOLLOW_DOUBLE_AMPER_in_andRestriction1279); if (state.failed) return result;
            	    pushFollow(FOLLOW_singleRestriction_in_andRestriction1283);
            	    right=singleRestriction(inp);

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       if( buildDescr && state.backtracking == 0 ) {
            	                     ConstraintConnectiveDescr descr = ConstraintConnectiveDescr.newAnd(); 
            	                     descr.addOrMerge( result );  
            	                     descr.addOrMerge( right ); 
            	                     result = descr;
            	                 }
            	               
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "andRestriction"


    // $ANTLR start "singleRestriction"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:270:1: singleRestriction[BaseDescr inp] returns [BaseDescr result] : (op= operator value= shiftExpression | LEFT_PAREN orRestriction[$inp] RIGHT_PAREN );
    public final BaseDescr singleRestriction(BaseDescr inp) throws RecognitionException {
        BaseDescr result = null;

        DRLExpressions.operator_return op = null;

        DRLExpressions.shiftExpression_return value = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:271:3: (op= operator value= shiftExpression | LEFT_PAREN orRestriction[$inp] RIGHT_PAREN )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=EQUALS && LA34_0<=LESS)) ) {
                alt34=1;
            }
            else if ( (LA34_0==ID) && ((((helper.validateIdentifierKey(DroolsSoftKeywords.NOT)))||((helper.isPluggableEvaluator(false)))))) {
                alt34=1;
            }
            else if ( (LA34_0==LEFT_PAREN) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:271:6: op= operator value= shiftExpression
                    {
                    pushFollow(FOLLOW_operator_in_singleRestriction1329);
                    op=operator();

                    state._fsp--;
                    if (state.failed) return result;
                    pushFollow(FOLLOW_shiftExpression_in_singleRestriction1333);
                    value=shiftExpression();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       if( buildDescr && state.backtracking == 0 ) {
                                     BaseDescr descr = ( (value!=null?value.result:null) != null && 
                                                       ( (!((value!=null?value.result:null) instanceof AtomicExprDescr)) || 
                                                         ((value!=null?input.toString(value.start,value.stop):null).equals(((AtomicExprDescr)(value!=null?value.result:null)).getExpression())) )) ? 
                      		                    (value!=null?value.result:null) : 
                      		                    new AtomicExprDescr( (value!=null?input.toString(value.start,value.stop):null) ) ;
                                     result = new RelationalExprDescr( (op!=null?input.toString(op.start,op.stop):null), inp, descr );
                                 }
                               
                    }

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:281:6: LEFT_PAREN orRestriction[$inp] RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_singleRestriction1351); if (state.failed) return result;
                    pushFollow(FOLLOW_orRestriction_in_singleRestriction1353);
                    orRestriction(inp);

                    state._fsp--;
                    if (state.failed) return result;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_singleRestriction1356); if (state.failed) return result;

                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "singleRestriction"

    public static class shiftExpression_return extends ParserRuleReturnScope {
        public BaseDescr result;
    };

    // $ANTLR start "shiftExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:286:1: shiftExpression returns [BaseDescr result] : left= additiveExpression ( ( shiftOp )=> shiftOp additiveExpression )* ;
    public final DRLExpressions.shiftExpression_return shiftExpression() throws RecognitionException {
        DRLExpressions.shiftExpression_return retval = new DRLExpressions.shiftExpression_return();
        retval.start = input.LT(1);

        BaseDescr left = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:287:3: (left= additiveExpression ( ( shiftOp )=> shiftOp additiveExpression )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:287:5: left= additiveExpression ( ( shiftOp )=> shiftOp additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression1389);
            left=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { retval.result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:288:5: ( ( shiftOp )=> shiftOp additiveExpression )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:288:7: ( shiftOp )=> shiftOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_shiftExpression1403);
            	    shiftOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression1405);
            	    additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "shiftExpression"


    // $ANTLR start "shiftOp"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:291:1: shiftOp : ( LESS LESS | GREATER GREATER GREATER | GREATER GREATER ) ;
    public final void shiftOp() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:292:5: ( ( LESS LESS | GREATER GREATER GREATER | GREATER GREATER ) )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:292:7: ( LESS LESS | GREATER GREATER GREATER | GREATER GREATER )
            {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:292:7: ( LESS LESS | GREATER GREATER GREATER | GREATER GREATER )
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LESS) ) {
                alt36=1;
            }
            else if ( (LA36_0==GREATER) ) {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==GREATER) ) {
                    int LA36_3 = input.LA(3);

                    if ( (LA36_3==GREATER) ) {
                        alt36=2;
                    }
                    else if ( (LA36_3==EOF||LA36_3==FLOAT||(LA36_3>=HEX && LA36_3<=DECIMAL)||LA36_3==STRING||(LA36_3>=BOOL && LA36_3<=NULL)||(LA36_3>=DECR && LA36_3<=INCR)||LA36_3==LESS||LA36_3==LEFT_PAREN||LA36_3==LEFT_SQUARE||(LA36_3>=NEGATION && LA36_3<=TILDE)||(LA36_3>=MINUS && LA36_3<=PLUS)||LA36_3==ID) ) {
                        alt36=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:292:9: LESS LESS
                    {
                    match(input,LESS,FOLLOW_LESS_in_shiftOp1425); if (state.failed) return ;
                    match(input,LESS,FOLLOW_LESS_in_shiftOp1427); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:293:11: GREATER GREATER GREATER
                    {
                    match(input,GREATER,FOLLOW_GREATER_in_shiftOp1440); if (state.failed) return ;
                    match(input,GREATER,FOLLOW_GREATER_in_shiftOp1442); if (state.failed) return ;
                    match(input,GREATER,FOLLOW_GREATER_in_shiftOp1444); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:294:11: GREATER GREATER
                    {
                    match(input,GREATER,FOLLOW_GREATER_in_shiftOp1457); if (state.failed) return ;
                    match(input,GREATER,FOLLOW_GREATER_in_shiftOp1459); if (state.failed) return ;

                    }
                    break;

            }


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "shiftOp"


    // $ANTLR start "additiveExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:297:1: additiveExpression returns [BaseDescr result] : left= multiplicativeExpression ( ( PLUS | MINUS )=> ( PLUS | MINUS ) multiplicativeExpression )* ;
    public final BaseDescr additiveExpression() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr left = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:298:5: (left= multiplicativeExpression ( ( PLUS | MINUS )=> ( PLUS | MINUS ) multiplicativeExpression )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:298:9: left= multiplicativeExpression ( ( PLUS | MINUS )=> ( PLUS | MINUS ) multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1487);
            left=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:299:9: ( ( PLUS | MINUS )=> ( PLUS | MINUS ) multiplicativeExpression )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=MINUS && LA37_0<=PLUS)) && (synpred13_DRLExpressions())) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:299:11: ( PLUS | MINUS )=> ( PLUS | MINUS ) multiplicativeExpression
            	    {
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1516);
            	    multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "additiveExpression"


    // $ANTLR start "multiplicativeExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:302:1: multiplicativeExpression returns [BaseDescr result] : left= unaryExpression ( ( STAR | DIV | MOD ) unaryExpression )* ;
    public final BaseDescr multiplicativeExpression() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr left = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:303:5: (left= unaryExpression ( ( STAR | DIV | MOD ) unaryExpression )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:303:9: left= unaryExpression ( ( STAR | DIV | MOD ) unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1544);
            left=unaryExpression();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               if( buildDescr && state.backtracking == 0 ) { result = left; } 
            }
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:304:7: ( ( STAR | DIV | MOD ) unaryExpression )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=MOD && LA38_0<=STAR)||LA38_0==DIV) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:304:9: ( STAR | DIV | MOD ) unaryExpression
            	    {
            	    if ( (input.LA(1)>=MOD && input.LA(1)<=STAR)||input.LA(1)==DIV ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return result;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1570);
            	    unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return result;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "multiplicativeExpression"


    // $ANTLR start "unaryExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:307:1: unaryExpression returns [BaseDescr result] : ( PLUS unaryExpression | MINUS unaryExpression | INCR primary | DECR primary | left= unaryExpressionNotPlusMinus );
    public final BaseDescr unaryExpression() throws RecognitionException {
        BaseDescr result = null;

        DRLExpressions.unaryExpressionNotPlusMinus_return left = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:308:5: ( PLUS unaryExpression | MINUS unaryExpression | INCR primary | DECR primary | left= unaryExpressionNotPlusMinus )
            int alt39=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt39=1;
                }
                break;
            case MINUS:
                {
                alt39=2;
                }
                break;
            case INCR:
                {
                alt39=3;
                }
                break;
            case DECR:
                {
                alt39=4;
                }
                break;
            case FLOAT:
            case HEX:
            case DECIMAL:
            case STRING:
            case BOOL:
            case NULL:
            case LESS:
            case LEFT_PAREN:
            case LEFT_SQUARE:
            case NEGATION:
            case TILDE:
            case ID:
                {
                alt39=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:308:9: PLUS unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression1596); if (state.failed) return result;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1598);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return result;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:309:7: MINUS unaryExpression
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unaryExpression1606); if (state.failed) return result;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1608);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return result;

                    }
                    break;
                case 3 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:310:9: INCR primary
                    {
                    match(input,INCR,FOLLOW_INCR_in_unaryExpression1618); if (state.failed) return result;
                    pushFollow(FOLLOW_primary_in_unaryExpression1620);
                    primary();

                    state._fsp--;
                    if (state.failed) return result;

                    }
                    break;
                case 4 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:311:9: DECR primary
                    {
                    match(input,DECR,FOLLOW_DECR_in_unaryExpression1630); if (state.failed) return result;
                    pushFollow(FOLLOW_primary_in_unaryExpression1632);
                    primary();

                    state._fsp--;
                    if (state.failed) return result;

                    }
                    break;
                case 5 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:312:9: left= unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1644);
                    left=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       if( buildDescr && state.backtracking == 0 ) { result = (left!=null?left.result:null); } 
                    }

                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "unaryExpression"

    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        public BaseDescr result;
    };

    // $ANTLR start "unaryExpressionNotPlusMinus"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:315:1: unaryExpressionNotPlusMinus returns [BaseDescr result] : ( TILDE unaryExpression | NEGATION unaryExpression | ( castExpression )=> castExpression | left= primary ( ( selector )=> selector )* ( ( INCR | DECR )=> ( INCR | DECR ) )? );
    public final DRLExpressions.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        DRLExpressions.unaryExpressionNotPlusMinus_return retval = new DRLExpressions.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        BaseDescr left = null;


         boolean isLeft = false; 
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:317:5: ( TILDE unaryExpression | NEGATION unaryExpression | ( castExpression )=> castExpression | left= primary ( ( selector )=> selector )* ( ( INCR | DECR )=> ( INCR | DECR ) )? )
            int alt42=4;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:317:9: TILDE unaryExpression
                    {
                    match(input,TILDE,FOLLOW_TILDE_in_unaryExpressionNotPlusMinus1674); if (state.failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1676);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:318:8: NEGATION unaryExpression
                    {
                    match(input,NEGATION,FOLLOW_NEGATION_in_unaryExpressionNotPlusMinus1685); if (state.failed) return retval;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1687);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:319:9: ( castExpression )=> castExpression
                    {
                    pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus1701);
                    castExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:320:9: left= primary ( ( selector )=> selector )* ( ( INCR | DECR )=> ( INCR | DECR ) )?
                    {
                    if ( state.backtracking==0 ) {
                       isLeft = helper.getLeftMostExpr() == null;
                    }
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus1723);
                    left=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if( buildDescr && state.backtracking == 0 ) { retval.result = left; } 
                    }
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:322:9: ( ( selector )=> selector )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==DOT) && (synpred15_DRLExpressions())) {
                            alt40=1;
                        }
                        else if ( (LA40_0==LEFT_SQUARE) && (synpred15_DRLExpressions())) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:322:10: ( selector )=> selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus1740);
                    	    selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       if( buildDescr && state.backtracking == 0 && isLeft ) { helper.setLeftMostExpr( input.toString(retval.start,input.LT(-1)) ); } 
                    }
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:323:9: ( ( INCR | DECR )=> ( INCR | DECR ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=DECR && LA41_0<=INCR)) && (synpred16_DRLExpressions())) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:323:10: ( INCR | DECR )=> ( INCR | DECR )
                            {
                            if ( (input.LA(1)>=DECR && input.LA(1)<=INCR) ) {
                                input.consume();
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"


    // $ANTLR start "castExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:326:1: castExpression : ( ( LEFT_PAREN primitiveType )=> LEFT_PAREN primitiveType RIGHT_PAREN expr= unaryExpression | ( LEFT_PAREN type )=> LEFT_PAREN type RIGHT_PAREN unaryExpressionNotPlusMinus );
    public final void castExpression() throws RecognitionException {
        BaseDescr expr = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:327:5: ( ( LEFT_PAREN primitiveType )=> LEFT_PAREN primitiveType RIGHT_PAREN expr= unaryExpression | ( LEFT_PAREN type )=> LEFT_PAREN type RIGHT_PAREN unaryExpressionNotPlusMinus )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==LEFT_PAREN) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred17_DRLExpressions()) ) {
                    alt43=1;
                }
                else if ( (synpred18_DRLExpressions()) ) {
                    alt43=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:327:8: ( LEFT_PAREN primitiveType )=> LEFT_PAREN primitiveType RIGHT_PAREN expr= unaryExpression
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_castExpression1799); if (state.failed) return ;
                    pushFollow(FOLLOW_primitiveType_in_castExpression1801);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_castExpression1803); if (state.failed) return ;
                    pushFollow(FOLLOW_unaryExpression_in_castExpression1807);
                    expr=unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:328:8: ( LEFT_PAREN type )=> LEFT_PAREN type RIGHT_PAREN unaryExpressionNotPlusMinus
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_castExpression1825); if (state.failed) return ;
                    pushFollow(FOLLOW_type_in_castExpression1827);
                    type();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_castExpression1829); if (state.failed) return ;
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression1831);
                    unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "castExpression"


    // $ANTLR start "primitiveType"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:331:1: primitiveType : ( boolean_key | char_key | byte_key | short_key | int_key | long_key | float_key | double_key );
    public final void primitiveType() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:332:5: ( boolean_key | char_key | byte_key | short_key | int_key | long_key | float_key | double_key )
            int alt44=8;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:332:9: boolean_key
                    {
                    pushFollow(FOLLOW_boolean_key_in_primitiveType1854);
                    boolean_key();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:333:7: char_key
                    {
                    pushFollow(FOLLOW_char_key_in_primitiveType1862);
                    char_key();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:334:7: byte_key
                    {
                    pushFollow(FOLLOW_byte_key_in_primitiveType1870);
                    byte_key();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:335:7: short_key
                    {
                    pushFollow(FOLLOW_short_key_in_primitiveType1878);
                    short_key();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:336:7: int_key
                    {
                    pushFollow(FOLLOW_int_key_in_primitiveType1886);
                    int_key();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:337:7: long_key
                    {
                    pushFollow(FOLLOW_long_key_in_primitiveType1894);
                    long_key();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:338:7: float_key
                    {
                    pushFollow(FOLLOW_float_key_in_primitiveType1902);
                    float_key();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:339:7: double_key
                    {
                    pushFollow(FOLLOW_double_key_in_primitiveType1910);
                    double_key();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "primitiveType"


    // $ANTLR start "primary"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:342:1: primary returns [BaseDescr result] : ( ( parExpression )=>expr= parExpression | ( nonWildcardTypeArguments )=> nonWildcardTypeArguments ( explicitGenericInvocationSuffix | this_key arguments ) | ( literal )=> literal | ( super_key )=> super_key superSuffix | ( new_key )=> new_key creator | ( primitiveType )=> primitiveType ( LEFT_SQUARE RIGHT_SQUARE )* DOT class_key | ( inlineMapExpression )=> inlineMapExpression | ( inlineListExpression )=> inlineListExpression | ( ID )=> ID ( ( DOT ID )=> DOT ID )* ( ( identifierSuffix )=> identifierSuffix )? );
    public final BaseDescr primary() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr expr = null;

        DRLExpressions.literal_return literal7 = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:343:5: ( ( parExpression )=>expr= parExpression | ( nonWildcardTypeArguments )=> nonWildcardTypeArguments ( explicitGenericInvocationSuffix | this_key arguments ) | ( literal )=> literal | ( super_key )=> super_key superSuffix | ( new_key )=> new_key creator | ( primitiveType )=> primitiveType ( LEFT_SQUARE RIGHT_SQUARE )* DOT class_key | ( inlineMapExpression )=> inlineMapExpression | ( inlineListExpression )=> inlineListExpression | ( ID )=> ID ( ( DOT ID )=> DOT ID )* ( ( identifierSuffix )=> identifierSuffix )? )
            int alt49=9;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:343:7: ( parExpression )=>expr= parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary1938);
                    expr=parExpression();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                        if( buildDescr && state.backtracking == 0 ) { result = expr; }  
                    }

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:344:9: ( nonWildcardTypeArguments )=> nonWildcardTypeArguments ( explicitGenericInvocationSuffix | this_key arguments )
                    {
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_primary1955);
                    nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return result;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:344:63: ( explicitGenericInvocationSuffix | this_key arguments )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ID) ) {
                        int LA45_1 = input.LA(2);

                        if ( (!((((helper.validateIdentifierKey(DroolsSoftKeywords.THIS)))))) ) {
                            alt45=1;
                        }
                        else if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.THIS)))) ) {
                            alt45=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return result;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 45, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:344:64: explicitGenericInvocationSuffix
                            {
                            pushFollow(FOLLOW_explicitGenericInvocationSuffix_in_primary1958);
                            explicitGenericInvocationSuffix();

                            state._fsp--;
                            if (state.failed) return result;

                            }
                            break;
                        case 2 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:344:98: this_key arguments
                            {
                            pushFollow(FOLLOW_this_key_in_primary1962);
                            this_key();

                            state._fsp--;
                            if (state.failed) return result;
                            pushFollow(FOLLOW_arguments_in_primary1964);
                            arguments();

                            state._fsp--;
                            if (state.failed) return result;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:345:9: ( literal )=> literal
                    {
                    pushFollow(FOLLOW_literal_in_primary1980);
                    literal7=literal();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       if( buildDescr && state.backtracking == 0 ) { result = new AtomicExprDescr( (literal7!=null?input.toString(literal7.start,literal7.stop):null), true ); }  
                    }

                    }
                    break;
                case 4 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:347:9: ( super_key )=> super_key superSuffix
                    {
                    pushFollow(FOLLOW_super_key_in_primary2002);
                    super_key();

                    state._fsp--;
                    if (state.failed) return result;
                    pushFollow(FOLLOW_superSuffix_in_primary2004);
                    superSuffix();

                    state._fsp--;
                    if (state.failed) return result;

                    }
                    break;
                case 5 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:348:9: ( new_key )=> new_key creator
                    {
                    pushFollow(FOLLOW_new_key_in_primary2020);
                    new_key();

                    state._fsp--;
                    if (state.failed) return result;
                    pushFollow(FOLLOW_creator_in_primary2022);
                    creator();

                    state._fsp--;
                    if (state.failed) return result;

                    }
                    break;
                case 6 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:349:9: ( primitiveType )=> primitiveType ( LEFT_SQUARE RIGHT_SQUARE )* DOT class_key
                    {
                    pushFollow(FOLLOW_primitiveType_in_primary2038);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return result;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:349:41: ( LEFT_SQUARE RIGHT_SQUARE )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==LEFT_SQUARE) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:349:42: LEFT_SQUARE RIGHT_SQUARE
                    	    {
                    	    match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_primary2041); if (state.failed) return result;
                    	    match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_primary2043); if (state.failed) return result;

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    match(input,DOT,FOLLOW_DOT_in_primary2047); if (state.failed) return result;
                    pushFollow(FOLLOW_class_key_in_primary2049);
                    class_key();

                    state._fsp--;
                    if (state.failed) return result;

                    }
                    break;
                case 7 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:351:9: ( inlineMapExpression )=> inlineMapExpression
                    {
                    pushFollow(FOLLOW_inlineMapExpression_in_primary2070);
                    inlineMapExpression();

                    state._fsp--;
                    if (state.failed) return result;

                    }
                    break;
                case 8 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:352:9: ( inlineListExpression )=> inlineListExpression
                    {
                    pushFollow(FOLLOW_inlineListExpression_in_primary2086);
                    inlineListExpression();

                    state._fsp--;
                    if (state.failed) return result;

                    }
                    break;
                case 9 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:353:9: ( ID )=> ID ( ( DOT ID )=> DOT ID )* ( ( identifierSuffix )=> identifierSuffix )?
                    {
                    match(input,ID,FOLLOW_ID_in_primary2100); if (state.failed) return result;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:353:18: ( ( DOT ID )=> DOT ID )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==DOT) ) {
                            int LA47_2 = input.LA(2);

                            if ( (LA47_2==ID) ) {
                                int LA47_3 = input.LA(3);

                                if ( (synpred28_DRLExpressions()) ) {
                                    alt47=1;
                                }


                            }


                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:353:19: ( DOT ID )=> DOT ID
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_primary2109); if (state.failed) return result;
                    	    match(input,ID,FOLLOW_ID_in_primary2111); if (state.failed) return result;

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:353:38: ( ( identifierSuffix )=> identifierSuffix )?
                    int alt48=2;
                    alt48 = dfa48.predict(input);
                    switch (alt48) {
                        case 1 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:353:39: ( identifierSuffix )=> identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_primary2120);
                            identifierSuffix();

                            state._fsp--;
                            if (state.failed) return result;

                            }
                            break;

                    }


                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "primary"


    // $ANTLR start "inlineListExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:356:1: inlineListExpression : LEFT_SQUARE ( expressionList )? RIGHT_SQUARE ;
    public final void inlineListExpression() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:357:5: ( LEFT_SQUARE ( expressionList )? RIGHT_SQUARE )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:357:9: LEFT_SQUARE ( expressionList )? RIGHT_SQUARE
            {
            match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_inlineListExpression2142); if (state.failed) return ;
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:357:21: ( expressionList )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==FLOAT||(LA50_0>=HEX && LA50_0<=DECIMAL)||LA50_0==STRING||(LA50_0>=BOOL && LA50_0<=NULL)||(LA50_0>=DECR && LA50_0<=INCR)||LA50_0==LESS||LA50_0==LEFT_PAREN||LA50_0==LEFT_SQUARE||(LA50_0>=NEGATION && LA50_0<=TILDE)||(LA50_0>=MINUS && LA50_0<=PLUS)||LA50_0==ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:357:21: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_inlineListExpression2144);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_inlineListExpression2147); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "inlineListExpression"


    // $ANTLR start "inlineMapExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:360:1: inlineMapExpression : LEFT_SQUARE mapExpressionList RIGHT_SQUARE ;
    public final void inlineMapExpression() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:361:5: ( LEFT_SQUARE mapExpressionList RIGHT_SQUARE )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:361:7: LEFT_SQUARE mapExpressionList RIGHT_SQUARE
            {
            match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_inlineMapExpression2169); if (state.failed) return ;
            pushFollow(FOLLOW_mapExpressionList_in_inlineMapExpression2171);
            mapExpressionList();

            state._fsp--;
            if (state.failed) return ;
            match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_inlineMapExpression2173); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "inlineMapExpression"


    // $ANTLR start "mapExpressionList"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:364:1: mapExpressionList : mapEntry ( COMMA mapEntry )* ;
    public final void mapExpressionList() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:365:5: ( mapEntry ( COMMA mapEntry )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:365:7: mapEntry ( COMMA mapEntry )*
            {
            pushFollow(FOLLOW_mapEntry_in_mapExpressionList2191);
            mapEntry();

            state._fsp--;
            if (state.failed) return ;
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:365:16: ( COMMA mapEntry )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==COMMA) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:365:17: COMMA mapEntry
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_mapExpressionList2194); if (state.failed) return ;
            	    pushFollow(FOLLOW_mapEntry_in_mapExpressionList2196);
            	    mapEntry();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "mapExpressionList"


    // $ANTLR start "mapEntry"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:368:1: mapEntry : expression COLON expression ;
    public final void mapEntry() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:369:5: ( expression COLON expression )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:369:7: expression COLON expression
            {
            pushFollow(FOLLOW_expression_in_mapEntry2219);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_mapEntry2221); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_mapEntry2223);
            expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "mapEntry"


    // $ANTLR start "parExpression"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:372:1: parExpression returns [BaseDescr result] : LEFT_PAREN expr= expression RIGHT_PAREN ;
    public final BaseDescr parExpression() throws RecognitionException {
        BaseDescr result = null;

        BaseDescr expr = null;


        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:373:5: ( LEFT_PAREN expr= expression RIGHT_PAREN )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:373:7: LEFT_PAREN expr= expression RIGHT_PAREN
            {
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_parExpression2245); if (state.failed) return result;
            pushFollow(FOLLOW_expression_in_parExpression2249);
            expr=expression();

            state._fsp--;
            if (state.failed) return result;
            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_parExpression2251); if (state.failed) return result;
            if ( state.backtracking==0 ) {
                if( buildDescr && state.backtracking == 0 ) { 
                             result = expr; 
                             if( result instanceof AtomicExprDescr ) {
                                 ((AtomicExprDescr)result).setExpression("(" +((AtomicExprDescr)result).getExpression() + ")" );
                             } 
                         }  
                      
            }

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "parExpression"


    // $ANTLR start "identifierSuffix"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:383:1: identifierSuffix : ( ( LEFT_SQUARE RIGHT_SQUARE )=> ( LEFT_SQUARE RIGHT_SQUARE )+ DOT class_key | ( ( LEFT_SQUARE )=> LEFT_SQUARE expression RIGHT_SQUARE )+ | arguments );
    public final void identifierSuffix() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:384:5: ( ( LEFT_SQUARE RIGHT_SQUARE )=> ( LEFT_SQUARE RIGHT_SQUARE )+ DOT class_key | ( ( LEFT_SQUARE )=> LEFT_SQUARE expression RIGHT_SQUARE )+ | arguments )
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LEFT_SQUARE) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RIGHT_SQUARE) && (synpred30_DRLExpressions())) {
                    alt54=1;
                }
                else if ( (LA54_1==FLOAT||(LA54_1>=HEX && LA54_1<=DECIMAL)||LA54_1==STRING||(LA54_1>=BOOL && LA54_1<=NULL)||(LA54_1>=DECR && LA54_1<=INCR)||LA54_1==LESS||LA54_1==LEFT_PAREN||LA54_1==LEFT_SQUARE||(LA54_1>=NEGATION && LA54_1<=TILDE)||(LA54_1>=MINUS && LA54_1<=PLUS)||LA54_1==ID) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==LEFT_PAREN) ) {
                alt54=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:384:7: ( LEFT_SQUARE RIGHT_SQUARE )=> ( LEFT_SQUARE RIGHT_SQUARE )+ DOT class_key
                    {
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:384:35: ( LEFT_SQUARE RIGHT_SQUARE )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==LEFT_SQUARE) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:384:36: LEFT_SQUARE RIGHT_SQUARE
                    	    {
                    	    match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_identifierSuffix2286); if (state.failed) return ;
                    	    match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_identifierSuffix2288); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt52 >= 1 ) break loop52;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(52, input);
                                throw eee;
                        }
                        cnt52++;
                    } while (true);

                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix2292); if (state.failed) return ;
                    pushFollow(FOLLOW_class_key_in_identifierSuffix2294);
                    class_key();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:385:7: ( ( LEFT_SQUARE )=> LEFT_SQUARE expression RIGHT_SQUARE )+
                    {
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:385:7: ( ( LEFT_SQUARE )=> LEFT_SQUARE expression RIGHT_SQUARE )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        alt53 = dfa53.predict(input);
                        switch (alt53) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:385:8: ( LEFT_SQUARE )=> LEFT_SQUARE expression RIGHT_SQUARE
                    	    {
                    	    match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_identifierSuffix2309); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expression_in_identifierSuffix2311);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_identifierSuffix2313); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:386:9: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_identifierSuffix2326);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "identifierSuffix"


    // $ANTLR start "creator"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:394:1: creator : ( nonWildcardTypeArguments )? createdName ( arrayCreatorRest | classCreatorRest ) ;
    public final void creator() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:395:5: ( ( nonWildcardTypeArguments )? createdName ( arrayCreatorRest | classCreatorRest ) )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:395:7: ( nonWildcardTypeArguments )? createdName ( arrayCreatorRest | classCreatorRest )
            {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:395:7: ( nonWildcardTypeArguments )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==LESS) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:395:7: nonWildcardTypeArguments
                    {
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator2349);
                    nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_createdName_in_creator2352);
            createdName();

            state._fsp--;
            if (state.failed) return ;
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:396:9: ( arrayCreatorRest | classCreatorRest )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==LEFT_SQUARE) ) {
                alt56=1;
            }
            else if ( (LA56_0==LEFT_PAREN) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:396:10: arrayCreatorRest
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2363);
                    arrayCreatorRest();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:396:29: classCreatorRest
                    {
                    pushFollow(FOLLOW_classCreatorRest_in_creator2367);
                    classCreatorRest();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "creator"


    // $ANTLR start "createdName"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:399:1: createdName : ( ID ( typeArguments )? ( DOT ID ( typeArguments )? )* | primitiveType );
    public final void createdName() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:400:5: ( ID ( typeArguments )? ( DOT ID ( typeArguments )? )* | primitiveType )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==ID) && ((!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR)))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))||!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))))) {
                int LA60_1 = input.LA(2);

                if ( (!(((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))))) ) {
                    alt60=1;
                }
                else if ( ((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:400:7: ID ( typeArguments )? ( DOT ID ( typeArguments )? )*
                    {
                    match(input,ID,FOLLOW_ID_in_createdName2385); if (state.failed) return ;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:400:10: ( typeArguments )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==LESS) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:400:10: typeArguments
                            {
                            pushFollow(FOLLOW_typeArguments_in_createdName2387);
                            typeArguments();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:401:9: ( DOT ID ( typeArguments )? )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==DOT) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:401:11: DOT ID ( typeArguments )?
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_createdName2400); if (state.failed) return ;
                    	    match(input,ID,FOLLOW_ID_in_createdName2402); if (state.failed) return ;
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:401:18: ( typeArguments )?
                    	    int alt58=2;
                    	    int LA58_0 = input.LA(1);

                    	    if ( (LA58_0==LESS) ) {
                    	        alt58=1;
                    	    }
                    	    switch (alt58) {
                    	        case 1 :
                    	            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:401:18: typeArguments
                    	            {
                    	            pushFollow(FOLLOW_typeArguments_in_createdName2404);
                    	            typeArguments();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:402:11: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName2419);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "createdName"


    // $ANTLR start "innerCreator"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:405:1: innerCreator : {...}? => ID classCreatorRest ;
    public final void innerCreator() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:406:5: ({...}? => ID classCreatorRest )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:406:7: {...}? => ID classCreatorRest
            {
            if ( !((!(helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "innerCreator", "!(helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF))");
            }
            match(input,ID,FOLLOW_ID_in_innerCreator2439); if (state.failed) return ;
            pushFollow(FOLLOW_classCreatorRest_in_innerCreator2441);
            classCreatorRest();

            state._fsp--;
            if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "innerCreator"


    // $ANTLR start "arrayCreatorRest"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:409:1: arrayCreatorRest : LEFT_SQUARE ( RIGHT_SQUARE ( LEFT_SQUARE RIGHT_SQUARE )* arrayInitializer | expression RIGHT_SQUARE ({...}? => LEFT_SQUARE expression RIGHT_SQUARE )* ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )* ) ;
    public final void arrayCreatorRest() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:410:5: ( LEFT_SQUARE ( RIGHT_SQUARE ( LEFT_SQUARE RIGHT_SQUARE )* arrayInitializer | expression RIGHT_SQUARE ({...}? => LEFT_SQUARE expression RIGHT_SQUARE )* ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )* ) )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:410:9: LEFT_SQUARE ( RIGHT_SQUARE ( LEFT_SQUARE RIGHT_SQUARE )* arrayInitializer | expression RIGHT_SQUARE ({...}? => LEFT_SQUARE expression RIGHT_SQUARE )* ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )* )
            {
            match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_arrayCreatorRest2460); if (state.failed) return ;
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:411:5: ( RIGHT_SQUARE ( LEFT_SQUARE RIGHT_SQUARE )* arrayInitializer | expression RIGHT_SQUARE ({...}? => LEFT_SQUARE expression RIGHT_SQUARE )* ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )* )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RIGHT_SQUARE) ) {
                alt64=1;
            }
            else if ( (LA64_0==FLOAT||(LA64_0>=HEX && LA64_0<=DECIMAL)||LA64_0==STRING||(LA64_0>=BOOL && LA64_0<=NULL)||(LA64_0>=DECR && LA64_0<=INCR)||LA64_0==LESS||LA64_0==LEFT_PAREN||LA64_0==LEFT_SQUARE||(LA64_0>=NEGATION && LA64_0<=TILDE)||(LA64_0>=MINUS && LA64_0<=PLUS)||LA64_0==ID) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:411:9: RIGHT_SQUARE ( LEFT_SQUARE RIGHT_SQUARE )* arrayInitializer
                    {
                    match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_arrayCreatorRest2470); if (state.failed) return ;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:411:22: ( LEFT_SQUARE RIGHT_SQUARE )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==LEFT_SQUARE) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:411:23: LEFT_SQUARE RIGHT_SQUARE
                    	    {
                    	    match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_arrayCreatorRest2473); if (state.failed) return ;
                    	    match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_arrayCreatorRest2475); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest2479);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:412:13: expression RIGHT_SQUARE ({...}? => LEFT_SQUARE expression RIGHT_SQUARE )* ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )*
                    {
                    pushFollow(FOLLOW_expression_in_arrayCreatorRest2493);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_arrayCreatorRest2495); if (state.failed) return ;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:412:37: ({...}? => LEFT_SQUARE expression RIGHT_SQUARE )*
                    loop62:
                    do {
                        int alt62=2;
                        alt62 = dfa62.predict(input);
                        switch (alt62) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:412:38: {...}? => LEFT_SQUARE expression RIGHT_SQUARE
                    	    {
                    	    if ( !((!helper.validateLT(2,"]"))) ) {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        throw new FailedPredicateException(input, "arrayCreatorRest", "!helper.validateLT(2,\"]\")");
                    	    }
                    	    match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_arrayCreatorRest2500); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expression_in_arrayCreatorRest2502);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_arrayCreatorRest2504); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:412:106: ( ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==LEFT_SQUARE) ) {
                            int LA63_2 = input.LA(2);

                            if ( (LA63_2==RIGHT_SQUARE) && (synpred32_DRLExpressions())) {
                                alt63=1;
                            }


                        }


                        switch (alt63) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:412:107: ( LEFT_SQUARE RIGHT_SQUARE )=> LEFT_SQUARE RIGHT_SQUARE
                    	    {
                    	    match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_arrayCreatorRest2516); if (state.failed) return ;
                    	    match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_arrayCreatorRest2518); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arrayCreatorRest"


    // $ANTLR start "variableInitializer"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:416:1: variableInitializer : ( arrayInitializer | expression );
    public final void variableInitializer() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:417:5: ( arrayInitializer | expression )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LEFT_CURLY) ) {
                alt65=1;
            }
            else if ( (LA65_0==FLOAT||(LA65_0>=HEX && LA65_0<=DECIMAL)||LA65_0==STRING||(LA65_0>=BOOL && LA65_0<=NULL)||(LA65_0>=DECR && LA65_0<=INCR)||LA65_0==LESS||LA65_0==LEFT_PAREN||LA65_0==LEFT_SQUARE||(LA65_0>=NEGATION && LA65_0<=TILDE)||(LA65_0>=MINUS && LA65_0<=PLUS)||LA65_0==ID) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:417:7: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer2547);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:418:13: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer2561);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variableInitializer"


    // $ANTLR start "arrayInitializer"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:421:1: arrayInitializer : LEFT_CURLY ( variableInitializer ( COMMA variableInitializer )* ( COMMA )? )? RIGHT_CURLY ;
    public final void arrayInitializer() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:422:5: ( LEFT_CURLY ( variableInitializer ( COMMA variableInitializer )* ( COMMA )? )? RIGHT_CURLY )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:422:7: LEFT_CURLY ( variableInitializer ( COMMA variableInitializer )* ( COMMA )? )? RIGHT_CURLY
            {
            match(input,LEFT_CURLY,FOLLOW_LEFT_CURLY_in_arrayInitializer2578); if (state.failed) return ;
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:422:18: ( variableInitializer ( COMMA variableInitializer )* ( COMMA )? )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==FLOAT||(LA68_0>=HEX && LA68_0<=DECIMAL)||LA68_0==STRING||(LA68_0>=BOOL && LA68_0<=NULL)||(LA68_0>=DECR && LA68_0<=INCR)||LA68_0==LESS||LA68_0==LEFT_PAREN||LA68_0==LEFT_SQUARE||LA68_0==LEFT_CURLY||(LA68_0>=NEGATION && LA68_0<=TILDE)||(LA68_0>=MINUS && LA68_0<=PLUS)||LA68_0==ID) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:422:19: variableInitializer ( COMMA variableInitializer )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer2581);
                    variableInitializer();

                    state._fsp--;
                    if (state.failed) return ;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:422:39: ( COMMA variableInitializer )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==COMMA) ) {
                            int LA66_1 = input.LA(2);

                            if ( (LA66_1==FLOAT||(LA66_1>=HEX && LA66_1<=DECIMAL)||LA66_1==STRING||(LA66_1>=BOOL && LA66_1<=NULL)||(LA66_1>=DECR && LA66_1<=INCR)||LA66_1==LESS||LA66_1==LEFT_PAREN||LA66_1==LEFT_SQUARE||LA66_1==LEFT_CURLY||(LA66_1>=NEGATION && LA66_1<=TILDE)||(LA66_1>=MINUS && LA66_1<=PLUS)||LA66_1==ID) ) {
                                alt66=1;
                            }


                        }


                        switch (alt66) {
                    	case 1 :
                    	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:422:40: COMMA variableInitializer
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer2584); if (state.failed) return ;
                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer2586);
                    	    variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:422:68: ( COMMA )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==COMMA) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:422:69: COMMA
                            {
                            match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer2591); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RIGHT_CURLY,FOLLOW_RIGHT_CURLY_in_arrayInitializer2598); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arrayInitializer"


    // $ANTLR start "classCreatorRest"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:425:1: classCreatorRest : arguments ;
    public final void classCreatorRest() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:426:5: ( arguments )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:426:7: arguments
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest2615);
            arguments();

            state._fsp--;
            if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "classCreatorRest"


    // $ANTLR start "explicitGenericInvocation"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:429:1: explicitGenericInvocation : nonWildcardTypeArguments arguments ;
    public final void explicitGenericInvocation() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:430:5: ( nonWildcardTypeArguments arguments )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:430:7: nonWildcardTypeArguments arguments
            {
            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation2633);
            nonWildcardTypeArguments();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_arguments_in_explicitGenericInvocation2635);
            arguments();

            state._fsp--;
            if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "explicitGenericInvocation"


    // $ANTLR start "nonWildcardTypeArguments"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:433:1: nonWildcardTypeArguments : LESS typeList GREATER ;
    public final void nonWildcardTypeArguments() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:434:5: ( LESS typeList GREATER )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:434:7: LESS typeList GREATER
            {
            match(input,LESS,FOLLOW_LESS_in_nonWildcardTypeArguments2652); if (state.failed) return ;
            pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments2654);
            typeList();

            state._fsp--;
            if (state.failed) return ;
            match(input,GREATER,FOLLOW_GREATER_in_nonWildcardTypeArguments2656); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nonWildcardTypeArguments"


    // $ANTLR start "explicitGenericInvocationSuffix"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:437:1: explicitGenericInvocationSuffix : ( super_key superSuffix | ID arguments );
    public final void explicitGenericInvocationSuffix() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:438:5: ( super_key superSuffix | ID arguments )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==ID) ) {
                int LA69_1 = input.LA(2);

                if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.SUPER)))) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:438:7: super_key superSuffix
                    {
                    pushFollow(FOLLOW_super_key_in_explicitGenericInvocationSuffix2673);
                    super_key();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_superSuffix_in_explicitGenericInvocationSuffix2675);
                    superSuffix();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:439:10: ID arguments
                    {
                    match(input,ID,FOLLOW_ID_in_explicitGenericInvocationSuffix2686); if (state.failed) return ;
                    pushFollow(FOLLOW_arguments_in_explicitGenericInvocationSuffix2688);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "explicitGenericInvocationSuffix"


    // $ANTLR start "selector"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:442:1: selector : ( ( DOT super_key )=> DOT super_key superSuffix | ( DOT new_key )=> DOT new_key ( nonWildcardTypeArguments )? innerCreator | ( DOT ID )=> DOT ID ( ( LEFT_PAREN )=> arguments )? | ( LEFT_SQUARE )=> LEFT_SQUARE expression RIGHT_SQUARE );
    public final void selector() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:443:5: ( ( DOT super_key )=> DOT super_key superSuffix | ( DOT new_key )=> DOT new_key ( nonWildcardTypeArguments )? innerCreator | ( DOT ID )=> DOT ID ( ( LEFT_PAREN )=> arguments )? | ( LEFT_SQUARE )=> LEFT_SQUARE expression RIGHT_SQUARE )
            int alt72=4;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==DOT) ) {
                int LA72_1 = input.LA(2);

                if ( (synpred33_DRLExpressions()) ) {
                    alt72=1;
                }
                else if ( (synpred34_DRLExpressions()) ) {
                    alt72=2;
                }
                else if ( (synpred35_DRLExpressions()) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA72_0==LEFT_SQUARE) && (synpred37_DRLExpressions())) {
                alt72=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:443:9: ( DOT super_key )=> DOT super_key superSuffix
                    {
                    match(input,DOT,FOLLOW_DOT_in_selector2713); if (state.failed) return ;
                    pushFollow(FOLLOW_super_key_in_selector2715);
                    super_key();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_superSuffix_in_selector2717);
                    superSuffix();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:444:9: ( DOT new_key )=> DOT new_key ( nonWildcardTypeArguments )? innerCreator
                    {
                    match(input,DOT,FOLLOW_DOT_in_selector2733); if (state.failed) return ;
                    pushFollow(FOLLOW_new_key_in_selector2735);
                    new_key();

                    state._fsp--;
                    if (state.failed) return ;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:444:36: ( nonWildcardTypeArguments )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==LESS) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:444:37: nonWildcardTypeArguments
                            {
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_selector2738);
                            nonWildcardTypeArguments();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_innerCreator_in_selector2742);
                    innerCreator();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:445:9: ( DOT ID )=> DOT ID ( ( LEFT_PAREN )=> arguments )?
                    {
                    match(input,DOT,FOLLOW_DOT_in_selector2758); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_selector2760); if (state.failed) return ;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:445:26: ( ( LEFT_PAREN )=> arguments )?
                    int alt71=2;
                    alt71 = dfa71.predict(input);
                    switch (alt71) {
                        case 1 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:445:27: ( LEFT_PAREN )=> arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector2769);
                            arguments();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:447:9: ( LEFT_SQUARE )=> LEFT_SQUARE expression RIGHT_SQUARE
                    {
                    match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_selector2790); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_selector2792);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_selector2794); if (state.failed) return ;

                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "selector"


    // $ANTLR start "superSuffix"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:450:1: superSuffix : ( arguments | DOT ID ( ( LEFT_PAREN )=> arguments )? );
    public final void superSuffix() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:451:5: ( arguments | DOT ID ( ( LEFT_PAREN )=> arguments )? )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==LEFT_PAREN) ) {
                alt74=1;
            }
            else if ( (LA74_0==DOT) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:451:7: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_superSuffix2811);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:452:10: DOT ID ( ( LEFT_PAREN )=> arguments )?
                    {
                    match(input,DOT,FOLLOW_DOT_in_superSuffix2822); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_superSuffix2824); if (state.failed) return ;
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:452:17: ( ( LEFT_PAREN )=> arguments )?
                    int alt73=2;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:452:18: ( LEFT_PAREN )=> arguments
                            {
                            pushFollow(FOLLOW_arguments_in_superSuffix2833);
                            arguments();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "superSuffix"


    // $ANTLR start "squareArguments"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:455:1: squareArguments : LEFT_SQUARE ( expressionList )? RIGHT_SQUARE ;
    public final void squareArguments() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:456:5: ( LEFT_SQUARE ( expressionList )? RIGHT_SQUARE )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:456:7: LEFT_SQUARE ( expressionList )? RIGHT_SQUARE
            {
            match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_squareArguments2856); if (state.failed) return ;
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:456:19: ( expressionList )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==FLOAT||(LA75_0>=HEX && LA75_0<=DECIMAL)||LA75_0==STRING||(LA75_0>=BOOL && LA75_0<=NULL)||(LA75_0>=DECR && LA75_0<=INCR)||LA75_0==LESS||LA75_0==LEFT_PAREN||LA75_0==LEFT_SQUARE||(LA75_0>=NEGATION && LA75_0<=TILDE)||(LA75_0>=MINUS && LA75_0<=PLUS)||LA75_0==ID) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:456:19: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_squareArguments2858);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_squareArguments2861); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "squareArguments"


    // $ANTLR start "arguments"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:459:1: arguments : LEFT_PAREN ( expressionList )? RIGHT_PAREN ;
    public final void arguments() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:460:5: ( LEFT_PAREN ( expressionList )? RIGHT_PAREN )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:460:7: LEFT_PAREN ( expressionList )? RIGHT_PAREN
            {
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_arguments2878); if (state.failed) return ;
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:460:18: ( expressionList )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==FLOAT||(LA76_0>=HEX && LA76_0<=DECIMAL)||LA76_0==STRING||(LA76_0>=BOOL && LA76_0<=NULL)||(LA76_0>=DECR && LA76_0<=INCR)||LA76_0==LESS||LA76_0==LEFT_PAREN||LA76_0==LEFT_SQUARE||(LA76_0>=NEGATION && LA76_0<=TILDE)||(LA76_0>=MINUS && LA76_0<=PLUS)||LA76_0==ID) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:460:18: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments2880);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_arguments2883); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arguments"


    // $ANTLR start "expressionList"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:463:1: expressionList : expression ( COMMA expression )* ;
    public final void expressionList() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:464:3: ( expression ( COMMA expression )* )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:464:7: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList2900);
            expression();

            state._fsp--;
            if (state.failed) return ;
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:464:18: ( COMMA expression )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==COMMA) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:464:19: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionList2903); if (state.failed) return ;
            	    pushFollow(FOLLOW_expression_in_expressionList2905);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionList"


    // $ANTLR start "assignmentOperator"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:467:1: assignmentOperator : ( EQUALS_ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN | AND_ASSIGN | OR_ASSIGN | XOR_ASSIGN | MOD_ASSIGN | LESS LESS EQUALS_ASSIGN | ( GREATER GREATER GREATER )=> GREATER GREATER GREATER EQUALS_ASSIGN | ( GREATER GREATER )=> GREATER GREATER EQUALS_ASSIGN );
    public final void assignmentOperator() throws RecognitionException {
        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:468:5: ( EQUALS_ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN | AND_ASSIGN | OR_ASSIGN | XOR_ASSIGN | MOD_ASSIGN | LESS LESS EQUALS_ASSIGN | ( GREATER GREATER GREATER )=> GREATER GREATER GREATER EQUALS_ASSIGN | ( GREATER GREATER )=> GREATER GREATER EQUALS_ASSIGN )
            int alt78=12;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:468:9: EQUALS_ASSIGN
                    {
                    match(input,EQUALS_ASSIGN,FOLLOW_EQUALS_ASSIGN_in_assignmentOperator2924); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:469:7: PLUS_ASSIGN
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_assignmentOperator2932); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:470:7: MINUS_ASSIGN
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_assignmentOperator2940); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:471:7: MULT_ASSIGN
                    {
                    match(input,MULT_ASSIGN,FOLLOW_MULT_ASSIGN_in_assignmentOperator2948); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:472:7: DIV_ASSIGN
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_assignmentOperator2956); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:473:7: AND_ASSIGN
                    {
                    match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_assignmentOperator2964); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:474:7: OR_ASSIGN
                    {
                    match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_assignmentOperator2972); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:475:7: XOR_ASSIGN
                    {
                    match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_assignmentOperator2980); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:476:7: MOD_ASSIGN
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_assignmentOperator2988); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:477:7: LESS LESS EQUALS_ASSIGN
                    {
                    match(input,LESS,FOLLOW_LESS_in_assignmentOperator2996); if (state.failed) return ;
                    match(input,LESS,FOLLOW_LESS_in_assignmentOperator2998); if (state.failed) return ;
                    match(input,EQUALS_ASSIGN,FOLLOW_EQUALS_ASSIGN_in_assignmentOperator3000); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:478:7: ( GREATER GREATER GREATER )=> GREATER GREATER GREATER EQUALS_ASSIGN
                    {
                    match(input,GREATER,FOLLOW_GREATER_in_assignmentOperator3018); if (state.failed) return ;
                    match(input,GREATER,FOLLOW_GREATER_in_assignmentOperator3020); if (state.failed) return ;
                    match(input,GREATER,FOLLOW_GREATER_in_assignmentOperator3022); if (state.failed) return ;
                    match(input,EQUALS_ASSIGN,FOLLOW_EQUALS_ASSIGN_in_assignmentOperator3024); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:479:7: ( GREATER GREATER )=> GREATER GREATER EQUALS_ASSIGN
                    {
                    match(input,GREATER,FOLLOW_GREATER_in_assignmentOperator3040); if (state.failed) return ;
                    match(input,GREATER,FOLLOW_GREATER_in_assignmentOperator3042); if (state.failed) return ;
                    match(input,EQUALS_ASSIGN,FOLLOW_EQUALS_ASSIGN_in_assignmentOperator3044); if (state.failed) return ;

                    }
                    break;

            }
        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assignmentOperator"


    // $ANTLR start "extends_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:485:1: extends_key : {...}? =>id= ID ;
    public final void extends_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:486:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:486:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.EXTENDS)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "extends_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.EXTENDS))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_extends_key3076); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "extends_key"


    // $ANTLR start "super_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:489:1: super_key : {...}? =>id= ID ;
    public final void super_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:490:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:490:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.SUPER)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "super_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.SUPER))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_super_key3103); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "super_key"

    public static class instanceof_key_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "instanceof_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:493:1: instanceof_key : {...}? =>id= ID ;
    public final DRLExpressions.instanceof_key_return instanceof_key() throws RecognitionException {
        DRLExpressions.instanceof_key_return retval = new DRLExpressions.instanceof_key_return();
        retval.start = input.LT(1);

        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:494:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:494:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "instanceof_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_instanceof_key3130); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instanceof_key"


    // $ANTLR start "boolean_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:497:1: boolean_key : {...}? =>id= ID ;
    public final void boolean_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:498:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:498:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "boolean_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_boolean_key3158); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "boolean_key"


    // $ANTLR start "char_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:501:1: char_key : {...}? =>id= ID ;
    public final void char_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:502:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:502:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "char_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_char_key3186); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "char_key"


    // $ANTLR start "byte_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:505:1: byte_key : {...}? =>id= ID ;
    public final void byte_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:506:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:506:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "byte_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.BYTE))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_byte_key3214); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "byte_key"


    // $ANTLR start "short_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:509:1: short_key : {...}? =>id= ID ;
    public final void short_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:510:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:510:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "short_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.SHORT))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_short_key3242); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "short_key"


    // $ANTLR start "int_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:513:1: int_key : {...}? =>id= ID ;
    public final void int_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:514:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:514:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "int_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.INT))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_int_key3270); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "int_key"


    // $ANTLR start "float_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:517:1: float_key : {...}? =>id= ID ;
    public final void float_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:518:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:518:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "float_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_float_key3298); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "float_key"


    // $ANTLR start "long_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:521:1: long_key : {...}? =>id= ID ;
    public final void long_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:522:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:522:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "long_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.LONG))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_long_key3326); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "long_key"


    // $ANTLR start "double_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:525:1: double_key : {...}? =>id= ID ;
    public final void double_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:526:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:526:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "double_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_double_key3353); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "double_key"


    // $ANTLR start "void_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:529:1: void_key : {...}? =>id= ID ;
    public final void void_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:530:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:530:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.VOID)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "void_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.VOID))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_void_key3381); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "void_key"


    // $ANTLR start "this_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:533:1: this_key : {...}? =>id= ID ;
    public final void this_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:534:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:534:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.THIS)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "this_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.THIS))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_this_key3409); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "this_key"


    // $ANTLR start "class_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:537:1: class_key : {...}? =>id= ID ;
    public final void class_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:538:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:538:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.CLASS)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "class_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.CLASS))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_class_key3436); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "class_key"


    // $ANTLR start "new_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:541:1: new_key : {...}? =>id= ID ;
    public final void new_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:542:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:542:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.NEW)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "new_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.NEW))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_new_key3463); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "new_key"


    // $ANTLR start "not_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:545:1: not_key : {...}? =>id= ID ;
    public final void not_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:546:5: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:546:12: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.NOT)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "not_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.NOT))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_not_key3490); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "not_key"


    // $ANTLR start "in_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:549:1: in_key : {...}? =>id= ID ;
    public final void in_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:550:3: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:550:10: {...}? =>id= ID
            {
            if ( !(((helper.validateIdentifierKey(DroolsSoftKeywords.IN)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "in_key", "(helper.validateIdentifierKey(DroolsSoftKeywords.IN))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_in_key3515); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "in_key"


    // $ANTLR start "operator_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:553:1: operator_key : {...}? =>id= ID ;
    public final void operator_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:554:3: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:554:10: {...}? =>id= ID
            {
            if ( !(((helper.isPluggableEvaluator(false)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "operator_key", "(helper.isPluggableEvaluator(false))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_operator_key3539); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "operator_key"


    // $ANTLR start "neg_operator_key"
    // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:557:1: neg_operator_key : {...}? =>id= ID ;
    public final void neg_operator_key() throws RecognitionException {
        Token id=null;

        try {
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:558:3: ({...}? =>id= ID )
            // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:558:10: {...}? =>id= ID
            {
            if ( !(((helper.isPluggableEvaluator(true)))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "neg_operator_key", "(helper.isPluggableEvaluator(true))");
            }
            id=(Token)match(input,ID,FOLLOW_ID_in_neg_operator_key3563); if (state.failed) return ;

            }

        }

        catch (RecognitionException re) {
            throw re;
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "neg_operator_key"

    // $ANTLR start synpred1_DRLExpressions
    public final void synpred1_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:85:33: ( squareArguments )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:85:34: squareArguments
        {
        pushFollow(FOLLOW_squareArguments_in_synpred1_DRLExpressions268);
        squareArguments();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_DRLExpressions

    // $ANTLR start synpred2_DRLExpressions
    public final void synpred2_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:86:22: ( squareArguments )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:86:23: squareArguments
        {
        pushFollow(FOLLOW_squareArguments_in_synpred2_DRLExpressions287);
        squareArguments();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_DRLExpressions

    // $ANTLR start synpred3_DRLExpressions
    public final void synpred3_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:99:8: ( primitiveType )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:99:9: primitiveType
        {
        pushFollow(FOLLOW_primitiveType_in_synpred3_DRLExpressions371);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_DRLExpressions

    // $ANTLR start synpred4_DRLExpressions
    public final void synpred4_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:99:44: ( LEFT_SQUARE RIGHT_SQUARE )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:99:45: LEFT_SQUARE RIGHT_SQUARE
        {
        match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_synpred4_DRLExpressions382); if (state.failed) return ;
        match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_synpred4_DRLExpressions384); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_DRLExpressions

    // $ANTLR start synpred5_DRLExpressions
    public final void synpred5_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:13: ( typeArguments )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:14: typeArguments
        {
        pushFollow(FOLLOW_typeArguments_in_synpred5_DRLExpressions408);
        typeArguments();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_DRLExpressions

    // $ANTLR start synpred6_DRLExpressions
    public final void synpred6_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:55: ( typeArguments )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:56: typeArguments
        {
        pushFollow(FOLLOW_typeArguments_in_synpred6_DRLExpressions422);
        typeArguments();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_DRLExpressions

    // $ANTLR start synpred7_DRLExpressions
    public final void synpred7_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:92: ( LEFT_SQUARE RIGHT_SQUARE )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:100:93: LEFT_SQUARE RIGHT_SQUARE
        {
        match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_synpred7_DRLExpressions434); if (state.failed) return ;
        match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_synpred7_DRLExpressions436); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_DRLExpressions

    // $ANTLR start synpred8_DRLExpressions
    public final void synpred8_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:126:10: ( assignmentOperator )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:126:11: assignmentOperator
        {
        pushFollow(FOLLOW_assignmentOperator_in_synpred8_DRLExpressions613);
        assignmentOperator();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_DRLExpressions

    // $ANTLR start synpred9_DRLExpressions
    public final void synpred9_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:236:5: ( orRestriction[null] )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:236:6: orRestriction[null]
        {
        pushFollow(FOLLOW_orRestriction_in_synpred9_DRLExpressions1147);
        orRestriction(null);

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_DRLExpressions

    // $ANTLR start synpred10_DRLExpressions
    public final void synpred10_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:246:7: ( DOUBLE_PIPE andRestriction[null] )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:246:8: DOUBLE_PIPE andRestriction[null]
        {
        match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_synpred10_DRLExpressions1203); if (state.failed) return ;
        pushFollow(FOLLOW_andRestriction_in_synpred10_DRLExpressions1205);
        andRestriction(null);

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_DRLExpressions

    // $ANTLR start synpred11_DRLExpressions
    public final void synpred11_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:259:5: ( DOUBLE_AMPER singleRestriction[null] )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:259:6: DOUBLE_AMPER singleRestriction[null]
        {
        match(input,DOUBLE_AMPER,FOLLOW_DOUBLE_AMPER_in_synpred11_DRLExpressions1271); if (state.failed) return ;
        pushFollow(FOLLOW_singleRestriction_in_synpred11_DRLExpressions1273);
        singleRestriction(null);

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_DRLExpressions

    // $ANTLR start synpred12_DRLExpressions
    public final void synpred12_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:288:7: ( shiftOp )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:288:8: shiftOp
        {
        pushFollow(FOLLOW_shiftOp_in_synpred12_DRLExpressions1400);
        shiftOp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_DRLExpressions

    // $ANTLR start synpred13_DRLExpressions
    public final void synpred13_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:299:11: ( PLUS | MINUS )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:
        {
        if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred13_DRLExpressions

    // $ANTLR start synpred14_DRLExpressions
    public final void synpred14_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:319:9: ( castExpression )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:319:10: castExpression
        {
        pushFollow(FOLLOW_castExpression_in_synpred14_DRLExpressions1698);
        castExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_DRLExpressions

    // $ANTLR start synpred15_DRLExpressions
    public final void synpred15_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:322:10: ( selector )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:322:11: selector
        {
        pushFollow(FOLLOW_selector_in_synpred15_DRLExpressions1737);
        selector();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_DRLExpressions

    // $ANTLR start synpred16_DRLExpressions
    public final void synpred16_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:323:10: ( INCR | DECR )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:
        {
        if ( (input.LA(1)>=DECR && input.LA(1)<=INCR) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred16_DRLExpressions

    // $ANTLR start synpred17_DRLExpressions
    public final void synpred17_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:327:8: ( LEFT_PAREN primitiveType )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:327:9: LEFT_PAREN primitiveType
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred17_DRLExpressions1792); if (state.failed) return ;
        pushFollow(FOLLOW_primitiveType_in_synpred17_DRLExpressions1794);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_DRLExpressions

    // $ANTLR start synpred18_DRLExpressions
    public final void synpred18_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:328:8: ( LEFT_PAREN type )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:328:9: LEFT_PAREN type
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred18_DRLExpressions1818); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred18_DRLExpressions1820);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_DRLExpressions

    // $ANTLR start synpred19_DRLExpressions
    public final void synpred19_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:343:7: ( parExpression )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:343:8: parExpression
        {
        pushFollow(FOLLOW_parExpression_in_synpred19_DRLExpressions1932);
        parExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_DRLExpressions

    // $ANTLR start synpred20_DRLExpressions
    public final void synpred20_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:344:9: ( nonWildcardTypeArguments )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:344:10: nonWildcardTypeArguments
        {
        pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred20_DRLExpressions1951);
        nonWildcardTypeArguments();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_DRLExpressions

    // $ANTLR start synpred21_DRLExpressions
    public final void synpred21_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:345:9: ( literal )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:345:10: literal
        {
        pushFollow(FOLLOW_literal_in_synpred21_DRLExpressions1976);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_DRLExpressions

    // $ANTLR start synpred22_DRLExpressions
    public final void synpred22_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:347:9: ( super_key )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:347:10: super_key
        {
        pushFollow(FOLLOW_super_key_in_synpred22_DRLExpressions1998);
        super_key();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_DRLExpressions

    // $ANTLR start synpred23_DRLExpressions
    public final void synpred23_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:348:9: ( new_key )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:348:10: new_key
        {
        pushFollow(FOLLOW_new_key_in_synpred23_DRLExpressions2016);
        new_key();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_DRLExpressions

    // $ANTLR start synpred24_DRLExpressions
    public final void synpred24_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:349:9: ( primitiveType )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:349:10: primitiveType
        {
        pushFollow(FOLLOW_primitiveType_in_synpred24_DRLExpressions2034);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_DRLExpressions

    // $ANTLR start synpred25_DRLExpressions
    public final void synpred25_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:351:9: ( inlineMapExpression )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:351:10: inlineMapExpression
        {
        pushFollow(FOLLOW_inlineMapExpression_in_synpred25_DRLExpressions2066);
        inlineMapExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_DRLExpressions

    // $ANTLR start synpred26_DRLExpressions
    public final void synpred26_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:352:9: ( inlineListExpression )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:352:10: inlineListExpression
        {
        pushFollow(FOLLOW_inlineListExpression_in_synpred26_DRLExpressions2082);
        inlineListExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_DRLExpressions

    // $ANTLR start synpred27_DRLExpressions
    public final void synpred27_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:353:9: ( ID )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:353:10: ID
        {
        match(input,ID,FOLLOW_ID_in_synpred27_DRLExpressions2097); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_DRLExpressions

    // $ANTLR start synpred28_DRLExpressions
    public final void synpred28_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:353:19: ( DOT ID )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:353:20: DOT ID
        {
        match(input,DOT,FOLLOW_DOT_in_synpred28_DRLExpressions2104); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred28_DRLExpressions2106); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_DRLExpressions

    // $ANTLR start synpred29_DRLExpressions
    public final void synpred29_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:353:39: ( identifierSuffix )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:353:40: identifierSuffix
        {
        pushFollow(FOLLOW_identifierSuffix_in_synpred29_DRLExpressions2117);
        identifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_DRLExpressions

    // $ANTLR start synpred30_DRLExpressions
    public final void synpred30_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:384:7: ( LEFT_SQUARE RIGHT_SQUARE )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:384:8: LEFT_SQUARE RIGHT_SQUARE
        {
        match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_synpred30_DRLExpressions2280); if (state.failed) return ;
        match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_synpred30_DRLExpressions2282); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_DRLExpressions

    // $ANTLR start synpred31_DRLExpressions
    public final void synpred31_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:385:8: ( LEFT_SQUARE )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:385:9: LEFT_SQUARE
        {
        match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_synpred31_DRLExpressions2304); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_DRLExpressions

    // $ANTLR start synpred32_DRLExpressions
    public final void synpred32_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:412:107: ( LEFT_SQUARE RIGHT_SQUARE )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:412:108: LEFT_SQUARE RIGHT_SQUARE
        {
        match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_synpred32_DRLExpressions2510); if (state.failed) return ;
        match(input,RIGHT_SQUARE,FOLLOW_RIGHT_SQUARE_in_synpred32_DRLExpressions2512); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_DRLExpressions

    // $ANTLR start synpred33_DRLExpressions
    public final void synpred33_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:443:9: ( DOT super_key )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:443:10: DOT super_key
        {
        match(input,DOT,FOLLOW_DOT_in_synpred33_DRLExpressions2708); if (state.failed) return ;
        pushFollow(FOLLOW_super_key_in_synpred33_DRLExpressions2710);
        super_key();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_DRLExpressions

    // $ANTLR start synpred34_DRLExpressions
    public final void synpred34_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:444:9: ( DOT new_key )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:444:10: DOT new_key
        {
        match(input,DOT,FOLLOW_DOT_in_synpred34_DRLExpressions2728); if (state.failed) return ;
        pushFollow(FOLLOW_new_key_in_synpred34_DRLExpressions2730);
        new_key();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_DRLExpressions

    // $ANTLR start synpred35_DRLExpressions
    public final void synpred35_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:445:9: ( DOT ID )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:445:10: DOT ID
        {
        match(input,DOT,FOLLOW_DOT_in_synpred35_DRLExpressions2753); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred35_DRLExpressions2755); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_DRLExpressions

    // $ANTLR start synpred36_DRLExpressions
    public final void synpred36_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:445:27: ( LEFT_PAREN )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:445:28: LEFT_PAREN
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred36_DRLExpressions2764); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_DRLExpressions

    // $ANTLR start synpred37_DRLExpressions
    public final void synpred37_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:447:9: ( LEFT_SQUARE )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:447:10: LEFT_SQUARE
        {
        match(input,LEFT_SQUARE,FOLLOW_LEFT_SQUARE_in_synpred37_DRLExpressions2787); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_DRLExpressions

    // $ANTLR start synpred38_DRLExpressions
    public final void synpred38_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:452:18: ( LEFT_PAREN )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:452:19: LEFT_PAREN
        {
        match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_synpred38_DRLExpressions2828); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_DRLExpressions

    // $ANTLR start synpred39_DRLExpressions
    public final void synpred39_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:478:7: ( GREATER GREATER GREATER )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:478:8: GREATER GREATER GREATER
        {
        match(input,GREATER,FOLLOW_GREATER_in_synpred39_DRLExpressions3010); if (state.failed) return ;
        match(input,GREATER,FOLLOW_GREATER_in_synpred39_DRLExpressions3012); if (state.failed) return ;
        match(input,GREATER,FOLLOW_GREATER_in_synpred39_DRLExpressions3014); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_DRLExpressions

    // $ANTLR start synpred40_DRLExpressions
    public final void synpred40_DRLExpressions_fragment() throws RecognitionException {   
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:479:7: ( GREATER GREATER )
        // /home/etirelli/workspace/jboss/drools-core/drools-compiler/src/main/resources/org/drools/lang/DRLExpressions.g:479:8: GREATER GREATER
        {
        match(input,GREATER,FOLLOW_GREATER_in_synpred40_DRLExpressions3034); if (state.failed) return ;
        match(input,GREATER,FOLLOW_GREATER_in_synpred40_DRLExpressions3036); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_DRLExpressions

    // Delegated rules

    public final boolean synpred13_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_DRLExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_DRLExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String DFA3_eotS =
        "\22\uffff";
    static final String DFA3_eofS =
        "\22\uffff";
    static final String DFA3_minS =
        "\1\10\1\0\20\uffff";
    static final String DFA3_maxS =
        "\1\102\1\0\20\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\16\uffff\1\1";
    static final String DFA3_specialS =
        "\1\uffff\1\0\20\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\2\uffff\2\2\1\uffff\1\2\3\uffff\2\2\11\uffff\2\2\10\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\1\10\uffff\2\2\5\uffff\2\2\5\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "85:32: ( ( squareArguments )=> squareArguments )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_DRLExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA4_eotS =
        "\22\uffff";
    static final String DFA4_eofS =
        "\22\uffff";
    static final String DFA4_minS =
        "\1\10\1\0\20\uffff";
    static final String DFA4_maxS =
        "\1\102\1\0\20\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\16\uffff\1\1";
    static final String DFA4_specialS =
        "\1\uffff\1\0\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\2\uffff\2\2\1\uffff\1\2\3\uffff\2\2\11\uffff\2\2\10\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\1\10\uffff\2\2\5\uffff\2\2\5\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "86:21: ( ( squareArguments )=> squareArguments )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_DRLExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\16\uffff";
    static final String DFA17_eofS =
        "\1\14\15\uffff";
    static final String DFA17_minS =
        "\1\24\13\0\2\uffff";
    static final String DFA17_maxS =
        "\1\102\13\0\2\uffff";
    static final String DFA17_acceptS =
        "\14\uffff\1\2\1\1";
    static final String DFA17_specialS =
        "\1\uffff\1\7\1\2\1\3\1\0\1\1\1\10\1\6\1\12\1\11\1\4\1\5\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\14\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff\2\14\4\uffff"+
            "\1\13\1\12\1\1\1\uffff\1\14\1\uffff\1\14\1\uffff\2\14\22\uffff"+
            "\1\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "126:9: ( ( assignmentOperator )=>op= assignmentOperator left= expression )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_DRLExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_DRLExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_DRLExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_DRLExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_DRLExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_11 = input.LA(1);

                         
                        int index17_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_DRLExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_DRLExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_DRLExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_DRLExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_DRLExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_DRLExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\37\uffff";
    static final String DFA30_eofS =
        "\1\1\36\uffff";
    static final String DFA30_minS =
        "\1\24\1\uffff\3\0\17\uffff\2\0\11\uffff";
    static final String DFA30_maxS =
        "\1\102\1\uffff\3\0\17\uffff\2\0\11\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\2\32\uffff\3\1";
    static final String DFA30_specialS =
        "\1\0\1\uffff\1\1\1\2\1\3\17\uffff\1\4\1\5\11\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\1\3\uffff\2\1\1\3\1\4\1\35\1\34\1\25\1\24\1\1\1\36\1\1\1"+
            "\uffff\1\1\1\uffff\2\1\1\uffff\3\1\2\uffff\3\1\11\uffff\1\2",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "()* loopback of 236:3: ( ( orRestriction[null] )=>right= orRestriction[$result] )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0==EOF||(LA30_0>=AT && LA30_0<=MOD_ASSIGN)||(LA30_0>=SEMICOLON && LA30_0<=COLON)||LA30_0==EQUALS_ASSIGN||LA30_0==RIGHT_PAREN||LA30_0==RIGHT_SQUARE||(LA30_0>=RIGHT_CURLY && LA30_0<=COMMA)||(LA30_0>=DOUBLE_AMPER && LA30_0<=QUESTION)||(LA30_0>=PIPE && LA30_0<=XOR)) ) {s = 1;}

                        else if ( (LA30_0==ID) ) {s = 2;}

                        else if ( (LA30_0==EQUALS) ) {s = 3;}

                        else if ( (LA30_0==NOT_EQUALS) ) {s = 4;}

                        else if ( (LA30_0==LESS) ) {s = 20;}

                        else if ( (LA30_0==GREATER) ) {s = 21;}

                        else if ( (LA30_0==LESS_EQUALS) && (synpred9_DRLExpressions())) {s = 28;}

                        else if ( (LA30_0==GREATER_EQUALS) && (synpred9_DRLExpressions())) {s = 29;}

                        else if ( (LA30_0==LEFT_PAREN) && (synpred9_DRLExpressions())) {s = 30;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred9_DRLExpressions()&&((helper.isPluggableEvaluator(false))))||(synpred9_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.NOT)))))) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_3 = input.LA(1);

                         
                        int index30_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_DRLExpressions()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_DRLExpressions()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_20 = input.LA(1);

                         
                        int index30_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_DRLExpressions()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_20);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_21 = input.LA(1);

                         
                        int index30_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_DRLExpressions()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index30_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\40\uffff";
    static final String DFA31_eofS =
        "\1\1\37\uffff";
    static final String DFA31_minS =
        "\1\24\10\uffff\1\0\26\uffff";
    static final String DFA31_maxS =
        "\1\102\10\uffff\1\0\26\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\2\35\uffff\1\1";
    static final String DFA31_specialS =
        "\11\uffff\1\0\26\uffff}>";
    static final String[] DFA31_transitionS = {
            "\11\1\3\uffff\13\1\1\uffff\1\1\1\uffff\2\1\1\uffff\1\1\1\11"+
            "\1\1\2\uffff\3\1\11\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 246:5: ( ( DOUBLE_PIPE andRestriction[null] )=>lop= DOUBLE_PIPE right= andRestriction[$inp] )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_DRLExpressions()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\40\uffff";
    static final String DFA33_eofS =
        "\1\1\37\uffff";
    static final String DFA33_minS =
        "\1\24\10\uffff\1\0\26\uffff";
    static final String DFA33_maxS =
        "\1\102\10\uffff\1\0\26\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\2\35\uffff\1\1";
    static final String DFA33_specialS =
        "\11\uffff\1\0\26\uffff}>";
    static final String[] DFA33_transitionS = {
            "\11\1\3\uffff\13\1\1\uffff\1\1\1\uffff\2\1\1\uffff\1\11\2\1"+
            "\2\uffff\3\1\11\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()* loopback of 259:3: ( ( DOUBLE_AMPER singleRestriction[null] )=>lop= DOUBLE_AMPER right= singleRestriction[$inp] )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_9 = input.LA(1);

                         
                        int index33_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_DRLExpressions()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\41\uffff";
    static final String DFA35_eofS =
        "\1\1\40\uffff";
    static final String DFA35_minS =
        "\1\24\4\uffff\2\0\32\uffff";
    static final String DFA35_maxS =
        "\1\102\4\uffff\2\0\32\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\2\36\uffff\1\1";
    static final String DFA35_specialS =
        "\5\uffff\1\0\1\1\32\uffff}>";
    static final String[] DFA35_transitionS = {
            "\11\1\3\uffff\6\1\1\6\1\5\3\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
            "\3\1\2\uffff\3\1\11\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "()* loopback of 288:5: ( ( shiftOp )=> shiftOp additiveExpression )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_5 = input.LA(1);

                         
                        int index35_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_DRLExpressions()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_6 = input.LA(1);

                         
                        int index35_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_DRLExpressions()) ) {s = 32;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\16\uffff";
    static final String DFA42_eofS =
        "\16\uffff";
    static final String DFA42_minS =
        "\1\10\2\uffff\1\0\12\uffff";
    static final String DFA42_maxS =
        "\1\102\2\uffff\1\0\12\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\10\uffff\1\3";
    static final String DFA42_specialS =
        "\3\uffff\1\0\12\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\4\2\uffff\2\4\1\uffff\1\4\3\uffff\2\4\23\uffff\1\4\1\uffff"+
            "\1\3\1\uffff\1\4\10\uffff\1\2\1\1\14\uffff\1\4",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "315:1: unaryExpressionNotPlusMinus returns [BaseDescr result] : ( TILDE unaryExpression | NEGATION unaryExpression | ( castExpression )=> castExpression | left= primary ( ( selector )=> selector )* ( ( INCR | DECR )=> ( INCR | DECR ) )? );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_3 = input.LA(1);

                         
                        int index42_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_DRLExpressions()) ) {s = 13;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index42_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\12\uffff";
    static final String DFA44_eofS =
        "\12\uffff";
    static final String DFA44_minS =
        "\1\102\1\0\10\uffff";
    static final String DFA44_maxS =
        "\1\102\1\0\10\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA44_specialS =
        "\1\1\1\0\10\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "331:1: primitiveType : ( boolean_key | char_key | byte_key | short_key | int_key | long_key | float_key | double_key );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))) ) {s = 2;}

                        else if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR)))) ) {s = 3;}

                        else if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))) ) {s = 4;}

                        else if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))) ) {s = 5;}

                        else if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))) ) {s = 6;}

                        else if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))) ) {s = 7;}

                        else if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))) ) {s = 8;}

                        else if ( (((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))) ) {s = 9;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_0 = input.LA(1);

                         
                        int index44_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA44_0==ID) && ((((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.LONG)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF)))||((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))||((helper.validateIdentifierKey(DroolsSoftKeywords.INT)))||((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR)))))) {s = 1;}

                         
                        input.seek(index44_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA49_eotS =
        "\21\uffff";
    static final String DFA49_eofS =
        "\21\uffff";
    static final String DFA49_minS =
        "\1\10\10\uffff\2\0\6\uffff";
    static final String DFA49_maxS =
        "\1\102\10\uffff\2\0\6\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\1\2\6\3\2\uffff\1\4\1\5\1\6\1\11\1\7\1\10";
    static final String DFA49_specialS =
        "\1\0\10\uffff\1\1\1\2\6\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\6\2\uffff\1\5\1\4\1\uffff\1\3\3\uffff\1\7\1\10\23\uffff\1"+
            "\2\1\uffff\1\1\1\uffff\1\12\26\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "342:1: primary returns [BaseDescr result] : ( ( parExpression )=>expr= parExpression | ( nonWildcardTypeArguments )=> nonWildcardTypeArguments ( explicitGenericInvocationSuffix | this_key arguments ) | ( literal )=> literal | ( super_key )=> super_key superSuffix | ( new_key )=> new_key creator | ( primitiveType )=> primitiveType ( LEFT_SQUARE RIGHT_SQUARE )* DOT class_key | ( inlineMapExpression )=> inlineMapExpression | ( inlineListExpression )=> inlineListExpression | ( ID )=> ID ( ( DOT ID )=> DOT ID )* ( ( identifierSuffix )=> identifierSuffix )? );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_0 = input.LA(1);

                         
                        int index49_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_0==LEFT_PAREN) && (synpred19_DRLExpressions())) {s = 1;}

                        else if ( (LA49_0==LESS) && (synpred20_DRLExpressions())) {s = 2;}

                        else if ( (LA49_0==STRING) && (synpred21_DRLExpressions())) {s = 3;}

                        else if ( (LA49_0==DECIMAL) && (synpred21_DRLExpressions())) {s = 4;}

                        else if ( (LA49_0==HEX) && (synpred21_DRLExpressions())) {s = 5;}

                        else if ( (LA49_0==FLOAT) && (synpred21_DRLExpressions())) {s = 6;}

                        else if ( (LA49_0==BOOL) && (synpred21_DRLExpressions())) {s = 7;}

                        else if ( (LA49_0==NULL) && (synpred21_DRLExpressions())) {s = 8;}

                        else if ( (LA49_0==ID) ) {s = 9;}

                        else if ( (LA49_0==LEFT_SQUARE) ) {s = 10;}

                         
                        input.seek(index49_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_9 = input.LA(1);

                         
                        int index49_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred22_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.SUPER))))) ) {s = 11;}

                        else if ( ((synpred23_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.NEW))))) ) {s = 12;}

                        else if ( (((synpred24_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.LONG))))||(synpred24_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.SHORT))))||(synpred24_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.CHAR))))||(synpred24_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.INT))))||(synpred24_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.INSTANCEOF))))||(synpred24_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.FLOAT))))||(synpred24_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.BYTE))))||(synpred24_DRLExpressions()&&((helper.validateIdentifierKey(DroolsSoftKeywords.DOUBLE)))))) ) {s = 13;}

                        else if ( (synpred27_DRLExpressions()) ) {s = 14;}

                         
                        input.seek(index49_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_10 = input.LA(1);

                         
                        int index49_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_DRLExpressions()) ) {s = 15;}

                        else if ( (synpred26_DRLExpressions()) ) {s = 16;}

                         
                        input.seek(index49_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA48_eotS =
        "\46\uffff";
    static final String DFA48_eofS =
        "\1\3\45\uffff";
    static final String DFA48_minS =
        "\1\24\2\0\43\uffff";
    static final String DFA48_maxS =
        "\1\103\2\0\43\uffff";
    static final String DFA48_acceptS =
        "\3\uffff\1\2\41\uffff\1\1";
    static final String DFA48_specialS =
        "\1\uffff\1\0\1\1\43\uffff}>";
    static final String[] DFA48_transitionS = {
            "\13\3\1\uffff\11\3\1\2\1\3\1\1\1\3\1\uffff\6\3\2\uffff\7\3\5"+
            "\uffff\2\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "353:38: ( ( identifierSuffix )=> identifierSuffix )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_1 = input.LA(1);

                         
                        int index48_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_DRLExpressions()) ) {s = 37;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index48_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_2 = input.LA(1);

                         
                        int index48_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_DRLExpressions()) ) {s = 37;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index48_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\46\uffff";
    static final String DFA53_eofS =
        "\1\1\45\uffff";
    static final String DFA53_minS =
        "\1\24\42\uffff\1\0\2\uffff";
    static final String DFA53_maxS =
        "\1\103\42\uffff\1\0\2\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\2\43\uffff\1\1";
    static final String DFA53_specialS =
        "\43\uffff\1\0\2\uffff}>";
    static final String[] DFA53_transitionS = {
            "\13\1\1\uffff\13\1\1\43\1\1\1\uffff\6\1\2\uffff\7\1\5\uffff"+
            "\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "()+ loopback of 385:7: ( ( LEFT_SQUARE )=> LEFT_SQUARE expression RIGHT_SQUARE )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_35 = input.LA(1);

                         
                        int index53_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_DRLExpressions()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_35);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\46\uffff";
    static final String DFA62_eofS =
        "\1\2\45\uffff";
    static final String DFA62_minS =
        "\1\24\1\0\44\uffff";
    static final String DFA62_maxS =
        "\1\103\1\0\44\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\42\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\44\uffff}>";
    static final String[] DFA62_transitionS = {
            "\13\2\1\uffff\13\2\1\1\1\2\1\uffff\6\2\2\uffff\7\2\5\uffff\2"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "()* loopback of 412:37: ({...}? => LEFT_SQUARE expression RIGHT_SQUARE )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!helper.validateLT(2,"]"))) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\46\uffff";
    static final String DFA71_eofS =
        "\1\2\45\uffff";
    static final String DFA71_minS =
        "\1\24\1\0\44\uffff";
    static final String DFA71_maxS =
        "\1\103\1\0\44\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\42\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\44\uffff}>";
    static final String[] DFA71_transitionS = {
            "\13\2\1\uffff\11\2\1\1\3\2\1\uffff\6\2\2\uffff\7\2\5\uffff\2"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "445:26: ( ( LEFT_PAREN )=> arguments )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_DRLExpressions()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\46\uffff";
    static final String DFA73_eofS =
        "\1\2\45\uffff";
    static final String DFA73_minS =
        "\1\24\1\0\44\uffff";
    static final String DFA73_maxS =
        "\1\103\1\0\44\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\42\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\44\uffff}>";
    static final String[] DFA73_transitionS = {
            "\13\2\1\uffff\11\2\1\1\3\2\1\uffff\6\2\2\uffff\7\2\5\uffff\2"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "452:17: ( ( LEFT_PAREN )=> arguments )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_DRLExpressions()) ) {s = 37;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\17\uffff";
    static final String DFA78_eofS =
        "\17\uffff";
    static final String DFA78_minS =
        "\1\25\12\uffff\2\46\2\uffff";
    static final String DFA78_maxS =
        "\1\50\12\uffff\1\46\1\50\2\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\13"+
        "\1\14";
    static final String DFA78_specialS =
        "\14\uffff\1\0\2\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\11\uffff\1\13\1\12\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14",
            "\1\15\1\uffff\1\16",
            "",
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "467:1: assignmentOperator : ( EQUALS_ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN | AND_ASSIGN | OR_ASSIGN | XOR_ASSIGN | MOD_ASSIGN | LESS LESS EQUALS_ASSIGN | ( GREATER GREATER GREATER )=> GREATER GREATER GREATER EQUALS_ASSIGN | ( GREATER GREATER )=> GREATER GREATER EQUALS_ASSIGN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_12 = input.LA(1);

                         
                        int index78_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA78_12==GREATER) && (synpred39_DRLExpressions())) {s = 13;}

                        else if ( (LA78_12==EQUALS_ASSIGN) && (synpred40_DRLExpressions())) {s = 14;}

                         
                        input.seek(index78_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_STRING_in_literal83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_literal98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_in_literal112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_literal146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_operator189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUALS_in_operator197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_operator205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_EQUALS_in_relationalOp228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_EQUALS_in_relationalOp236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_relationalOp245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_relationalOp254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_key_in_relationalOp262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_neg_operator_key_in_relationalOp264 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_squareArguments_in_relationalOp272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_key_in_relationalOp282 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_squareArguments_in_relationalOp291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList320 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_typeList325 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_typeMatch_in_type347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_typeMatch378 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_typeMatch388 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_typeMatch390 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ID_in_typeMatch404 = new BitSet(new long[]{0x0001088000000002L});
    public static final BitSet FOLLOW_typeArguments_in_typeMatch411 = new BitSet(new long[]{0x0001080000000002L});
    public static final BitSet FOLLOW_DOT_in_typeMatch416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_typeMatch418 = new BitSet(new long[]{0x0001088000000002L});
    public static final BitSet FOLLOW_typeArguments_in_typeMatch425 = new BitSet(new long[]{0x0001080000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_typeMatch440 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_typeMatch442 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_LESS_in_typeArguments467 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments469 = new BitSet(new long[]{0x0000804000000000L});
    public static final BitSet FOLLOW_COMMA_in_typeArguments472 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments474 = new BitSet(new long[]{0x0000804000000000L});
    public static final BitSet FOLLOW_GREATER_in_typeArguments478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeArgument495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_typeArgument503 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_extends_key_in_typeArgument507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_super_key_in_typeArgument511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_typeArgument514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_dummy538 = new BitSet(new long[]{0x0000000100100000L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_dummy540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_dummy2574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_dummy2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression599 = new BitSet(new long[]{0x000001C01FE00002L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression620 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression651 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression665 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression669 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression671 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression700 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_conditionalOrExpression709 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression713 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression750 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_DOUBLE_AMPER_in_conditionalAndExpression758 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression762 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression798 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_PIPE_in_inclusiveOrExpression806 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression810 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression846 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_XOR_in_exclusiveOrExpression854 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression858 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression896 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_AMPER_in_andExpression904 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression908 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression948 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_EQUALS_in_equalityExpression960 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_EQUALS_in_equalityExpression966 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression972 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_inExpression_in_instanceOfExpression1008 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_instanceof_key_in_instanceOfExpression1017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_inExpression1056 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_not_key_in_inExpression1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_in_key_in_inExpression1070 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_inExpression1072 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_inExpression1074 = new BitSet(new long[]{0x0000840000000000L});
    public static final BitSet FOLLOW_COMMA_in_inExpression1077 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_inExpression1079 = new BitSet(new long[]{0x0000840000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_inExpression1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_key_in_inExpression1093 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_inExpression1095 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_inExpression1097 = new BitSet(new long[]{0x0000840000000000L});
    public static final BitSet FOLLOW_COMMA_in_inExpression1100 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_inExpression1102 = new BitSet(new long[]{0x0000840000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_inExpression1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression1133 = new BitSet(new long[]{0x000002FC00000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_orRestriction_in_relationalExpression1154 = new BitSet(new long[]{0x000002FC00000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_andRestriction_in_orRestriction1191 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_orRestriction1211 = new BitSet(new long[]{0x000002FC00000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_andRestriction_in_orRestriction1215 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_EOF_in_orRestriction1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleRestriction_in_andRestriction1261 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_DOUBLE_AMPER_in_andRestriction1279 = new BitSet(new long[]{0x000002FC00000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_singleRestriction_in_andRestriction1283 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_operator_in_singleRestriction1329 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_shiftExpression_in_singleRestriction1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_singleRestriction1351 = new BitSet(new long[]{0x000002FC00000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_orRestriction_in_singleRestriction1353 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_singleRestriction1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1389 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_shiftOp_in_shiftExpression1403 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1405 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_LESS_in_shiftOp1425 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LESS_in_shiftOp1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_shiftOp1440 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_GREATER_in_shiftOp1442 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_GREATER_in_shiftOp1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_shiftOp1457 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_GREATER_in_shiftOp1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1487 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1508 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1516 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1544 = new BitSet(new long[]{0x0600000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1556 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1570 = new BitSet(new long[]{0x0600000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression1596 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression1606 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_unaryExpression1618 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_primary_in_unaryExpression1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECR_in_unaryExpression1630 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_primary_in_unaryExpression1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_unaryExpressionNotPlusMinus1674 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATION_in_unaryExpressionNotPlusMinus1685 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus1723 = new BitSet(new long[]{0x0001080060000002L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus1740 = new BitSet(new long[]{0x0001080060000002L});
    public static final BitSet FOLLOW_set_in_unaryExpressionNotPlusMinus1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_castExpression1799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_castExpression1801 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_castExpression1803 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_unaryExpression_in_castExpression1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_castExpression1825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_castExpression1827 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_castExpression1829 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_key_in_primitiveType1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_key_in_primitiveType1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_byte_key_in_primitiveType1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_short_key_in_primitiveType1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_key_in_primitiveType1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_long_key_in_primitiveType1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_key_in_primitiveType1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_key_in_primitiveType1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_primary1955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_explicitGenericInvocationSuffix_in_primary1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_this_key_in_primary1962 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_arguments_in_primary1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_super_key_in_primary2002 = new BitSet(new long[]{0x0001020000000000L});
    public static final BitSet FOLLOW_superSuffix_in_primary2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_new_key_in_primary2020 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_creator_in_primary2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary2038 = new BitSet(new long[]{0x0001080000000000L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_primary2041 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_primary2043 = new BitSet(new long[]{0x0001080000000000L});
    public static final BitSet FOLLOW_DOT_in_primary2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_class_key_in_primary2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineMapExpression_in_primary2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineListExpression_in_primary2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary2100 = new BitSet(new long[]{0x00010A0000000002L});
    public static final BitSet FOLLOW_DOT_in_primary2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_primary2111 = new BitSet(new long[]{0x00010A0000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_primary2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_inlineListExpression2142 = new BitSet(new long[]{0x18301A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_inlineListExpression2144 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_inlineListExpression2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_inlineMapExpression2169 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_mapExpressionList_in_inlineMapExpression2171 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_inlineMapExpression2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapEntry_in_mapExpressionList2191 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_COMMA_in_mapExpressionList2194 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_mapEntry_in_mapExpressionList2196 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_expression_in_mapEntry2219 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_mapEntry2221 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_mapEntry2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_parExpression2245 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parExpression2249 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_parExpression2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_identifierSuffix2286 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_identifierSuffix2288 = new BitSet(new long[]{0x0001080000000000L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix2292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_class_key_in_identifierSuffix2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_identifierSuffix2309 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_identifierSuffix2311 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_identifierSuffix2313 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator2349 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_createdName_in_creator2352 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_createdName2385 = new BitSet(new long[]{0x0001008000000002L});
    public static final BitSet FOLLOW_typeArguments_in_createdName2387 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_DOT_in_createdName2400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_createdName2402 = new BitSet(new long[]{0x0001008000000002L});
    public static final BitSet FOLLOW_typeArguments_in_createdName2404 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_innerCreator2439 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_classCreatorRest_in_innerCreator2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_arrayCreatorRest2460 = new BitSet(new long[]{0x18301A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_arrayCreatorRest2470 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_arrayCreatorRest2473 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_arrayCreatorRest2475 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2493 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_arrayCreatorRest2495 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_arrayCreatorRest2500 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2502 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_arrayCreatorRest2504 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_arrayCreatorRest2516 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_arrayCreatorRest2518 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_CURLY_in_arrayInitializer2578 = new BitSet(new long[]{0x18306A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer2581 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_COMMA_in_arrayInitializer2584 = new BitSet(new long[]{0x18302A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer2586 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_COMMA_in_arrayInitializer2591 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RIGHT_CURLY_in_arrayInitializer2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation2633 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitGenericInvocation2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_nonWildcardTypeArguments2652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments2654 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_GREATER_in_nonWildcardTypeArguments2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_super_key_in_explicitGenericInvocationSuffix2673 = new BitSet(new long[]{0x0001020000000000L});
    public static final BitSet FOLLOW_superSuffix_in_explicitGenericInvocationSuffix2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_explicitGenericInvocationSuffix2686 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitGenericInvocationSuffix2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector2713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_super_key_in_selector2715 = new BitSet(new long[]{0x0001020000000000L});
    public static final BitSet FOLLOW_superSuffix_in_selector2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector2733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_new_key_in_selector2735 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_selector2738 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_innerCreator_in_selector2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector2758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_selector2760 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_arguments_in_selector2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_selector2790 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector2792 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_selector2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_superSuffix2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_superSuffix2822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_superSuffix2824 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_arguments_in_superSuffix2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_squareArguments2856 = new BitSet(new long[]{0x18301A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_squareArguments2858 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_squareArguments2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_arguments2878 = new BitSet(new long[]{0x18300E80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_arguments2880 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_arguments2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList2900 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_COMMA_in_expressionList2903 = new BitSet(new long[]{0x18300A80600C5900L,0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expressionList2905 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_EQUALS_ASSIGN_in_assignmentOperator2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_assignmentOperator2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_assignmentOperator2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULT_ASSIGN_in_assignmentOperator2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_assignmentOperator2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_assignmentOperator2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_assignmentOperator2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_assignmentOperator2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_assignmentOperator2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_assignmentOperator2996 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LESS_in_assignmentOperator2998 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_EQUALS_ASSIGN_in_assignmentOperator3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_assignmentOperator3018 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_GREATER_in_assignmentOperator3020 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_GREATER_in_assignmentOperator3022 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_EQUALS_ASSIGN_in_assignmentOperator3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_assignmentOperator3040 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_GREATER_in_assignmentOperator3042 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_EQUALS_ASSIGN_in_assignmentOperator3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_extends_key3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_super_key3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instanceof_key3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_boolean_key3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_char_key3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_byte_key3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_short_key3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_int_key3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_float_key3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_long_key3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_double_key3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_void_key3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_this_key3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_class_key3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_new_key3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_not_key3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_in_key3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operator_key3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_neg_operator_key3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_squareArguments_in_synpred1_DRLExpressions268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_squareArguments_in_synpred2_DRLExpressions287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_synpred3_DRLExpressions371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_synpred4_DRLExpressions382 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_synpred4_DRLExpressions384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArguments_in_synpred5_DRLExpressions408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArguments_in_synpred6_DRLExpressions422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_synpred7_DRLExpressions434 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_synpred7_DRLExpressions436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperator_in_synpred8_DRLExpressions613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orRestriction_in_synpred9_DRLExpressions1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_synpred10_DRLExpressions1203 = new BitSet(new long[]{0x000002FC00000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_andRestriction_in_synpred10_DRLExpressions1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_AMPER_in_synpred11_DRLExpressions1271 = new BitSet(new long[]{0x000002FC00000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_singleRestriction_in_synpred11_DRLExpressions1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftOp_in_synpred12_DRLExpressions1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred13_DRLExpressions1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_synpred14_DRLExpressions1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_synpred15_DRLExpressions1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred16_DRLExpressions1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred17_DRLExpressions1792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_synpred17_DRLExpressions1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred18_DRLExpressions1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_synpred18_DRLExpressions1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_synpred19_DRLExpressions1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred20_DRLExpressions1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred21_DRLExpressions1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_super_key_in_synpred22_DRLExpressions1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_new_key_in_synpred23_DRLExpressions2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_synpred24_DRLExpressions2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineMapExpression_in_synpred25_DRLExpressions2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineListExpression_in_synpred26_DRLExpressions2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred27_DRLExpressions2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred28_DRLExpressions2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_synpred28_DRLExpressions2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred29_DRLExpressions2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_synpred30_DRLExpressions2280 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_synpred30_DRLExpressions2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_synpred31_DRLExpressions2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_synpred32_DRLExpressions2510 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RIGHT_SQUARE_in_synpred32_DRLExpressions2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred33_DRLExpressions2708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_super_key_in_synpred33_DRLExpressions2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred34_DRLExpressions2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_new_key_in_synpred34_DRLExpressions2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred35_DRLExpressions2753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_synpred35_DRLExpressions2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred36_DRLExpressions2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_SQUARE_in_synpred37_DRLExpressions2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_synpred38_DRLExpressions2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_synpred39_DRLExpressions3010 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_GREATER_in_synpred39_DRLExpressions3012 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_GREATER_in_synpred39_DRLExpressions3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_synpred40_DRLExpressions3034 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_GREATER_in_synpred40_DRLExpressions3036 = new BitSet(new long[]{0x0000000000000002L});

}