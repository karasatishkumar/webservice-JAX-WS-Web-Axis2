
/**
 * FooBarImplServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package webservice-JAX-WS-Web-Axis2.ws;

    /**
     *  FooBarImplServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class FooBarImplServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public FooBarImplServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public FooBarImplServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for callFooBar method
            * override this method for handling normal response from callFooBar operation
            */
           public void receiveResultcallFooBar(
                    com.techiekernel.ws.jaxws.document.CallFooBarResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from callFooBar operation
           */
            public void receiveErrorcallFooBar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServerDetail method
            * override this method for handling normal response from getServerDetail operation
            */
           public void receiveResultgetServerDetail(
                    com.techiekernel.ws.jaxws.document.GetServerDetailResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerDetail operation
           */
            public void receiveErrorgetServerDetail(java.lang.Exception e) {
            }
                


    }
    