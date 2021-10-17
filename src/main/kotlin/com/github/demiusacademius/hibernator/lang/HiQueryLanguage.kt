package com.github.demiusacademius.hibernator.lang

import com.intellij.lang.Language

// https://bitbucket.org/dancioca/dbn/src/master/src/com/dci/intellij/dbn/language/
// https://github.com/intellij-rust/intellij-rust/tree/master/src/main/resources/icons
// https://github.com/JetBrains/intellij-plugins/tree/master/Dart
// https://github.com/DemiusAcademius/DataScriptNative/tree/master/resources/icons

// https://plugins.jetbrains.com/docs/intellij/language-and-filetype.html#run-the-project
// https://plugins.jetbrains.com/docs/intellij/custom-language-support.html

// https://github.com/JetBrains/gradle-grammar-kit-plugin

object HiQueryLanguage : Language("Hi Query Language", "text/hql", "text/x-hql", "application/x-hql") {
    override fun isCaseSensitive() = true

    override fun getDisplayName() = "Hi Query Language"
}