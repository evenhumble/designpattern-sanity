package io.hedwig.dp.advanced.chain;

/**
 * @@author: patrick
 */
public class MainRequests {

  public static void main(String[] args) {
    HttpRequester requester = new HttpRequester();
    requester.makeRequest(new Request(
        RequestType.ENTRY_FILTER, "Entry Filter"
    ));

    requester.makeRequest(new Request(
        RequestType.HTTP_REQUEST, "Entry Filter"
    ));

    requester.makeRequest(new Request(
        RequestType.EXIT_FILTER, "Entry Filter"
    ));
  }
}
