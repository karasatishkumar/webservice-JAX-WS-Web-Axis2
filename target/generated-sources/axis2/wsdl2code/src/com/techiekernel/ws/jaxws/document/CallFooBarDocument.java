/*
 * An XML document type.
 * Localname: callFooBar
 * Namespace: http://document.jaxws.ws.techiekernel.com
 * Java type: com.techiekernel.ws.jaxws.document.CallFooBarDocument
 *
 * Automatically generated - do not modify.
 */
package com.techiekernel.ws.jaxws.document;


/**
 * A document containing one callFooBar(@http://document.jaxws.ws.techiekernel.com) element.
 *
 * This is a complex type.
 */
public interface CallFooBarDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallFooBarDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8F4814A118F59EABFAE1D73D94F21FAC").resolveHandle("callfoobarda06doctype");
    
    /**
     * Gets the "callFooBar" element
     */
    com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar getCallFooBar();
    
    /**
     * Sets the "callFooBar" element
     */
    void setCallFooBar(com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar callFooBar);
    
    /**
     * Appends and returns a new empty "callFooBar" element
     */
    com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar addNewCallFooBar();
    
    /**
     * An XML callFooBar(@http://document.jaxws.ws.techiekernel.com).
     *
     * This is a complex type.
     */
    public interface CallFooBar extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallFooBar.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8F4814A118F59EABFAE1D73D94F21FAC").resolveHandle("callfoobard21felemtype");
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Tests for nil "name" element
         */
        boolean isNilName();
        
        /**
         * True if has "name" element
         */
        boolean isSetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Nils the "name" element
         */
        void setNilName();
        
        /**
         * Unsets the "name" element
         */
        void unsetName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar newInstance() {
              return (com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.techiekernel.ws.jaxws.document.CallFooBarDocument.CallFooBar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument newInstance() {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.techiekernel.ws.jaxws.document.CallFooBarDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.techiekernel.ws.jaxws.document.CallFooBarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
