package me.sangs.effects.script.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

/**
 * Created by dsa28s on 2017. 4. 28..
 */
public class AffectScriptVariableRef extends AffectScriptElementRef {

    public AffectScriptVariableRef(@NotNull AffectScriptIdentifierPSINode element) {
        super(element);
    }

    @Override
    public boolean isDefSubtree(PsiElement def) {
        return def instanceof AffectScriptVariableSubtree;
    }
}
