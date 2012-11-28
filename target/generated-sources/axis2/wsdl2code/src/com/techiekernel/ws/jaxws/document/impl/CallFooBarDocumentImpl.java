/*
 * An XML document type.
 * Localname: callFooBar
 * Namespace: http://document.jaxws.ws.techiekernel.com
 * Java type: com.techiekernel.ws.jaxws.document.CallFooBarDocument
 *
 * Automatically generated - do not modify.
 */
package com.techiekernel.ws.jaxws.document.impl;
/**
 * A document containing one callFooBar(@http://document.jaxws.ws.techiekernel.com) element.
 *
 * This is a complex type.
 */
public class CallFooBarDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.techiekernel.ws.jaxws.document.CallFooBarDocument
{
    
    public CallFooBarDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLFOOBAR$0 = 
        new javax.xml.namespace.QName("http://document.jaxws.ws.techiekernel.com", "callFooBar");
    
    
    /**
     * Gets the "callFooBar" element
     */
    public com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar getCallFooBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar target = null;
            target = (com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar)get_store().find_element_user(CALLFOOBAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "callFooBar" element
     */
    public void setCallFooBar(com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar callFooBar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar target = null;
            target = (com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar)get_store().find_element_user(CALLFOOBAR$0, 0);
            if (target == null)
            {
                target = (com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar)get_store().add_element_user(CALLFOOBAR$0);
            }
            target.set(callFooBar);
        }
    }
    
    /**
     * Appends and returns a new empty "callFooBar" element
     */
    public com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar addNewCallFooBar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar target = null;
            target = (com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar)get_store().add_element_user(CALLFOOBAR$0);
            return target;
        }
    }
    /**
     * An XML callFooBar(@http://document.jaxws.ws.techiekernel.com).
     *
     * This is a complex type.
     */
    public static class CallFooBarImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar
    {
        
        public CallFooBarImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://document.jaxws.ws.techiekernel.com", "name");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
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
                return get_store().count_elements(NAME$0) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
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
                get_store().remove_element(NAME$0, 0);
            }
        }
    }
}
