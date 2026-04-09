<<<<<<< HEAD
import java.util.Properties
import java.io.FileInputStream

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
=======
plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
>>>>>>> b56b59100f500d39c8cb10ea6e7c3d2b5bc4b4e8
    id("dev.flutter.flutter-gradle-plugin")
    id("com.google.gms.google-services")
}

<<<<<<< HEAD
val keystoreProperties = Properties()
val keystorePropertiesFile = rootProject.file("key.properties")

if (keystorePropertiesFile.exists()) {
    keystoreProperties.load(FileInputStream(keystorePropertiesFile))
}

=======
>>>>>>> b56b59100f500d39c8cb10ea6e7c3d2b5bc4b4e8
android {
    namespace = "com.jalsetu.jalsetu"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

<<<<<<< HEAD
    defaultConfig {
        applicationId = "com.jalsetu.jalsetu"
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    signingConfigs {
        create("release") {
            keyAlias = keystoreProperties["keyAlias"] as String
            keyPassword = keystoreProperties["keyPassword"] as String
            storeFile = file(keystoreProperties["storeFile"] as String)
            storePassword = keystoreProperties["storePassword"] as String
        }
    }

    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = false
            isShrinkResources = false
        }
    }

=======
>>>>>>> b56b59100f500d39c8cb10ea6e7c3d2b5bc4b4e8
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
<<<<<<< HEAD
        jvmTarget = "1.8"
=======
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://developer.android.com/studio/build/application-id.html).
        applicationId = "com.jalsetu.jalsetu"
        // You can update the following values to match your application needs.
        // For more information, see: https://flutter.dev/to/review-gradle-config.
        minSdk = flutter.minSdkVersion // Required for flutter_local_notifications and desugaring
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
>>>>>>> b56b59100f500d39c8cb10ea6e7c3d2b5bc4b4e8
    }
}

dependencies {
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.4")
}

flutter {
    source = "../.."
<<<<<<< HEAD
}
=======
}
>>>>>>> b56b59100f500d39c8cb10ea6e7c3d2b5bc4b4e8
