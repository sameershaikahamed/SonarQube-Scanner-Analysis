import java.util.*;
/**
 * Entry point to auto-generated tests (generated by maven-hpi-plugin).
 * If this fails to compile, you are probably using Hudson &lt; 1.327. If so, disable
 * this code generation by configuring maven-hpi-plugin to &lt;disabledTestInjection&gt;true&lt;/disabledTestInjection&gt;.
 */
public class InjectedTest extends junit.framework.TestCase {
  public static junit.framework.Test suite() throws Exception {
    System.out.println("Running tests for "+"org.conjur.jenkins:conjur-credentials:2.2.4");
    Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("basedir","/Users/sameer.shaik/MyWorkSpace/Github-Sonar-Qube-Code-Analysis10022025/SonarQube-Scanner-Analysis");
    parameters.put("artifactId","conjur-credentials");
    parameters.put("packaging","hpi");
    parameters.put("outputDirectory","/Users/sameer.shaik/MyWorkSpace/Github-Sonar-Qube-Code-Analysis10022025/SonarQube-Scanner-Analysis/target/classes");
    parameters.put("testOutputDirectory","/Users/sameer.shaik/MyWorkSpace/Github-Sonar-Qube-Code-Analysis10022025/SonarQube-Scanner-Analysis/target/test-classes");
    parameters.put("requirePI","true");
    return org.jvnet.hudson.test.PluginAutomaticTestBuilder.build(parameters);
  }
}
