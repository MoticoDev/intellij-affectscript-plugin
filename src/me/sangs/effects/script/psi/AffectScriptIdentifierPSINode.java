package me.sangs.effects.script.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.IncorrectOperationException;
import me.sangs.effects.script.AffectScriptDefinition;
import me.sangs.effects.script.AffectScriptLanguage;
import me.sangs.effects.script.grammar.AffectScriptParser;
import org.antlr.jetbrains.adaptor.lexer.RuleIElementType;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiLeafNode;
import org.antlr.jetbrains.adaptor.psi.Trees;
import org.jetbrains.annotations.NotNull;

/**
 * Created by dsa28s on 2017. 4. 28..
 */
public class AffectScriptIdentifierPSINode extends ANTLRPsiLeafNode implements PsiNamedElement {

    public AffectScriptIdentifierPSINode(IElementType type, CharSequence text) {
        super(type, text);
    }

    @Override
    public String getName() {
        return getText();
    }

    @Override
    public PsiElement setName(@NotNull String name) throws IncorrectOperationException {
        if(getParent() == null) {
            return this;
        }

        PsiElement newID = Trees.createLeafFromText(getProject(), AffectScriptLanguage.INSTANCE, getContext(), name, AffectScriptDefinition.ID);
        if(newID != null) {
            return this.replace(newID);
        }

        return this;
    }

    @Override
    public PsiReference getReference() {
        PsiElement mParent = getParent();
        IElementType mType = mParent.getNode().getElementType();

        if(mType instanceof RuleIElementType) {
            switch(((RuleIElementType)mType).getRuleIndex()) {
                case AffectScriptParser.RULE_statement:
                case AffectScriptParser.RULE_expr:
                case AffectScriptParser.RULE_primary:
                    return new AffectScriptVariableRef(this);
                case AffectScriptParser.RULE_call_expr:
                    return new AffectScriptFunctionRef(this);

            }
        }

        return null;
    }
}
