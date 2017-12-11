// This is a generated file. Not intended for manual editing.
package com.tang.intellij.lua.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.tang.intellij.lua.stubs.LuaPlaceholderStub;
import com.tang.intellij.lua.search.SearchContext;
import com.tang.intellij.lua.ty.ITy;

public interface LuaClosureExpr extends LuaExpr, LuaFuncBodyOwner, StubBasedPsiElement<LuaPlaceholderStub> {

  @NotNull
  LuaFuncBody getFuncBody();

  @NotNull
  List<LuaParamNameDef> getParamNameDefList();

  @NotNull
  ITy guessReturnType(SearchContext searchContext);

  @NotNull
  LuaParamInfo[] getParams();

}
