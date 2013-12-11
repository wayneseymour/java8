/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home.research.java8;

import static home.research.java8.Colors.BLUE;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static org.hamcrest.CoreMatchers.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wayne
 */
public class SimpleLambdaTest {
    
    public SimpleLambdaTest() {
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

     @Test
     public void simpleLambda() throws Exception {
         List<Block> blocks = new ArrayList<>();
         blocks.add(new Block("blue"));
         blocks.add(new Block("blue"));
         
         blocks.add(new Block("red"));

         Stream<Block> blueBlocks = blocks.stream().filter(b -> b.getColor() == BLUE);
//                         .into(new ArrayList<>());
         blueBlocks.forEach(b -> { 
             assertThat(b.getColor(), is(Colors.BLUE));
         });
         blocks.forEach(b -> { b.setColor(Colors.RED); });
         blocks.forEach(b -> {
             System.out.println(b.getColor().name());
             assertThat(b.getColor(), is(Colors.RED));
         });
     }
}
