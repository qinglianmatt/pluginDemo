package com.git.fist

import org.gradle.api.Plugin
import org.gradle.api.Project


class FirstPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        print('------first plugin------')
    }
}