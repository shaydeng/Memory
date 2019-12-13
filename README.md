# Memory
![01](https://user-gold-cdn.xitu.io/2019/12/13/16efe7e2252a374a?w=464&h=960&f=gif&s=3543469)

![02](https://user-gold-cdn.xitu.io/2019/12/13/16efe7ee749db460?w=464&h=960&f=gif&s=3615461)

![03](https://user-gold-cdn.xitu.io/2019/12/13/16efe808fbfeb49a?w=464&h=960&f=gif&s=4738728)
### 一款集云笔记、分类、备忘、倒计时、新闻资讯的工具类app
> * 大学毕设项目，因为没有后台开发，直接使用了Bmob云服务器作为后台数据存储，笔记的上传等请求都是基于Bmob sdk提供的api来调用
> * 项目clone到本地实测是可以跑的装上apk，如果邮箱注册账号失败，可以使用(账号xiaoli，密码123456)进行测试
### 涉及到的技术点大概有以下：
1. Bmob的接口调用
2. 富文本编辑器的使用（笔记中添加图片）（app中上传图片可以成功，但是可能是接口参数更新了，所以返回的url地址应该是失效的显示不出来，个人暂时没有对Bmob 
sdk 去做升级 需读者自行升级 可以主要了解下富文本编辑器的核心实现）
3. 列表item测滑删除菜单的实现（有笔记的测滑删除、倒计日的测滑删除）
4. 分类笔记的多级列表是recyclerView做的（可以看下核心实现）
5. 知乎新闻的接口调用：
    - 如何用Recyclerview展示不同itemtype 
    - 接口获取到数据后缓存到本地数据库，以便无网络时展示数据库中到缓存新闻
    - 点击某个新闻时由webview去展示url内容
    - 使用开源Recyclerview去处理下拉刷新访问下一页的接口
6. viewPager+Fragment首页左右滑动屏幕
7. 项目中有针对不同业务划分不同module，笔记功能是主module，新闻功能等是另一个业务module，借鉴了组件化的思想，将公共的依赖库
放到一个公共的moudle，让其他module都依赖这个公共module。主module会添加对业务module的依赖

# 最后
> 因为是毕设项目，后面没有对代码进行进一步优化，所以只是给广大同学提供demo示例，仅供学习交流
