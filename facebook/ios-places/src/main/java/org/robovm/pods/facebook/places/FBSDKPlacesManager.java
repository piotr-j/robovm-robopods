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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKPlacesManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKPlacesManagerPtr extends Ptr<FBSDKPlacesManager, FBSDKPlacesManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKPlacesManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKPlacesManager() {}
    protected FBSDKPlacesManager(Handle h, long handle) { super(h, handle); }
    protected FBSDKPlacesManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "generatePlaceSearchRequestForSearchTerm:categories:fields:distance:cursor:completion:")
    public native void generatePlaceSearchRequest(String searchTerm, NSArray<NSString> categories, NSArray<NSString> fields, double distance, String cursor, @Block VoidBlock3<IntPtr, CLLocation, NSError> completion);
    @Method(selector = "placeSearchRequestForLocation:searchTerm:categories:fields:distance:cursor:")
    public native NSObject placeSearchRequest(CLLocation location, String searchTerm, NSArray<NSString> categories, NSArray<NSString> fields, double distance, String cursor);
    @Method(selector = "generateCurrentPlaceRequestWithMinimumConfidenceLevel:fields:completion:")
    public native void generateCurrentPlaceRequest(FBSDKPlaceLocationConfidence minimumConfidence, NSArray<NSString> fields, @Block VoidBlock2<IntPtr, NSError> completion);
    @Method(selector = "generateCurrentPlaceRequestForCurrentLocation:withMinimumConfidenceLevel:fields:completion:")
    public native void generateCurrentPlaceRequest(CLLocation currentLocation, FBSDKPlaceLocationConfidence minimumConfidence, NSArray<NSString> fields, @Block VoidBlock2<IntPtr, NSError> completion);
    @Method(selector = "currentPlaceFeedbackRequestForPlaceID:tracking:wasHere:")
    public native NSObject currentPlaceFeedbackRequest(String placeID, String tracking, boolean wasHere);
    @Method(selector = "placeInfoRequestForPlaceID:fields:")
    public native NSObject placeInfoRequest(String placeID, NSArray<NSString> fields);
    /*</methods>*/
}
