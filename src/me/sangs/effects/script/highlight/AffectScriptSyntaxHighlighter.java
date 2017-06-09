package me.sangs.effects.script.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import me.sangs.effects.script.AffectScriptLanguage;
import me.sangs.effects.script.grammar.AffectScriptLexer;
import me.sangs.effects.script.grammar.AffectScriptParser;
import me.sangs.effects.script.psi.AffectScriptUseScriptSubtree;
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;

/**
 * Created by dsa28s on 2017. 4. 28..
 */
public class AffectScriptSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    public static final TextAttributesKey ID = TextAttributesKey.createTextAttributesKey("AFFECTSCRIPT_VARIABLE", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("AFFECTSCRIPT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey("AFFECTSCRIPT_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMERICAL = TextAttributesKey.createTextAttributesKey("AFFECTSCRIPT_NUMERIC", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey LINE_COMMENT = TextAttributesKey.createTextAttributesKey("AFFECTSCRIPT_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey("AFFECTSCRIPT_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey FUNCTION = TextAttributesKey.createTextAttributesKey("AFFECTSCRIPT_FUNCTION", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey ANNOTATION = TextAttributesKey.createTextAttributesKey("AFFECTSCRIPT_ANNOTATION", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL);
    public static final TextAttributesKey CLASS = TextAttributesKey.createTextAttributesKey("AFFECTSCRIPT_CLASS", DefaultLanguageHighlighterColors.CLASS_REFERENCE);


    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(AffectScriptLanguage.INSTANCE, AffectScriptParser.tokenNames, AffectScriptParser.ruleNames);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        AffectScriptLexer mLexer = new AffectScriptLexer(null);
        return new ANTLRLexerAdaptor(AffectScriptLanguage.INSTANCE, mLexer);
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if(!(tokenType instanceof TokenIElementType)) {
            return EMPTY_KEYS;
        }

        TokenIElementType mType = (TokenIElementType)tokenType;
        int ttype = mType.getANTLRTokenType();

        TextAttributesKey attrKey;

        switch(ttype) {
            case AffectScriptLexer.ID:
                attrKey = ID;
                break;
            case AffectScriptLexer.USE_K:
            case AffectScriptLexer.SCRIPT_k:
            case AffectScriptLexer.CREATE_K:
            case AffectScriptLexer.RECTANGLE_K:
            case AffectScriptLexer.TEXT_K:
            case AffectScriptLexer.SET_K:
            case AffectScriptLexer.TO_K:
            case AffectScriptLexer.ADD_K:
            case AffectScriptLexer.OPEN_K:
            case AffectScriptLexer.SHOW_K:
            case AffectScriptLexer.MSGBOX_K:
            case AffectScriptLexer.IMPORT_K:
            case AffectScriptLexer.FILE_K:
            case AffectScriptLexer.APPLY_K:
            case AffectScriptLexer.EFFECT_K:
            case AffectScriptLexer.PARAMS_K:
            case AffectScriptLexer.NEW_K:
            case AffectScriptLexer.FOLDER_K:
            case AffectScriptLexer.MOVE_K:
            case AffectScriptLexer.COMPOSITION_K:
                attrKey = KEYWORD;
                break;
            case AffectScriptLexer.SETVALUES_FUNC:
            case AffectScriptLexer.SELECT:
                attrKey = FUNCTION;
                break;
            case AffectScriptLexer.STRING:
                attrKey = STRING;
                break;
            case AffectScriptLexer.COMMENT:
                attrKey = LINE_COMMENT;
                break;
            case AffectScriptLexer.LINE_COMMENT:
                attrKey = BLOCK_COMMENT;
                break;
            case AffectScriptLexer.INT:
            case AffectScriptLexer.FLOAT:
                attrKey = NUMERICAL;
                break;
            case AffectScriptLexer.ANNO:
                attrKey = ANNOTATION;
                break;
            case AffectScriptLexer.NEW_:
                attrKey = CLASS;
                break;
            default:
                return EMPTY_KEYS;
        }

        return new TextAttributesKey[] {attrKey};
    }
}
