import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

class Greeting {

  var name:String = "x"
  var res:String = "x"

  @Given("^Name$")
  def createName(): Unit = {
     name = "Steve"
  }

  @When("^Pass name to function$")
  def passName(): Unit = {
     res = example.Greeting.greeting(name)
  }

  @Then("^Response should be hello world Steve$")
  def checkMessage() = Assert.assertEquals(res, "Hello World, Steve")

}
