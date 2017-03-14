1) your compilation & implementation platform with the version
编译环境:JDK1.8
编译IDE:eclipse Luna

代码下载：https://github.com/ArchitectsNJU/TeamProject
项目具体文件位置：项目根目录下3-implements中3个RMI项目

how to install and configure the platform
安装eclipse, JDK, maven即可

2) how to compile your code
使用eclipse导入项目,在JDK1.8环境下编译即可

3) how to execute your system
配置3个项目中Main类中的ip地址，依次启动RMIServer，RMIBroker，RMIClient

简要说明:RMIClient模拟多并发大请求量情况，RMIBroker负责和RMIClient交互获得请求并转发，RMIServer作为服务提供端