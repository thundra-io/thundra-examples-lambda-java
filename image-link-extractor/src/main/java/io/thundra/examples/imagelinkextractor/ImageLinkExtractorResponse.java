package io.thundra.examples.imagelinkextractor;

import java.util.List;
import java.util.Map;

/**
 * @author Fazilet Ozer
 * @version 08/02/2018 13:23.
 */
public class ImageLinkExtractorResponse {

    private Map<String, List<String>> extractedImages;

    public ImageLinkExtractorResponse(Map<String, List<String>> extractedImages) {
        this.extractedImages = extractedImages;
    }

    public Map<String, List<String>> getExtractedImages() {
        return extractedImages;
    }

    public ImageLinkExtractorResponse setExtractedImages(Map<String, List<String>> extractedImages) {
        this.extractedImages = extractedImages;
        return this;
    }

}
