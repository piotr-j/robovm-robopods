/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.facebook.core;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.webkit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FacebookCore/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(FacebookCore.class); }/*</bind>*/
    /*<constants>*/
    public static final String Constant__FBSDK_VERSION_STRING = "5.5.0";
    public static final String Constant__FBSDK_TARGET_PLATFORM_VERSION = "v4.0";
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKAccessTokenDidExpireKey", optional=true)
    public static native String Value__FBSDKAccessTokenDidExpireKey();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCategory", optional=true)
    public static native String Value__FBSDKAppEventParameterProductCategory();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCategory", optional=true)
    public static native void Value__FBSDKAppEventParameterProductCategory(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel0", optional=true)
    public static native String Value__FBSDKAppEventParameterProductCustomLabel0();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel0", optional=true)
    public static native void Value__FBSDKAppEventParameterProductCustomLabel0(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel1", optional=true)
    public static native String Value__FBSDKAppEventParameterProductCustomLabel1();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel1", optional=true)
    public static native void Value__FBSDKAppEventParameterProductCustomLabel1(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel2", optional=true)
    public static native String Value__FBSDKAppEventParameterProductCustomLabel2();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel2", optional=true)
    public static native void Value__FBSDKAppEventParameterProductCustomLabel2(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel3", optional=true)
    public static native String Value__FBSDKAppEventParameterProductCustomLabel3();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel3", optional=true)
    public static native void Value__FBSDKAppEventParameterProductCustomLabel3(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel4", optional=true)
    public static native String Value__FBSDKAppEventParameterProductCustomLabel4();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel4", optional=true)
    public static native void Value__FBSDKAppEventParameterProductCustomLabel4(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSUrl", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIOSUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSUrl", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkIOSUrl(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSAppStoreID", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIOSAppStoreID();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSAppStoreID", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkIOSAppStoreID(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSAppName", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIOSAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSAppName", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkIOSAppName(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneUrl", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIPhoneUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneUrl", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkIPhoneUrl(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneAppStoreID", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIPhoneAppStoreID();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneAppStoreID", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkIPhoneAppStoreID(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneAppName", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIPhoneAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneAppName", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkIPhoneAppName(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadUrl", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIPadUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadUrl", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkIPadUrl(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadAppStoreID", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIPadAppStoreID();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadAppStoreID", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkIPadAppStoreID(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadAppName", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIPadAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadAppName", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkIPadAppName(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidUrl", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkAndroidUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidUrl", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkAndroidUrl(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidPackage", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkAndroidPackage();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidPackage", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkAndroidPackage(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidAppName", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkAndroidAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidAppName", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkAndroidAppName(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneUrl", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkWindowsPhoneUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneUrl", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkWindowsPhoneUrl(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneAppID", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkWindowsPhoneAppID();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneAppID", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkWindowsPhoneAppID(String v);
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneAppName", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkWindowsPhoneAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneAppName", optional=true)
    public static native void Value__FBSDKAppEventParameterProductAppLinkWindowsPhoneAppName(String v);
    @GlobalValue(symbol="FBSDKAppEventEmail", optional=true)
    public static native String Value__FBSDKAppEventEmail();
    @GlobalValue(symbol="FBSDKAppEventEmail", optional=true)
    public static native void Value__FBSDKAppEventEmail(String v);
    @GlobalValue(symbol="FBSDKAppEventFirstName", optional=true)
    public static native String Value__FBSDKAppEventFirstName();
    @GlobalValue(symbol="FBSDKAppEventFirstName", optional=true)
    public static native void Value__FBSDKAppEventFirstName(String v);
    @GlobalValue(symbol="FBSDKAppEventLastName", optional=true)
    public static native String Value__FBSDKAppEventLastName();
    @GlobalValue(symbol="FBSDKAppEventLastName", optional=true)
    public static native void Value__FBSDKAppEventLastName(String v);
    @GlobalValue(symbol="FBSDKAppEventPhone", optional=true)
    public static native String Value__FBSDKAppEventPhone();
    @GlobalValue(symbol="FBSDKAppEventPhone", optional=true)
    public static native void Value__FBSDKAppEventPhone(String v);
    @GlobalValue(symbol="FBSDKAppEventDateOfBirth", optional=true)
    public static native String Value__FBSDKAppEventDateOfBirth();
    @GlobalValue(symbol="FBSDKAppEventDateOfBirth", optional=true)
    public static native void Value__FBSDKAppEventDateOfBirth(String v);
    @GlobalValue(symbol="FBSDKAppEventGender", optional=true)
    public static native String Value__FBSDKAppEventGender();
    @GlobalValue(symbol="FBSDKAppEventGender", optional=true)
    public static native void Value__FBSDKAppEventGender(String v);
    @GlobalValue(symbol="FBSDKAppEventCity", optional=true)
    public static native String Value__FBSDKAppEventCity();
    @GlobalValue(symbol="FBSDKAppEventCity", optional=true)
    public static native void Value__FBSDKAppEventCity(String v);
    @GlobalValue(symbol="FBSDKAppEventState", optional=true)
    public static native String Value__FBSDKAppEventState();
    @GlobalValue(symbol="FBSDKAppEventState", optional=true)
    public static native void Value__FBSDKAppEventState(String v);
    @GlobalValue(symbol="FBSDKAppEventZip", optional=true)
    public static native String Value__FBSDKAppEventZip();
    @GlobalValue(symbol="FBSDKAppEventZip", optional=true)
    public static native void Value__FBSDKAppEventZip(String v);
    @GlobalValue(symbol="FBSDKAppEventCountry", optional=true)
    public static native String Value__FBSDKAppEventCountry();
    @GlobalValue(symbol="FBSDKAppEventCountry", optional=true)
    public static native void Value__FBSDKAppEventCountry(String v);
    @GlobalValue(symbol="FBSDKGraphRequestErrorKey", optional=true)
    public static native String Value__FBSDKGraphRequestErrorKey();
    @GlobalValue(symbol="FBSDKHTTPMethodGET", optional=true)
    public static native String Value__FBSDKHTTPMethodGET();
    @GlobalValue(symbol="FBSDKHTTPMethodGET", optional=true)
    public static native void Value__FBSDKHTTPMethodGET(String v);
    @GlobalValue(symbol="FBSDKHTTPMethodPOST", optional=true)
    public static native String Value__FBSDKHTTPMethodPOST();
    @GlobalValue(symbol="FBSDKHTTPMethodPOST", optional=true)
    public static native void Value__FBSDKHTTPMethodPOST(String v);
    @GlobalValue(symbol="FBSDKHTTPMethodDELETE", optional=true)
    public static native String Value__FBSDKHTTPMethodDELETE();
    @GlobalValue(symbol="FBSDKHTTPMethodDELETE", optional=true)
    public static native void Value__FBSDKHTTPMethodDELETE(String v);
    @GlobalValue(symbol="FBSDKAppLinkVersion", optional=true)
    public static native String Value__FBSDKAppLinkVersion();
    @GlobalValue(symbol="FBSDKMeasurementEventNotification", optional=true)
    public static native String Value__FBSDKMeasurementEventNotification();
    @GlobalValue(symbol="FBSDKMeasurementEventNameKey", optional=true)
    public static native String Value__FBSDKMeasurementEventNameKey();
    @GlobalValue(symbol="FBSDKMeasurementEventArgsKey", optional=true)
    public static native String Value__FBSDKMeasurementEventArgsKey();
    @GlobalValue(symbol="FBSDKAppLinkParseEventName", optional=true)
    public static native String Value__FBSDKAppLinkParseEventName();
    @GlobalValue(symbol="FBSDKAppLinkNavigateInEventName", optional=true)
    public static native String Value__FBSDKAppLinkNavigateInEventName();
    @GlobalValue(symbol="FBSDKAppLinkNavigateOutEventName", optional=true)
    public static native String Value__FBSDKAppLinkNavigateOutEventName();
    @GlobalValue(symbol="FBSDKAppLinkNavigateBackToReferrerEventName", optional=true)
    public static native String Value__FBSDKAppLinkNavigateBackToReferrerEventName();
    /*</methods>*/
}
