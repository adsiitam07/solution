package mx.com.itam.adsi;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Prubas unitarias para Solution
 */
public class SolutionTest
{
     private final static Logger LOG = Logger.getLogger(SolutionTest.class);
     Solution sol = new

    @Test
    public void prueba1()
    {
        assertTrue("Verifica abab", Solution.problema("abab"));
    }
    
    @Test
    public void prueba2()
    {
        assertTrue("Verifica gustavogustavogustavo", Solution.problema("gustavogustavogustavo"));
    }
    
    @Test
    public void prueba3()
    {
        assertTrue("Verifica ababa", Solution.problema("ababa"));
    }
    
    @Test
    public void prueba3()
    {
        assertTrue("Verifica ferferferferfe", Solution.problema("ferferferferfe"));
    }
}
