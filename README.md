
在家练习
家里常用的tomcat所在路径： D:\Program Files\apache-tomcat-7.0.57

公司相关环境
	tomcat： C:\Program Files\apache-tomcat-7.0.59
	


本工程是个web工程，所以配置运行起来特别简单
1：tomcat
启动一个tomcat，只需要增加一个配置文件即可运行此项目
${tomcat安装路径}\conf\Catalina\localhost 下增加本项目的配置文件。
file name:<项目名>.xml
content of file:
<Context path="quickStart" reloadable="true" docBase="D:\intellij_project\quickStart\web" workDir="D:\intellij_project\quickStart\web" />
2：项目文件



angularJs 相关文件
	1：你可以下载angularjs相关的 sdk 文件到本地，也可以直接引用网络上的(可以修改version)
		http://apps.bdimg.com/libs/angular.js/1.4.6/angular.min.js


.gitignore
    配置要忽略的文件及文件夹。比如
    web/org 下的文件是一些jsp编译后的文件，不需要上传到 repository中
