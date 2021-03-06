package org.eclipse.emf.codegen.ecore.templates.model;

import org.eclipse.emf.codegen.ecore.genmodel.*;

public class Plugin
{
  protected static String nl;
  public static synchronized Plugin create(String lineSeparator)
  {
    nl = lineSeparator;
    Plugin result = new Plugin();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " */" + NL + "package ";
  protected final String TEXT_5 = ";" + NL;
  protected final String TEXT_6 = NL + NL + "/**" + NL + " * This is the central singleton for the ";
  protected final String TEXT_7 = " model plugin." + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_8 = NL + " * ";
  protected final String TEXT_9 = NL + " * @generated" + NL + " */";
  protected final String TEXT_10 = NL + "@Deprecated";
  protected final String TEXT_11 = NL + "public final class ";
  protected final String TEXT_12 = " extends EMFPlugin" + NL + "{";
  protected final String TEXT_13 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_14 = " copyright = ";
  protected final String TEXT_15 = ";";
  protected final String TEXT_16 = NL;
  protected final String TEXT_17 = NL + "\t/**" + NL + "\t * Keep track of the singleton." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_18 = " INSTANCE = new ";
  protected final String TEXT_19 = "();" + NL;
  protected final String TEXT_20 = NL + "\t/**" + NL + "\t * Keep track of the singleton." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static Implementation plugin;" + NL;
  protected final String TEXT_21 = NL + "\t/**" + NL + "\t * Create the instance." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_22 = "()" + NL + "\t{" + NL + "\t\tsuper(new ResourceLocator [] {});" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns the singleton instance of the Eclipse plugin." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the singleton instance." + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_23 = NL + "\t@Override";
  protected final String TEXT_24 = NL + "\tpublic ResourceLocator getPluginResourceLocator()" + NL + "\t{";
  protected final String TEXT_25 = NL + "\t\treturn null;";
  protected final String TEXT_26 = NL + "\t\treturn plugin;";
  protected final String TEXT_27 = NL + "\t}" + NL;
  protected final String TEXT_28 = NL + "\t/**" + NL + "\t * Returns the singleton instance of the Eclipse plugin." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return the singleton instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static Implementation getPlugin()" + NL + "\t{" + NL + "\t\treturn plugin;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * The actual implementation of the Eclipse <b>Plugin</b>." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class Implementation extends EclipsePlugin" + NL + "\t{" + NL + "\t\t/**" + NL + "\t\t * Creates an instance." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->";
  protected final String TEXT_29 = NL + "\t\t * @param descriptor the description of the plugin.";
  protected final String TEXT_30 = NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic Implementation(";
  protected final String TEXT_31 = " descriptor";
  protected final String TEXT_32 = ")" + NL + "\t\t{" + NL + "\t\t\tsuper(";
  protected final String TEXT_33 = "descriptor";
  protected final String TEXT_34 = ");" + NL + "" + NL + "\t\t\t// Remember the static instance." + NL + "\t\t\t//" + NL + "\t\t\tplugin = this;" + NL + "\t\t}";
  protected final String TEXT_35 = NL + "\t" + NL + "\t\t/**" + NL + "\t\t * The actual implementation of the purely OSGi-compatible <b>Bundle Activator</b>." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic static final class Activator extends ";
  protected final String TEXT_36 = ".OSGiDelegatingBundleActivator" + NL + "\t\t{";
  protected final String TEXT_37 = NL + "\t\t\t@Override";
  protected final String TEXT_38 = NL + "\t\t\tprotected ";
  protected final String TEXT_39 = " createBundle()" + NL + "\t\t\t{" + NL + "\t\t\t\treturn new Implementation();" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_40 = NL + "\t}" + NL;
  protected final String TEXT_41 = NL + "}";
  protected final String TEXT_42 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */

    GenModel genModel = (GenModel)argument;
    final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    }}
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genModel.getModelPluginPackageName());
    stringBuffer.append(TEXT_5);
    genModel.addImport("org.eclipse.emf.common.EMFPlugin");
    genModel.addImport("org.eclipse.emf.common.util.ResourceLocator");
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_7);
    if (genModel.hasAPITags()) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genModel.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_9);
    if (isJDK50 && genModel.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genModel.getModelPluginClassName());
    stringBuffer.append(TEXT_12);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genModel.getModelPluginClassName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genModel.getModelPluginClassName());
    stringBuffer.append(TEXT_19);
    if (genModel.getRuntimePlatform() != GenRuntimePlatform.GWT) {
    stringBuffer.append(TEXT_20);
    }
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genModel.getModelPluginClassName());
    stringBuffer.append(TEXT_22);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_24);
    if (genModel.getRuntimePlatform() == GenRuntimePlatform.GWT) {
    stringBuffer.append(TEXT_25);
    } else {
    stringBuffer.append(TEXT_26);
    }
    stringBuffer.append(TEXT_27);
    if (genModel.getRuntimePlatform() != GenRuntimePlatform.GWT) {
    stringBuffer.append(TEXT_28);
    if (genModel.needsRuntimeCompatibility()) {
    stringBuffer.append(TEXT_29);
    }
    stringBuffer.append(TEXT_30);
    if (genModel.needsRuntimeCompatibility()) {
    stringBuffer.append(genModel.getImportedName("org.eclipse.core.runtime.IPluginDescriptor"));
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    if (genModel.needsRuntimeCompatibility()) {
    stringBuffer.append(TEXT_33);
    }
    stringBuffer.append(TEXT_34);
    if (genModel.isOSGiCompatible()) {
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.EMFPlugin"));
    stringBuffer.append(TEXT_36);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_37);
    }
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genModel.getImportedName("org.osgi.framework.BundleActivator"));
    stringBuffer.append(TEXT_39);
    }
    stringBuffer.append(TEXT_40);
    }
    stringBuffer.append(TEXT_41);
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_42);
    return stringBuffer.toString();
  }
}
