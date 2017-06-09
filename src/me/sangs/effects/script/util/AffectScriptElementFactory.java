package me.sangs.effects.script.util;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import me.sangs.effects.script.AffectScriptFile;
import me.sangs.effects.script.AffectScriptFileType;
import me.sangs.effects.script.psi.AffectScriptVariableSubtree;

/**
 * Created by dsa28s on 2017. 4. 29..
 */
public class AffectScriptElementFactory {

    public static AffectScriptVariableSubtree createComposition(Project project, String name) {
        final AffectScriptFile mFile = createFile(project, "@Comp(duration=300, fps=29.97, width=1920, height=1080)\n" + name + " = create composition");
        return (AffectScriptVariableSubtree)mFile.getFirstChild();
    }

    public static PsiElement createCRLF(Project project) {
        final AffectScriptFile mFile = createFile(project, "\n");
        return mFile.getFirstChild();
    }

    public static AffectScriptFile createFile(Project project, String text) {
        String name = "newScript.affects";
        return (AffectScriptFile) PsiFileFactory.getInstance(project).createFileFromText(name, AffectScriptFileType.INSTANCE, text);
    }
}
