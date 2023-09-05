![status: Active](https://img.shields.io/badge/status-active-green.svg)
![status: Branch](https://img.shields.io/badge/branch-poorBehavior-lightgrey.svg)
![status: Development Release](https://img.shields.io/badge/Dev_Release-0.1.0-orange.svg)
![status: Google Play Release](https://img.shields.io/badge/Google_Play_Release-No-red.svg)

# EMMTools for Android

EMMTools is an application designed to help EMM Admins & ISVs validate Knox Asset Intelligence ('KAI') deployments in an Automated way.
EMM tools will behave like a normal android application, or can behave poorly via a preference change locally or remotely via the MDM.  This can help EMM admins validate their KAI deployments if they have no applications that behave poorly.
Note that there is no affiliation with Samsung.

See the [Documentation](https://www.samsungknox.com/en/solutions/it-solutions/knox-asset-intelligence) for getting started with the Samsung Knox Asset Intelligence.

## Features

To log a new feature click the [New Feature](https://github.com/mattintech/android-knoxapitest-kotlin/issues/new?title=[FER]%20Your%20Feature%20Name)

### Current
-- None
### Roadmap 
Here are a a list of features expected

0.1.0
- Poor app behavior:
   - Application Crashing
   - Application Not responding

0.2.0
 - Recurring Downloads 
   - Force transport (Wi-Fi vs Cellular)

0.3.0
 - Battery Drainer
   - Max Screen brightness
   - WiFi Scanning
   - Downloading
   - WakeLock

TBD
 - App usage (Foreground & background)
 - AppConfig - (EMM Control of test configurations)
 - Multi-Language support
   - If you want to help add a new language please view the [strings.xml](https://github.com/mattintech/android-emmtools-kotlin/blob/master/app/src/main/res/values/strings.xml).
   - Submit a new strings.xml via a pull request or contacting me directly [here.](https://mattintech.com/contact)

## Getting Started

EMM tools can be used with and without an EMM.  It is available in Google play [here.](https://play.google.com/store/apps/details?id=com.mattintech.emmtools)
If you have experience with Android studio you can also compile and sideload the application as well.

## Support
If you've found an error in this example, or have a suggestion please file an issue:
https://github.com/mattintech/android-emmtools-kotlin/issues

Patches are encouraged, and may be submitted by forking this project and submitting a pull request through GitHub.

## License
Licensed under the MIT license. See the LICENSE file for details.

## How to make contributions?
Please read and follow the steps in the CONTRIB file.

## Was this helpful?
If you found this repository helpful feel that is great, I am glad.  If you are able to and would to [buy me a coffee](https://www.buymeacoffee.com/mattintech) I would appreciate it.