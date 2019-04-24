
在家练习
家里常用的tomcat所在路径： D:\Program Files\apache-tomcat-7.0.57

公司相关环境
	tomcat： C:\Program Files\apache-tomcat-7.0.59
	

# 快速调试本项目

本工程是个web工程，所以配置运行起来特别简单
1：prepare one tomcat
在tomcat 的安装路径 ${tomcat安装路径}\conf\Catalina\localhost 下增加一个本项目的配置文件
file name:<项目名>.xml
content of file:
<Context path="quickStart" reloadable="true" docBase="D:\intellij_project\quickStart\web" workDir="D:\intellij_project\quickStart\web" />

# 首次调试代码时确认事项
1：确保 web-info/classes 目录下有本项目java代码生成的class。如果用IDE导入此项目，确保配置class输出路径为 web-info/classes


# 相关零碎信息说明


angularJs 相关文件
	1：你可以下载angularjs相关的 sdk 文件到本地，也可以直接引用网络上的(可以修改version)
		http://apps.bdimg.com/libs/angular.js/1.4.6/angular.min.js


.gitignore
    配置要忽略的文件及文件夹。比如
    web/org 下的文件是一些jsp编译后的文件，不需要上传到 repository中去
