package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void iWaitHour(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        throw new RuntimeException("Booo");
    }

    @Then("^my belly should growl$")
    public void myBellyShouldGrowl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }
}
