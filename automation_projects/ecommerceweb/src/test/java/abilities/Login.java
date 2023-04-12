package abilities;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class Login implements Ability
{
    protected final String email;
    protected final String password;

    public Login(String email, String password)
    {
        this.email = email;
        this.password = password;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPassword()
    {
        return password;
    }
    public static Login with(String email, String password)
    {
        return new Login(email,password);
    }
    public static Login as(Actor actor)
    {
        return actor.abilityTo(Login.class);
    }
}
