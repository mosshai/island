What is "Island"
----------------

"Island" is a sandbox environment to clone selected apps and isolate them from accessing your personal data outside the sandbox (including call logs, contacts, photos and etc) even if related permissions are granted. Device-bound data (SMS, IMEI and etc) is still accessible.

Isolated app can be frozen on demand, with launcher icon vanish and its background behaviors completely blocked.


How does it work
----------------

Island takes advantage of the "managed profile" feature on Android 5.0+, which is also the base of "Android for Work", to create an isolated sandbox for apps with their data.

App needs to be cloned in Island first. Afterwards, the clone can run parallel aside from the original one. (even with different accounts signed-in) It can be frozen on demand by Island. **(NO ROOT REQUIRED)**

If [Greenify](https://play.google.com/store/apps/details?id=com.oasisfeng.greenify) is also installed, apps can be frozen automatically by "Auto-freeze with Greenify" action (in the overflow menu), just like normal app hibernation in Greenify.


Common use cases
----------------

- **Freeze frequently woken apps.** Clone it into Island and uninstall the original one outside. Then you can freeze it to fully block its background behaviors. Remember to create launch shortcut for quick de-freezing and launching.
- **Prevent permission-hungry apps from accessing your private data.** Sometimes runtime-permission may not be the solution, especially if the app refuses to work without certain permissions. App clones running in Island cannot access your contacts, call logs and sniff other apps outside. **But SMS and location are exceptions since they are bound to device.**
- **Use two accounts of the same app parallel.** Clone it into Island and login the other account inside.
- **Archive rarely used apps.** Like the first case, keep them frozen until the next time you need it.
- **Hide your private apps.**


Manual setup
------------

On most middle to high end Android devices released after 2016, Island can be setup straightforward without hassle. But still on some devices, you may got "incompatible with your device" message on Google Play Store, or be notified during the setup with error message "Sorry, your device (or ROM) is incompatible with Island". In both cases, Island could still work on your device if setup manually.

If you are prompted to encrypt your device first during the setup and you don't want device decription (which may significantly degrade overall I/O performance on low-end devices), this prerequisite could also be skipped if setup manually.

Please refer to [Manual setup](/setup.md) for prerequisites and detailed steps.


Experimental God mode
---------------------

In normal mode, Island only takes care of apps inside the Island space. The "God mode" is an experimental mode, in which Island takes control of **ALL** apps, both inside and outside Island space. For example, you can freeze any app without cloning it first.

It is highly experimental and not ready for normal users. At present it is only recommended for advanced users who is well understanding what is going on the device and how to deal with unforeseeable troubles.

The limitations in "God mode":

- Google Play Store is currently not working as expected, apps could not be installed inside.  
(We are investigating this issue)

- App Backup (Cloud backup for app data by Google Play services) will stop working.  
(We are working on a solution for Android 7.1+)

God mode could only be [setup manually](/setup.md).


Discussion and feedback
-----------------------

[XDA thread](https://forum.xda-developers.com/android/apps-games/closed-beta-test-incoming-companion-app-t3366295)


DISCLAIMER
----------

This beta version may be dangerous on some Android devices, it may cause boot-loop and even brick your device. The purpose of closed beta exclusive for advanced users is to widely test and improve the device compatibility. Don't install it on your daily device and remember to BACKUP FIRST.