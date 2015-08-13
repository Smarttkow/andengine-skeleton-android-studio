#AndEngine Ready To Use Skeleton

##Credits
Charles Smartt Jr. & Jordan Dickow of [SmarttKow LLC](http://smarttkow.com)

##Summary
The following is a compile-ready source code set for andEngine and andEnginePhysicsBox2DExtension that is for use in Android Studio only. The JNI native extensions have been compiled and are included, and all that is needed is to begin writing your game. This is a skeleton project of our game Dot!Panic. 

##Important Details
* This project is designed for Android Lollipop. 
* This project will compile on Windows or Mac as is without any additions.
* The app module is the game module, and for compilation the modules andEngine and andEnginePhysicsBox2DExtension are used.
* The app module contains copies of pertinent packages from the andEngine and andEnginePhysicsBox2DExtension. These are in the app module so that code hinting will work in Android Studio. Careful inspection of the gradle script for the app build will reveal that this additional source is excluded from compilation as the two modules are used.
* Assets are to be included in module app at /assets/gfx for use in the andEngine.

##Starting Your Development
* Start in the RootEngineActivity.java class and instantiate anyCamera, Scene, BitmapTextureAtlas, TextureRegion, PhysicsWorld, and FixtureDef you may use.
* The skeleton functions that are overridden should all be used.
* Your two main views are in the /res/layout folder where the button click in activity_main_screen.xml opens activity_main_game.xml. 

##Notes
* We highly recommend drinking while programming with AndEngine - it worked for us.
* Create a pull request if you would like to improve our project.
