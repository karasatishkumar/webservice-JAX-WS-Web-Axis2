/*
 * An XML document type.
 * Localname: getServerDetailResponse
 * Namespace: http://document.jaxws.ws.techiekernel.com
 * Java type: com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.techiekernel.ws.jaxws.document.impl;
/**
 * A document containing one getServerDetailResponse(@http://document.jaxws.ws.techiekernel.com) element.
 *
 * This is a complex type.
 */
public class GetServerDetailResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument
{
    
    public GetServerDetailResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSERVERDETAILRESPONSE$0 = 
        new javax.xml.namespace.QName("http://document.jaxws.ws.techiekernel.com", "getServerDetailResponse");
    
    
    /**
     * Gets the "getServerDetailResponse" element
     */
    public com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument.GetServerDetailResponse getGetServerDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument.GetServerDetailResponse target = null;
            target = (com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument.GetServerDetailResponse)get_store().find_element_user(GETSERVERDETAILRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getServerDetailResponse" element
     */
    public void setGetServerDetailResponse(com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument.GetServerDetailResponse getServerDetailResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument.GetServerDetailResponse target = null;
            target = (com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument.GetServerDetailResponse)get_store().find_element_user(GETSERVERDETAILRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument.GetServerDetailResponse)get_store().add_element_user(GETSERVERDETAILRESPONSE$0);
            }
            target.set(getServerDetailResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getServerDetailResponse" element
     */
    public com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument.GetServerDetailResponse addNewGetServerDetailResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument.GetServerDetailResponse target = null;
            target = (com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument.GetServerDetailResponse)get_store().add_element_user(GETSERVERDETAILRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getServerDetailResponse(@http://document.jaxws.ws.techiekernel.com).
     *
     * This is a complex type.
     */
    public static class GetServerDetailResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument.GetServerDetailResponse
    {
        
        public GetServerDetailResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://document.jaxws.ws.techiekernel.com", "return");
        
        
        /**
         * Gets the "return" element
         */
        public com.techiekernel.ws.jaxws.document.xsd.Server getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.techiekernel.ws.jaxws.document.xsd.Server target = null;
                target = (com.techiekernel.ws.jaxws.document.xsd.Server)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
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
                com.techiekernel.ws.jaxws.document.xsd.Server target = null;
                target = (com.techiekernel.ws.jaxws.document.xsd.Server)get_store().find_element_user(RETURN$0, 0);
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
        public void setReturn(com.techiekernel.ws.jaxws.document.xsd.Server xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.techiekernel.ws.jaxws.document.xsd.Server target = null;
                target = (com.techiekernel.ws.jaxws.document.xsd.Server)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (com.techiekernel.ws.jaxws.document.xsd.Server)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public com.techiekernel.ws.jaxws.document.xsd.Server addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.techiekernel.ws.jaxws.document.xsd.Server target = null;
                target = (com.techiekernel.ws.jaxws.document.xsd.Server)get_store().add_element_user(RETURN$0);
                return target;
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
                com.techiekernel.ws.jaxws.document.xsd.Server target = null;
                target = (com.techiekernel.ws.jaxws.document.xsd.Server)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (com.techiekernel.ws.jaxws.document.xsd.Server)get_store().add_element_user(RETURN$0);
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
