package io.hedwig.dp.advanced.chain;

/**
 * @@author: patrick
 */
public class HttpRequester {
  RequestHandler chain;

  public HttpRequester() {
    buildChain();
  }

  private void buildChain(){
    this.chain=
      new EntryFilter(
          new HttpRequest(
              new ExitFilter(null)
          )
      );
  }

  public void makeRequest(Request req){
    chain.handleRequest(req);
  }
}
