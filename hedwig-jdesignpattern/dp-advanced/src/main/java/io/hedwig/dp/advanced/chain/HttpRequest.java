package io.hedwig.dp.advanced.chain;

/**
 * @@author: patrick
 */
public class HttpRequest extends RequestHandler {

  public HttpRequest(RequestHandler next) {
    super(next);
  }

  @Override
  public void handleRequest(Request req) {
    if(req.getRequestType().equals(RequestType.HTTP_REQUEST)){
     printHandling(req);
     req.markHandled();
    }else{
      super.handleRequest(req);
    }
  }

  @Override
  public String toString() {
    return "HttpRequest";
  }
}
