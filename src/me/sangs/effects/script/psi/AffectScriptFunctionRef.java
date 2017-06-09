package me.sangs.effects.script.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

/**
 * Created by dsa28s on 2017. 4. 28..
 */
public class AffectScriptFunctionRef extends AffectScriptElementRef {

    public AffectScriptFunctionRef(@NotNull AffectScriptIdentifierPSINode element) {
        super(element);
    }

    @Override
    public boolean isDefSubtree(PsiElement def) {
        return def instanceof AffectScriptFunctionSubtree;
    }
}
