package me.sangs.effects.script.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import org.antlr.jetbrains.adaptor.psi.IdentifierDefSubtree;
import org.jetbrains.annotations.NotNull;

/**
 * Created by dsa28s on 2017. 4. 28..
 */
public class AffectScriptVariableSubtree extends IdentifierDefSubtree {
    public AffectScriptVariableSubtree(@NotNull ASTNode node, @NotNull IElementType idElementType) {
        super(node, idElementType);
    }
}
