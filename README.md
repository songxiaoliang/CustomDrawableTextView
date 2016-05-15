# CustomDrawableTextView
This is a custom TextView, when you need to display Drawable in the case of TextView, the control can be used to control their own Drawable display size.

#####for example:

![](https://github.com/songxiaoliang/loadinglayout/blob/master/app/demo/demo.jpg "Gif图加载效果") 

## Development Help

####1.Dependence：

#####Insert the following dependency to build.gradle file of your project:
    
     compile 'com.song:CustomDrawableTextView:1.0.0'
      
####2.CustomDrawableTextView support function：
      
    app:imageHeight="50dp" //图片高度
    
    app:imageWidth="50dp" //图片宽度
    
    app:leftImage="@drawable/ic_qq" //左部图片
    
    app:topImage="@drawable/ic_qq" //顶部图片
    
    app:rightImage="@drawable/ic_qq" //右部图片
    
    app:bottomImage="@drawable/ic_qq" //底部图片
      
####3.layout.xml:

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
   >
    <co.song.customdrawabletextview.view.CustomDrawableTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="QQ登录"
        app:topImage="@drawable/ic_qq"
        app:imageHeight="50dp"
        app:imageWidth="50dp"
        />
</LinearLayout>

## My Blog
####[Click to view](http://blog.csdn.net/u013718120)
## Contact Me
####Email：563609104@qq.com
    
