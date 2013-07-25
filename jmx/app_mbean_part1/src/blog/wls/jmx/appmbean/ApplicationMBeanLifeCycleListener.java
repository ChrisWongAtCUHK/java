package blog.wls.jmx.appmbean;

import weblogic.application.ApplicationLifecycleListener; 
import weblogic.application.ApplicationLifecycleEvent; 
import weblogic.application.ApplicationException; 

import javax.management.ObjectName; 
import javax.management.MBeanServer; 
import javax.naming.InitialContext; 

public class ApplicationMBeanLifeCycleListener extends ApplicationLifecycleListener {

    public void postStart(ApplicationLifecycleEvent evt) throws ApplicationException { 

        try { 
            InitialContext ctx = new InitialContext(); 
            // Lookup Oracle WebLogic Server 'Runtime' MBeanServer 
            MBeanServer mbs  = MBeanServer.class.cast( ctx.lookup("java:comp/jmx/runtime") ); 
            PropertyConfig mbean = new PropertyConfig("config/properties.data");
            ObjectName oname = new ObjectName("blog.wls.jmx.appmbean:type=PropertyConfig,name=myAppProperties"); 
            mbs.registerMBean(mbean, oname); 
        } 
        catch (Exception e) {
            // Deal with exception
            e.printStackTrace();
        } 
    } 

    public void preStop(ApplicationLifecycleEvent evt) throws ApplicationException { 

        try { 
            InitialContext ctx = new InitialContext(); 
            MBeanServer mbs  = MBeanServer.class.cast( ctx.lookup("java:comp/jmx/runtime") ); 
            ObjectName oname = new ObjectName("blog.wls.jmx.appmbean:type=PropertyConfig,name=myAppProperties");
            if ( mbs.isRegistered(oname) ) { 
                 mbs.unregisterMBean(oname); 
            }
        } 
        catch (Exception e) {
            // Deal with exception
            e.printStackTrace();
        } 
    }        

}
