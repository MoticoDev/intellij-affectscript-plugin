package me.sangs.effects.script.structure;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.psi.PsiFile;
import me.sangs.effects.script.AffectScriptFile;
import org.jetbrains.annotations.NotNull;

/**
 *  Affect Script for Adobe After Effects
 *  Project. AffectScript (Language)
 *  Author - MR.LEE(leeshoon1344@gmail.com)
 *  Description - Structure view model for Affect Script
 */
public class AffectScriptStructureViewModel extends StructureViewModelBase implements StructureViewModel.ElementInfoProvider {

    public AffectScriptStructureViewModel(PsiFile psiFile) {
        super(psiFile, new AffectScriptStructureViewElement(psiFile));
    }

    @NotNull
    @Override
    public Sorter[] getSorters() {
        return new Sorter[] {Sorter.ALPHA_SORTER};
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return element instanceof AffectScriptFile;
    }
}
