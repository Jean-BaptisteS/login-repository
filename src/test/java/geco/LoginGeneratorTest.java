package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService ls = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
    private LoginGenerator lg = new LoginGenerator(ls);

    @Test
    public void generateLoginPaulDurand() {
        lg.generateLoginForNomAndPrenom("Durand", "Paul");
        assertTrue("PDUR a ete ajoute", ls.loginExists("PDUR"));
    }

    @Test
    public void addLoginJRAL() {
        lg.generateLoginForNomAndPrenom("Ralling", "John");
        assertTrue("JRAL2 a ete ajoute", ls.loginExists("JRAL2"));
    }

    @Test
    public void addLoginJROL1() {
        lg.generateLoginForNomAndPrenom("Rolling", "John");
        assertTrue("JROL1 a ete ajoute", ls.loginExists("JROL1"));
    }

    @Test
    public void addLoginPDUR() {
        lg.generateLoginForNomAndPrenom("Dùrand", "Paul");
        assertTrue("PDUR a ete ajoute", ls.loginExists("PDUR"));
    }
}