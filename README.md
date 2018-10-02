# Android TV直播电视节目


[参考demo,鸣谢](https://github.com/hejunlin2013/LivePlayback)

原作者有许多无法使用，我进行了修改，并且删除了他的播放库，接入了自己的evideoview。

[evideoview](https://github.com/ccx1/EView)


代码实现思路:

- 1、通过RecycleView为对应的节目item,遥控器按键,可触发跳到对应的直播节目
- 2、使用ijkplay进行播放直播源
- 3、我家里使用的是英菲克机顶盒，出现了很多问题，目前都完美解决

代码实现：

- 主页面：Recycleview对应adapater
- 直播节目源
- 播放器
- 播放页处理