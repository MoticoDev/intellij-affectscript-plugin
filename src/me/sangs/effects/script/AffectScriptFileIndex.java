package me.sangs.effects.script;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.util.indexing.*;
import com.intellij.util.io.DataExternalizer;
import com.intellij.util.io.EnumeratorStringDescriptor;
import com.intellij.util.io.KeyDescriptor;
import org.apache.commons.io.FilenameUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * Created by dsa28s on 2017. 4. 30..
 */
public class AffectScriptFileIndex extends FileBasedIndexExtension<FileType, Void> {

    public static final ID<FileType, Void> AFFECT_SCRIPT_INDEX_ID = ID.create("AffectScriptFileIndex");
    private static final int VERSION = 11;

    private final AffectScriptFile.FileDetector mFileDetector = new AffectScriptFile.FileDetector();

    @NotNull
    @Override
    public FileBasedIndex.InputFilter getInputFilter() {
        return mFileDetector::isAffectScriptCompatible;
    }

    @Override
    public boolean dependsOnFileContent() {
        return true;
    }

    @NotNull
    @Override
    public ID<FileType, Void> getName() {
        return AFFECT_SCRIPT_INDEX_ID;
    }

    @NotNull
    @Override
    public DataIndexer<FileType, Void, FileContent> getIndexer() {
        return null;
    }

    @NotNull
    @Override
    public KeyDescriptor<FileType> getKeyDescriptor() {
        return null;
    }

    @NotNull
    @Override
    public DataExternalizer<Void> getValueExternalizer() {
        return null;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }
}
