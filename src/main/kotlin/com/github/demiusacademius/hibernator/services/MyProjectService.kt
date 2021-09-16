package com.github.demiusacademius.hibernator.services

import com.intellij.openapi.project.Project
import com.github.demiusacademius.hibernator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
