bingads-api
===========

`bingads-api` is Feedeo's java client library for accessing Bing Ads APIs it supports authorization and
authentication with OAuth 2.0.

## Release 1.0.0

Support for Bing Ads API v9 October 2013 release


## Questions/problems?

* If you found a bug, please [file a bug](https://github.com/feedeo/bings-ads/issues).

## Setting up your environement

At this point you need to download and build your own jar. We will publish to a public Maven repository in the future.

Add the following to your pom.xml

~~~~ xml
        <dependency>
            <groupId>com.feedeo</groupId>
            <artifactId>bingads-api</artifactId>
            <version>1.0.0</version>
        </dependency>
~~~~

### Examples

Coming...



### Authorization and Authentication

This client comes with Google's OAuth2 client that allows you to retrieve an access token and
refreshes the token and re-try the request seamlessly if token is expired. The
basics of Google's OAuth 2.0 implementation is explained on
[Google Authorization and Authentication
documentation](https://developers.google.com/accounts/docs/OAuth2Login).

## License

`bingads-api` is licensed with The MIT License (MIT). The full license text is
available in the LICENSE file.

## Contributors

Fork the repo, develop and test your code changes.

Submit a pull request. The repo owner will review your request. If it is
approved, the change will be merged. If it needs additional work, the repo
owner will respond with useful comments.


