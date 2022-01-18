package com.kaopiz.training;

import com.kaopiz.training.client.webappTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class webappSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for webapp");
    suite.addTestSuite(webappTest.class);
    return suite;
  }
}
