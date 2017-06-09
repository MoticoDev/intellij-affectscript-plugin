package me.sangs.effects.script;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import me.sangs.effects.script.grammar.AffectScriptLexer;
import me.sangs.effects.script.grammar.AffectScriptParser;
import me.sangs.effects.script.psi.*;
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.jetbrains.adaptor.lexer.RuleIElementType;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.antlr.jetbrains.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 *  Affect Script for Adobe After Effects
 *  Project. AffectScript (Language)
 *  Author - MR.LEE(leeshoon1344@gmail.com)
 *  Description - Definition of AffectScript Parser
 */

public class AffectScriptDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(AffectScriptLanguage.INSTANCE);
    public static TokenIElementType ID;

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(AffectScriptLanguage.INSTANCE, AffectScriptParser.tokenNames, AffectScriptParser.ruleNames);
        List<TokenIElementType> mTypes = PSIElementTypeFactory.getTokenIElementTypes(AffectScriptLanguage.INSTANCE);
        ID = mTypes.get(AffectScriptLexer.ID);
    }

    public static final TokenSet COMMENTS = PSIElementTypeFactory.createTokenSet(AffectScriptLanguage.INSTANCE, AffectScriptLexer.COMMENT, AffectScriptLexer.LINE_COMMENT);
    public static final TokenSet WHITESPACE = PSIElementTypeFactory.createTokenSet(AffectScriptLanguage.INSTANCE, AffectScriptLexer.WS);
    public static final TokenSet STRING = PSIElementTypeFactory.createTokenSet(AffectScriptLanguage.INSTANCE, AffectScriptLexer.STRING);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        AffectScriptLexer mLexer = new AffectScriptLexer(null);
        return new ANTLRLexerAdaptor(AffectScriptLanguage.INSTANCE, mLexer);
    }

    @Override
    public PsiParser createParser(Project project) {
        final AffectScriptParser mParser = new AffectScriptParser(null);
        return new ANTLRParserAdaptor(AffectScriptLanguage.INSTANCE, mParser) {
            @Override
            protected ParseTree parse(Parser parser, IElementType root) {
                if(root instanceof IFileElementType) {
                    return ((AffectScriptParser)parser).affectscript();
                }

                return ((AffectScriptParser)parser).primary();
            }
        };
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITESPACE;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return STRING;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        IElementType mType = node.getElementType();
        if(mType instanceof TokenIElementType) {
            return new AffectScriptPSIElement(node);
        }

        if(!(mType instanceof RuleIElementType)) {
            return new AffectScriptPSIElement(node);
        }

        RuleIElementType mRuleType = (RuleIElementType)mType;

        switch(mRuleType.getRuleIndex()) {
            case AffectScriptParser.RULE_affectscript:
                return new AffectScript(node);
            case AffectScriptParser.RULE_usescript:
                return new AffectScriptUseScriptSubtree(node, mRuleType);
            case AffectScriptParser.RULE_annotation:
                return new AffectScriptAnnotation(node);
            case AffectScriptParser.RULE_create:
                return new AffectScriptCreateExpression(node);
            case AffectScriptParser.RULE_set:
                return new AffectScriptSetExpression(node);
            case AffectScriptParser.RULE_add:
                return new AffectScriptAddExpression(node);
            case AffectScriptParser.RULE_setvalues:
                return new AffectScriptSetValuesBlock(node);
            case AffectScriptParser.RULE_open:
                return new AffectScriptOpenExpression(node, mRuleType);
            case AffectScriptParser.RULE_importfile:
                return new AffectScriptImportFile(node, mRuleType);
            default:
                return new AffectScriptPSIElement(node);
        }
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new AffectScriptPSIFileRoot(viewProvider, AffectScriptLanguage.INSTANCE);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
