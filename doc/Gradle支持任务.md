
#Gradle 如何支持任务

gradle 任务有很多任务编写方式。
* 自定义任务


##自定义任务
Gradle 提供了api，用于通过基于groovy语法创建和配置任务。

编写一个自定义任务, 在build.gradle 文件中添加以下代码。
定义一个名为Copy的类型的副本（注意大写字母），该任务将src目录复制到名为dest的新目录。 （您不必创建dest目录 - 任务将为您完成。）
```
task copy(type: Copy, group: "Custom", description: "Copies sources to the dest directory") {
    from "src"
    into "dest"
}
```
通过命令： gradlew tasks 查看所有的任务，则会发现在 Custom 任务组多了一个 copy任务 如下：
```
Custom tasks
------------
copy - Copies sources to the dest directory
```
