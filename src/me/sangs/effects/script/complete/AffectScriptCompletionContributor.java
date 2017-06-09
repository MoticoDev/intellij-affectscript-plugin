package me.sangs.effects.script.complete;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.notification.*;
import com.intellij.openapi.editor.VisualPosition;
import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.util.PsiUtil;
import com.intellij.util.ProcessingContext;
import me.sangs.effects.script.AffectScriptLanguage;
import me.sangs.effects.script.icon.AffectScriptIconProvider;
import me.sangs.effects.script.util.AffectScriptErrorManager;
import me.sangs.effects.script.util.AffectScriptUtil;
import org.apache.commons.lang.RandomStringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

/**
 * Created by dsa28s on 2017. 4. 29..
 */
public class AffectScriptCompletionContributor extends CompletionContributor {

    public AffectScriptCompletionContributor() {
        boolean isDarculaTheme = AffectScriptUtil.isIDEDarculaTheme();

        extend(CompletionType.BASIC, PlatformPatterns.psiElement().withLanguage(AffectScriptLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters parameters, ProcessingContext context, @NotNull CompletionResultSet result) {
                        try {
                            int lineCount = parameters.getEditor().getDocument().getLineCount();

                            VisualPosition mCurrentPosition = parameters.getEditor().getCaretModel().getVisualPosition();
                            int currentLine = mCurrentPosition.getLine();

                            for(int i = 1; i < lineCount; i++) {
                                int startOffset = parameters.getEditor().getDocument().getLineStartOffset(i - 1);
                                int endOffset = parameters.getEditor().getDocument().getLineEndOffset(i - 1);

                                TextRange mRange = new TextRange(startOffset, endOffset);
                                String lineText = parameters.getEditor().getDocument().getText(mRange);

                                String lineTextNoSpace = lineText.replace(" ", "");

                                if(lineTextNoSpace.contains("=createcomposition")) {
                                    result.addElement(LookupElementBuilder.create(lineTextNoSpace.replace("=createcomposition", "")).withIcon(isDarculaTheme ? AffectScriptIconProvider.COMP_FILE : AffectScriptIconProvider.COMP_FILE_LIGHT).withTypeText("Composition"));
                                } else if(lineTextNoSpace.contains("=createrectangle")) {
                                    result.addElement(LookupElementBuilder.create(lineTextNoSpace.replace("=createrectangle", "")).withIcon(isDarculaTheme ? AffectScriptIconProvider.SHAPE_FILE : AffectScriptIconProvider.SHAPE_FILE_LIGHT).withTypeText("ShapeLayer"));
                                } else if(lineTextNoSpace.contains("=createtext")) {
                                    result.addElement(LookupElementBuilder.create(lineTextNoSpace.replace("=createtext", "")).withIcon(isDarculaTheme ? AffectScriptIconProvider.TEXT_FILE : AffectScriptIconProvider.TEXT_FILE_LIGHT).withTypeText("TextLayer"));
                                } else if(lineTextNoSpace.contains("=new")) {
                                    String[] mSplitData = lineTextNoSpace.split("=new");
                                    result.addElement(LookupElementBuilder.create(mSplitData[0]).withIcon(isDarculaTheme ? AffectScriptIconProvider.CLASS_FILE : AffectScriptIconProvider.CLASS_FILE_LIGHT).withTypeText(mSplitData[1]));
                                } else if(lineTextNoSpace.contains("=importfile")) {
                                    result.addElement(LookupElementBuilder.create(lineTextNoSpace.replace("=importfile", "")).withIcon(isDarculaTheme ? AffectScriptIconProvider.FILE_FILE : AffectScriptIconProvider.FILE_FILE_LIGHT).withTypeText("File"));
                                }
                            }

                            String currentLineString = parameters.getEditor().getDocument().getText(new TextRange(parameters.getEditor().getDocument().getLineStartOffset(currentLine - 1), parameters.getEditor().getDocument().getLineEndOffset(currentLine - 1)));

                            if(currentLineString.replace(" ", "").endsWith("use")) {
                                result.addElement(LookupElementBuilder.create("script"));
                            } else if(currentLineString.replace(" ", "").endsWith("script")) {

                            } else if(currentLineString.replace(" ", "").endsWith("create")) {
                                result.addElement(LookupElementBuilder.create("composition"));
                                result.addElement(LookupElementBuilder.create("rectangle"));
                                result.addElement(LookupElementBuilder.create("folder"));
                                result.addElement(LookupElementBuilder.create("text"));
                                result.addElement(LookupElementBuilder.create("solid"));
                            } else {
                                result.addElement(LookupElementBuilder.create("@Comp(duration=300, fps=29.97, width=1920, height=1080, name=\"CompositionName\")\ncomp" + RandomStringUtils.randomNumeric(2) + " = create composition").withIcon(isDarculaTheme ? AffectScriptIconProvider.ANNO_FILE : AffectScriptIconProvider.ANNO_FILE_LIGHT).withTypeText("").withPresentableText("Create Composition"));
                                result.addElement(LookupElementBuilder.create("@Solid(name=\"AudioSpectrum\", color=[236, 0, 136], width=1920, height=1080, duration=300)\nsolid" + RandomStringUtils.randomNumeric(2) + " = create solid").withIcon(isDarculaTheme ? AffectScriptIconProvider.ANNO_FILE : AffectScriptIconProvider.ANNO_FILE_LIGHT).withTypeText("").withPresentableText("Create Solid"));
                                result.addElement(LookupElementBuilder.create("@Folder(\"Folder Name\"\nfolder" + RandomStringUtils.randomNumeric(2) + " = create folder").withIcon(isDarculaTheme ? AffectScriptIconProvider.ANNO_FILE : AffectScriptIconProvider.ANNO_FILE_LIGHT).withTypeText("").withPresentableText("Create Folder"));
                                result.addElement(LookupElementBuilder.create("@Text(\"Input Text Here\")\ntext" + RandomStringUtils.randomNumeric(2) + " = create text").withIcon(isDarculaTheme ? AffectScriptIconProvider.ANNO_FILE : AffectScriptIconProvider.ANNO_FILE_LIGHT).withTypeText("").withPresentableText("Create Text"));
                                result.addElement(LookupElementBuilder.create("shape" + RandomStringUtils.randomNumeric(2) + " = create rectangle").withIcon(isDarculaTheme ? AffectScriptIconProvider.ANNO_FILE : AffectScriptIconProvider.ANNO_FILE_LIGHT).withTypeText("").withPresentableText("Create ShapeLayer (Rectangle)"));
                                result.addElement(LookupElementBuilder.create("create"));

                                result.addElement(LookupElementBuilder.create("new"));
                                result.addElement(LookupElementBuilder.create("add"));
                                result.addElement(LookupElementBuilder.create("to"));
                                result.addElement(LookupElementBuilder.create("set"));
                                result.addElement(LookupElementBuilder.create("import"));
                                result.addElement(LookupElementBuilder.create("apply"));
                                result.addElement(LookupElementBuilder.create("effect"));
                                result.addElement(LookupElementBuilder.create("parameters"));
                                result.addElement(LookupElementBuilder.create("file"));

                                result.addElement(LookupElementBuilder.create("rgb[0, 0, 0]").withIcon(isDarculaTheme ? AffectScriptIconProvider.METHOD_FILE : AffectScriptIconProvider.METHOD_FILE_LIGHT).withTypeText("StaticParameter").withPresentableText("rgb[R, G, B]"));
                                result.addElement(LookupElementBuilder.create("setValues").withIcon(isDarculaTheme ? AffectScriptIconProvider.METHOD_FILE : AffectScriptIconProvider.METHOD_FILE_LIGHT).withTypeText("Method").withPresentableText("setValues ->"));
                                result.addElement(LookupElementBuilder.create("open"));
                                result.addElement(LookupElementBuilder.create("show messagebox \"Change message here\"").withIcon(isDarculaTheme ? AffectScriptIconProvider.METHOD_FILE : AffectScriptIconProvider.METHOD_FILE_LIGHT).withTypeText("").withPresentableText("Show Messagebox"));
                                result.addElement(LookupElementBuilder.create("show messagebox \"Change message here\" select {\n\tyes: {\t},\n\tno: {\n\n\t}\n}").withIcon(isDarculaTheme ? AffectScriptIconProvider.METHOD_FILE : AffectScriptIconProvider.METHOD_FILE_LIGHT).withTypeText("").withPresentableText("Show Messagebox (Yes or No)"));
                            }
                        } catch(Exception e) {
                            //Notifications.Bus.notify(new Notification("AFFECTSCRIPT_DEBUG", "Affect Script Debugger", AffectScriptErrorManager.getErrorMessage(e), NotificationType.INFORMATION));
                        }
                    }
                });
    }

}
