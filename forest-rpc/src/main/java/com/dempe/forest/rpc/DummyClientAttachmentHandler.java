package com.dempe.forest.rpc;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2016/3/11
 * Time: 17:30
 * To change this template use File | Settings | File Templates.
 */
public class DummyClientAttachmentHandler extends DummyAttachmentHandler implements ClientAttachmentHandler {


    /* (non-Javadoc)
     * @see com.baidu.jprotobuf.pbrpc.ClientAttachmentHandler#handleResponse(byte[], java.lang.String, java.lang.String, java.lang.Object[])
     */
    public void handleResponse(byte[] response, String serviceName, String methodName, Object... params) {

    }

}