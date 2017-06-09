package me.sangs.effects.script.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.IElementType;
import me.sangs.effects.script.AffectScriptLanguage;
import org.antlr.jetbrains.adaptor.SymtabUtils;
import org.antlr.jetbrains.adaptor.psi.IdentifierDefSubtree;
import org.antlr.jetbrains.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by dsa28s on 2017. 4. 28..
 */
public class AffectScriptFunctionSubtree extends IdentifierDefSubtree implements ScopeNode {

    public AffectScriptFunctionSubtree(@NotNull ASTNode node, @NotNull IElementType idElementType) {
        super(node, idElementType);
    }

    @Nullable
    @Override
    public PsiElement resolve(PsiNamedElement element) {
        return SymtabUtils.resolve(this, AffectScriptLanguage.INSTANCE, element, "/affectscript/function/ID");
    }
}
