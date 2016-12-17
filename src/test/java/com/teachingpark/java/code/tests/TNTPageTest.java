package com.teachingpark.java.code.tests;

import org.testng.annotations.Test;

import com.teachingpark.java.code.components.GalenTestBase;
import com.teachingpark.java.code.pages.LandingPage;

import java.io.IOException;


public class TNTPageTest extends GalenTestBase {

	LandingPage objLanding;
	
    @Test(dataProvider = "devices")
    public void TNTLandingPage_shouldLookGood_onDevice(TestDevice device) throws IOException, InterruptedException {
        load("");
        objLanding = new LandingPage(getDriver());
        Thread.sleep(5000);
        if((device.getName().equals("mobile"))||(device.getName().equals("tablet"))){
        	objLanding.clickMobileMenuToggle();
         }
        checkLayout("/specs/landingPage.spec", device.getTags());
        
        
    }
}
