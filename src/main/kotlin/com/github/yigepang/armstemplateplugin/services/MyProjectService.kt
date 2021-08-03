package com.github.yigepang.armstemplateplugin.services

import com.github.yigepang.armstemplateplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
