## Image Link Extractor
This is an advanced example to get started with Thundra. It extracts image links from each given url.

You will learn how to observe invocation, log and stat metrics 
of lambda functions on Thundra.

---

### How to run using [serverless](https://serverless.com/)


1 - **Install dependencies**, in repository directory:  

***Unix***:
```bash
./mvnw clean package
```
***Windows***:
```bash
mvnw.cmd clean install
```

![maven-clean-package](../readme-src/maven-clean-package.gif)

2 - **Login** to [Thundra](https://beta.thundra.io/) to create your API key:

![create-api-key](../readme-src/create-api-key.gif)

3 - **Configure `custom` field** in `examples-java/image-link-extractor/serverless.yml`:
```
custom:
    deploymentBucket: <your-s3-deployment-bucket>
    thundraApiKey: <your-api-key>
    ...
```

![image-link-extractor-edit](../readme-src/image-link-extractor-edit.gif)

4 - **Deploy**, in `examples-java/image-link-extractor` directory:
```bash
sls deploy
```

![image-link-extractor-sls-deploy](../readme-src/image-link-extractor-sls-deploy.gif)

5 - **Invoke**, in `examples-java/image-link-extractor` directory:
```bash
sls invoke --function image-link-extractor --data '{  "urls":
    [
        "http://ycombinator.com",
        "http://news.ycombinator.com/news",
        "http://news.ycombinator.com/newest",
        "http://news.ycombinator.com/newcomments",
        "http://news.ycombinator.com/leaders"
    ]
}'
```

![image-link-extractor-sls-invoke](../readme-src/image-link-extractor-sls-invoke.gif)

6 - **Enjoy your flight with** Thundra!

Visit [Thundra](https://beta.thundra.io/) to observe your metrics. It might take 1-2 minutes to be visible.

![image-link-extractor-observe](../readme-src/image-link-extractor-observe.gif)
