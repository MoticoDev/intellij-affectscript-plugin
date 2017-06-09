package me.sangs.effects.script;

import com.intellij.openapi.fileTypes.LanguageFileType;
import me.sangs.effects.script.icon.AffectScriptIconProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 *  Affect Script for Adobe After Effects
 *  Project. AffectScript (Language)
 *  Author - MR.LEE(leeshoon1344@gmail.com)
 *  Description - AffectScript File Information
 */
public class AffectScriptFileType extends LanguageFileType {

    public static final AffectScriptFileType INSTANCE = new AffectScriptFileType();

    public AffectScriptFileType() {
        super(AffectScriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Affect Script";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Affect script for coding(MAKE VIDEO!!!).";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "affects";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AffectScriptIconProvider.FILE;
    }
}
