package io.thundra.examples.imagelinkextractor;

import io.thundra.agent.trace.instrument.config.Traceable;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Fazilet Ozer
 * @version 08/02/2018 13:23.
 */
@Traceable(
        methodModifiers = { Modifier.PUBLIC, Modifier.PRIVATE },
        traceArguments = true,
        traceArgumentNames = true,
        serializeArgumentsAsJson = true,
        traceReturnValue = true,
        serializeReturnValueAsJson = true
)
public class ImageLinkExtractorService {

    private final Logger logger = Logger.getLogger(getClass());

    public ImageLinkExtractorService() {

    }

    public Map<String, List<String>> extractImageSources(List<String> urls) {
        Map<String, List<String>> extractedImageSources = new HashMap<>();
        for (String url : urls) {
            extractedImageSources.put(url, extractImageSource(url));
        }
        return extractedImageSources;
    }

    private List<String> extractImageSource(String url) {
        List<String> imageSources = new ArrayList<>();

        try {
            Document document = Jsoup.connect(url).userAgent("Mozilla").get();
            logger.info("Successfully connected to " + url);
            Elements imgElements = document.getElementsByTag("img");

            int numberOfImages = imgElements.size();
            logger.info(numberOfImages + " images are extracted from " + url);
            for (Element element : imgElements) {
                String imageSource = element.absUrl("src");
                imageSources.add(imageSource);
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
        return imageSources;
    }

}
