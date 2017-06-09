package me.sangs.effects.script;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.FileViewProvider;
import org.apache.commons.io.FilenameUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 *  Affect Script for Adobe After Effects
 *  Project. AffectScript (Language)
 *  Author - MR.LEE(leeshoon1344@gmail.com)
 *  Description - AffectScript Base File
 */

public class AffectScriptFile extends PsiFileBase {
    protected AffectScriptFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, AffectScriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return AffectScriptFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Affect Script File";
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }

    public static class FileDetector {
        public boolean isAffectScriptCompatible(VirtualFile file) {
            return FilenameUtils.isExtension(file.getName(), "affects");
        }
    }
}
