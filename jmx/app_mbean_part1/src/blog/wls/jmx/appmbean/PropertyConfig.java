package blog.wls.jmx.appmbean;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

import java.net.URL;

import java.util.Map;
import java.util.Properties;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.MBeanRegistration;

public class PropertyConfig implements PropertyConfigMXBean, MBeanRegistration {

    private String relativePath_ = null; 

    private Properties props_ = null;

    private File resource_ = null;

    public PropertyConfig(String relativePath) throws Exception {
        props_ = new Properties();
        relativePath_ = relativePath;
    }

    public String setProperty(String key,
                              String value) throws IOException {

        String oldValue = null;

        if (value == null) {
            oldValue = String.class.cast(props_.remove(key));
        } else {
            oldValue = String.class.cast(props_.setProperty(key, value));      
        }

        save();
        return oldValue;
    }

    public String getProperty(String key) {
        return props_.getProperty(key);
    }

    public Map<String, String> getProperties() {
        return (Map) props_;
    }

    private void load() throws IOException {
        
        InputStream is = new FileInputStream(resource_);
        try {
            props_.load(is);
        }
        finally {
            is.close();
        }
    } 

    private void save() throws IOException {
  
        OutputStream os = new FileOutputStream(resource_);

        try {
            props_.store(os, null);
        }
        finally {
            os.close();
        }
    }

    public ObjectName preRegister(MBeanServer server, ObjectName name)
        throws Exception {
       
        // MBean must be registered from an application thread
        // to have access to the application ClassLoader
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        URL resourceUrl = cl.getResource(relativePath_);
        resource_ = new File(resourceUrl.toURI());

        load();     

        return name;
    }

    public void postRegister(Boolean registrationDone) { }

    public void preDeregister() throws Exception {}

    public void postDeregister() {}     

}
