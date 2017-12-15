package com.dsz.jarloader;

import com.dsz.loader.AbstractAction;

/**
 * Created by dsz on 2017/9/8.
 */
public class TestAction extends AbstractAction {
  @Override
  public String action() {
    System.out.println("I am working!!!!!!  TestAction");
    return "this TestAction class";
  }
}
