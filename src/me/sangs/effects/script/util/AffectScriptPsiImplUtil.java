package me.sangs.effects.script.util;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import me.sangs.effects.script.grammar.AffectScriptLexer;
import me.sangs.effects.script.grammar.AffectScriptParser;
import me.sangs.effects.script.icon.AffectScriptIconProvider;
import me.sangs.effects.script.psi.AffectScriptVariableSubtree;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by dsa28s on 2017. 4. 29..
 */
public class AffectScriptPsiImplUtil {

    public static String getVariable(AffectScriptVariableSubtree variable) {
        ASTNode mKeyNode = variable.getNode().findLeafElementAt(0);

        if(mKeyNode != null) {
            return mKeyNode.getText().replaceAll("\\\\", " ");
        } else {
            return null;
        }
    }

    public static String getValue(AffectScriptVariableSubtree variable) {
        ASTNode mValueNode = variable.getNode().findLeafElementAt(2);
        if(mValueNode != null) {
            return mValueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(AffectScriptVariableSubtree element) {
        return getVariable(element);
    }

    public static PsiElement getNameIdentifier(AffectScriptVariableSubtree element) {
        ASTNode mNode = element.getNode().findLeafElementAt(0);
        if(mNode != null) {
            return mNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final AffectScriptVariableSubtree element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getNode().findLeafElementAt(0).getText();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile mFile = element.getContainingFile();
                return mFile == null ? null : mFile.getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return AffectScriptIconProvider.FILE;
            }
        };
    }
}
