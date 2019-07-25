package patches.projects

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Project
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a project with id = 'SubProject2'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, Project({
    id("SubProject2")
    name = "SubProject2"
}))

