package ru.clevertec.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class StrukovPlugin implements Plugin<Project> {
    void generatingReport(Project project){
        project.apply(plugin: 'jacoco')
        project.tasks.getByName('test').finalizedBy project.tasks.getByName('jacocoTestReport')
        project.tasks.getByName('jacocoTestReport').dependsOn project.tasks.getByName('test')
    }

    @Override
    void apply(Project project) {
        project.task('startReports') {
            group = 'strukov'
            description = 'Generating reports'
            doLast {
                println 'This task in my first plugin'
            }
        }
        generatingReport(project)
    }
}
