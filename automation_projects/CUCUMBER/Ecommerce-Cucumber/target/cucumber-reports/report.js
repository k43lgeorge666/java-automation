$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BuyJacket.feature");
formatter.feature({
  "line": 1,
  "name": "buy a jacket",
  "description": "",
  "id": "buy-a-jacket",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4866827000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user buys a jacket successfully",
  "description": "",
  "id": "buy-a-jacket;user-buys-a-jacket-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user open the web application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user logs_in in the web page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user goes to the jackets page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user selects a jacket from the page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user perform a checkout for the selected item",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user should be notified that the buy was successful completed",
  "keyword": "Then "
});
formatter.match({
  "location": "BuyJacketSteps.user_open_the_webpage()"
});
formatter.result({
  "duration": 2583130700,
  "status": "passed"
});
formatter.match({
  "location": "BuyJacketSteps.the_user_provides_credentials()"
});
formatter.result({
  "duration": 5592987400,
  "status": "passed"
});
formatter.match({
  "location": "BuyJacketSteps.the_user_goes_to_the_jackets_page()"
});
formatter.result({
  "duration": 109806300,
  "error_message": "org.openqa.selenium.json.JsonException: java.lang.reflect.InvocationTargetException\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027DESKTOP-TKIFE1R\u0027, ip: \u0027192.168.20.160\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.json.JsonOutput.convertUsingMethod(JsonOutput.java:344)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$15(JsonOutput.java:147)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:275)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$21(JsonOutput.java:162)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)\r\n\tat java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)\r\n\tat java.util.Iterator.forEachRemaining(Iterator.java:116)\r\n\tat java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:418)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$22(JsonOutput.java:162)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:275)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$23(JsonOutput.java:175)\r\n\tat com.google.common.collect.SingletonImmutableBiMap.forEach(SingletonImmutableBiMap.java:65)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$24(JsonOutput.java:170)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:275)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:266)\r\n\tat org.openqa.selenium.json.Json.toJson(Json.java:40)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:255)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:129)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:155)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:652)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:613)\r\n\tat org.openqa.selenium.interactions.Actions.perform(Actions.java:569)\r\n\tat PageObjects.Buy.BuyJacketServices.Click_on_men_jackets_option_tab(BuyJacketServices.java:36)\r\n\tat StepDefinitions.Buy.BuyJacketSteps.the_user_goes_to_the_jackets_page(BuyJacketSteps.java:26)\r\n\tat ✽.And the user goes to the jackets page(BuyJacket.feature:6)\r\n\tSuppressed: org.openqa.selenium.json.JsonException: Attempting to close incomplete json stream\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027DESKTOP-TKIFE1R\u0027, ip: \u0027192.168.20.160\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\t\tat org.openqa.selenium.json.JsonOutput.close(JsonOutput.java:291)\r\n\t\tat org.openqa.selenium.json.Json.toJson(Json.java:38)\r\n\t\tat org.openqa.selenium.remote.codec.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:255)\r\n\t\tat org.openqa.selenium.remote.codec.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:129)\r\n\t\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:155)\r\n\t\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\t\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\t\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:652)\r\n\t\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:613)\r\n\t\tat org.openqa.selenium.interactions.Actions.perform(Actions.java:569)\r\n\t\tat PageObjects.Buy.BuyJacketServices.Click_on_men_jackets_option_tab(BuyJacketServices.java:36)\r\n\t\tat StepDefinitions.Buy.BuyJacketSteps.the_user_goes_to_the_jackets_page(BuyJacketSteps.java:26)\r\n\t\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\t\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\t\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\t\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\t\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\t\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\t\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\t\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\t\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\t\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\t\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\t\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\t\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\t\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\t\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\t\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\t\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\t\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\t\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\t\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\t\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\t\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\t\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\t\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\t\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\t\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\t\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\t\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\t\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\t\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\t\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\t\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\t\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:252)\r\n\t\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)\r\n\t\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)\r\n\t\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\t\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\t\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\t\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\t\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)\r\n\t\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)\r\n\t\tat org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)\r\n\t\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)\r\n\t\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.json.JsonOutput.convertUsingMethod(JsonOutput.java:340)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$15(JsonOutput.java:147)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:275)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$21(JsonOutput.java:162)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)\r\n\tat java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)\r\n\tat java.util.Iterator.forEachRemaining(Iterator.java:116)\r\n\tat java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:418)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$22(JsonOutput.java:162)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:275)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$23(JsonOutput.java:175)\r\n\tat com.google.common.collect.SingletonImmutableBiMap.forEach(SingletonImmutableBiMap.java:65)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$24(JsonOutput.java:170)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:275)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:266)\r\n\tat org.openqa.selenium.json.Json.toJson(Json.java:40)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:255)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:129)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:155)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:652)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:613)\r\n\tat org.openqa.selenium.interactions.Actions.perform(Actions.java:569)\r\n\tat PageObjects.Buy.BuyJacketServices.Click_on_men_jackets_option_tab(BuyJacketServices.java:36)\r\n\tat StepDefinitions.Buy.BuyJacketSteps.the_user_goes_to_the_jackets_page(BuyJacketSteps.java:26)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:252)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: #ui\\-id\\-5\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027DESKTOP-TKIFE1R\u0027, ip: \u0027192.168.20.160\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 108.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20221215175817, moz:geckodriverVersion: 0.32.0, moz:headless: false, moz:platformVersion: 10.0, moz:processID: 1756, moz:profile: C:\\Users\\george\\AppData\\Loc..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, moz:windowless: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 3b1c0dae-170a-4b1b-95ec-833767e01e7a\n*** Element info: {Using\u003did, value\u003dui-id-5}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:381)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:194)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:325)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy20.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.interactions.PointerInput$Origin.asArg(PointerInput.java:204)\r\n\tat org.openqa.selenium.interactions.PointerInput$Move.encode(PointerInput.java:155)\r\n\tat org.openqa.selenium.interactions.Sequence.encode(Sequence.java:73)\r\n\tat org.openqa.selenium.interactions.Sequence.toJson(Sequence.java:82)\r\n\t... 80 more\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BuyJacketSteps.the_user_selects_a_jacket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BuyJacketSteps.the_user_perform_a_checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BuyJacketSteps.the_buy_is_completed_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4037167400,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "user login",
  "description": "",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3008134900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user login successfully",
  "description": "",
  "id": "user-login;user-login-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user open the webapp",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user goes to Sign In tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user provides email and password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user should be logged successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_open_the_webpage()"
});
formatter.result({
  "duration": 1943996200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_user_goes_to_the_Sign_In_tab()"
});
formatter.result({
  "duration": 2616608300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_user_provides_credentials()"
});
formatter.result({
  "duration": 10490068300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_username_text_should_be_displayed()"
});
formatter.result({
  "duration": 29203600,
  "status": "passed"
});
formatter.after({
  "duration": 3138910200,
  "status": "passed"
});
formatter.uri("signup.feature");
formatter.feature({
  "line": 1,
  "name": "user sign up",
  "description": "",
  "id": "user-sign-up",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3013322900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user sign up successfully",
  "description": "",
  "id": "user-sign-up;user-sign-up-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user goes to the create account tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user provides the required information",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user should be notified that the account was created",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpSteps.user_open_the_webpage()"
});
formatter.result({
  "duration": 4425628500,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.the_user_clicks_on_the_create_account_tab()"
});
formatter.result({
  "duration": 976316800,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.the_user_provides_the_required_information()"
});
formatter.result({
  "duration": 10290486500,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.the_successful_message_should_be_displayed()"
});
formatter.result({
  "duration": 7561700,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: //div[contains(text(),\u0027Thank you for registering with Fake Online Clothing Store.\u0027)]\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027DESKTOP-TKIFE1R\u0027, ip: \u0027192.168.20.160\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 108.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20221215175817, moz:geckodriverVersion: 0.32.0, moz:headless: false, moz:platformVersion: 10.0, moz:processID: 9628, moz:profile: C:\\Users\\george\\AppData\\Loc..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, moz:windowless: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 08e62f49-0972-4193-880a-5b8164e67612\n*** Element info: {Using\u003dxpath, value\u003d//div[contains(text(),\u0027Thank you for registering with Fake Online Clothing Store.\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:451)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:394)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:325)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy20.getText(Unknown Source)\r\n\tat PageObjects.SignUp.SignUpServices.Verify_the_message_displayed(SignUpServices.java:37)\r\n\tat StepDefinitions.SignUp.SignUpSteps.the_successful_message_should_be_displayed(SignUpSteps.java:34)\r\n\tat ✽.Then the user should be notified that the account was created(signup.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 3488917900,
  "status": "passed"
});
});