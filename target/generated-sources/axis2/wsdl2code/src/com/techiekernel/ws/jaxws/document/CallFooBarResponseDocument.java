/*
 * An XML document type.
 * Localname: callFooBarResponse
 * Namespace: http://document.jaxws.ws.techiekernel.com
 * Java type: com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.techiekernel.ws.jaxws.document;


/**
 * A document containing one callFooBarResponse(@http://document.jaxws.ws.techiekernel.com) element.
 *
 * This is a complex type.
 */
public interface CallFooBarResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallFooBarResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8F4814A118F59EABFAE1D73D94F21FAC").resolveHandle("callfoobarresponse6527doctype");
    
    /**
     * Gets the "callFooBarResponse" element
     */
    com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse getCallFooBarResponse();
    
    /**
     * Sets the "callFooBarResponse" element
     */
    void setCallFooBarResponse(com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse callFooBarResponse);
    
    /**
     * Appends and returns a new empty "callFooBarResponse" element
     */
    com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse addNewCallFooBarResponse();
    
    /**
     * An XML callFooBarResponse(@http://document.jaxws.ws.techiekernel.com).
     *
     * This is a complex type.
     */
    public interface CallFooBarResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallFooBarResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8F4814A118F59EABFAE1D73D94F21FAC").resolveHandle("callfoobarresponse46bfelemtype");
        
        /**
         * Gets the "return" element
         */
        java.lang.String getReturn();
        
        /**
         * Gets (as xml) the "return" element
         */
        org.apache.xmlbeans.XmlString xgetReturn();
        
        /**
         * Tests for nil "return" element
         */
        boolean isNilReturn();
        
        /**
         * True if has "return" element
         */
        boolean isSetReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(java.lang.String xreturn);
        
        /**
         * Sets (as xml) the "return" element
         */
        void xsetReturn(org.apache.xmlbeans.XmlString xreturn);
        
        /**
         * Nils the "return" element
         */
        void setNilReturn();
        
        /**
         * Unsets the "return" element
         */
        void unsetReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse newInstance() {
              return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument.CallFooBarResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument newInstance() {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
