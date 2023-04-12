package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UserLogin
{
    public static Target USER_LABEL = Target.the("The username in the page")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/p[1]/strong"));
}
