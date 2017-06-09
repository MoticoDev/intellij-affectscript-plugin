package me.sangs.effects.script.icon;

import com.intellij.ide.IconProvider;
import com.intellij.openapi.util.IconLoader;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by dsa28s on 2017. 4. 26..
 */
public class AffectScriptIconProvider extends IconProvider {

    private static final String ICON_URL = "/me/sangs/effects/script/icon/es_16x16.png";
    private static final String COMP_URL = "/me/sangs/effects/script/icon/composition_16x16.png";
    private static final String SHAPE_URL = "/me/sangs/effects/script/icon/shape_16x16.png";
    private static final String TEXT_URL = "/me/sangs/effects/script/icon/text_16x16.png";
    private static final String FILE_URL = "/me/sangs/effects/script/icon/file_16x16.png";
    private static final String CLASS_URL = "/me/sangs/effects/script/icon/class_16x16.png";
    private static final String ANNO_URL = "/me/sangs/effects/script/icon/anno_16x16.png";
    private static final String METHOD_URL = "/me/sangs/effects/script/icon/method_16x16.png";

    private static final String COMP_URL_LIGHT = "/me/sangs/effects/script/icon/light/composition_16x16.png";
    private static final String SHAPE_URL_LIGHT = "/me/sangs/effects/script/icon/light/shape_16x16.png";
    private static final String TEXT_URL_LIGHT = "/me/sangs/effects/script/icon/light/text_16x16.png";
    private static final String FILE_URL_LIGHT = "/me/sangs/effects/script/icon/light/file_16x16.png";
    private static final String CLASS_URL_LIGHT = "/me/sangs/effects/script/icon/light/class_16x16.png";
    private static final String ANNO_URL_LIGHT = "/me/sangs/effects/script/icon/light/method_16x16.png";
    private static final String METHOD_URL_LIGHT = "/me/sangs/effects/script/icon/light/method_16x16.png";

    public static final Icon FILE = IconLoader.getIcon(ICON_URL);
    public static final Icon COMP_FILE = IconLoader.getIcon(COMP_URL);
    public static final Icon SHAPE_FILE = IconLoader.getIcon(SHAPE_URL);
    public static final Icon TEXT_FILE = IconLoader.getIcon(TEXT_URL);
    public static final Icon FILE_FILE = IconLoader.getIcon(FILE_URL);
    public static final Icon CLASS_FILE = IconLoader.getIcon(CLASS_URL);
    public static final Icon ANNO_FILE = IconLoader.getIcon(ANNO_URL);
    public static final Icon METHOD_FILE = IconLoader.getIcon(METHOD_URL);

    public static final Icon COMP_FILE_LIGHT = IconLoader.getIcon(COMP_URL_LIGHT);
    public static final Icon SHAPE_FILE_LIGHT = IconLoader.getIcon(SHAPE_URL_LIGHT);
    public static final Icon TEXT_FILE_LIGHT = IconLoader.getIcon(TEXT_URL_LIGHT);
    public static final Icon FILE_FILE_LIGHT = IconLoader.getIcon(FILE_URL_LIGHT);
    public static final Icon CLASS_FILE_LIGHT = IconLoader.getIcon(CLASS_URL_LIGHT);
    public static final Icon METHOD_FILE_LIGHT = IconLoader.getIcon(METHOD_URL_LIGHT);
    public static final Icon ANNO_FILE_LIGHT = IconLoader.getIcon(ANNO_URL_LIGHT);

    @Nullable
    @Override
    public Icon getIcon(@NotNull PsiElement element, int flags) {
        PsiFile mContainingFile = element.getContainingFile();
        if(mContainingFile != null && mContainingFile.getName().endsWith(".affects")) {
            return IconLoader.getIcon(ICON_URL);
        }

        return null;
    }
}
