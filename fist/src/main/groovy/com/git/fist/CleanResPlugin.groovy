package com.git.fist

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.internal.impldep.org.apache.maven.model.PluginExecution

class CleanResPlugin implements Plugin<Project> {

    static final String Group = "lintClear"
    static final String EXTENSION_NAME = "lintClear"

    @Override
    void apply(Project project) {
        project.extensions.create(EXTENSION_NAME, PluginExecution, project)

        Task clearTask = project.tasks.create(ClearTask.name, ClearTask)

        clearTask.dependsOn project.tasks.getByName('lint')
    }
}