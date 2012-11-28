/*
 * An XML document type.
 * Localname: callFooBarResponse
 * Namespace: http://document.jaxws.ws.techiekernel.com
 * Java type: com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.techiekernel.ws.jaxws.document.impl;
/**
 * A document containing one callFooBarResponse(@http://document.jaxws.ws.techiekernel.com) element.
 *
 * This is a complex type.
 */
public class CallFooBarResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument
{
    
    public CallFooBarResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLFOOBARRESPONSE$0 = 
        new javax.xml.namespace.QName("http://document.jaxws.ws.techiekernel.com", "callFooBarResponse");
    
    
    /**
     * Gets the "callFooBarResponse" element
     */
    public com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse getCallFooBarResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse target = null;
            target = (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse)get_store().find_element_user(CALLFOOBARRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "callFooBarResponse" element
     */
    public void setCallFooBarResponse(com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse callFooBarResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse target = null;
            target = (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse)get_store().find_element_user(CALLFOOBARRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse)get_store().add_element_user(CALLFOOBARRESPONSE$0);
            }
            target.set(callFooBarResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "callFooBarResponse" element
     */
    public com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse addNewCallFooBarResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse target = null;
            target = (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse)get_store().add_element_user(CALLFOOBARRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML callFooBarResponse(@http://document.jaxws.ws.techiekernel.com).
     *
     * This is a complex type.
     */
    public static class CallFooBarResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse
    {
        
        public CallFooBarResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://document.jaxws.ws.techiekernel.com", "return");
        
        
        /**
         * Gets the "return" element
         */
        public java.lang.String getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlString xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "return" element
         */
        public boolean isSetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0) != 0;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(java.lang.String xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setStringValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlString xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "return" element
         */
        public void unsetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, 0);
            }
        }
    }
}
