package com.shinriyo.freezed_bingsoo

import com.intellij.ide.FileIconProvider
import com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon
import com.intellij.openapi.util.IconLoader
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Iconable

class CustomFileIconProvider : FileIconProvider {
    private val customIcon: Icon = IconLoader.getIcon("/icons/custom_icon.png", javaClass)

    override fun getIcon(file: VirtualFile, @Iconable.IconFlags flags: Int, project: Project?): Icon? {
        return if (file.name.endsWith(".g.dart") || file.name.endsWith(".freezed.dart")) {
            customIcon
        } else {
            null
        }
    }
}
