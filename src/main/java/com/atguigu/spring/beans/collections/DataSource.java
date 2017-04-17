package com.atguigu.spring.beans.collections;

import java.util.Properties;

/**
 * Created by lance017 on 2017/4/17.
 */
public class DataSource {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}
