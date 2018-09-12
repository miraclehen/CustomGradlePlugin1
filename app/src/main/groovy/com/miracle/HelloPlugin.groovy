package com.miracle

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin implements Plugin<Project>
{
    @Override
    void apply(Project project) {

        project.extensions.add("personExt", PersonExt)

        project.task('helloPluginTask') {
            group 'miracle'
            doLast {
                PersonExt ext = project.personExt

                println ext
            }
        }
    }
}