package io.thundra.imagelinkextractor;

import com.amazonaws.services.lambda.runtime.Context;
import com.opsgenie.thundra.lambda.core.ThundraLambdaRequestHandler;

import java.util.List;
import java.util.Map;

/**
 * @author Fazilet Ozer
 * @version 08/02/2018 13:15.
 */
public class ImageLinkExtractorHandler implements
        ThundraLambdaRequestHandler<ImageLinkExtractorRequest, ImageLinkExtractorResponse> {

    private final ImageLinkExtractorService imageLinkExtractorService = new ImageLinkExtractorService();

    @Override
    public ImageLinkExtractorResponse doHandleRequest(ImageLinkExtractorRequest imageLinkExtractorRequest, Context context) throws Exception {
        Map<String, List<String>> imageSources = imageLinkExtractorService.extractImageSources(imageLinkExtractorRequest.getUrls());
        return new ImageLinkExtractorResponse(imageSources);
    }
}