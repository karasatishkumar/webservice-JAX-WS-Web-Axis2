/*
 * XML Type:  Server
 * Namespace: http://document.jaxws.ws.techiekernel.com/xsd
 * Java type: com.techiekernel.ws.jaxws.document.xsd.Server
 *
 * Automatically generated - do not modify.
 */
package com.techiekernel.ws.jaxws.document.xsd.impl;
/**
 * An XML Server(@http://document.jaxws.ws.techiekernel.com/xsd).
 *
 * This is a complex type.
 */
public class ServerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.techiekernel.ws.jaxws.document.xsd.Server
{
    
    public ServerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IP$0 = 
        new javax.xml.namespace.QName("http://document.jaxws.ws.techiekernel.com/xsd", "ip");
    private static final javax.xml.namespace.QName MAC$2 = 
        new javax.xml.namespace.QName("http://document.jaxws.ws.techiekernel.com/xsd", "mac");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("http://document.jaxws.ws.techiekernel.com/xsd", "name");
    private static final javax.xml.namespace.QName OS$6 = 
        new javax.xml.namespace.QName("http://document.jaxws.ws.techiekernel.com/xsd", "os");
    
    
    /**
     * Gets the "ip" element
     */
    public java.lang.String getIp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ip" element
     */
    public org.apache.xmlbeans.XmlString xgetIp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IP$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ip" element
     */
    public boolean isNilIp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IP$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ip" element
     */
    public boolean isSetIp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IP$0) != 0;
        }
    }
    
    /**
     * Sets the "ip" element
     */
    public void setIp(java.lang.String ip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IP$0);
            }
            target.setStringValue(ip);
        }
    }
    
    /**
     * Sets (as xml) the "ip" element
     */
    public void xsetIp(org.apache.xmlbeans.XmlString ip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IP$0);
            }
            target.set(ip);
        }
    }
    
    /**
     * Nils the "ip" element
     */
    public void setNilIp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IP$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ip" element
     */
    public void unsetIp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IP$0, 0);
        }
    }
    
    /**
     * Gets the "mac" element
     */
    public java.lang.String getMac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAC$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mac" element
     */
    public org.apache.xmlbeans.XmlString xgetMac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAC$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "mac" element
     */
    public boolean isNilMac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAC$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "mac" element
     */
    public boolean isSetMac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAC$2) != 0;
        }
    }
    
    /**
     * Sets the "mac" element
     */
    public void setMac(java.lang.String mac)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAC$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAC$2);
            }
            target.setStringValue(mac);
        }
    }
    
    /**
     * Sets (as xml) the "mac" element
     */
    public void xsetMac(org.apache.xmlbeans.XmlString mac)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAC$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAC$2);
            }
            target.set(mac);
        }
    }
    
    /**
     * Nils the "mac" element
     */
    public void setNilMac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAC$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAC$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "mac" element
     */
    public void unsetMac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAC$2, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "name" element
     */
    public boolean isNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$4) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Nils the "name" element
     */
    public void setNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$4, 0);
        }
    }
    
    /**
     * Gets the "os" element
     */
    public java.lang.String getOs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "os" element
     */
    public org.apache.xmlbeans.XmlString xgetOs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OS$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "os" element
     */
    public boolean isNilOs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OS$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "os" element
     */
    public boolean isSetOs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OS$6) != 0;
        }
    }
    
    /**
     * Sets the "os" element
     */
    public void setOs(java.lang.String os)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OS$6);
            }
            target.setStringValue(os);
        }
    }
    
    /**
     * Sets (as xml) the "os" element
     */
    public void xsetOs(org.apache.xmlbeans.XmlString os)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OS$6);
            }
            target.set(os);
        }
    }
    
    /**
     * Nils the "os" element
     */
    public void setNilOs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OS$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "os" element
     */
    public void unsetOs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OS$6, 0);
        }
    }
}
