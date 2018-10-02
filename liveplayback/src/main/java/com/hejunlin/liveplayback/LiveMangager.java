package com.hejunlin.liveplayback;

import java.util.ArrayList;
import java.util.List;

public class LiveMangager {

    private static List<DataBean> list;

    static {
        list = new ArrayList<>();
        list.add(new DataBean("CCTV1标清", "rtmp://58.200.131.2:1935/livetv/cctv1"));
        list.add(new DataBean("CCTV2标清", "rtmp://58.200.131.2:1935/livetv/cctv2"));
        list.add(new DataBean("CCTV3标清", "rtmp://58.200.131.2:1935/livetv/cctv3"));
        list.add(new DataBean("CCTV4标清", "rtmp://58.200.131.2:1935/livetv/cctv4"));
        list.add(new DataBean("CCTV5标清", "rtmp://58.200.131.2:1935/livetv/cctv5"));
        list.add(new DataBean("CCTV6标清", "rtmp://58.200.131.2:1935/livetv/cctv6"));
        list.add(new DataBean("CCTV7标清", "rtmp://58.200.131.2:1935/livetv/cctv7"));
        list.add(new DataBean("CCTV8标清", "rtmp://58.200.131.2:1935/livetv/cctv8"));
        list.add(new DataBean("CCTV9标清", "rtmp://58.200.131.2:1935/livetv/cctv9"));
        list.add(new DataBean("CCTV10标清", "rtmp://58.200.131.2:1935/livetv/cctv10"));
        list.add(new DataBean("CCTV11标清", "rtmp://58.200.131.2:1935/livetv/cctv11"));
        list.add(new DataBean("CCTV12标清", "rtmp://58.200.131.2:1935/livetv/cctv12"));
        list.add(new DataBean("CCTV13标清", "rtmp://58.200.131.2:1935/livetv/cctv13"));
        list.add(new DataBean("CCTV14标清", "rtmp://58.200.131.2:1935/livetv/cctv14"));
        list.add(new DataBean("CCTV15标清", "rtmp://58.200.131.2:1935/livetv/cctv15"));
        list.add(new DataBean("CGTN", "rtmp://58.200.131.2:1935/livetv/cctv16"));
        list.add(new DataBean("北京卫视", "rtmp://58.200.131.2:1935/livetv/btv1"));
        list.add(new DataBean("北京文艺", "rtmp://58.200.131.2:1935/livetv/btv2"));
        list.add(new DataBean("北京科教", "rtmp://58.200.131.2:1935/livetv/btv3"));
        list.add(new DataBean("北京影视", "rtmp://58.200.131.2:1935/livetv/btv4"));
        list.add(new DataBean("北京财经", "rtmp://58.200.131.2:1935/livetv/btv5"));
        list.add(new DataBean("北京体育", "rtmp://58.200.131.2:1935/livetv/btv6"));
        list.add(new DataBean("北京生活", "rtmp://58.200.131.2:1935/livetv/btv7"));
        list.add(new DataBean("北京青年", "rtmp://58.200.131.2:1935/livetv/btv8"));
        list.add(new DataBean("北京新闻", "rtmp://58.200.131.2:1935/livetv/btv9"));
        list.add(new DataBean("北京卡酷", "rtmp://58.200.131.2:1935/livetv/btv10"));
        list.add(new DataBean("北京纪实", "rtmp://58.200.131.2:1935/livetv/btv11hd"));
        list.add(new DataBean("广西卫视", "rtmp://58.200.131.2:1935/livetv/gxtv"));
        list.add(new DataBean("湖南卫视", "rtmp://58.200.131.2:1935/livetv/hunantv"));
        list.add(new DataBean("广东卫视", "rtmp://58.200.131.2:1935/livetv/gdtv"));
        list.add(new DataBean("东方卫视", "rtmp://58.200.131.2:1935/livetv/dftv"));
        list.add(new DataBean("兵团卫视", "rtmp://58.200.131.2:1935/livetv/bttv"));
        list.add(new DataBean("东南卫视", "rtmp://58.200.131.2:1935/livetv/dntv"));
        list.add(new DataBean("甘肃卫视", "rtmp://58.200.131.2:1935/livetv/gstv"));
        list.add(new DataBean("贵州卫视", "rtmp://58.200.131.2:1935/livetv/gztv"));
        list.add(new DataBean("河北卫视", "rtmp://58.200.131.2:1935/livetv/hebtv"));
        list.add(new DataBean("河南卫视", "rtmp://58.200.131.2:1935/livetv/hntv"));
        list.add(new DataBean("黑龙江卫视", "rtmp://58.200.131.2:1935/livetv/hljtv"));
        list.add(new DataBean("湖北卫视", "rtmp://58.200.131.2:1935/livetv/hbtv"));
        list.add(new DataBean("吉林卫视", "rtmp://58.200.131.2:1935/livetv/jltv"));
        list.add(new DataBean("江苏卫视", "rtmp://58.200.131.2:1935/livetv/jstv"));
        list.add(new DataBean("江西卫视", "rtmp://58.200.131.2:1935/livetv/jxtv"));
        list.add(new DataBean("辽宁卫视", "rtmp://58.200.131.2:1935/livetv/lntv"));
        list.add(new DataBean("旅游卫视", "rtmp://58.200.131.2:1935/livetv/lytv"));
        list.add(new DataBean("内蒙古卫视", "rtmp://58.200.131.2:1935/livetv/nmtv"));
        list.add(new DataBean("宁夏卫视", "rtmp://58.200.131.2:1935/livetv/nxtv"));
        list.add(new DataBean("青海卫视", "rtmp://58.200.131.2:1935/livetv/qhtv"));
        list.add(new DataBean("厦门卫视", "rtmp://58.200.131.2:1935/livetv/xmtv"));
        list.add(new DataBean("山东卫视", "rtmp://58.200.131.2:1935/livetv/sdtv"));
        list.add(new DataBean("山西卫视", "rtmp://58.200.131.2:1935/livetv/sxrtv"));
        list.add(new DataBean("陕西卫视", "rtmp://58.200.131.2:1935/livetv/sxtv"));
        list.add(new DataBean("深圳卫视", "rtmp://58.200.131.2:1935/livetv/sztv"));
        list.add(new DataBean("四川卫视", "rtmp://58.200.131.2:1935/livetv/sctv"));
        list.add(new DataBean("天津卫视", "rtmp://58.200.131.2:1935/livetv/tjtv"));
        list.add(new DataBean("西藏卫视", "rtmp://58.200.131.2:1935/livetv/xztv"));
        list.add(new DataBean("新疆卫视", "rtmp://58.200.131.2:1935/livetv/xjtv"));
        list.add(new DataBean("云南卫视", "rtmp://58.200.131.2:1935/livetv/yntv"));
        list.add(new DataBean("浙江卫视", "rtmp://58.200.131.2:1935/livetv/zjtv"));
        list.add(new DataBean("重庆卫视", "rtmp://58.200.131.2:1935/livetv/cqtv"));
        list.add(new DataBean("安徽卫视", "rtmp://58.200.131.2:1935/livetv/ahtv"));
        list.add(new DataBean("湖北卫视高清", "rtmp://58.200.131.2:1935/livetv/hbhd"));
        list.add(new DataBean("江苏卫视高清", "rtmp://58.200.131.2:1935/livetv/jshd"));
        list.add(new DataBean("辽宁卫视高清", "rtmp://58.200.131.2:1935/livetv/lnhd"));
        list.add(new DataBean("山东卫视高清", "rtmp://58.200.131.2:1935/livetv/sdhd"));
        list.add(new DataBean("深圳卫视高清", "rtmp://58.200.131.2:1935/livetv/szhd"));
        list.add(new DataBean("天津卫视高清", "rtmp://58.200.131.2:1935/livetv/tjhd"));
        list.add(new DataBean("浙江卫视高清", "rtmp://58.200.131.2:1935/livetv/zjhd"));
        list.add(new DataBean("重庆卫视高清", "rtmp://58.200.131.2:1935/livetv/cqhd"));


        list.add(new DataBean("CCTV1-超清", "http://223.110.243.155:80/PLTV/3/224/3221227400/index.m3u8"));
        list.add(new DataBean("CCTV2-1-超清", "http://223.110.243.155:80/PLTV/3/224/3221227207/index.m3u8"));
        list.add(new DataBean("CCTV2-2-超清", "http://223.110.243.155:80/PLTV/3/224/3221227412/index.m3u8"));
        list.add(new DataBean("CCTV3-1-超清", "http://223.110.243.155:80/PLTV/3/224/3221227415/index.m3u8"));
        list.add(new DataBean("CCTV3-2-超清", "http://223.110.243.155:80/PLTV/3/224/3221227206/index.m3u8"));
        list.add(new DataBean("CCTV4-超清", "http://223.110.243.148/PLTV/4/224/3221227378/index.m3u8"));
        list.add(new DataBean("CCTV5-1-超清", "http://223.110.243.155:80/PLTV/3/224/3221227468/index.m3u8"));
        list.add(new DataBean("CCTV5-2-超清", "http://223.110.243.155:80/PLTV/3/224/3221227166/index.m3u8"));
        list.add(new DataBean("CCTV5-3-超清", "http://223.110.243.155:80/PLTV/3/224/3221227465/index.m3u8"));
        list.add(new DataBean("CCTV6-1-超清", "http://223.110.243.152/PLTV/3/224/3221225548/index.m3u8"));
        list.add(new DataBean("CCTV6-2-超清", "http://223.110.243.138/PLTV/3/224/3221227209/index.m3u8"));
        list.add(new DataBean("CCTV7-超清", "http://223.110.243.155:80/PLTV/3/224/3221227392/index.m3u8"));
        list.add(new DataBean("CCTV8-1-超清", "http://223.110.243.155:80/PLTV/3/224/3221227418/index.m3u8"));
        list.add(new DataBean("CCTV8-2-超清", "http://223.110.243.155:80/PLTV/3/224/3221227204/index.m3u8"));
        list.add(new DataBean("CCTV8-3-超清", "http://223.110.243.155:80/PLTV/3/224/3221227205/index.m3u8"));
        list.add(new DataBean("CCTV9-超清", "http://223.110.243.155:80/PLTV/3/224/3221227471/index.m3u8"));
        list.add(new DataBean("CCTV10-超清", "http://223.110.243.155:80/PLTV/3/224/3221227403/index.m3u8"));
        list.add(new DataBean("CCTV12-超清", "http://223.110.243.155:80/PLTV/3/224/3221227406/index.m3u8"));
        list.add(new DataBean("CCTV14-1-超清", "http://223.110.243.155:80/PLTV/3/224/3221227409/index.m3u8"));
        list.add(new DataBean("CCTV14-2-超清", "http://223.110.243.155:80/PLTV/3/224/3221227201/index.m3u8"));
        list.add(new DataBean("东方卫视", "http://223.110.243.155:80/PLTV/3/224/3221227208/index.m3u8"));
    }

    public static List<DataBean> getList() {
        return list;
    }
}
