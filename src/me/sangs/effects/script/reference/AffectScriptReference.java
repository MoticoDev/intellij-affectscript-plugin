package me.sangs.effects.script.reference;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import me.sangs.effects.script.icon.AffectScriptIconProvider;
import me.sangs.effects.script.psi.AffectScriptCreateExpression;
import me.sangs.effects.script.util.AffectScriptUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsa28s on 2017. 4. 30..
 */
public class AffectScriptReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {

    //private String key;

    public AffectScriptReference(PsiElement element) {
        super(element);
        //key = element.getText().substring(rangeInElement.getStartOffset(), rangeInElement.getEndOffset());
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        Project mProject = myElement.getProject();

        final List<AffectScriptCreateExpression> mCompVariables = AffectScriptUtil.findCompositions(mProject);

        List<ResolveResult> mResults = new ArrayList<>();
        for(AffectScriptCreateExpression mComp : mCompVariables) {
            mResults.add(new PsiElementResolveResult(mComp.getFirstChild()));
        }

        return mResults.toArray(new ResolveResult[mResults.size()]);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] mResults = multiResolve(false);
        return mResults.length == 1 ? mResults[0].getElement() : null;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        Project mProject = myElement.getProject();

        List<AffectScriptCreateExpression> mCompExprs = AffectScriptUtil.findCompositions(mProject);

        List<LookupElement> mVariants = new ArrayList<>();

        for(final AffectScriptCreateExpression mComps : mCompExprs) {
            mVariants.add(LookupElementBuilder.create(mComps.getFirstChild()).withIcon(AffectScriptIconProvider.COMP_FILE).withTypeText("Composition"));
            //Notifications.Bus.notify(new Notification("AFFECTSCRIPT_DEBUG", "Affect Script Debugger", mComps.getText(), NotificationType.INFORMATION));
        }

        return mVariants.toArray();
    }
}
