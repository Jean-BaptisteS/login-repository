package geco;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private String[] tab = {"toto","titi", "tutu"};
    private LoginService ls = new LoginService(tab);

    @Test
    public void loginExists() {
        assertTrue("toto existe dans le ls", ls.loginExists("toto"));
    }

    @Test
    public void addLogin() {
        ls.addLogin("abcd");
        assertTrue("abcd a ete ajoute dans ls", ls.loginExists("abcd"));
    }

    @Test
    public void findAllLoginsStartingWith() {
        ArrayList res = new ArrayList<String>();
        res.add("toto");
        assertEquals("toto est le seul qui commence par to", res, ls.findAllLoginsStartingWith("to"));
    }

    @Test
    public void findAllLogins() {
        ArrayList res = new ArrayList<String>();
        res.add("titi");
        res.add("toto");
        res.add("tutu");
        assertEquals("tous les logins sont la", res, ls.findAllLogins());
    }
}