package me.sangs.effects.script.psi;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.util.IncorrectOperationException;
import org.antlr.jetbrains.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by dsa28s on 2017. 4. 28..
 */
public abstract class AffectScriptElementRef extends PsiReferenceBase<AffectScriptIdentifierPSINode> {

    public AffectScriptElementRef(@NotNull AffectScriptIdentifierPSINode element) {
        super(element, new TextRange(0, element.getText().length()));
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ScopeNode mScope = (ScopeNode)myElement.getContext();
        if(mScope == null) {
            return null;
        }

        return mScope.resolve(myElement);
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }

    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        return myElement.setName(newElementName);
    }

    public abstract boolean isDefSubtree(PsiElement def);
}
