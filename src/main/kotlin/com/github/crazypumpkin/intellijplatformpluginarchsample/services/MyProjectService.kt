package com.github.crazypumpkin.intellijplatformpluginarchsample.services

import com.intellij.openapi.project.Project
import com.github.crazypumpkin.intellijplatformpluginarchsample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
