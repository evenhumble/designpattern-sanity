package io.hedwig.dp.demos.structural.adapter;

/**
 * 1. author: patrick
 */
public class DefaultRankingOperation implements RankingOperation {

  @Override
  public void sort(int[] source) {
    System.out.println("default sort algorithm");
  }

  @Override
  public void preSort(int[] source) {
    System.out.println("default pre-sort algorithm");
  }
}
