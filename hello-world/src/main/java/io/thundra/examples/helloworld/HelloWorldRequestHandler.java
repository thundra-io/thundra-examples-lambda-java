package io.thundra.examples.helloworld;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * @author serkan
 */
public class HelloWorldRequestHandler
        implements RequestHandler<HelloWorldRequest, HelloWorldResponse> {

    @Override
    public HelloWorldResponse handleRequest(HelloWorldRequest helloWorldRequest, Context context) {
        return new HelloWorldResponse(helloWorldRequest.getMsg());
    }

}
