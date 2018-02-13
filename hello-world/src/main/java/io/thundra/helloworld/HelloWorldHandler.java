package io.thundra.helloworld;

import com.amazonaws.services.lambda.runtime.Context;
import com.opsgenie.thundra.lambda.core.ThundraLambdaRequestHandler;

/**
 * @author Canberk Morelli
 * @version 08/02/18.
 */
public class HelloWorldHandler
        implements ThundraLambdaRequestHandler<HelloWorldRequest, HelloWorldResponse> {

    @Override
    public HelloWorldResponse doHandleRequest(HelloWorldRequest helloWorldRequest, Context context) throws Exception {
        return new HelloWorldResponse(helloWorldRequest.getMsg());
    }

}
