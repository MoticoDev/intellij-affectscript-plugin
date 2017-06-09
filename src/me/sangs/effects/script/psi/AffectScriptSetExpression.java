package me.sangs.effects.script.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import me.sangs.effects.script.AffectScriptLanguage;
import org.antlr.jetbrains.adaptor.SymtabUtils;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode;
import org.antlr.jetbrains.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by dsa28s on 2017. 4. 28..
 */
public class AffectScriptSetExpression extends ANTLRPsiNode implements ScopeNode {

    public AffectScriptSetExpression(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable
    @Override
    public PsiElement resolve(PsiNamedElement element) {
        return SymtabUtils.resolve(this, AffectScriptLanguage.INSTANCE, element, "/set");
    }
}
