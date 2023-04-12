package PageObjects;

import Tests.LoginToPage;
import net.thucydides.core.annotations.Step;

public class HomePage
{
    TestCode home;
    @Step("This step is for enter email and password")
    public void EnterCredentials()
    {
        home.EnterEmailAndPassword();
    }
    @Step
    public void VerifyDashboard()
    {
        home.VerifyDashboard();
    }
}
