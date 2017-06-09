package me.sangs.effects.script.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import me.sangs.effects.script.AffectScriptFileType;
import me.sangs.effects.script.AffectScriptLanguage;
import me.sangs.effects.script.icon.AffectScriptIconProvider;
import org.antlr.jetbrains.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by dsa28s on 2017. 4. 28..
 */
public class AffectScriptPSIFileRoot extends PsiFileBase implements ScopeNode {

    public AffectScriptPSIFileRoot(@NotNull FileViewProvider viewProvider, @NotNull Language language) {
        super(viewProvider, AffectScriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return AffectScriptFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Affect Script File for After Effects";
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return AffectScriptIconProvider.FILE;
    }

    @Override
    public ScopeNode getContext() {
        return null;
    }

    @Nullable
    @Override
    public PsiElement resolve(PsiNamedElement element) {
        return null;
    }
}
