package io.thundra.examples.imagelinkextractor;

import java.util.List;

/**
 * @author Fazilet Ozer
 * @version 08/02/2018 13:23.
 */
public class ImageLinkExtractorRequest {

    private List<String> urls;

    public ImageLinkExtractorRequest() {
    }

    public ImageLinkExtractorRequest(List<String> urls) {
        this.urls = urls;
    }

    public List<String> getUrls() {
        return urls;
    }

    public ImageLinkExtractorRequest setUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

}
