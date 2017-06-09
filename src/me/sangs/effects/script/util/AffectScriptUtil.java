package me.sangs.effects.script.util;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.editor.colors.EditorColorsManager;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import hidden.edu.emory.mathcs.backport.java.util.Collections;
import me.sangs.effects.script.AffectScriptFile;
import me.sangs.effects.script.AffectScriptFileType;
import me.sangs.effects.script.psi.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Created by dsa28s on 2017. 4. 29..
 */
public class AffectScriptUtil {

    public static boolean isIDEDarculaTheme() {
        EditorColorsScheme mScheme = EditorColorsManager.getInstance().getSchemeForCurrentUITheme();
        return mScheme.getName().toLowerCase().contains("darcula");
    }

    public static List<AffectScriptVariableSubtree> findComposition(Project project, String compName) {
        List<AffectScriptVariableSubtree> result = null;
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, AffectScriptFileType.INSTANCE, GlobalSearchScope.allScope(project));

        for (VirtualFile virtualFile : virtualFiles) {
            AffectScriptFile affectScriptFile = (AffectScriptFile) PsiManager.getInstance(project).findFile(virtualFile);
            //JOptionPane.showMessageDialog(null, affectScriptFile.getVirtualFile().getName(), "Affect Script Debugger", JOptionPane.INFORMATION_MESSAGE);
            if (affectScriptFile != null) {
                AffectScriptVariableSubtree[] mVariables = PsiTreeUtil.getChildrenOfType(affectScriptFile, AffectScriptVariableSubtree.class);
                if (mVariables != null) {
                    for (AffectScriptVariableSubtree var : mVariables) {
                        if (compName.equals(var.getNode().findLeafElementAt(0).getText())) {
                            if (result == null) {
                                result = new ArrayList<>();
                            }
                            result.add(var);
                        }
                    }
                }
            }
        }

        return result != null ? result : Collections.emptyList();
    }

    public static List<AffectScriptCreateExpression> findCompositions(Project project) {
        List<AffectScriptCreateExpression> mResult = new ArrayList<>();

        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, AffectScriptFileType.INSTANCE, GlobalSearchScope.allScope(project));

        //Notifications.Bus.notify(new Notification("AFFECTSCRIPT_DEBUG", "Affect Script Debugger", "OKOK", NotificationType.INFORMATION));

        for (VirtualFile virtualFile : virtualFiles) {
            AffectScriptPSIFileRoot affectScriptFile = (AffectScriptPSIFileRoot) PsiManager.getInstance(project).findFile(virtualFile);
            //Notifications.Bus.notify(new Notification("AFFECTSCRIPT_DEBUG", "Affect Script Debugger", affectScriptFile.getName(), NotificationType.INFORMATION));
            if (affectScriptFile != null) {
                AffectScript[] mVariable = PsiTreeUtil.getChildrenOfType(affectScriptFile, AffectScript.class);

                if(mVariable != null) {
                    for (AffectScript aMVariable : mVariable) {
                        for (int i = 0; i < aMVariable.getChildren().length; i++) {
                            PsiElement mElement = mVariable[0].getChildren()[i];
                            if (mElement instanceof AffectScriptCreateExpression) {
                                mResult.add((AffectScriptCreateExpression) mElement);
                                //Notifications.Bus.notify(new Notification("AFFECTSCRIPT_DEBUG", "Affect Script Debugger", mElement.getText(), NotificationType.INFORMATION));
                                //Notifications.Bus.notify(new Notification("AFFECTSCRIPT_DEBUG", "Affect Script Debugger", mElement.getText(), NotificationType.INFORMATION));
                            }
                        }
                    }
                }
            }
        }

        return mResult;
    }
}
