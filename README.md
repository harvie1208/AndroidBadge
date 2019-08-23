# AndroidBadge
android 桌面角标适配

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.harvie1208:AndroidBadge:1.0'
	}
  
使用示例：

BadgeHelper.setCount(10,MainActivity.this);


目前适配比较完美的机型：华为、三星、HTC、联想ZUK、诺基亚、索尼

