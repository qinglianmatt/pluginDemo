package com.git.fist

public class PluginExtension {

    String lintXmlPath
    String outputPath

    public PluginExtension() {
        // 默认路径
        lintXmlPath = "$project.buildDir/reports/lint-results.xml"
        outputPath = "$project.buildDir/reports/lintCleanerLog.txt"
    }

    @Override
    String toString() {
        return "配置项:\n\tlintXmlPath:" + lintXmlPath + "\n" +
                "outputPath:" + outputPath + "\n"
    }
}

