
## 项目说明

### 1.项目目的

   集成了weex master的源码（java + C++），用于调试weex源码，git log: Commits on Sep 7, 2022。


### 2.项目依赖

#### 1）Android SDK

compileSdkVersion=28

minSdkVersion=14

targetSdkVersion=28

NDK：android-ndk-r18b

#### 2）gradle

6.7.1

#### 3）JDK

java8

### 3.项目结构

#### 1）APP

assets/dist放本地bundle包

WeexProxyActivity是测试activity


#### 2）sdk

sdk是Weex java部分源码

sdk下的weex_core是weex C++部分源码


### 4.如何运行项目

1)在local.properties中设置您的sdk、ndk地址;

2)选择bundle运行方式

本地bundle：如果想运行本地bundle，把bundle放到app/assets/dist下，将WeexProxyActivity的loadPage改为loadLocalFile()，运行项目；

网络bundle：如果想运行网络bundle，将WeexProxyActivity的loadPage改为loadByUrl()，运行项目.
