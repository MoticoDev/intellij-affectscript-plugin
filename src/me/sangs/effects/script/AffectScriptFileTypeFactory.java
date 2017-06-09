package me.sangs.effects.script;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 *  Affect Script for Adobe After Effects
 *  Project. AffectScript (Language)
 *  Author - MR.LEE(leeshoon1344@gmail.com)
 *  Description - Registring filetypes(AffectScript) to IntelliJ
 */
public class AffectScriptFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(AffectScriptFileType.INSTANCE, "affects");
    }
}
