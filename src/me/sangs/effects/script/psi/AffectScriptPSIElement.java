package me.sangs.effects.script.psi;

import com.intellij.lang.ASTNode;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode;
import org.jetbrains.annotations.NotNull;

/**
 * Created by dsa28s on 2017. 4. 28..
 */
public class AffectScriptPSIElement extends ANTLRPsiNode {
    public AffectScriptPSIElement(@NotNull ASTNode node) {
        super(node);
    }
}
