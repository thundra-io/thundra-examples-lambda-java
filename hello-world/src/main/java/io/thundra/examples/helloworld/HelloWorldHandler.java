package io.thundra.examples.helloworld;

import com.amazonaws.services.lambda.runtime.Context;
import io.thundra.agent.lambda.core.handler.request.LambdaRequestHandler;

/**
 * @author Canberk Morelli
 * @version 08/02/18.
 */
public class HelloWorldHandler
        implements LambdaRequestHandler<HelloWorldRequest, HelloWorldResponse> {

    @Override
    public HelloWorldResponse doHandleRequest(HelloWorldRequest helloWorldRequest, Context context) throws Exception {
        return new HelloWorldResponse(helloWorldRequest.getMsg());
    }

}
