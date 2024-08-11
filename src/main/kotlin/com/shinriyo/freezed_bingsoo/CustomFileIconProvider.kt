package com.shinriyo.freezed_bingsoo

import com.intellij.ide.FileIconProvider
import com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon
import com.intellij.openapi.util.IconLoader
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Iconable

class CustomFileIconProvider : FileIconProvider {
    private val customIconG: Icon = IconLoader.getIcon("/icons/custom_icon_g.png", javaClass)
    private val customIconFreezed: Icon = IconLoader.getIcon("/icons/custom_icon_freezed.png", javaClass)

    override fun getIcon(file: VirtualFile, @Iconable.IconFlags flags: Int, project: Project?): Icon? {
        return when {
            file.name.endsWith(".g.dart") -> customIconG
            file.name.endsWith(".freezed.dart") -> customIconFreezed
            else -> null
        }
    }
}
