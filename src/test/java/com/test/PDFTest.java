/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;


import static com.mycompany.mergepdf.MergePDF.doMerge;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author home
 */
public class PDFTest {

    public PDFTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void doMergeTest() {

        List<InputStream> list = new ArrayList<InputStream>();

        try {

            // Source pdfs
            list.add(new FileInputStream(new File("c:/Temp/file1.pdf")));
            list.add(new FileInputStream(new File("c:/Temp/file2.pdf")));

            // Resulting pdf
            OutputStream out = new FileOutputStream(new File("c:/Temp/result.pdf"));

            doMerge(list, out);

        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(false);
        }

    }
}
