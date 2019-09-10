# RoboPods for Facebook

Build, grow, and monetize your app with Facebook. The Facebook SDK allows you to natively integrate Facebook into your app.

## Available RoboPods

| Platform                          | Version  | Description                                         |
|---------------------------------|----------|-----------------------------------------------------|
| [ios](ios/)                       | 5.50.0   | Facebook iOS (all frameworks bu AudienceNetwork)   |
| [ios-audience](ios-audience/)     | 5.5.0   | Facebook iOS AudienceNetwork Framework              |
| [ios-core](ios-core/)             | 5.50.0   | Facebook iOS CoreKit Framework                      |
| [ios-login](ios-login/)           | 5.50.0   | Facebook iOS LoginKit Framework                     |
| [ios-places](ios-places/)         | 5.50.0   | Facebook iOS PlacesKit Framework                    |
| [ios-share](ios-share/)           | 5.50.0   | Facebook iOS ShareKit Framework                     |

## Official website

https://developers.facebook.com/

## Integration

You can include any or all of the above components of the Facebook SDK. To integrate the entire SDK into your project requires a few steps.

First, add the dependencies to either the root or the module `build.gradle` file.

```gradle
dependencies {
   ... other dependencies ...
   compile "com.mobidevelop.robovm:robopods-facebook-ios:$robopodsVersion"
   compile "com.mobidevelop.robovm:robopods-facebook-ios-audience:$robopodsVersion"
}
```

Next we need to add the SDK to the project. Download the Facebook SDK for iOS from [here](https://developers.facebook.com/docs/ios/downloads) and Audience SDK for iOS from [here](https://developers.facebook.com/docs/audience-network/download). Make sure you download the correct version, referenced above.

Extract the .zip and copy all the `.framework` folders into you project in `ios/libs`. Create the `libs` folder if it doesn't exist.

Now we need to update the `robovm.xml` file to tell it to include the Facebook SDK in the project. We need to include the libs folder in the `frameworkPaths` and include the framework within the `frameworks` as shown below.

```
<config>
  ... other sections ...
  <frameworkPaths>
    <path>libs</path>
  </frameworkPaths>
  <frameworks>
     ... other frameworks ...
    <framework>FBSDKCoreKit</framework>
  </frameworks>
</config>

```

You're ready to go.
