/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tummosoft;

import anywheresoftware.b4a.BA;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.*;
import anywheresoftware.b4a.objects.streams.File;
import anywheresoftware.b4a.BA.Events;
/**
 *
 * @author hienh
 */
@BA.ShortName("jSeleniumEventHandler")
//@DependsOn(values={"some java library "})
//@ActivityObject
// Giai thich
@Hide
public class jSeleniumEventHandler implements WebDriverEventListener {
    BA baEvent;
    String eventAfterClickOn;
    String eventbeforeAlertAccept;
    String eventAfterAlertDismiss;
    String eventBeforeAlertDismiss;
    String eventBeforeNavigateTo;
    String eventBeforeNavigateBack;
    String eventAfterNavigateBack;
    String eventbeforeNavigateForward;
    String eventAfterNavigateForward;
    String eventBeforeNavigateRefresh;
    String eventBeforeFindBy;
    String eventAfterFindBy;
    String eventBeforeClickOn;
    String eventBeforeChangeValueOf;
    String eventAfterChangeValueOf;
    String eventBeforeScript;
    String eventAfterScript;
    String eventBeforeSwitchToWindow;
    String eventAfterSwitchToWindow;
    String eventOnException;
    String eventBeforeGetScreenshotAs;
    String eventAfterGetScreenshotAs;
    String eventBeforeGetText;
    String eventAfterGetText;
    String eventAfterNavigateTo;
        
    public jSeleniumEventHandler(BA ba, String sEvent) {
       baEvent = ba; 
       eventAfterClickOn = sEvent + "_AfterClickOn";
       eventAfterClickOn =  eventAfterClickOn.toLowerCase(BA.cul);
       eventbeforeAlertAccept = sEvent + "_BeforeAlertAccept";
       eventbeforeAlertAccept = eventbeforeAlertAccept.toLowerCase(BA.cul);
       eventAfterAlertDismiss = sEvent + "_AfterAlertDismiss";
       eventAfterAlertDismiss = eventAfterAlertDismiss.toLowerCase(BA.cul);
       eventBeforeAlertDismiss = sEvent + "_AfterAlertDismiss";
       eventBeforeAlertDismiss = eventBeforeAlertDismiss.toLowerCase(BA.cul);
       eventBeforeNavigateTo = sEvent + "_BeforeNavigateTo";
       eventBeforeNavigateTo = eventBeforeNavigateTo.toLowerCase(BA.cul);
       eventBeforeNavigateBack = sEvent + "_BeforeNavigateBack";
       eventBeforeNavigateBack = eventBeforeNavigateBack.toLowerCase(BA.cul);
       eventAfterNavigateBack = sEvent + "_AfterNavigateBack";
       eventAfterNavigateBack = eventAfterNavigateBack.toLowerCase(BA.cul);
       eventbeforeNavigateForward = sEvent + "_BeforeNavigateForward";
       eventbeforeNavigateForward = eventbeforeNavigateForward.toLowerCase(BA.cul);
       eventAfterNavigateForward = sEvent + "_AfterNavigateForward";
       eventAfterNavigateForward = eventAfterNavigateForward.toLowerCase(BA.cul);
       eventBeforeNavigateRefresh = sEvent + "_BeforeNavigateRefresh";
       eventBeforeNavigateRefresh = eventBeforeNavigateRefresh.toLowerCase(BA.cul);
       eventBeforeFindBy = sEvent + "_BeforeFindBy";
       eventBeforeFindBy = eventBeforeFindBy.toLowerCase(BA.cul);
       eventAfterFindBy = sEvent + "_AfterFindBy";
       eventAfterFindBy = eventAfterFindBy.toLowerCase(BA.cul);
       eventBeforeClickOn = sEvent + "_BeforeClickOn";
       eventBeforeClickOn = eventBeforeClickOn.toLowerCase(BA.cul);
       eventBeforeChangeValueOf = sEvent + "_BeforeChangeValueOf";
       eventBeforeChangeValueOf = eventBeforeClickOn.toLowerCase(BA.cul);
       eventAfterChangeValueOf = sEvent + "_AfterChangeValueOf";
       eventAfterChangeValueOf = eventAfterChangeValueOf.toLowerCase(BA.cul);
       eventBeforeScript = sEvent + "_BeforeScript";
       eventBeforeScript = eventBeforeScript.toLowerCase(BA.cul);
       eventAfterScript = sEvent + "_AfterScript";
       eventAfterScript = eventAfterScript.toLowerCase(BA.cul);
       eventBeforeSwitchToWindow = sEvent + "_BeforeSwitchToWindow";
       eventBeforeSwitchToWindow = eventBeforeSwitchToWindow.toLowerCase(BA.cul);
       eventAfterSwitchToWindow = sEvent + "_AfterSwitchToWindow";
       eventAfterSwitchToWindow = eventAfterSwitchToWindow.toLowerCase(BA.cul);
       eventOnException = sEvent + "_OnException";
       eventOnException = eventOnException.toLowerCase(BA.cul);
       eventBeforeGetScreenshotAs = sEvent + "_BeforeGetScreenshotAs";
       eventBeforeGetScreenshotAs = eventBeforeGetScreenshotAs.toLowerCase(BA.cul);
       eventAfterGetScreenshotAs = sEvent + "_AfterGetScreenshotAs";
       eventAfterGetScreenshotAs = eventAfterGetScreenshotAs.toLowerCase(BA.cul);
       eventBeforeGetText = sEvent + "_BeforeGetText";
       eventBeforeGetText = eventBeforeGetText.toLowerCase(BA.cul);
       eventAfterGetText  = sEvent + "_AfterGetText";
       eventAfterNavigateTo = sEvent + "_AfterNavigateTo";
       eventAfterNavigateTo = eventAfterNavigateTo.toLowerCase(BA.cul);
    }
    
    @Hide
    public void beforeAlertAccept(WebDriver driver) {
        if (baEvent.subExists(eventbeforeAlertAccept)) {
        baEvent.raiseEvent(null, eventbeforeAlertAccept);}	
    }

    public void afterAlertAccept(WebDriver driver) {
        if (baEvent.subExists(eventbeforeAlertAccept)) {
	baEvent.raiseEvent(null, eventbeforeAlertAccept);}		
    }

    public void afterAlertDismiss(WebDriver driver) {
        if (baEvent.subExists(eventAfterAlertDismiss)) {
        baEvent.raiseEvent(null, eventAfterAlertDismiss);}
    }

    public void beforeAlertDismiss(WebDriver driver) {
        if (baEvent.subExists(eventBeforeAlertDismiss)) {
        baEvent.raiseEvent(null, eventBeforeAlertDismiss);}	
    }

    public void beforeNavigateTo(String url, WebDriver driver) {
        if (baEvent.subExists(eventBeforeNavigateTo)) {
        baEvent.raiseEvent(null, eventBeforeNavigateTo, url);}
    }

    public void afterNavigateTo(String url, WebDriver driver) {
        if (baEvent.subExists(eventAfterNavigateTo)) {
        baEvent.raiseEvent(null, eventAfterNavigateTo, driver.getCurrentUrl());}		
    }

    public void beforeNavigateBack(WebDriver driver) {		
        if (baEvent.subExists(eventBeforeNavigateBack)) {
	baEvent.raiseEvent(null, eventBeforeNavigateBack);}		
    }

    public void afterNavigateBack(WebDriver driver) {
        if (baEvent.subExists(eventAfterNavigateBack)) {
	baEvent.raiseEvent(null, eventAfterNavigateBack);}
    }

    public void beforeNavigateForward(WebDriver driver) {
        if (baEvent.subExists(eventbeforeNavigateForward)) {
        baEvent.raiseEvent(null, eventbeforeNavigateForward);}
    }

    public void afterNavigateForward(WebDriver driver) {
        if (baEvent.subExists(eventAfterNavigateForward)) {
	baEvent.raiseEvent(null, eventAfterNavigateForward);}   
    }

    public void beforeNavigateRefresh(WebDriver driver) {
        if (baEvent.subExists(eventBeforeNavigateRefresh)) {
	baEvent.raiseEvent(null, eventBeforeNavigateRefresh);}
    }

    public void afterNavigateRefresh(WebDriver driver) { 
        if (baEvent.subExists(eventBeforeNavigateRefresh)) {
    	baEvent.raiseEvent(null, eventBeforeNavigateRefresh);}        		
    }

    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        if (baEvent.subExists(eventBeforeFindBy)) {
	baEvent.raiseEvent(null, eventBeforeFindBy);}
    }

    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        if (baEvent.subExists(eventAfterFindBy)) {
	baEvent.raiseEvent(null, eventAfterFindBy);}	
    }

    public void beforeClickOn(WebElement element, WebDriver driver) {
        if (baEvent.subExists(eventBeforeClickOn)) {
    	baEvent.raiseEvent(null, eventBeforeClickOn);}
		
    }

    public void afterClickOn(WebElement element, WebDriver driver) {
        if (baEvent.subExists(eventAfterClickOn)) {
	baEvent.raiseEvent(this, eventAfterClickOn);}		
    }

    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        if (baEvent.subExists(eventBeforeChangeValueOf)) {
        baEvent.raiseEvent(this, eventBeforeChangeValueOf, keysToSend.toString());}		        
    }

    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        if (baEvent.subExists(eventAfterChangeValueOf)) {
	baEvent.raiseEvent(this, eventAfterChangeValueOf, keysToSend.toString());}	        
    }

    public void beforeScript(String script, WebDriver driver) {
        if (baEvent.subExists(eventBeforeScript)) {
        baEvent.raiseEvent(this, eventBeforeScript, script);}
    }

    public void afterScript(String script, WebDriver driver) {
        if (baEvent.subExists(eventAfterScript)) {
	baEvent.raiseEvent(this, eventAfterScript, script);}
    }

    public void beforeSwitchToWindow(String windowName, WebDriver driver) {
        if (baEvent.subExists(eventBeforeSwitchToWindow)) {
	baEvent.raiseEvent(this, eventBeforeSwitchToWindow, windowName);}
    }

    public void afterSwitchToWindow(String windowName, WebDriver driver) {
        if (baEvent.subExists(eventAfterSwitchToWindow)) {
	baEvent.raiseEvent(this, eventAfterSwitchToWindow, windowName);}
    }

    public void onException(Throwable throwable, WebDriver driver) {
        if (baEvent.subExists(eventOnException)) {
        baEvent.raiseEvent(this, eventOnException, throwable.getCause());}
    }

    public <X> void beforeGetScreenshotAs(OutputType<X> target) {
        if (baEvent.subExists(eventBeforeGetScreenshotAs)) {
	baEvent.raiseEvent(this, eventBeforeGetScreenshotAs);}
    }

    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
        if (baEvent.subExists(eventAfterGetScreenshotAs)) {
        baEvent.raiseEvent(this, eventAfterGetScreenshotAs);}
    }

    public void beforeGetText(WebElement element, WebDriver driver) {
        if (baEvent.subExists(eventBeforeGetText)) {
        baEvent.raiseEvent(this, eventBeforeGetText);}
    }

    public void afterGetText(WebElement element, WebDriver driver, String text) {
        if (baEvent.subExists(eventAfterGetText)) {
	baEvent.raiseEvent(this, eventAfterGetText, text);}
    }   
}
