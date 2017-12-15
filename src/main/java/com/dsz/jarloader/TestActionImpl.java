package com.dsz.jarloader;

import com.dsz.loader.InterfaceAction;

/**
 * Created by dsz on 2017/9/8.
 */
public class TestActionImpl implements InterfaceAction {
  public String action() {
    System.out.println("I am working!!!!! TestActionImpl");
    return "this TestActionImpl class";
  }
}
