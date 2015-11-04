package hu.elte.txtuml.xtxtuml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXtxtUMLLexer extends Lexer {
    public static final int RULE_HEX=6;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DECIMAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalXtxtUMLLexer() {;} 
    public InternalXtxtUMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXtxtUMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:11:7: ( 'package' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:12:7: ( ';' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:13:7: ( 'model' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:13:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:14:7: ( '{' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:15:7: ( '}' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:16:7: ( 'execution' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:16:9: 'execution'
            {
            match("execution"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:17:7: ( 'signal' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:17:9: 'signal'
            {
            match("signal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:18:7: ( 'class' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:18:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:19:7: ( 'extends' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:19:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:20:7: ( 'association' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:20:9: 'association'
            {
            match("association"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:21:7: ( '(' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:22:7: ( ',' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:23:7: ( ')' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:24:7: ( 'entry' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:24:9: 'entry'
            {
            match("entry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:25:7: ( 'exit' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:25:9: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:26:7: ( 'transition' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:26:9: 'transition'
            {
            match("transition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:27:7: ( 'trigger' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:27:9: 'trigger'
            {
            match("trigger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:28:7: ( 'from' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:28:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:29:7: ( 'to' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:29:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:30:7: ( 'effect' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:30:9: 'effect'
            {
            match("effect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:31:7: ( 'guard' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:31:9: 'guard'
            {
            match("guard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:32:7: ( 'hidden' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:32:9: 'hidden'
            {
            match("hidden"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:33:7: ( '..' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:33:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:34:7: ( '*' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:34:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:35:7: ( 'send' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:35:9: 'send'
            {
            match("send"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:36:7: ( 'delete' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:36:9: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:37:7: ( 'new' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:37:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:38:7: ( '<' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:38:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:39:7: ( '>' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:39:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:40:7: ( 'while' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:40:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:41:7: ( 'do' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:41:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:42:7: ( 'if' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:42:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:43:7: ( 'else' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:43:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:44:7: ( 'for' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:44:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:45:7: ( 'in' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:45:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:46:7: ( 'switch' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:46:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:47:7: ( 'default' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:47:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:48:7: ( ':' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:48:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:49:7: ( 'case' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:49:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:50:7: ( '=' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:50:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:51:7: ( 'return' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:51:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:52:7: ( '.' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:52:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:53:7: ( '::' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:53:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:54:7: ( '->' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:54:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:55:7: ( 'import' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:55:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:56:7: ( 'static' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:56:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:57:7: ( '+=' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:57:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:58:7: ( '-=' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:58:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:59:7: ( '*=' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:59:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:60:7: ( '/=' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:60:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:61:7: ( '%=' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:61:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:62:7: ( '>=' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:62:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:63:7: ( '||' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:63:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:64:7: ( '&&' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:64:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:65:7: ( '==' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:65:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:66:7: ( '!=' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:66:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:67:7: ( '===' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:67:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:68:7: ( '!==' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:68:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:69:7: ( 'instanceof' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:69:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:70:7: ( '+' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:70:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:71:7: ( '-' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:71:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:72:7: ( '**' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:72:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:73:7: ( '/' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:73:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:74:7: ( '%' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:74:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:75:7: ( '!' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:75:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:76:7: ( 'as' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:76:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:77:7: ( '++' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:77:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:78:7: ( '--' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:78:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:79:7: ( '#' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:79:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:80:7: ( '[' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:80:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:81:7: ( ']' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:81:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:82:7: ( '|' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:82:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:83:7: ( 'extension' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:83:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:84:7: ( 'super' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:84:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:85:7: ( 'false' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:85:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:86:7: ( 'true' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:86:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:87:7: ( 'null' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:87:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:88:7: ( 'catch' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:88:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:89:7: ( '?' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:89:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:90:7: ( '&' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:90:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:91:7: ( 'state' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:91:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:92:7: ( 'initial' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:92:9: 'initial'
            {
            match("initial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:93:7: ( 'choice' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:93:9: 'choice'
            {
            match("choice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:94:7: ( 'composite' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:94:9: 'composite'
            {
            match("composite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:95:7: ( 'private' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:95:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:96:7: ( 'protected' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:96:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:97:7: ( 'public' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:97:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6935:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6935:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6935:12: ( '0x' | '0X' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='x') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='X') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6935:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6935:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6935:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6935:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6935:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6935:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='B'||LA3_0=='b') ) {
                        alt3=1;
                    }
                    else if ( (LA3_0=='L'||LA3_0=='l') ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6935:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6935:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6937:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6937:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6937:21: ( '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6939:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6939:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6939:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6939:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6939:36: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6939:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='B'||LA8_0=='b') ) {
                alt8=1;
            }
            else if ( (LA8_0=='D'||LA8_0=='F'||LA8_0=='L'||LA8_0=='d'||LA8_0=='f'||LA8_0=='l') ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6939:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6939:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6941:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6941:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6941:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6941:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6941:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='$'||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:44: ( '\"' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\"') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:62: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:79: ( '\\'' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\'') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6943:79: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6945:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6945:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6945:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6945:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6947:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6947:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6947:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6947:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6947:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6947:41: ( '\\r' )? '\\n'
                    {
                    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6947:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6947:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6949:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6949:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6949:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6951:16: ( . )
            // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:6951:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=96;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:346: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:352: T__70
                {
                mT__70(); 

                }
                break;
            case 59 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:358: T__71
                {
                mT__71(); 

                }
                break;
            case 60 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:364: T__72
                {
                mT__72(); 

                }
                break;
            case 61 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:370: T__73
                {
                mT__73(); 

                }
                break;
            case 62 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:376: T__74
                {
                mT__74(); 

                }
                break;
            case 63 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:382: T__75
                {
                mT__75(); 

                }
                break;
            case 64 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:388: T__76
                {
                mT__76(); 

                }
                break;
            case 65 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:394: T__77
                {
                mT__77(); 

                }
                break;
            case 66 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:400: T__78
                {
                mT__78(); 

                }
                break;
            case 67 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:406: T__79
                {
                mT__79(); 

                }
                break;
            case 68 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:412: T__80
                {
                mT__80(); 

                }
                break;
            case 69 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:418: T__81
                {
                mT__81(); 

                }
                break;
            case 70 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:424: T__82
                {
                mT__82(); 

                }
                break;
            case 71 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:430: T__83
                {
                mT__83(); 

                }
                break;
            case 72 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:436: T__84
                {
                mT__84(); 

                }
                break;
            case 73 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:442: T__85
                {
                mT__85(); 

                }
                break;
            case 74 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:448: T__86
                {
                mT__86(); 

                }
                break;
            case 75 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:454: T__87
                {
                mT__87(); 

                }
                break;
            case 76 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:460: T__88
                {
                mT__88(); 

                }
                break;
            case 77 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:466: T__89
                {
                mT__89(); 

                }
                break;
            case 78 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:472: T__90
                {
                mT__90(); 

                }
                break;
            case 79 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:478: T__91
                {
                mT__91(); 

                }
                break;
            case 80 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:484: T__92
                {
                mT__92(); 

                }
                break;
            case 81 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:490: T__93
                {
                mT__93(); 

                }
                break;
            case 82 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:496: T__94
                {
                mT__94(); 

                }
                break;
            case 83 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:502: T__95
                {
                mT__95(); 

                }
                break;
            case 84 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:508: T__96
                {
                mT__96(); 

                }
                break;
            case 85 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:514: T__97
                {
                mT__97(); 

                }
                break;
            case 86 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:520: T__98
                {
                mT__98(); 

                }
                break;
            case 87 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:526: T__99
                {
                mT__99(); 

                }
                break;
            case 88 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:532: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 89 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:541: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 90 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:550: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 91 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:563: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 92 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:571: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 93 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:583: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 94 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:599: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 95 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:615: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 96 :
                // ../hu.elte.txtuml.xtxtuml/src-gen/hu/elte/txtuml/xtxtuml/parser/antlr/internal/InternalXtxtUML.g:1:623: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\1\62\1\uffff\1\62\2\uffff\4\62\3\uffff\4\62\1\120\1\123"+
        "\2\62\1\uffff\1\132\2\62\1\140\1\142\1\62\1\147\1\152\1\156\1\160"+
        "\1\162\1\164\1\166\4\uffff\2\175\1\56\5\uffff\3\62\2\uffff\1\62"+
        "\2\uffff\15\62\1\u0097\3\uffff\1\62\1\u009b\5\62\5\uffff\1\62\1"+
        "\u00a3\2\62\3\uffff\1\62\1\u00a7\1\u00aa\1\62\2\uffff\1\u00ad\1"+
        "\uffff\1\62\21\uffff\1\u00b0\6\uffff\1\175\4\uffff\26\62\1\uffff"+
        "\3\62\1\uffff\1\62\1\u00cb\5\62\1\uffff\1\u00d1\2\62\1\uffff\2\62"+
        "\1\uffff\1\62\2\uffff\1\62\2\uffff\7\62\1\u00df\2\62\1\u00e2\1\62"+
        "\1\u00e4\4\62\1\u00ea\6\62\1\u00f1\1\u00f2\1\uffff\5\62\1\uffff"+
        "\1\u00f8\11\62\1\u0102\2\62\1\uffff\1\u0106\1\62\1\uffff\1\62\1"+
        "\uffff\2\62\1\u010b\1\u010c\1\u010d\1\uffff\1\u010e\5\62\2\uffff"+
        "\1\u0114\1\u0115\3\62\1\uffff\1\u0119\7\62\1\u0121\1\uffff\3\62"+
        "\1\uffff\1\u0125\1\u0126\1\u0127\1\u0128\4\uffff\1\u0129\4\62\2"+
        "\uffff\1\u012e\1\u012f\1\62\1\uffff\2\62\1\u0133\1\u0134\1\u0135"+
        "\1\u0136\1\62\1\uffff\1\62\1\u0139\1\62\5\uffff\3\62\1\u013e\2\uffff"+
        "\1\u013f\1\62\1\u0141\4\uffff\2\62\1\uffff\4\62\2\uffff\1\62\1\uffff"+
        "\1\u0149\1\u014a\1\u014b\1\u014c\3\62\4\uffff\1\62\1\u0151\1\u0152"+
        "\1\u0153\3\uffff";
    static final String DFA21_eofS =
        "\u0154\uffff";
    static final String DFA21_minS =
        "\1\0\1\141\1\uffff\1\157\2\uffff\1\146\1\145\1\141\1\163\3\uffff"+
        "\1\157\1\141\1\165\1\151\1\56\1\52\2\145\1\uffff\1\75\1\150\1\146"+
        "\1\72\1\75\1\145\1\55\1\53\1\52\1\75\1\174\1\46\1\75\4\uffff\2\60"+
        "\1\44\5\uffff\1\143\1\151\1\142\2\uffff\1\144\2\uffff\1\145\1\164"+
        "\1\146\1\163\1\147\1\156\1\151\1\141\1\160\1\141\1\163\1\157\1\155"+
        "\1\44\3\uffff\1\141\1\44\1\157\1\162\1\154\1\141\1\144\5\uffff\1"+
        "\146\1\44\1\167\1\154\3\uffff\1\151\2\44\1\160\2\uffff\1\75\1\uffff"+
        "\1\164\21\uffff\1\75\6\uffff\1\60\4\uffff\1\153\1\166\1\164\1\154"+
        "\1\145\1\143\1\145\1\164\1\162\2\145\1\156\1\144\2\164\1\145\1\163"+
        "\1\145\1\143\1\151\1\160\1\157\1\uffff\1\156\1\147\1\145\1\uffff"+
        "\1\155\1\44\1\163\1\162\1\144\1\145\1\141\1\uffff\1\44\2\154\1\uffff"+
        "\2\164\1\uffff\1\157\2\uffff\1\165\2\uffff\2\141\1\145\1\151\1\154"+
        "\1\165\1\156\1\44\1\171\1\143\1\44\1\141\1\44\1\143\1\145\1\162"+
        "\1\163\1\44\1\150\1\143\1\157\1\143\1\163\1\147\2\44\1\uffff\1\145"+
        "\1\144\1\145\1\164\1\165\1\uffff\1\44\1\145\1\141\1\151\2\162\1"+
        "\147\1\164\2\143\1\44\1\164\1\144\1\uffff\1\44\1\164\1\uffff\1\154"+
        "\1\uffff\1\150\1\143\3\44\1\uffff\1\44\1\145\1\163\2\151\1\145\2"+
        "\uffff\2\44\1\156\1\145\1\154\1\uffff\1\44\1\156\1\141\1\164\1\156"+
        "\2\145\1\164\1\44\1\uffff\1\151\1\163\1\151\1\uffff\4\44\4\uffff"+
        "\1\44\1\151\1\141\1\164\1\162\2\uffff\2\44\1\164\1\uffff\1\143\1"+
        "\154\4\44\1\145\1\uffff\1\157\1\44\1\157\5\uffff\2\164\1\151\1\44"+
        "\2\uffff\1\44\1\145\1\44\4\uffff\1\144\1\156\1\uffff\1\156\1\145"+
        "\1\151\1\157\2\uffff\1\157\1\uffff\4\44\1\157\1\156\1\146\4\uffff"+
        "\1\156\3\44\3\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\165\1\uffff\1\157\2\uffff\1\170\1\167\1\157\1\163\3"+
        "\uffff\2\162\1\165\1\151\1\56\1\75\1\157\1\165\1\uffff\1\75\1\150"+
        "\1\156\1\72\1\75\1\145\1\76\3\75\1\174\1\46\1\75\4\uffff\1\170\1"+
        "\154\1\172\5\uffff\1\143\1\157\1\142\2\uffff\1\144\2\uffff\2\164"+
        "\1\146\1\163\1\147\1\156\1\151\1\141\1\160\1\141\1\164\1\157\1\155"+
        "\1\172\3\uffff\1\165\1\172\1\157\1\162\1\154\1\141\1\144\5\uffff"+
        "\1\154\1\172\1\167\1\154\3\uffff\1\151\2\172\1\160\2\uffff\1\75"+
        "\1\uffff\1\164\21\uffff\1\75\6\uffff\1\154\4\uffff\1\153\1\166\1"+
        "\164\1\154\1\145\1\143\1\145\1\164\1\162\2\145\1\156\1\144\2\164"+
        "\1\145\1\163\1\145\1\143\1\151\1\160\1\157\1\uffff\1\156\1\147\1"+
        "\145\1\uffff\1\155\1\172\1\163\1\162\1\144\1\145\1\141\1\uffff\1"+
        "\172\2\154\1\uffff\2\164\1\uffff\1\157\2\uffff\1\165\2\uffff\2\141"+
        "\1\145\1\151\1\154\1\165\1\156\1\172\1\171\1\143\1\172\1\141\1\172"+
        "\1\143\1\151\1\162\1\163\1\172\1\150\1\143\1\157\1\143\1\163\1\147"+
        "\2\172\1\uffff\1\145\1\144\1\145\1\164\1\165\1\uffff\1\172\1\145"+
        "\1\141\1\151\2\162\1\147\1\164\2\143\1\172\1\164\1\163\1\uffff\1"+
        "\172\1\164\1\uffff\1\154\1\uffff\1\150\1\143\3\172\1\uffff\1\172"+
        "\1\145\1\163\2\151\1\145\2\uffff\2\172\1\156\1\145\1\154\1\uffff"+
        "\1\172\1\156\1\141\1\164\1\156\2\145\1\164\1\172\1\uffff\1\151\1"+
        "\163\1\151\1\uffff\4\172\4\uffff\1\172\1\151\1\141\1\164\1\162\2"+
        "\uffff\2\172\1\164\1\uffff\1\143\1\154\4\172\1\145\1\uffff\1\157"+
        "\1\172\1\157\5\uffff\2\164\1\151\1\172\2\uffff\1\172\1\145\1\172"+
        "\4\uffff\1\144\1\156\1\uffff\1\156\1\145\1\151\1\157\2\uffff\1\157"+
        "\1\uffff\4\172\1\157\1\156\1\146\4\uffff\1\156\3\172\3\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\4\uffff\1\13\1\14\1\15\10\uffff\1"+
        "\34\15\uffff\1\105\1\106\1\107\1\117\3\uffff\1\133\2\134\1\137\1"+
        "\140\3\uffff\1\133\1\2\1\uffff\1\4\1\5\16\uffff\1\13\1\14\1\15\7"+
        "\uffff\1\27\1\52\1\61\1\76\1\30\4\uffff\1\34\1\64\1\35\4\uffff\1"+
        "\53\1\46\1\uffff\1\50\1\uffff\1\54\1\60\1\104\1\75\1\57\1\103\1"+
        "\74\1\62\1\135\1\136\1\77\1\63\1\100\1\65\1\110\1\66\1\120\1\uffff"+
        "\1\101\1\105\1\106\1\107\1\117\1\130\1\uffff\1\131\1\132\1\134\1"+
        "\137\26\uffff\1\102\3\uffff\1\23\7\uffff\1\37\3\uffff\1\40\2\uffff"+
        "\1\43\1\uffff\1\71\1\67\1\uffff\1\72\1\70\32\uffff\1\42\5\uffff"+
        "\1\33\15\uffff\1\17\2\uffff\1\41\1\uffff\1\31\5\uffff\1\47\6\uffff"+
        "\1\114\1\22\5\uffff\1\115\11\uffff\1\3\3\uffff\1\16\4\uffff\1\121"+
        "\1\112\1\10\1\116\5\uffff\1\113\1\25\3\uffff\1\36\7\uffff\1\127"+
        "\3\uffff\1\24\1\7\1\44\1\56\1\123\4\uffff\1\26\1\32\3\uffff\1\55"+
        "\1\51\1\1\1\125\2\uffff\1\11\4\uffff\1\21\1\45\1\uffff\1\122\7\uffff"+
        "\1\126\1\6\1\111\1\124\4\uffff\1\20\1\73\1\12";
    static final String DFA21_specialS =
        "\1\0\u0153\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\42\1\53\1\43\1\52\1\37\1"+
            "\41\1\54\1\12\1\14\1\22\1\35\1\13\1\34\1\21\1\36\1\47\11\50"+
            "\1\31\1\2\1\25\1\32\1\26\1\46\1\56\32\52\1\44\1\56\1\45\1\51"+
            "\1\52\1\56\1\11\1\52\1\10\1\23\1\6\1\16\1\17\1\20\1\30\3\52"+
            "\1\3\1\24\1\52\1\1\1\52\1\33\1\7\1\15\2\52\1\27\3\52\1\4\1\40"+
            "\1\5\uff82\56",
            "\1\57\20\uffff\1\60\2\uffff\1\61",
            "",
            "\1\64",
            "",
            "",
            "\1\71\5\uffff\1\72\1\uffff\1\70\11\uffff\1\67",
            "\1\74\3\uffff\1\73\12\uffff\1\76\1\77\1\uffff\1\75",
            "\1\101\6\uffff\1\102\3\uffff\1\100\2\uffff\1\103",
            "\1\104",
            "",
            "",
            "",
            "\1\111\2\uffff\1\110",
            "\1\114\15\uffff\1\113\2\uffff\1\112",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\122\22\uffff\1\121",
            "\1\124\11\uffff\1\125",
            "\1\126\17\uffff\1\127",
            "",
            "\1\131",
            "\1\133",
            "\1\134\6\uffff\1\136\1\135",
            "\1\137",
            "\1\141",
            "\1\143",
            "\1\146\17\uffff\1\145\1\144",
            "\1\151\21\uffff\1\150",
            "\1\154\4\uffff\1\155\15\uffff\1\153",
            "\1\157",
            "\1\161",
            "\1\163",
            "\1\165",
            "",
            "",
            "",
            "",
            "\12\174\10\uffff\1\176\1\uffff\3\176\5\uffff\1\176\13\uffff"+
            "\1\173\6\uffff\1\174\2\uffff\1\176\1\uffff\3\176\5\uffff\1\176"+
            "\13\uffff\1\173",
            "\12\174\10\uffff\1\176\1\uffff\3\176\5\uffff\1\176\22\uffff"+
            "\1\174\2\uffff\1\176\1\uffff\3\176\5\uffff\1\176",
            "\1\62\34\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "",
            "\1\u0081",
            "\1\u0082\5\uffff\1\u0083",
            "\1\u0084",
            "",
            "",
            "\1\u0085",
            "",
            "",
            "\1\u0086\3\uffff\1\u0088\12\uffff\1\u0087",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22"+
            "\62\1\u0096\7\62",
            "",
            "",
            "",
            "\1\u0098\7\uffff\1\u0099\13\uffff\1\u009a",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a2\5\uffff\1\u00a1",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "",
            "\1\u00a6",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10"+
            "\62\1\u00a9\11\62\1\u00a8\7\62",
            "\1\u00ab",
            "",
            "",
            "\1\u00ac",
            "",
            "\1\u00ae",
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
            "\1\u00af",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\174\10\uffff\1\176\1\uffff\3\176\5\uffff\1\176\22\uffff"+
            "\1\174\2\uffff\1\176\1\uffff\3\176\5\uffff\1\176",
            "",
            "",
            "",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "",
            "",
            "\1\u00d7",
            "",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u00e0",
            "\1\u00e1",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u00e3",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u00e5",
            "\1\u00e7\3\uffff\1\u00e6",
            "\1\u00e8",
            "\1\u00e9",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u0103",
            "\1\u0104\16\uffff\1\u0105",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u0107",
            "",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "",
            "",
            "",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u0130",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u0137",
            "",
            "\1\u0138",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u013a",
            "",
            "",
            "",
            "",
            "",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u0140",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "",
            "",
            "",
            "",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "",
            "",
            "\1\u0148",
            "",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "",
            "",
            "",
            "",
            "\1\u0150",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "\1\62\13\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32"+
            "\62",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='p') ) {s = 1;}

                        else if ( (LA21_0==';') ) {s = 2;}

                        else if ( (LA21_0=='m') ) {s = 3;}

                        else if ( (LA21_0=='{') ) {s = 4;}

                        else if ( (LA21_0=='}') ) {s = 5;}

                        else if ( (LA21_0=='e') ) {s = 6;}

                        else if ( (LA21_0=='s') ) {s = 7;}

                        else if ( (LA21_0=='c') ) {s = 8;}

                        else if ( (LA21_0=='a') ) {s = 9;}

                        else if ( (LA21_0=='(') ) {s = 10;}

                        else if ( (LA21_0==',') ) {s = 11;}

                        else if ( (LA21_0==')') ) {s = 12;}

                        else if ( (LA21_0=='t') ) {s = 13;}

                        else if ( (LA21_0=='f') ) {s = 14;}

                        else if ( (LA21_0=='g') ) {s = 15;}

                        else if ( (LA21_0=='h') ) {s = 16;}

                        else if ( (LA21_0=='.') ) {s = 17;}

                        else if ( (LA21_0=='*') ) {s = 18;}

                        else if ( (LA21_0=='d') ) {s = 19;}

                        else if ( (LA21_0=='n') ) {s = 20;}

                        else if ( (LA21_0=='<') ) {s = 21;}

                        else if ( (LA21_0=='>') ) {s = 22;}

                        else if ( (LA21_0=='w') ) {s = 23;}

                        else if ( (LA21_0=='i') ) {s = 24;}

                        else if ( (LA21_0==':') ) {s = 25;}

                        else if ( (LA21_0=='=') ) {s = 26;}

                        else if ( (LA21_0=='r') ) {s = 27;}

                        else if ( (LA21_0=='-') ) {s = 28;}

                        else if ( (LA21_0=='+') ) {s = 29;}

                        else if ( (LA21_0=='/') ) {s = 30;}

                        else if ( (LA21_0=='%') ) {s = 31;}

                        else if ( (LA21_0=='|') ) {s = 32;}

                        else if ( (LA21_0=='&') ) {s = 33;}

                        else if ( (LA21_0=='!') ) {s = 34;}

                        else if ( (LA21_0=='#') ) {s = 35;}

                        else if ( (LA21_0=='[') ) {s = 36;}

                        else if ( (LA21_0==']') ) {s = 37;}

                        else if ( (LA21_0=='?') ) {s = 38;}

                        else if ( (LA21_0=='0') ) {s = 39;}

                        else if ( ((LA21_0>='1' && LA21_0<='9')) ) {s = 40;}

                        else if ( (LA21_0=='^') ) {s = 41;}

                        else if ( (LA21_0=='$'||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='b'||(LA21_0>='j' && LA21_0<='l')||LA21_0=='o'||LA21_0=='q'||(LA21_0>='u' && LA21_0<='v')||(LA21_0>='x' && LA21_0<='z')) ) {s = 42;}

                        else if ( (LA21_0=='\"') ) {s = 43;}

                        else if ( (LA21_0=='\'') ) {s = 44;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 45;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='@'||LA21_0=='\\'||LA21_0=='`'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}