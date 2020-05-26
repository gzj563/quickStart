
#Support Gradle

Gradle 可以安装在很多操作系统上，但是需要JDK或者JRE8以上版本

* [安装JDK](##安装JDK)
* [安装Gradle](##安装gradle)
* [Init Gradle所需资源](##Init gradle所需资源)

##安装JDK
 并设置环境变量 JAVA_HOME，使其指向jdk的安装路径

##安装gradle
设置环境变量 GRADLE_HOME 和 PATH，使path包含 GRADLE_HOME/bin 就足够了。
验证安装是否成功：gradle -v

##Init gradle所需资源
执行命令：gradle init ; 

```
├── build.gradle  
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar  
│       └── gradle-wrapper.properties  
├── gradlew  
├── gradlew.bat  
└── settings.gradle  
```
* build.gradle 用于配置当前项目的Gradle构建脚本
* gradle-wrapper.jar Gradle Wrapper可执行JAR
* gradle-wrapper.properties Gradle Wrapper配置属性
* gradlew 基于Unix的系统的Gradle Wrapper脚本
* gradlew.bat 适用于Windows的Gradle Wrapper脚本
* settings.gradle 用于配置Gradle构建的Gradle设置脚本

##提交以下文件到代码库
gradlew、gradlew.bat和gradle目录
以后可以通过修改 gradle/wrapper/gradle-wrapper.properties 的内容来维护 ___当前项目使用的gradle___ 的版本。
当项目其他人拿到代码之后，由于gradlew和gradlew.bat文件均在源代码中，他们本地即便没有gradle，依然可以通过以下命令进行项目构建：
```
./gradlew build //unix系统下执行
or
gradlew build //windows 系统下执行
```