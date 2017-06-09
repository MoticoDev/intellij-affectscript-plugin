package me.sangs.effects.script;

import com.intellij.lang.Language;

/**
 *  Affect Script for Adobe After Effects
 *  Project. AffectScript (Language)
 *  Author - MR.LEE(leeshoon1344@gmail.com)
 *  Description - AffectScript Instance
 */

public class AffectScriptLanguage extends Language {
    public static final AffectScriptLanguage INSTANCE = new AffectScriptLanguage();

    private AffectScriptLanguage() {
        super("AffectScript");
    }
}
