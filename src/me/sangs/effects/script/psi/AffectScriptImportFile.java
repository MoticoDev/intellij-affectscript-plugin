package me.sangs.effects.script.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * Created by dsa28s on 2017. 4. 28..
 */
public class AffectScriptImportFile extends AffectScriptVariableSubtree {
    public AffectScriptImportFile(@NotNull ASTNode node, @NotNull IElementType idElementType) {
        super(node, idElementType);
    }
}
