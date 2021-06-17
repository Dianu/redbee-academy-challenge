package com.redbee.academy.challenge;

import java.util.List;
import java.util.*;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */  

  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List<Integer> new_list = new ArrayList<Integer>();
    
    if (a.size() == b.size()) {
      for (int i = 0; i < a.size() ; i++) {
        int max_value = Math.max(a.get(i), b.get(i));
        new_list.add(max_value);
      }
    } else {
      /* It didn't come to me a more elegant way to do this */
      List<Integer> long_list = new ArrayList<Integer>();
      List<Integer> short_list = new ArrayList<Integer>();
      short_list = a.size() < b.size() ? a : b;
      long_list = a.size() < b.size() ? a : b;
      
      // Comparo primero los index en común de ambas listas
      // agregando en la nueva lista los valores máximos
      for (int i = 0; i < short_list.size(); i++) {
        int max_value = Math.max(a.get(i), b.get(i));
        new_list.add(max_value);
      }
      
      // Sigo iterando y agregando a la nueva lista los valores
      // restantes de la lista más larga
      for (int i = short_list.size() - 1; i < long_list.size(); i++) {
        int value = long_list.get(i);
        new_list.add(value);
      }
    }
    return new_list;
  }
}
