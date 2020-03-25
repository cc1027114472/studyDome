package com.ushine

import org.gradle.api.Plugin
import org.gradle.api.Project


class MyCustomPlugin implements Plugin<Project> {


    @Override
    void apply(Project project) {
            project.task('myTask'){
                println 'my plugin is myTask'
            }
    }


}
