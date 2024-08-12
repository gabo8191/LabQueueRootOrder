package co.edu.uptc.presenter;

import java.util.ArrayList;
import java.util.Map;

import co.edu.uptc.model.RootOrder;
import co.edu.uptc.view.View;

public class Presenter {
  private View view;
  private RootOrder rootOrder;

  public Presenter() {
    view = new View();
  }

  public void run() {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(442);
    numbers.add(503);
    numbers.add(312);
    numbers.add(145);
    numbers.add(250);
    numbers.add(349);
    numbers.add(325);
    numbers.add(102);
    numbers.add(420);
    numbers.add(143);
    numbers.add(201);
    numbers.add(100);
    numbers.add(991);
    numbers.add(999);
    numbers.add(721);
    numbers.add(123);
    numbers.add(678);
    numbers.add(456);
    numbers.add(789);
    numbers.add(987);
    numbers.add(888);
    rootOrder = new RootOrder(numbers);
    showFirstPass();
    showSecondPass();
    showThirdPass();
  }

  public void showFirstPass() {
    view.showMessage("===================================");
    view.showMessage("PASADA 1 -> UNIDADES");
    view.showMessage("===================================");
    Map<String, ArrayList<Integer>> map = rootOrder.showFirstPass();
    for (String key : map.keySet()) {
      view.showMessage(key + " -> " + map.get(key));
    }
  }

  public void showSecondPass() {
    view.showMessage("===================================");
    view.showMessage("PASADA 2 -> DECENAS");
    view.showMessage("===================================");
    Map<String, ArrayList<Integer>> map = rootOrder.showSecondPass();
    for (String key : map.keySet()) {
      view.showMessage(key + " -> " + map.get(key));
    }
  }

  public void showThirdPass() {
    view.showMessage("===================================");
    view.showMessage("PASADA 3 -> CENTENAS");
    view.showMessage("===================================");
    Map<String, ArrayList<Integer>> map = rootOrder.showThirdPass();
    for (String key : map.keySet()) {
      view.showMessage(key + " -> " + map.get(key));
    }
  }

  public static void main(String[] args) {
    Presenter presenter = new Presenter();
    presenter.run();

  }

}
