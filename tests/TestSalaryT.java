package tests;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import src.SalaryT;

public class TestSalaryT {
    private SalaryT s1, s2, s3, s4, s5, s6;

    private String fn1, fn2, fn3, fn4, fn5, fn6;
    private String ln1, ln2, ln3, ln4, ln5, ln6;
    private String p1, p2, p3, p4, p5, p6;
    private String e1, e2, e3, e4, e5, e6;
    private String se1, se2, se3, se4, se5, se6;
    private double sa1, sa2, sa3, sa4, sa5, sa6;
    private double b1, b2, b3, b4, b5, b6;
    private int y1, y2, y3, y4, y5, y6;

    @Before
    public void setUp(){
        fn1 = "Bob"; fn2 = "Bob";
        
        ln1 = "Vagene"; ln2 = "Bob";

        p1 = "1st Class Constable/Fire Fighter"; p2 = "Bob";

        e1 = "City of Sarnia"; e2 = "Bob";

        se1 = "Colleges"; se2 = "Bob";

        sa1 = 102255.45; sa2 = Double.parseDouble("$2024.00");

        b1 = 214.02; b2 = 2024.00;

        y1 = 2019; y2 = 2024;

        s1 = new SalaryT(se1, fn1, ln1, sa1, b1, e1, p1, y1);
        s2 = new SalaryT(se2, fn2, ln2, sa2, b2, e2, p2, y2);
        // s3 = new SalaryT(se3, fn3, ln3, sa3, b3, e3, p3, y3);
        // s4 = new SalaryT(se4, fn4, ln4, sa4, b4, e4, p4, y4);
        // s5 = new SalaryT(se5, fn5, ln5, sa5, b5, e5, p5, y5);
        // s6 = new SalaryT(se6, fn6, ln6, sa6, b6, e6, p6, y6);
    }

    @After
    public void tearDown(){
        fn1 = null;
        fn2 = null;
        // fn3 = null;
        // fn4 = null;
        // fn5 = null;
        // fn6 = null;

        ln1 = null;
        ln2 = null;
        // ln3 = null;
        // ln4 = null;
        // ln5 = null;
        // ln6 = null;

        p1 = null;
        p2 = null;
        // p3 = null;
        // p4 = null;
        // p5 = null;
        // p6 = null;

        e1 = null;
        e2 = null;
        // e3 = null;
        // e4 = null;
        // e5 = null;
        // e6 = null;

        se1 = null;
        se2 = null;
        // se3 = null;
        // se4 = null;
        // se5 = null;
        // se6 = null;

        sa1 = null;
        sa2 = null;
        // sa3 = null;
        // sa4 = null;
        // sa5 = null;
        // sa6 = null;

        b1 = null;
        b2 = null;
        // b3 = null;
        // b4 = null;
        // b5 = null;
        // b6 = null;

        y1 = null;
        y2 = null;
        // y3 = null;
        // y4 = null;
        // y5 = null;
        // y6 = null;

        s1 = null;
        s2 = null;
        // s3 = null;
        // s4 = null;
        // s5 = null;
        // s6 = null;
    }

    @Test
    public void testName(){
        assertTrue(s1.getName().contentEquals("Vagene Bob"));
    }
}