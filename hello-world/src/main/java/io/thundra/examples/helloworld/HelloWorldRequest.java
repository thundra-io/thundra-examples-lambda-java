package io.thundra.examples.helloworld;

/**
 * @author Canberk Morelli
 * @version 08/02/18.
 */
public class HelloWorldRequest {

    private String msg;

    public HelloWorldRequest() {
    }

    public HelloWorldRequest(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
