/*
 * XML Type:  Server
 * Namespace: http://document.jaxws.ws.techiekernel.com/xsd
 * Java type: com.techiekernel.ws.jaxws.document.xsd.Server
 *
 * Automatically generated - do not modify.
 */
package com.techiekernel.ws.jaxws.document.xsd;


/**
 * An XML Server(@http://document.jaxws.ws.techiekernel.com/xsd).
 *
 * This is a complex type.
 */
public interface Server extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Server.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8F4814A118F59EABFAE1D73D94F21FAC").resolveHandle("servereba8type");
    
    /**
     * Gets the "ip" element
     */
    java.lang.String getIp();
    
    /**
     * Gets (as xml) the "ip" element
     */
    org.apache.xmlbeans.XmlString xgetIp();
    
    /**
     * Tests for nil "ip" element
     */
    boolean isNilIp();
    
    /**
     * True if has "ip" element
     */
    boolean isSetIp();
    
    /**
     * Sets the "ip" element
     */
    void setIp(java.lang.String ip);
    
    /**
     * Sets (as xml) the "ip" element
     */
    void xsetIp(org.apache.xmlbeans.XmlString ip);
    
    /**
     * Nils the "ip" element
     */
    void setNilIp();
    
    /**
     * Unsets the "ip" element
     */
    void unsetIp();
    
    /**
     * Gets the "mac" element
     */
    java.lang.String getMac();
    
    /**
     * Gets (as xml) the "mac" element
     */
    org.apache.xmlbeans.XmlString xgetMac();
    
    /**
     * Tests for nil "mac" element
     */
    boolean isNilMac();
    
    /**
     * True if has "mac" element
     */
    boolean isSetMac();
    
    /**
     * Sets the "mac" element
     */
    void setMac(java.lang.String mac);
    
    /**
     * Sets (as xml) the "mac" element
     */
    void xsetMac(org.apache.xmlbeans.XmlString mac);
    
    /**
     * Nils the "mac" element
     */
    void setNilMac();
    
    /**
     * Unsets the "mac" element
     */
    void unsetMac();
    
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
     * Gets the "os" element
     */
    java.lang.String getOs();
    
    /**
     * Gets (as xml) the "os" element
     */
    org.apache.xmlbeans.XmlString xgetOs();
    
    /**
     * Tests for nil "os" element
     */
    boolean isNilOs();
    
    /**
     * True if has "os" element
     */
    boolean isSetOs();
    
    /**
     * Sets the "os" element
     */
    void setOs(java.lang.String os);
    
    /**
     * Sets (as xml) the "os" element
     */
    void xsetOs(org.apache.xmlbeans.XmlString os);
    
    /**
     * Nils the "os" element
     */
    void setNilOs();
    
    /**
     * Unsets the "os" element
     */
    void unsetOs();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.techiekernel.ws.jaxws.document.xsd.Server newInstance() {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.techiekernel.ws.jaxws.document.xsd.Server parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.techiekernel.ws.jaxws.document.xsd.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
