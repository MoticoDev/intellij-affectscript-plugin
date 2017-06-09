package me.sangs.effects.script.reference;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import me.sangs.effects.script.AffectScriptLanguage;
import me.sangs.effects.script.psi.*;
import me.sangs.effects.script.util.AffectScriptErrorManager;
import org.jetbrains.annotations.NotNull;

/**
 * Created by dsa28s on 2017. 4. 30..
 */
public class AffectScriptReferenceContributor extends PsiReferenceContributor {

    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(PlatformPatterns.psiElement().withLanguage(AffectScriptLanguage.INSTANCE),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
                        Notifications.Bus.notify(new Notification("AFFECTSCRIPT_DEBUG", "Affect Script Debugger", "OK", NotificationType.INFORMATION));
                        return new PsiReference[]{ new AffectScriptReference(element) };
                    }
                });
    }
}
