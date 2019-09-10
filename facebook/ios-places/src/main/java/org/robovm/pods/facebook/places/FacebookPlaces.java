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
package org.robovm.pods.facebook.places;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.accounts.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FacebookPlaces/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(FacebookPlaces.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKPlacesFieldKeyAbout", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyAbout();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyAbout", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyAbout(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyAppLinks", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyAppLinks();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyAppLinks", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyAppLinks(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyCategories", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyCategories();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyCategories", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyCategories(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyCheckins", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyCheckins();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyCheckins", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyCheckins(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyConfidence", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyConfidence();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyConfidence", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyConfidence(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyCoverPhoto", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyCoverPhoto();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyCoverPhoto", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyCoverPhoto(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyDescription", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyDescription();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyDescription", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyDescription(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyEngagement", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyEngagement();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyEngagement", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyEngagement(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyHours", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyHours();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyHours", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyHours(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyIsAlwaysOpen", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyIsAlwaysOpen();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyIsAlwaysOpen", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyIsAlwaysOpen(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyIsPermanentlyClosed", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyIsPermanentlyClosed();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyIsPermanentlyClosed", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyIsPermanentlyClosed(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyIsVerified", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyIsVerified();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyIsVerified", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyIsVerified(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyLocation", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyLocation();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyLocation", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyLocation(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyLink", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyLink();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyLink", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyLink(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyName", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyName();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyName", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyName(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyOverallStarRating", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyOverallStarRating();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyOverallStarRating", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyOverallStarRating(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPage", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyPage();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPage", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyPage(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyParking", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyParking();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyParking", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyParking(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPaymentOptions", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyPaymentOptions();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPaymentOptions", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyPaymentOptions(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPlaceID", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyPlaceID();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPlaceID", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyPlaceID(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPhone", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyPhone();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPhone", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyPhone(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPhotos", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyPhotos();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPhotos", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyPhotos(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPriceRange", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyPriceRange();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyPriceRange", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyPriceRange(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyProfilePhoto", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyProfilePhoto();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyProfilePhoto", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyProfilePhoto(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyRatingCount", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyRatingCount();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyRatingCount", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyRatingCount(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyRestaurantServices", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyRestaurantServices();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyRestaurantServices", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyRestaurantServices(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyRestaurantSpecialties", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyRestaurantSpecialties();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyRestaurantSpecialties", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyRestaurantSpecialties(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeySingleLineAddress", optional=true)
    public static native String Value__FBSDKPlacesFieldKeySingleLineAddress();
    @GlobalValue(symbol="FBSDKPlacesFieldKeySingleLineAddress", optional=true)
    public static native void Value__FBSDKPlacesFieldKeySingleLineAddress(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyWebsite", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyWebsite();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyWebsite", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyWebsite(String v);
    @GlobalValue(symbol="FBSDKPlacesFieldKeyWorkflows", optional=true)
    public static native String Value__FBSDKPlacesFieldKeyWorkflows();
    @GlobalValue(symbol="FBSDKPlacesFieldKeyWorkflows", optional=true)
    public static native void Value__FBSDKPlacesFieldKeyWorkflows(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyCity", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyCity();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyCity", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyCity(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyCityID", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyCityID();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyCityID", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyCityID(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyCountry", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyCountry();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyCountry", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyCountry(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyCountryCode", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyCountryCode();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyCountryCode", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyCountryCode(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyLatitude", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyLatitude();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyLatitude", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyLatitude(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyLongitude", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyLongitude();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyLongitude", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyLongitude(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyRegion", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyRegion();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyRegion", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyRegion(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyRegionID", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyRegionID();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyRegionID", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyRegionID(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyState", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyState();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyState", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyState(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyStreet", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyStreet();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyStreet", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyStreet(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyZip", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyZip();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyZip", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyZip(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyMatchedCategories", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyMatchedCategories();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyMatchedCategories", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyMatchedCategories(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyPhotoSource", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyPhotoSource();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyPhotoSource", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyPhotoSource(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyData", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyData();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyData", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyData(String v);
    @GlobalValue(symbol="FBSDKPlacesResponseKeyUrl", optional=true)
    public static native String Value__FBSDKPlacesResponseKeyUrl();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyUrl", optional=true)
    public static native void Value__FBSDKPlacesResponseKeyUrl(String v);
    @GlobalValue(symbol="FBSDKPlacesParameterKeySummary", optional=true)
    public static native String Value__FBSDKPlacesParameterKeySummary();
    @GlobalValue(symbol="FBSDKPlacesParameterKeySummary", optional=true)
    public static native void Value__FBSDKPlacesParameterKeySummary(String v);
    @GlobalValue(symbol="FBSDKPlacesSummaryKeyTracking", optional=true)
    public static native String Value__FBSDKPlacesSummaryKeyTracking();
    @GlobalValue(symbol="FBSDKPlacesSummaryKeyTracking", optional=true)
    public static native void Value__FBSDKPlacesSummaryKeyTracking(String v);
    /*</methods>*/
}
