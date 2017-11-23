package io.hedwig.dp.demos.structural.adapter;

/**
 * 1. author: patrick
 */
public class RankingOperationAdapter extends DefaultRankingOperation {
  //adaptee
  private Sorter quickSort = new QuickSort();
  //adaptee
  private PreSorter preSortAlgo= new PreSortAlgo();

  @Override
  public void sort(int[] source) {
    quickSort.sort(source);
  }

  @Override
  public void preSort(int[] source) {
    preSortAlgo.sort(source);
  }
}
