###  使用说明

#### 说明   
        主要用于启动activity或者fragment中启动activity用，一个启动一个回调，不需要在activityResult中处理了，androidx中已经有替代品了
#### 在项目中配置资源地址
```
maven { url = uri("https://gitee.com/liu-huiliang/jarlibs/raw/master") }
```

#### 在项目中配置引用
```
implementation 'com.lhl.result:result:1.0.0'
```

#### 主要api说明
##### Result说明
| 方法名 | 方法说明 | 参数说明                                         |
| --- | --- |----------------------------------------------|
 | photo2PhotoAlbum | 从相册中选择照片 | 请求回调                                         |
 | openCamera | 拍照 | file 保存相片的文件, authority 授权, callback 回调      |
 | screenshots | 截图 |                                              |
 | startActivityForResult  | 启动activity ｜ requsetCode请求码，intent需要启动的intent，callbacks回调 |
 |  startActivity | 启动activity | intent需要启动的intent                            |
 | requestPermissions | 请求权限  | requsetCode请求码，callback回调，permissions需要申请的权限 |
 | check | 检测权限 |  permissions需要检测的权限，如果不传则检测清单中所有权限,返回没有授权的权限 |
 | checkWriteSettings |  检查WRITE_SETTINGS权限 |  |
 | requestWriteSettings | 申请WRITE_SETTINGS权限 | callback回调 |
 | checkSystemAlertWindow | 检查SYSTEM_ALERT_WINDOW权限 | |
 | requestSystemAlertWindow | 申请SYSTEM_ALERT_WINDOW权限 | callback回调 |
##### ResultCallback说明  


| 方法名 | 方法说明 | 参数说明                                         |
| --- | --- |----------------------------------------------|
 | onActivityResult | activity回调 | requestCode请求码，resultCode响应码，data回传数据 |

##### PermissionCallback说明


| 方法名 | 方法说明 | 参数说明                                         |
| --- | -- |----------------------------------------------|
| result | 申请权限回调 | failPermissions申请失败了的权限 |