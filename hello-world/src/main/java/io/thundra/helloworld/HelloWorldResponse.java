package io.thundra.helloworld;

/**
 * @author Canberk Morelli
 * @version 08/02/18.
 */
public class HelloWorldResponse {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HelloWorldResponse(String msg) {
        this.msg = msg + " Thundra!";
    }

}
