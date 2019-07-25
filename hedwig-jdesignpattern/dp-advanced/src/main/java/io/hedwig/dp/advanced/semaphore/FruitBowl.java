/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.hedwig.dp.advanced.semaphore;

import java.util.List;
import java.util.ArrayList;

/**
 * A FruitBowl contains Fruit. 
 */
public class FruitBowl {
    
  private List<Fruit> fruit = new ArrayList<>();

  /**
   * 
   * @return The amount of Fruit left in the bowl. 
   */
  public int countFruit() {
    return fruit.size();
  }

  /**
   * Put an item of Fruit into the bowl.
   * 
   * @param f fruit
   */
  public void put(Fruit f) {
    fruit.add(f);
  }
  
  /**
   * Take an item of Fruit out of the bowl.
   * @return The Fruit taken out of the bowl, or null if empty.
   */
  public Fruit take() {
    if (fruit.isEmpty()) {
      return null;
    } else {
      return fruit.remove(0);
    }
  }
  
  /**
   * toString method
   */   
  public String toString() {
    int apples = 0;
    int oranges = 0;
    int lemons = 0;
        
    for (Fruit f : fruit) {
      switch (f.getType()) {
        case APPLE:
          apples++;
          break;
        case ORANGE:
          oranges++;
          break;
        case LEMON:
          lemons++;
          break;
        default:
      }
    }
        
    return apples + " Apples, " + oranges + " Oranges, and " + lemons + " Lemons";
  }
}
