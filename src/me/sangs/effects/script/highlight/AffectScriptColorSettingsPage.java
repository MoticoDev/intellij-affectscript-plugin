package me.sangs.effects.script.highlight;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;

import me.sangs.effects.script.icon.AffectScriptIconProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

/**
 * Created by dsa28s on 2017. 4. 28..
 */
public class AffectScriptColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[] {
        new AttributesDescriptor("Keyword", AffectScriptSyntaxHighlighter.KEYWORD),
        new AttributesDescriptor("Function", AffectScriptSyntaxHighlighter.FUNCTION),
        new AttributesDescriptor("String", AffectScriptSyntaxHighlighter.STRING),
        new AttributesDescriptor("Line Comment", AffectScriptSyntaxHighlighter.LINE_COMMENT),
        new AttributesDescriptor("Block Comment", AffectScriptSyntaxHighlighter.BLOCK_COMMENT),
        new AttributesDescriptor("Numeric", AffectScriptSyntaxHighlighter.NUMERICAL),
        new AttributesDescriptor("Annotation", AffectScriptSyntaxHighlighter.ANNOTATION),
        new AttributesDescriptor("Class", AffectScriptSyntaxHighlighter.CLASS),
        new AttributesDescriptor("Identifier", AffectScriptSyntaxHighlighter.ID)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return AffectScriptIconProvider.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new AffectScriptSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "/* Effect Script for After Effects */\n" +
                "\n" +
                "use script CircleBurst\n" +
                "\n" +
                "@Comp(duration=100, fps=29.97)\n" +
                "comp1 = create composition\n" +
                "\n" +
                "myShape = create rectangle\n" +
                "\n" +
                "set size [1920,1080] to myShape\n" +
                "set fillColor rgb[21, 48, 1] to myShape\n" +
                "\n" +
                "add myShape to comp1\n" +
                "\n" +
                "@Text(\"잠시만 기다려주세요!!!!\")\n" +
                "loadingText = create text\n" +
                "set position [960, 532] to loadingText\n" +
                "\n" +
                "add loadingText to comp1\n" +
                "\n" +
                "setValues loadingText {\n" +
                "    justifcation: center,\n" +
                "    fontSize: 40,\n" +
                "    fontFamily: \"Kopub Dotum\"\n" +
                "}\n" +
                "\n" +
                "open comp1\n" +
                "\n" +
                "@Comp(duration=300, fps=29.97, width=1920, height=1080)\n" +
                "musicComp = create composition\n" +
                "\n" +
                "show messagebox \"확인 버튼을 누른 후 음악파일을 선택합니다!\"\n" +
                "\n" +
                "musicFile = import file\n" +
                "add musicFile to musicComp\n" +
                "\n" +
                "@Comp(duration=300, fps=29.97, width=1920, height=1080)\n" +
                "sourceComp = create composition\n" +
                "\n" +
                "show messagebox \"확인 버튼을 누른 후 소스(사용할 영상) 파일을 선택합니다\"\n" +
                "\n" +
                "show messagebox \"test\" select {\n" +
                "    yes: {\n" +
                "        test = create text\n" +
                "    },\n" +
                "    no: {\n" +
                "        test = create text\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "sourceFile = import file\n" +
                "set duration sourceFile.duration to sourceComp\n" +
                "\n" +
                "add sourceFile to sourceComp\n" +
                "\n" +
                "@Comp(duration=300, fps=29.97, width=1920, height=1080)\n" +
                "internalAudioSpectrumComp = create composition\n" +
                "\n" +
                "@Folder(\"손대지 마세요\")\n" +
                "folder2 = create folder\n" +
                "\n" +
                "move internalAudioSpectrumComp to folder2\n" +
                "add musicComp to internalAudioSpectrumComp\n" +
                "\n" +
                "@Solid(name=\"AudioSpectrum\", color=[236, 0, 136], width=1920, height=1080, duration=300)\n" +
                "spectrum = create solid\n" +
                "\n" +
                "apply effect \"Audio Spectrum\" to spectrum\n" +
                "set parameters \"Audio Spectrum\" to spectrum {\n" +
                "    \"AudioLayer\" : 2,\n" +
                "    \"Start Frequency\" : 100,\n" +
                "    \"End Frequency\" : 400,\n" +
                "    \"Frequency bands\" : 40,\n" +
                "    \"Maximum Height\" : 4000\n" +
                "}\n" +
                "\n" +
                "apply effect \"Minimax\" to spectrum\n" +
                "set parameters \"Minimax\" to spectrum {\n" +
                "    \"radius\" : 5\n" +
                "}";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Affect Script";
    }
}
