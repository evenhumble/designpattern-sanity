package io.hedwig.dp.demos.structural.adapter;

/**
 * 1. author: patrick
 */
public class SortClient {

  public static void main(String[] args) {
    RankingOperation operation = new DefaultRankingOperation();
    operation.preSort(null);
    operation.sort(null);
    RankingOperationAdapter adapter = new RankingOperationAdapter();
    adapter.preSort(null);
    adapter.sort(null);
  }
}
