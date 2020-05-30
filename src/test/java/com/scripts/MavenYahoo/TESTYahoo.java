package com.scripts.MavenYahoo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.MavenYahoo.BaseTest;
import com.pages.MavenYahoo.POMFramework;

public class TESTYahoo extends BaseTest{
    
	@Test
     public void yahoo() throws IOException, InterruptedException {
		POMFramework pf = new POMFramework(driver);
		pf.enterDetails();
	}
}
