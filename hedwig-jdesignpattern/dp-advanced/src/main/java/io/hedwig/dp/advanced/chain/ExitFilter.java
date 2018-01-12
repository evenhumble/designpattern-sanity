package io.hedwig.dp.advanced.chain;

/**
 * @@author: patrick
 */
public class ExitFilter extends RequestHandler{

  public ExitFilter(RequestHandler next) {
    super(next);
  }

  @Override
  public void handleRequest(Request req) {
    if(req.getRequestType().equals(RequestType.EXIT_FILTER) ){
      printHandling(req);
      req.markHandled();
    }else{
      super.handleRequest(req);
    }
  }

  @Override
  public String toString() {
    return "EntryFilter Handler";
  }
}
