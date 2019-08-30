package cn.hy.aurora.util;

import java.util.Date;

/**
 * @author hy
 * @version 1.0
 * @date 2019/8/27 14:03
 */
public class TimeUtil {

    public static String getSimpleFormatDate() {
        return String.format(new Date().toString(), "yyyy-MM-dd HH:mm:ss");
    }
}
