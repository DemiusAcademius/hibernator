package com.github.demiusacademius.hibernator.icons

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object HqlIcons {
    val HQL_FILE = load("/icons/hql_file.png")

    private fun load(path: String): Icon = IconLoader.getIcon(path, HqlIcons::class.java)
}