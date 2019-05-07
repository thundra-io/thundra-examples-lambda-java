package io.thundra.examples.imagelinkextractor;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.List;
import java.util.Map;

/**
 * @author serkan
 */
public class ImageLinkExtractorRequestHandler
        implements RequestHandler<ImageLinkExtractorRequest, ImageLinkExtractorResponse> {

    private final ImageLinkExtractorService imageLinkExtractorService = new ImageLinkExtractorService();

    @Override
    public ImageLinkExtractorResponse handleRequest(ImageLinkExtractorRequest imageLinkExtractorRequest, Context context) {
        Map<String, List<String>> imageSources = imageLinkExtractorService.extractImageSources(imageLinkExtractorRequest.getUrls());
        return new ImageLinkExtractorResponse(imageSources);
    }

}