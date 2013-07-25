package blog.wls.jmx.appmbean;

import java.util.Map;

import java.io.IOException;

public interface PropertyConfigMXBean {

    public String setProperty(String key, String value) throws IOException;

    public String getProperty(String key);

    public Map<String, String> getProperties();

}
