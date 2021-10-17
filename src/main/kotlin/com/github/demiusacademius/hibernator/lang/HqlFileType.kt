package com.github.demiusacademius.hibernator.lang

import com.github.demiusacademius.hibernator.icons.HqlIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon

object HqlFileType: LanguageFileType(HiQueryLanguage) {
    override fun getName(): String = "Hql"

    override fun getIcon(): Icon = HqlIcons.HQL_FILE

    override fun getDefaultExtension(): String = "hql"

    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"

    override fun getDescription(): String = "Hql files"
}