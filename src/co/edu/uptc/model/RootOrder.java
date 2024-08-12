package co.edu.uptc.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import co.edu.uptc.structures.MyQueue;

public class RootOrder {

  private ArrayList<MyQueue<Integer>> queues;
  private ArrayList<Integer> numbers;

  public RootOrder(ArrayList<Integer> numbers) {
    this.numbers = numbers;
  }

  private void processPass(int divisor) {
    queues = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      queues.add(new MyQueue<>());
    }
    for (int i = 0; i < numbers.size(); i++) {
      int number = numbers.get(i);
      int unit = (number / divisor) % 10;
      queues.get(unit).push(number);
    }
  }

  public Map<String, ArrayList<Integer>> showPass(int divisor) {
    processPass(divisor);
    Map<String, ArrayList<Integer>> data = new HashMap<>();
    for (int i = 0; i < queues.size(); i++) {
      ArrayList<Integer> numbers = new ArrayList<>();
      while (!queues.get(i).isEmpty()) {
        numbers.add(queues.get(i).poll());
      }
      data.put("Cola " + i, numbers);
    }
    return data;
  }

  public Map<String, ArrayList<Integer>> showFirstPass() {
    return showPass(1);
  }

  public Map<String, ArrayList<Integer>> showSecondPass() {
    return showPass(10);
  }

  public Map<String, ArrayList<Integer>> showThirdPass() {
    return showPass(100);
  }

}
