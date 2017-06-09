package me.sangs.effects.script.marker;

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.editor.colors.EditorColorsManager;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.psi.PsiElement;
import com.intellij.ui.SearchTextField;
import me.sangs.effects.script.icon.AffectScriptIconProvider;
import me.sangs.effects.script.psi.AffectScriptCreateExpression;
import me.sangs.effects.script.psi.AffectScriptImportFile;
import me.sangs.effects.script.psi.AffectScriptVariableSubtree;
import me.sangs.effects.script.util.AffectScriptErrorManager;
import me.sangs.effects.script.util.AffectScriptUtil;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Collection;
import java.util.List;

/**
 * Created by dsa28s on 2017. 4. 29..
 */
public class AffectScriptLineMarkerProvider extends RelatedItemLineMarkerProvider {

    @Override
    protected void collectNavigationMarkers(@NotNull PsiElement element, Collection<? super RelatedItemLineMarkerInfo> result) {
        try {
            boolean isDarculaTheme = AffectScriptUtil.isIDEDarculaTheme();

            if(element instanceof AffectScriptCreateExpression) {
                //String oneLineText = element.toString();
                if(element.getText().contains("create composition")) {
                    NavigationGutterIconBuilder<PsiElement> mBuilder = NavigationGutterIconBuilder.create(isDarculaTheme ? AffectScriptIconProvider.COMP_FILE : AffectScriptIconProvider.COMP_FILE_LIGHT).setTarget(element).setTooltipText("This variable is After Effects Composition.\n이 변수는 After Effects 컴포지션 입니다.");
                    result.add(mBuilder.createLineMarkerInfo(element));
                } else if(element.getText().contains("create rectangle")) {
                    NavigationGutterIconBuilder<PsiElement> mBuilder = NavigationGutterIconBuilder.create(isDarculaTheme ? AffectScriptIconProvider.SHAPE_FILE : AffectScriptIconProvider.SHAPE_FILE_LIGHT).setTarget(element).setTooltipText("This variable is After Effects Shape Layer.\n이 변수는 After Effects 도형 레이어 입니다.");
                    result.add(mBuilder.createLineMarkerInfo(element));
                } else if(element.getText().contains("create text")) {
                    NavigationGutterIconBuilder<PsiElement> mBuilder = NavigationGutterIconBuilder.create(isDarculaTheme ? AffectScriptIconProvider.TEXT_FILE : AffectScriptIconProvider.TEXT_FILE_LIGHT).setTarget(element).setTooltipText("This variable is After Effects Text Layer.\n이 변수는 After Effects 텍스트 레이어 입니다.");
                    result.add(mBuilder.createLineMarkerInfo(element));
                }
            } else if(element instanceof AffectScriptImportFile) {
                NavigationGutterIconBuilder<PsiElement> mBuilder = NavigationGutterIconBuilder.create(isDarculaTheme ? AffectScriptIconProvider.FILE_FILE : AffectScriptIconProvider.FILE_FILE_LIGHT).setTarget(element).setTooltipText("Specifies the file loaded into this variable.\n이 변수에 불러온 파일을 지정합니다.");
                result.add(mBuilder.createLineMarkerInfo(element));
            }
        } catch(Exception e) {
            Notifications.Bus.notify(new Notification("AFFECTSCRIPT_DEBUG", "Affect Script Debugger", AffectScriptErrorManager.getErrorMessage(e), NotificationType.INFORMATION));
        }
    }
}
