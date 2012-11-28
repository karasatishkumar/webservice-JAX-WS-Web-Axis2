/*
 * An XML document type.
 * Localname: getServerDetail
 * Namespace: http://document.jaxws.ws.techiekernel.com
 * Java type: com.techiekernel.ws.jaxws.document.GetServerDetailDocument
 *
 * Automatically generated - do not modify.
 */
package com.techiekernel.ws.jaxws.document.impl;
/**
 * A document containing one getServerDetail(@http://document.jaxws.ws.techiekernel.com) element.
 *
 * This is a complex type.
 */
public class GetServerDetailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.techiekernel.ws.jaxws.document.GetServerDetailDocument
{
    
    public GetServerDetailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSERVERDETAIL$0 = 
        new javax.xml.namespace.QName("http://document.jaxws.ws.techiekernel.com", "getServerDetail");
    
    
    /**
     * Gets the "getServerDetail" element
     */
    public com.techiekernel.ws.jaxws.document.GetServerDetailDocument.GetServerDetail getGetServerDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.techiekernel.ws.jaxws.document.GetServerDetailDocument.GetServerDetail target = null;
            target = (com.techiekernel.ws.jaxws.document.GetServerDetailDocument.GetServerDetail)get_store().find_element_user(GETSERVERDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getServerDetail" element
     */
    public void setGetServerDetail(com.techiekernel.ws.jaxws.document.GetServerDetailDocument.GetServerDetail getServerDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.techiekernel.ws.jaxws.document.GetServerDetailDocument.GetServerDetail target = null;
            target = (com.techiekernel.ws.jaxws.document.GetServerDetailDocument.GetServerDetail)get_store().find_element_user(GETSERVERDETAIL$0, 0);
            if (target == null)
            {
                target = (com.techiekernel.ws.jaxws.document.GetServerDetailDocument.GetServerDetail)get_store().add_element_user(GETSERVERDETAIL$0);
            }
            target.set(getServerDetail);
        }
    }
    
    /**
     * Appends and returns a new empty "getServerDetail" element
     */
    public com.techiekernel.ws.jaxws.document.GetServerDetailDocument.GetServerDetail addNewGetServerDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.techiekernel.ws.jaxws.document.GetServerDetailDocument.GetServerDetail target = null;
            target = (com.techiekernel.ws.jaxws.document.GetServerDetailDocument.GetServerDetail)get_store().add_element_user(GETSERVERDETAIL$0);
            return target;
        }
    }
    /**
     * An XML getServerDetail(@http://document.jaxws.ws.techiekernel.com).
     *
     * This is a complex type.
     */
    public static class GetServerDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.techiekernel.ws.jaxws.document.GetServerDetailDocument.GetServerDetail
    {
        
        public GetServerDetailImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLIENT$0 = 
            new javax.xml.namespace.QName("http://document.jaxws.ws.techiekernel.com", "client");
        
        
        /**
         * Gets the "client" element
         */
        public java.lang.String getClient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "client" element
         */
        public org.apache.xmlbeans.XmlString xgetClient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENT$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "client" element
         */
        public boolean isNilClient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "client" element
         */
        public boolean isSetClient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLIENT$0) != 0;
            }
        }
        
        /**
         * Sets the "client" element
         */
        public void setClient(java.lang.String client)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENT$0);
                }
                target.setStringValue(client);
            }
        }
        
        /**
         * Sets (as xml) the "client" element
         */
        public void xsetClient(org.apache.xmlbeans.XmlString client)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENT$0);
                }
                target.set(client);
            }
        }
        
        /**
         * Nils the "client" element
         */
        public void setNilClient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "client" element
         */
        public void unsetClient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLIENT$0, 0);
            }
        }
    }
}
