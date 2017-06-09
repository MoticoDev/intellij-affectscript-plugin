package me.sangs.effects.script.reference;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry;
import org.jetbrains.annotations.NotNull;

/**
 * Created by dsa28s on 2017. 4. 30..
 */
public abstract class AffectScriptNamedElementImpl extends ASTWrapperPsiElement implements AffectScriptNamedElement {

    public AffectScriptNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public PsiReference getReference() {
        PsiReference[] mReferences = getReferences();
        return mReferences.length == 0 ? null : mReferences[0];
    }

    @NotNull
    @Override
    public PsiReference[] getReferences() {
        return ReferenceProvidersRegistry.getReferencesFromProviders(this);
    }
}
