package jpixy.com.framework.helper;

import jpixy.com.framework.ConfigConstant;
import jpixy.com.framework.util.PropsUtil;

import java.util.Properties;

public final class ConfigHelper {
    private static final Properties CONFIG_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    public static String getJdbcDriver(){
        return PropsUtil.getString()
    }

}
